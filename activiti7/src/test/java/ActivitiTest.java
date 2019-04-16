import com.alibaba.fastjson.JSON;
import com.fbc.base.vo.BaseResponse;
import com.fbc.ms.activiti7.Application;
import com.fbc.ms.activiti7.controller.ActivitiController;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @ClassName ActivitiTest
 * @Author fangbc
 * @Date 2019/4/12 15:47
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Application.class})
public class ActivitiTest {

    @Autowired
    private ActivitiController activitiController;
    @Test
    public void testCreateTables() {
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        ProcessEngine processEngine = configuration.buildProcessEngine();
        System.out.println(processEngine);
    }

    @Test
    public void deployTest() {
        BaseResponse baseResponse = activitiController.deploy("deploy1", null);
        System.out.println(JSON.toJSONString(baseResponse));
    }

    @Test
    public void startProcessByKeyTest() {
        BaseResponse baseResponse = activitiController.startProcessByKey("myProcess");
        System.out.println(JSON.toJSONString(baseResponse));
    }

    @Test
    public void qryTaskTest() {
        BaseResponse baseResponse = activitiController.qryTask("myProcess:2:5745bbb3-6062-11e9-ab42-005056c00008","usertask2");
        //System.out.println(JSON.toJSONString(baseResponse));
    }
}
