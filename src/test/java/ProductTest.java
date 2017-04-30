import org.testng.annotations.Test;
import product.Hostel;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import steps.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Created by alexey on 29.04.2017.
 */
public class ProductTest extends BaseTest {

    @Test
    @Title("Object of Hostel not be null")
    @TestCaseId(value = "00001")
    public void test00001(){
        String name = "ES";
        int roomNumber = 5;

        Hostel hostel = commonSteps.createHostel(name, roomNumber);
        commonSteps.checkHostelNotNull(hostel);
    }

    @Test
    @Title("Object of Hostel must was created correct")
    @TestCaseId(value = "00002")
    public void test00002(){
        String name = "ES";
        int roomNumber = 5;

        Hostel hostel = commonSteps.createHostel(name, roomNumber);
        commonSteps.checkHostelNotNull(hostel);
        commonSteps.checkHostelName(hostel, name);
        commonSteps.checkHostelRoomNumber(hostel, 6);
    }

}
