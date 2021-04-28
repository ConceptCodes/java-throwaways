import java.util.*;
class Bartender {
    public static void main(String[] args) {
        int drinkingAge = 21;
        // get the age from the user
        Scanner input = new Scanner(System.in);
        System.out.println('Enter your age: ');
        int age = input.nextInt();
        // verfiy if user is old enough to drink
        String result = age >= drinkingAge ? 'Drink Responsibly!': 'Get out of here kid!';
        // print a message to the screen
        System.out.println(result);
    }
}