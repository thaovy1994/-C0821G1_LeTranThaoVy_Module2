package case_study.models;

public class Room extends Facility {
    private String freeService;

    public Room(){
        super();
    }

    public Room(String serviceName, double area, double roomRate, int personNumber, String rentType) {
        super(serviceName, area, roomRate, personNumber, rentType);
    }

    public Room(String serviceName, double area, double roomRate, int personNumber, String rentType, String freeService) {
        super(serviceName, area, roomRate, personNumber, rentType);
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
