package case_study.models;

import java.util.Date;

public class Room extends Facility {
    private String freeService;

    public Room(){
        super();
    }

    public Room(String serviceName, float area, double rentCost, short personNumber, Date rentType) {
        super(serviceName, area, rentCost, personNumber, rentType);
    }

    public Room(String serviceName, float area, double rentCost, short personNumber, Date rentType, String freeService) {
        super(serviceName, area, rentCost, personNumber, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                this.getFreeService();
    }
}
