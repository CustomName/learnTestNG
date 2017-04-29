package product;

/**
 * Created by alexey on 29.04.2017.
 */
public class HostelManager_Impl implements HostelManager {

    public boolean bookIn(Hostel hostel) {
        if(hostel.getHoldRoomCount() < hostel.getRoomNumber()){
            hostel.holdUp();
            return true;
        }
        return false;
    }

    public void bookOut(Hostel hostel) {
        if(hostel.getHoldRoomCount() > 0){
            hostel.holdDown();
        }
    }

}
