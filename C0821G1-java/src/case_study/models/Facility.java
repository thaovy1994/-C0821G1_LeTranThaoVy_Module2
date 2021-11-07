package case_study.models;

public abstract class Facility {
    private String serviceName;
    private double area;
    private double roomRate;
    private int personNumber;
    private String rentType;   //thuê theo năm, tháng, ngày, giờ.

    public Facility() {
    }

    public Facility(String serviceName, double area, double roomRate, int personNumber, String rentType) {
        this.serviceName = serviceName;
        this.area = area;
        this.roomRate = roomRate;
        this.personNumber = personNumber;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double rentCost) {
        this.roomRate = rentCost;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return this.getServiceName() + "," +
                this.getArea() + "," +
                this.getRoomRate() + "," +
                this.getPersonNumber() + "," +
                this.getRentType();
    }
}
