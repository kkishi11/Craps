
/**
 * This class allows the user to play the game of Craps on the computer.
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
        if (instructions.equals("") || instructions.substring(0,1).equalsIgnoreCase("y"))
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

        boolean play = true;
        while (play) // get point, win, lose
        {
            // roll dice the first time
            Die game = new Die();
            System.out.println("Press <Enter> to roll the dice");
            String pause = in.nextLine();
            // first roll
            int die1 = game.rollOne();
            int die2 = game.rollTwo();
            int sum = die1 + die2;
            System.out.println("Your first roll is " + die1 + " and " + die2);
            System.out.println("Total: " + sum);
            if (sum == 7 || sum == 11) // immediate win
            {
                System.out.println("You win! :)");
                play = false; // break out and ask if want to play again
            }
            else if (sum == 2 || sum == 3 || sum == 12) // immediate loss
            {
                System.out.println("You lose :(");
                play = false; // break out and ask if want to play again
            }
            else // entire rest of rolling
            {
                System.out.println("That's your point.");
                System.out.println("Try to roll it again before you roll a 7!");
                boolean again = true;
                while (again)
                {
                    System.out.println("Press <Enter> to roll the dice");
                    String pause2 = in.nextLine();
                    int die3 = game.rollOne();
                    int die4 = game.rollTwo();
                    int sum2 = die3 + die4;
                    System.out.println("You rolled " + die3 + " and " + die4);
                    System.out.println("Total: " + sum2);
                    if (sum2 == 7)
                    {
                        System.out.println("Oh no! You rolled a 7. You lose :(");
                        again = false; // breaks out b/c loss
                    }
                    else if (sum2 == sum)
                    {
                        System.out.println("You rolled your point! You win! :)");
                        again = false; // breaks out b/c win
                    }
                    else
                    {
                        System.out.println("Keep rolling!");
                    }
                }
            }
            System.out.println("Do you want to play again (Y/n)?");
            String answer = in.nextLine();
            if (answer.equals("") || answer.equalsIgnoreCase("y"))
            {
                System.out.println();
                play = true; // starts loop over to play again
            }
            else
            {
                System.out.println();
                System.out.println("Thank you for playing. Goodbye!");
                play = false; // breaks loop, ends game
            }
        }
    }
}
