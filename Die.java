
/**
 * This class will roll two six-sided dice.
 *
 * @author Kylie Kishi
 * @version 2020-1-14
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int d1;
    private int d2;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        // do i need this?????????
        d1 = 0;
        d2 = 0;
    }

    /**
     * The rollOne method rolls the first six-sided die.
     * 
     * @return d1 the result of the first die
     */
    public int rollOne()
    {
        // put your code here
        d1 = (int) (Math.random() * 6 + 1);
        return d1;
    }
    
    /**
     * The rollTwo method rolls the second six-sided die.
     * 
     * @return d2 the result of the second die
     */
    public int rollTwo()
    {
        // put your code here
        d2 = (int) (Math.random() * 6 + 1);
        return d2;
    }
}
