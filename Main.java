import java.util.Scanner;

public class Main {

    public static void main(String [] args){
    
    ContactsManager myContactsManager = new ContactsManager();

     //Print the options for the user to choose from
		System.out.println("*****Welcome to Contacts Manager*****");
		System.out.println("*. Press 1 to create contact");
		System.out.println("*. Press 2 to search contact");
        System.out.println("*. Press 3 to exit");
   

    Scanner input = null;

    try{

        input = new Scanner(System.in);
 
        int options = input.nextInt();

        while (input.hasNextLine()){

        switch(options){
            case 1:

                System.out.println("Enter the name of the contact: ");
                String name = input.next();
                Contact Rissam = new Contact();
                Rissam.setName(name);


                System.out.println("Enter the number of the contact: ");
                String phoneNumber = input.next();
                Rissam.setPhoneNumber(phoneNumber);

                myContactsManager.addContact(Rissam);
                
                break;

            case 2:
                System.out.println("Enter the name of the contact: ");
                String searchName = input.nextLine();
                Contact result = myContactsManager.searchContact(searchName);
                System.out.println("The phone number is: " +result.getPhonenumber());
                break;
            case 3:
                input.close();
                System.exit(0);
                break;    
        }
    }
            
    
    
    }
    
    finally{
        
        if(input!=null)
        input.close();
    }
    
}
    
}