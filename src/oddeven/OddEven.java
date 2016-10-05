package oddeven;

/**
 *
 * @author Robyn
 */
import java.util.Scanner;
import java.util.Random;

public class OddEven {

//Roll a dice to get a number between 1-6 /done
//Ask users to guess Odd or Even /done
/*Track and announce result:You win/lose 
* You’ve played xx number of times, 
* The system generate  yy  number of Odds and  zz  number of Even 
* Your winning percentage is  nn %,
* Print out game history as user finish playing
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int roll;
        int face = 0;
        System.out.print("Guess number either odd or even: ");
        roll = input.nextInt();
        int[] frequency = new int[7];//storage

        //roll dice 20 times
        for (roll = 1; roll < frequency.length; roll++) {
            frequency[roll] = 0;
        }

        for (roll = 1; roll < 10; roll++) {
            face = 1 + r.nextInt(6);
        }
        frequency[face]++;
        System.out.printf("%s%10s%n", "Face", "Frequency");
        //output each array's value
        for (face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }

    }//endmain
}//endclass

// Hi Robyn, please see if you can draw a flow chart to represent the logic of the game.  This may help.
