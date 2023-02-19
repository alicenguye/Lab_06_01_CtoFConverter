import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaration of variable
        int temptC = 0;
        int temptF= 0;
        String trash = "";

        //start scanner object
        Scanner in = new Scanner(System.in);

        //asking user and input it
        System.out.println("Enter the temperature in C degrees: ");
        if (in.hasNextInt()) {
            temptC = in.nextInt();
            in.nextLine(); //clear the buffer

            //calculation temperature C to F
            temptF= (temptC * 9/5)+32;

            //display output for user
            System.out.println("The temperature in F is:"+" "+ temptF);
        } else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number:" + " " + trash);
        }
    }
}