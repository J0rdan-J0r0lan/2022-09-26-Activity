import java.util.*;
import java.util.Scanner;

class List{
    private int num;

    List(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }
    public String toString(){
        return num+ "";
    }
}

class Arraylist{
    public static void main(String[] args) {
        
        Collection<List> n = new ArrayList<List>();
        Scanner s = new Scanner(System.in);
        int ins;
        do{
            System.out.println("=====================================");
            System.out.println("Choose Any From The Following ");
            System.out.println("");
            System.out.println("1. Add number");
            System.out.println("2. Remove number");
            System.out.println("3. Display List");
            System.out.println("4. Clear");
            System.out.println("5. Exit");
            System.out.println("=====================================");
            System.out.println("");
            System.out.println("Enter Your Choice: ");
            ins = s.nextInt();

            switch(ins){
                case 1:
                System.out.print("  Enter a number: ");
                int number = s.nextInt();
                
                if ((number >= 0) && (number <= 100)) 
                {
                System.out.print(" ");
                
                n.add(new List(number));
                }
                else if (number <= 0) 
                {
                    System.out.println("   Opps, Negative number, try to input Positive Number.");
                    System.out.println("");
                }
                else 
                {
                    break;
                }
                System.out.println("Added List: " + n);
                break;

                case 2:
                    boolean found = false;
                    System.out.println("Input a number to remove: ");
                    int num = s.nextInt();
                    System.out.println("===============================");
                    Iterator<List> i = n.iterator();
                    while(i.hasNext()){
                        List l = i.next();
                        if(l.getNum() == num) {
                            i.remove();
                            found = true;
                        }
                    }

                    if(!found){
                        System.out.println("Number Not Found! ");
                    }else{
                        System.out.println("Number is Removed Successfully..!");
                    }
                    System.out.println("===============================");
                break;

                case 3: 
                    System.out.println("===============================");
                    i = n.iterator();
                    System.out.println("List Display: " + n);
                    System.out.println("===============================");
                break;

                case 4:
                    System.out.println("\n ");
                    System.out.println("Successfully Clear!!!!");
                    n.clear();
                break;

                case 5:
                    System.out.println("Thank You!");
                break;
                default:
                System.err.println("   Invalid option selected");
                System.exit(0);

            }

        }while (ins!=0);
    }
}