import java.util.*; // written by Joe Bugajski

public class assignment_1 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello! I am a powerful computer.\nGive me five numbers, and I will \nuse my giant computer brain \nto make some amazing calculations. \nLet us begin!");
        System.out.print("Enter first number: ");
        double num1 = GetAFloat(); // I wrote a simple try/catch method to validate the input
        System.out.println("The first number is " + num1);
        System.out.print("Enter second number: ");
        double num2 = GetAFloat();
        System.out.println("The second number is " + num2);
        System.out.print("Enter third number: ");
        double num3 = GetAFloat();
        System.out.println("The third number is " + num3 + "\nKeep going! You're doing a great job!");
        System.out.print("Enter fourth number: ");
        double num4 = GetAFloat();
        System.out.println("The fourth number is " + num4);
        System.out.print("Enter the fifth and final number: ");
        double num5 = GetAFloat();
        System.out.println("The fifth and final number is " + num5);
        System.out.println("Excellent! Now we have our list of five numbers:" + "\n" + num1 +"\n" + num2 +"\n" + num3 +"\n" + num4 +"\n" + num5);
        double grandTotal = num1 + num2 + num3 + num4 + num5;
        System.out.println("\n \n \n ......working \n \n \n ......this is harder than it looks \n \n \n I've added up our list of numbers, and the grand total was " + grandTotal);
        System.out.println("The average of all five numbers is " + grandTotal / 5);
        System.out.println("Thanks for playing! You are good at this!");
    }
    public static double GetAFloat(){
        while (true) {
            try {
                return console.nextDouble();
            }
            catch (InputMismatchException e) {
                console.next();
                System.out.print("That's not a valid float. Try again: ");
            }
        }
    }
   
}