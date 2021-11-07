package case_study.models;

import java.util.Date;

public class House extends Facility {
    private String roomStandard;
    private int floorNumber;

    public House() {
        super();
    }

    public House(String serviceName, double area, double roomRate, int personNumber, String rentType) {
        super(serviceName, area, roomRate, personNumber, rentType);
    }

    public House(String serviceName, double area, double roomRate, int personNumber, String rentType, String roomStandard, int floorNumber) {
        super(serviceName, area, roomRate, personNumber, rentType);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                this.getRoomStandard() + "," +
                this.getFloorNumber();
    }
}
