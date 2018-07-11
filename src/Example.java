import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        String name;
        String breed;
        int age ;

//Scan for get data
        Scanner keyboard = new Scanner(System.in);

//print Greetings. What is your pet's name?
        System.out.print( "Greetings. What is your pet's name? " );

//Get String data
        name = keyboard.nextLine();

//print What kind of animal is?
        System.out.print( "What kind of animal is " + name + "? " );
//Get String data
        breed = keyboard.nextLine();

//print How old is ?
        System.out.print( "How old is " + name + "? ");

//Get Integer data
        age = keyboard.nextInt();

//print Result
        System.out.println( name + " is your " + breed + " and it is " + age );

//Scan finish
        keyboard.close();

    }
}
