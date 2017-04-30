package steps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by alexey on 30.04.2017.
 */
public class BaseTest {

    protected CommonSteps commonSteps;

    @BeforeMethod
    public void setUp(){
        commonSteps = new CommonSteps();
    }

    @AfterMethod
    public void tearDown(){
        commonSteps = null;//doodle mock ))
    }

}
