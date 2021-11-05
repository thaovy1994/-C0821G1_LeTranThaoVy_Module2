package case_study.models;

import java.util.Date;

public class Villa extends Facility {
    private String roomStandard;
    private float swimmingPoolArea;
    private byte floorNumber;

    public Villa() {
        super();
    }

    public Villa(String serviceName, float area, double rentCost, short personNumber, String rentType) {
        super(serviceName, area, rentCost, personNumber, rentType);
    }

    public Villa(String serviceName, float area, double rentCost, short personNumber, String rentType, String roomStandard, float swimmingPoolArea, byte floorNumber) {
        super(serviceName, area, rentCost, personNumber, rentType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(float swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
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
                this.getSwimmingPoolArea() + "," +
                this.getFloorNumber();
    }
}
