package com.fbc.ms.activiti7.controller;

import com.fbc.base.vo.BaseResponse;
import com.fbc.base.vo.ResultEnum;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @ClassName UserController
 * @Author fangbc
 * @Date 2019/1/4 18:58
 * @Version 1.0
 */
@RestController
@RequestMapping("/activiti")
public class ActivitiController {

    private static final Logger log = LoggerFactory.getLogger(ActivitiController.class);

    @Autowired
    private ProcessEngine processEngine;

    /**
     * 部署流程定义
     * @param key 可为null
     * @param name 可以为null
     * @return
     */
    public BaseResponse deploy(String key, String name) {
        BaseResponse<Deployment> baseResponse;
        try {
            Deployment deploy = processEngine.getRepositoryService()
                    .createDeployment()
                    .key(key)
                    .name(name)
                    .addClasspathResource("diagram/demo1.bpmn")
                    .deploy();

            baseResponse = new BaseResponse(ResultEnum.SUCCESS);
            baseResponse.setResult(deploy);
        } catch (Exception e) {
            log.error("部署流程定义异常",e);
            baseResponse = new BaseResponse(ResultEnum.FAIL);
        }
        return baseResponse;
    }

    /**
     * 启动流程
     * @param key
     * @return
     */
    @RequestMapping("/startProcess")
    public BaseResponse startProcessByKey(String key) {
        BaseResponse<String> baseResponse;
        try {
            ProcessInstance processInstance = processEngine.getRuntimeService()
                    .startProcessInstanceByKey(key);
            baseResponse = new BaseResponse(ResultEnum.SUCCESS);
            baseResponse.setResult(processInstance.getProcessInstanceId());
        } catch (Exception e) {
            log.error("启动流程异常",e);
            baseResponse = new BaseResponse(ResultEnum.FAIL);
        }
        return baseResponse;
    }


    @RequestMapping("/qryTask")
    public BaseResponse qryTask(String proDefId,String assignee) {
        BaseResponse<List<Task>> baseResponse;
        try {
            List<Task> list = processEngine.getTaskService()
                    .createTaskQuery()
                    .processDefinitionId(proDefId)
                    .taskAssignee(assignee)
                    .list();
            for (Task task : list) {
                System.out.println(task.getAssignee());
            }
            baseResponse = new BaseResponse(ResultEnum.SUCCESS);
            baseResponse.setResult(list);
        } catch (Exception e) {
            log.error("查询任务异常",e);
            baseResponse = new BaseResponse(ResultEnum.FAIL);
        }
        return baseResponse;
    }
}
