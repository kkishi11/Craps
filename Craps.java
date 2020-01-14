
/**
 * This class allows the user to play the game of craps on the computer.
 *
 * @author Kylie Kishi
 * @version 2020-1-14
 */

import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        // ask about instructions/give instructions
        System.out.println("LET'S PLAY CRAPS!");
        System.out.println("Do you need instructions (Y/n)?");
        Scanner in = new Scanner(System.in);
        String instructions = in.nextLine();
        if (instructions.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win!");
            System.out.println("4. b. or you roll a 7 and lose.");
        }
        System.out.println("Good luck!");
        
    }
}
