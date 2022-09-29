import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class hashmap{
        public static void main(String[] args) {
            Map<Integer, String> hashMAP = new HashMap<Integer, String>();
            Scanner s = new Scanner(System.in);
            char myOption;
            do{
                System.out.println("Choose any from the following:");
                System.out.println("");
                System.out.println("=============================");
                System.out.println("1. Add");
                System.out.println("2. Remove");
                System.out.println("3. Display");
                System.out.println("4. Clear");
                System.out.println("5. Exit");
                System.out.println("=============================");
                System.out.println("");
                System.out.println("Enter your Choice:");
                
                myOption = s.next().charAt(0);
                

                switch(myOption){
                    case'1':
                        System.out.println("\nYou are going to ADD a NUMBER");
                        for (int i = 0; i < 5; ++i) {
                            System.out.println("Enter the number: ");
                            Integer a = s.nextInt();
                            String b = s.nextLine();
                            if(a % 3 == 0){
                                System.out.println("Youre not Allowed to add Prime numbers");
                            }else{
                                hashMAP.put(a, b);
                            }
                        }
                        System.out.println("\n");
                        break;
                    case '2':
                        System.out.println("\nYou are going to REMOVE a NUMBER");
                        System.out.println("Enter the number to remove: ");
                        Integer a = s.nextInt();
                        hashMAP.remove(a);
                        System.out.println("\n");
                        break;
                    case '3':
                        System.out.println("\nYou Display HashMap Key Value");
                        Set<Integer> keys = hashMAP.keySet();
                        for(Integer key : keys){
                            System.out.println("Key="+key + " Value="+hashMAP.get(key));
                        }
                        System.out.println("\n");
                        break;
                    case '4':
                        System.out.println("\nYou Cleared The Hash Map Arrays Value!");
                        hashMAP.clear();
                        System.out.println("\n");
                        break;
                    case '5':
                        System.out.println("\nThank You!, Goodbye!");
                        System.exit(0);
                        break;
                }
            }while(myOption != 1 || myOption != 2 || myOption != 3 || myOption != 4 || myOption != 5);
    }
}