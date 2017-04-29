package product;

/**
 * Created by alexey on 29.04.2017.
 */
public class Main {

    public static void main(String... args){
        Hostel hostel = Hostel.builder()
                .name("Marselle")
                .roomNumber(4)
                .build();

        HostelManager hostelManager = new HostelManager_Impl();
        hostelManager.bookIn(hostel);

        System.out.println(hostel);
    }

}
