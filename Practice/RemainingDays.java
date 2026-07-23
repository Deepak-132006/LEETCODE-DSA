package Practice;

import java.time.Year;
import java.util.Scanner;

public class RemainingDays {
    boolean leap = false;
    boolean validDate = false;

    public void leapYear(int year) {
        if (Year.isLeap(year)) {
            leap = true;
        } else {
            leap = false;
        }
    }

    public void isDateValid(int date){
        if(date >= 1 && date <= 31){
            validDate = true;
        } else {
            validDate = false;
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year");
        int year = sc.nextInt();

        System.out.println("Enter the Month: ");
        int month = sc.nextInt();

        System.out.println("Enter the Date: ");
        int date = sc.nextInt();
    }
}
