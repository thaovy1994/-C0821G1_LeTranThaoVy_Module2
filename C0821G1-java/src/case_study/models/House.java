package case_study.models;

import java.util.Date;

public class House extends Facility {
    private String roomStandard;
    private byte floorNumber;

    public House() {
        super();
    }

    public House(String serviceName, float area, double rentCost, short personNumber, String rentType) {
        super(serviceName, area, rentCost, personNumber, rentType);
    }

    public House(String serviceName, float area, double rentCost, short personNumber, String rentType, String roomStandard, byte floorNumber) {
        super(serviceName, area, rentCost, personNumber, rentType);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public byte getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(byte floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                this.getRoomStandard() + "," +
                this.getFloorNumber();
    }
}
