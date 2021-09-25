import java.text.DecimalFormat;

//import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Please enter height to be converted.\n");
        System.out.print("First, enter the feet.");
        int feet = scanner.nextInt();
        System.out.print("Next, enter the inches.");
        int inches = scanner.nextInt();
        System.out.print(
                "Your height is " + feet + " feet " + inches + " inches, or " + (12 * feet + inches) + " inches.");
        System.out.print(" This is " + ((12 * feet + inches) * (2.54)) + " cm.\n");
        System.out.print("Please enter a second height to be converted.\n");
        System.out.print("Enter the height in centimeters: ");
        int centimeters = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.print("Your height is " + centimeters + " cm," + "or " + df.format(centimeters / 2.54) + " inches.");
        scanner.close();

    }
}