import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Contact> thing = new ArrayList<Contact>(); 

    static Scanner input = new Scanner(System.in);
    private static ContactsManager myContactsManager = new ContactsManager();
    private static int options;

    public static int startMenu(){

        System.out.println("*****Welcome to Contacts Manager*****");
		System.out.println("*. Press 1 to create contact");
        System.out.println("*. Press 2 to search contacts");
        System.out.println("*. Press 3 to display contacts");
        System.out.println("*. Press 0 to exit");

        int options = input.nextInt();

        while (options < 0 || options > 3){

            System.out.println ("Invalid selectection.");
            System.out.println (" Enter 1, 2,3 or 0");
            options = input.nextInt();
    }

    return options;
       

    }

    public static void searchContact(){
        System.out.println("Available Contacts: ");
                for(int i = 0; i < thing.size(); i++){
                    System.out.println("* "+ thing.get(i).getName());
                }
                System.out.println("Search Contact Info: ");
                String searchName = input.next();
                Contact result = myContactsManager.searchContact(searchName);

                System.out.println("*****Contact Info*****");
                System.out.println("");
                System.out.println("Name: " +result.getName());
                System.out.println("Phone Number: " +result.getPhonenumber());
                System.out.println("");
                System.out.println("**********************");

                System.out.println("Type any word to open menu:");
                String openMenu = input.next();


    }

    public static void createContact(){
                System.out.println("Enter the name of the contact: ");
                String name = input.next();
                Contact contact = new Contact();
                thing.add(contact);
                contact.setName(name);


                System.out.println("Enter the number of the contact: ");
                String phoneNumber = input.next();
                contact.setPhoneNumber(phoneNumber);

                myContactsManager.addContact(contact);
                System.out.println("Contact added successfully!!");
                System.out.println("Total Contacts: " +myContactsManager.totalContacts());

                System.out.println("Type any word to open menu:");
                String openMenu = input.next();

    }

    public static void displayContacts(){
            int z;
        for(int i = 0; i < thing.size(); i++){
            z = i +1;
            System.out.println(z + ". " + thing.get(i).getName());
        }

        System.out.println("Type any word to open menu:");
                String openMenu = input.next();

    }

    public static void main(String [] args){
    


        do{
            options = startMenu();
           
        switch(options){
            case 1:

                createContact();
                break;

            case 2:

                searchContact();
                break;

            case 3:
                displayContacts();
                break;    


        }
    }

    while(options !=0);

            
    }
    
}