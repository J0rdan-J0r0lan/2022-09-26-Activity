import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> people = new ArrayList<String>();

        Person<String> personFirst = new Person<String>();
        personFirst.setMyName("Jordan Jorolan");
        personFirst.setMyDetails("riding big bike and eating.");
        personFirst.setMyAge("22");
        people.add("I am " + personFirst.getMyName() + ", " + personFirst.getAge() + " years of age " + "and I love "+ personFirst.getMyDetails());


        Person<String> personSecond = new Person<String>();
        personFirst.setMyName("James");
        personFirst.setMyDetails("reading and sleeping.");
        personFirst.setMyAge("19");
        people.add("I'm " + personFirst.getMyName() + ", " + personFirst.getAge() + " years of age " + "and I like "+ personFirst.getMyDetails());


        Person<String> personThird = new Person<String>();
        personFirst.setMyName("Joana");
        personFirst.setMyDetails("dancing and singing.");
        personFirst.setMyAge("20");
        people.add("I am " + personFirst.getMyName() + ", " + personFirst.getAge() + " years of age " + "and I love "+ personFirst.getMyDetails());




        Person<String> personFourth = new Person<String>();
        personFirst.setMyName("Joshua");
        personFirst.setMyDetails("eating seafoods.");
        personFirst.setMyAge("21");
        people.add("I am " + personFirst.getMyName() + ", " + personFirst.getAge() + " years of age " + "and I love "+ personFirst.getMyDetails());


        Person<String> personFifth = new Person<String>();
        personFirst.setMyName("Johnson");
        personFirst.setMyDetails("riding big bikes.");
        personFirst.setMyAge("19");
        people.add("I am " + personFirst.getMyName() + ", " + personFirst.getAge() + " years of age " + "and I like "+ personFirst.getMyDetails());


        System.out.print(" || 0,1,2,3,4 || ");
        System.out.print("\nEnter your choosen index:");
        int input = sc.nextInt();

        try {

            if (input < 0) {
                sc.close();
                throw new PersonException("Your input is negative. Please input positive index.");
            }
            if (input > 5) {
                sc.close();
                throw new PersonException("Your input exceeds the size of the array.");
            }

            System.out.println("Index number: " + input);
            System.out.println(people.get(input));

        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }

      sc.close(); 
    }

}