package product;

import lombok.Builder;
import lombok.Data;

/**
 * Created by alexey on 29.04.2017.
 */
@Data
@Builder
public class Hostel {

    private String name;
    private int roomNumber;
    private int holdRoomCount;

    public void holdUp(){
        holdRoomCount++;
    }

    public void holdDown(){
        holdRoomCount--;
    }

}
