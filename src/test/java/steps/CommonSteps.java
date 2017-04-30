package steps;

import product.Hostel;
import ru.yandex.qatools.allure.annotations.Step;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Created by alexey on 30.04.2017.
 */
public class CommonSteps {

    @Step("Create instance of Hostel with name \"{0}\" and room numbers = {1}")
    public Hostel createHostel(String name, int roomNumber){
        return Hostel.builder()
                .name(name)
                .roomNumber(roomNumber)
                .build();
    }

    @Step("Check that object was created.")
    public void checkHostelNotNull(Hostel hostel){
        assertNotNull(hostel, "Object of Hostel not be null");
    }

    @Step("Check that name of hostel is correct")
    public void checkHostelName(Hostel hostel, String expectedName){
        assertEquals(hostel.getName(), expectedName, "Name of object. Expected = " + expectedName + ", actual = " + hostel.getName());
    }

    @Step("Check that number of room is correct")
    public void checkHostelRoomNumber(Hostel hostel, int expectedRoomNumber){
        assertEquals(hostel.getRoomNumber(), expectedRoomNumber, "Number of room. Expected = " + expectedRoomNumber + ", actual = " + hostel.getRoomNumber());
    }

}
