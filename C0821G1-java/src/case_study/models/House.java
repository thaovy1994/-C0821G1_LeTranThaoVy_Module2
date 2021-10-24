package case_study.models;

import java.util.Date;

public class House extends Facility {
    private String roomStandard;
    private byte floorNumber;

    public House(){

    }

    public House(String serviceName, float area, double rentCost, short personNumber, Date rentType) {
        super(serviceName, area, rentCost, personNumber, rentType);
    }

    public House(String serviceName, float area, double rentCost, short personNumber, Date rentType, String roomStandard, byte floorNumber) {
        super(serviceName, area, rentCost, personNumber, rentType);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }
}
