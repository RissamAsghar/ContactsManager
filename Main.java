import java.util.Scanner;

public class Main {

    
    static Scanner input = new Scanner(System.in);
    private static ContactsManager myContactsManager = new ContactsManager();
    private static int options;

    public static int start(){

        System.out.println("*****Welcome to Contacts Manager*****");
		System.out.println("*. Press 1 to create contact");
		System.out.println("*. Press 2 to search contact");
        System.out.println("*. Press 3 to exit");

        int options = input.nextInt();

        while (options < 1 || options > 3){

            System.out.println ("that is an invalid select.");
            System.out.println (" Enter 1, 2, or 3s");
            options = input.nextInt();
    }

    return options;
       

    }

    public static void searchContact(){
                System.out.println("Search Contact: ");
                String searchName = input.next();
                Contact result = myContactsManager.searchContact(searchName);
                System.out.println("The phone number is: " +result.getPhonenumber());

    }

    public static void createContact(){
                System.out.println("Enter the name of the contact: ");
                String name = input.next();
                Contact Rissam = new Contact();
                Rissam.setName(name);


                System.out.println("Enter the number of the contact: ");
                String phoneNumber = input.next();
                Rissam.setPhoneNumber(phoneNumber);

                myContactsManager.addContact(Rissam);
                System.out.println("Contact added successfully!!");

    }

    public static void main(String [] args){
    


        do{
            options = start();
           
        switch(options){
            case 1:

                createContact();
                options = 0;
                break;

            case 2:

                searchContact();
                options = 0;
                break;


        }
    }

    while(options !=3);

            
    }
    
}