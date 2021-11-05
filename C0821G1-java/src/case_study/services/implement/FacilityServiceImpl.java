package case_study.services.implement;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.FacilityService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner input = new Scanner(System.in);
    public static Map<Facility, Integer> myMap = new HashMap<>();

    private static final Facility House = null;
    private static final Facility Room = null;
    private static final Facility Villa = null;

    static {
        myMap = new HashMap<>();
        myMap.put(Villa, 1);
        myMap.put(House, 2);
        myMap.put(Room, 3);
    }

    @Override
    public void create() {
        int choice;
        do {
            System.out.println("   --- Service ---");
            System.out.println("1.\tAdd New Villa.");
            System.out.println("2.\tAdd New House.");
            System.out.println("3.\tAdd New Room.");
            System.out.println("4.\tBack to menu.");
            System.out.println("         ---");
            System.out.print("Please choose a service: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    myMap.put(new Villa(), 1);
                    break;
                case 2:
                    myMap.put(new House(),2);
                    break;
                case 3:
                    myMap.put(new Room(),3);
                    break;
                case 4:
                    System.exit(4);
            }
        } while (choice != 4);
    }

    @Override
    public void edit(Facility facility) {

    }

    @Override
    public void show() {
        for (Map.Entry<Facility, Integer> entry : myMap.entrySet()) {
            System.out.println("Service: " + entry.getKey() + ", used " + entry.getValue() + " time");
        }
    }
}
