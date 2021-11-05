package case_study.models;

import java.util.Date;

public abstract class Facility {
    private String serviceName;
    private double area;
    private double rentCost;
    private short personNumber;
    private String rentType;

    public Facility() {

    }

    public Facility(String serviceName, double area, double rentCost, short personNumber, String rentType) {
        this.serviceName = serviceName;
        this.area = area;
        this.rentCost = rentCost;
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

    public void setArea(float area) {
        this.area = area;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public short getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(short personNumber) {
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
                this.getRentCost() + "," +
                this.getPersonNumber() + "," +
                this.getRentType();
    }
}
