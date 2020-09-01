public class Contact {

    private String name;
    private String phoneNumber;
    private String email;

    public Contact(){}

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName(){
        return this.name;

    }

    public String getPhonenumber(){
        return this.phoneNumber;

    }

    public String getEmail(){
        return this.email;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    
    }


    
}