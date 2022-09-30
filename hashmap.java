import java.util.*;


class hashmap{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int option;
        
        do{

             System.out.println("\n   **************************");
            System.out.println(" \n  ");
            System.out.println("   HASHMAP  ");
            System.out.println("Choose any of the following below:  ");
            System.out.print("\n   [1] Add Numbers \n   [2] Delete Numbers \n   [3] Display Numbers \n   [4] Clear \n   [5] Exit \n\n   Your Choice: ");
            option = s.nextInt();
            
            switch(option){
                case 1:
                    for (int i = 0; i < 5; ++i) {
                            System.out.print("   Enter 1st num: ");
                            int number = s.nextInt();
                            System.out.print("   Enter 2nd num: ");
                            int c = s.nextInt();
                            if(number % 3 == 0){
                                System.out.println("   Youre not Allowed to add Prime numbers");
                            }else{
                                hm.put(number, c);
                                System.out.println("   "+number +" and "+c+" is added to the Hashmap.");  
                            }
                        }
                    
                break;
                
                case 3:
                    System.out.println("\n ");
                    System.out.println("   Display Number ");
                    System.out.println("   Map: " + hm);
                    System.out.println("\n ");
                    for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
                    System.out.println(m.getKey() + " " + m.getValue());
        }
                break;
                case 2:
                    System.out.print("   Choose number to delete: ");
                    int num = s.nextInt();
                    
                    hm.remove(num);
                    System.out.println("   The removed number number is:" + num);
                    System.out.println("   Updated Map: " + hm);
                    
                    
                break;
                case 4:
                    System.out.println("\n ");
                    System.out.println("   All Numbers are Successfully Clear!!! ");
                    hm.clear();
                break;
                case 5:
                    
                    System.out.println("   Thank You for Using!!! ");
                    System.exit(0);
                break;
                
                default:
                System.err.println("   Invalid option selected");
                System.exit(0);
            }
            
            
        }while(option != 0);
            
    }
}
