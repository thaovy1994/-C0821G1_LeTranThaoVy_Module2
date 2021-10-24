package case_study.models;

public class Customer extends Person{
    private String customerType;    //Diamond, Platinium, Gold, Silver, Member
    private String customerAddress;

    public Customer(){
    }

    public Customer(int id, String fullName, String dateOfBirth, boolean male, int identifyNumber, int phoneNumber, String email, String customerType, String customerAddress) {
        super(id, fullName, dateOfBirth, male, identifyNumber, phoneNumber, email);
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }
}
