import java.util.HashSet;
import java.util.Scanner;


public class hashset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        
        HashSet<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(19);
        numberHashSet.add(17);
        numberHashSet.add(15);
        numberHashSet.add(13);
        numberHashSet.add(11);
        char choice;
        int number = 0;

        
        do{
            System.out.print("\n====================================================================");
            System.out.println("\nGiven numbers in HASHSET Collection:" + numberHashSet);
            System.out.println("===================================================================");
            System.out.println("\nChoose any of the following:");
            System.out.print("1. Add");
            System.out.print("\n2. Remove");
            System.out.print("\n3. Display");
            System.out.print("\n4. Clear");
            System.out.print("\n5. Exit");

            System.out.print("\nEnter your choice: ");
            choice = input.next().charAt(0);
            
            
            switch (choice) {
            case '1':
                System.out.print("\n====================================================================");
                System.out.print("\n***** You are going to ADD a NUMBER *****");
                System.out.print("\n====================================================================");
                System.out.print("\nEnter a number: ");
                number = in.nextInt();
                //----------------------------CONDITION ADDED ----------------------------
                if(numberHashSet.contains(number)){
                    System.out.print("\nThe number you entered is already in the HashSet Collection.\n");
                    System.out.print("\n==== Please Try inputting another number. ====\n");
                    System.out.print("\n====================================================================");
                 } else {
                    numberHashSet.add(number);
                    System.out.println("\nThe added number is: " + number);
                    System.out.println("\nThe updated HashSet Collection:" + numberHashSet);
                    System.out.print("\n====================================================================");
                 }
                //------------------------------------------------------------------------
                break;
                
            case '2':
                System.out.println("\n==== You are now going to REMOVE a NUMBER ====");
                System.out.print("Enter the number you want to remove: ");
                int number2 = in.nextInt();
                numberHashSet.remove(number2);
                System.out.println("\nThe removed number number is:" + number2);
                System.out.println("\nThe updated HashSet Collection:" + numberHashSet);
                System.out.print("\n====================================================================");
                break;
                
            case '3':
                System.out.println("\nThe added number earlier is:" + number);
                System.out.println("\nThe updated HashSet Collection:" + numberHashSet);
                System.out.print("\n====================================================================");
                break;
                
            case '4':
                System.out.print("\n====================================================================");
                numberHashSet.clear();  
                System.out.println("\n\t\tCLEARED HashSet Collection:" + numberHashSet);
                System.out.print("\n====================================================================");
                break;
                
            case '5':
                System.out.print("\n====================================================================\n"); 
                System.out.println("\n******* THANK YOU!!!, Goodbye! *******");  
                System.out.print("\n====================================================================\n\n"); 
                break;
                
            default:
                System.out.println("\nJust Pick fron the options given above. Please try Again. ");
                System.out.print("\n====================================================================");
                break;
        }
        }while (choice != '5');
        
        
    
    }

}