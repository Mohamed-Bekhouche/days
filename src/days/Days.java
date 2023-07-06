/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 * Modified by : Mohamed Bekhouche 
 */
public class Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1-7) in integer:");
        int dayNumber = in.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            Weekday day = Weekday.values()[dayNumber - 1];
            System.out.println(day.getName());
        } else {
            System.out.println("Invalid day number");
        }
    }
}