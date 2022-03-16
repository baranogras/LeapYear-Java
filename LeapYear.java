package Lesson3;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a Year : ");
        year = input.nextInt();

        if (year%100==0){
            if (year%400==0){
                System.out.println(year+" Is a Leap Year.");
            }else{
                System.out.println(year+" Is Not A Leap Year.");
            }
        }else if(year%4==0){
            System.out.println(year+" Is a Leap Year.");
        }else{
            System.out.println(year+" Is Not A Leap Year.");
        }
    }
}
