package case_study.models;

public class Customer extends Person {
    private String customerType;    //Diamond, Platinium, Gold, Silver, Member
    private String customerAddress;

    public Customer() {
        super();
    }

    public Customer(String id, String fullName, String dateOfBirth, boolean male, int identifyNumber, String phoneNumber, String email,
                    String customerType, String customerAddress) {
        super(id, fullName, dateOfBirth, male, identifyNumber, phoneNumber, email);
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                this.getCustomerType() + "," +
                this.getCustomerAddress();
    }
}
