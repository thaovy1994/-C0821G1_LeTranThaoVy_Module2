package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private int floorNumber;

    public Villa() {
        super();
    }

    public Villa(String serviceName, double area, double roomRate, int personNumber, String rentType) {
        super(serviceName, area, roomRate, personNumber, rentType);
    }

    public Villa(String serviceName, double area, double roomRate, int personNumber, String rentType,
                 String roomStandard, double swimmingPoolArea, int floorNumber) {
        super(serviceName, area, roomRate, personNumber, rentType);
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

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
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
                this.getSwimmingPoolArea() + "," +
                this.getFloorNumber();
    }
}
