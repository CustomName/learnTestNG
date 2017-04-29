import org.testng.annotations.Test;
import product.Hostel;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

import static org.testng.Assert.*;

/**
 * Created by alexey on 29.04.2017.
 */
public class ProductTest {

    @Test
    @Title("Объект hostel не должен быть null")
    @TestCaseId(value = "00001")
    public void test00001(){
        Hostel hostel = Hostel.builder()
                .name("Marcelle")
                .roomNumber(4)
                .build();
        assertNotNull(hostel, "Объект hostel не должен быть null");
    }

}
