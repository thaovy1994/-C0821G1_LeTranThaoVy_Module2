package case_study.services.implement;

import case_study.models.*;
import case_study.services.FacilityService;
import case_study.services.Service;
import case_study.utils.Validation;

import java.util.*;

public class FacilityServiceImpl implements FacilityService, Service {
    Scanner input = new Scanner(System.in);
    public static Map<Facility, Integer> myMap = new HashMap<>();
    ReadAndWriteServiceImpl readAndWriteService = new ReadAndWriteServiceImpl();

//    static {
//        myMap = new HashMap<>();
//        myMap.put(new Villa("Villa", 100, 1500, 10, "hour"
//                , "standard", 30.5, (byte) 2), 1);
//    }

    @Override
    public void createVilla() {
        try {
            String serviceName = "Villa";
            System.out.print("Enter area: ");
            double area = Validation.checkArea();
            System.out.print("Enter room rate: ");
            double roomrate = Validation.checkRoomRate();
            System.out.print("Enter number of person rent: ");
            int personNumber = Validation.checkPersonNumber();
            System.out.print("Enter type of rent - by the(Hour/Day/Month/Year): ");
            String rentType = Validation.checkServiceName();

            System.out.print("Enter standard of room (Superior/Deluxe/Executive/Family/President/...): ");
            String roomStandard = Validation.checkServiceName();
            System.out.print("Enter swimming pool's area: ");
            double swimmingPoolArea = Validation.checkArea();
            System.out.print("Enter number of floor: ");
            byte floorNumber = Validation.checkFloorNumber();
            myMap.put(new Villa(serviceName, area, roomrate, personNumber, rentType,
                    roomStandard, swimmingPoolArea, floorNumber), 0);

            readAndWriteService.writeFileMap("D:\\C0821G1_LeTranThaoVy_Module2\\C0821G1-java\\src\\case_study\\data\\villa.csv", myMap);

        } catch (NumberFormatException e) {
            System.err.print("Enter again: ");
        }
    }


    @Override
    public void createRoom() {
        try {
            String serviceName = "Room";
            System.out.print("Enter area: ");
            double area = Double.parseDouble(input.nextLine());
            System.out.print("Enter room rate: ");
            Double roomrate = Validation.checkRoomRate();
            System.out.print("Enter number of person rent: ");
            int personNumber = Validation.checkPersonNumber();
            System.out.print("Enter type of rent - by the(Hour/Day/Month/Year): ");
            String rentType = Validation.checkServiceName();

            System.out.print("Enter free service: ");
            String freeService = input.nextLine();
            myMap.put(new Room(serviceName, area, roomrate, personNumber, rentType, freeService), 0);

            readAndWriteService.writeFileMap("D:\\C0821G1_LeTranThaoVy_Module2\\C0821G1-java\\src\\case_study\\data\\room.csv", myMap);

        } catch (NumberFormatException e) {
            System.err.print("Enter again: ");
        }
    }

    @Override
    public void createHouse() {
        try {
            String serviceName = "House";
            System.out.print("Enter area: ");
            double area = Double.parseDouble(input.nextLine());
            System.out.print("Enter room rate: ");
            Double roomrate = Validation.checkRoomRate();
            System.out.print("Enter number of person rent: ");
            int personNumber = Validation.checkPersonNumber();
            System.out.print("Enter type of rent - by the(Hour/Day/Month/Year): ");
            String rentType = Validation.checkServiceName();

            System.out.print("Enter standard of room (Superior/Deluxe/Executive/Family/President/...): ");
            String roomStandard = input.nextLine();
            System.out.print("Enter number of floor: ");
            byte floorNumber = Validation.checkFloorNumber();
            myMap.put(new House(serviceName, area, roomrate, personNumber, rentType, roomStandard, floorNumber), 0);

            readAndWriteService.writeFileMap("D:\\C0821G1_LeTranThaoVy_Module2\\C0821G1-java\\src\\case_study\\data\\house.csv", myMap);

        } catch (NumberFormatException e) {
            System.err.print("Enter again: ");
        }
    }

    @Override
    public void edit(Object object) {
    }

    @Override
    public void show(String path) {
        Map<Facility, Integer> myMap = new HashMap<>();
        readAndWriteService.readFileMap(path, myMap);
        for (Map.Entry<Facility, Integer> entry : myMap.entrySet()) {
            System.out.println("Service - " + entry.getKey() + ", used " + entry.getValue() + " time");

        }
    }
}
