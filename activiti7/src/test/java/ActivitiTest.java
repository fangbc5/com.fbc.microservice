import com.fbc.ms.activiti7.Application;
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
    private ProcessEngine processEngine;

    @Test
    public void testCreateTables() {
        System.out.println(processEngine);
    }

    @Test
    public void deployTest() {
    }

    @Test
    public void startProcessByKeyTest() {
    }

    @Test
    public void qryTaskTest() {
    }

    @Test
    public void test1() {
//        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
//        System.out.println(processEngine);
    }
}
