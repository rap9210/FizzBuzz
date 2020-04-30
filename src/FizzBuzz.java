import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args){
        /*
        Goal: Write a program that prints the numbers from 1 to 100.
              For multiples of 3 print “Fizz” instead of the number.
              For the multiples of five print “Buzz”.
              For numbers which are multiples of both 3 and 5 print “FizzBuzz”.

        1. Write a for loop to populate an array with numbers from 1 to 100.
        2. Write a for loop that goes through every number and checks if
        they meet the criteria. If they do, replace it with appropriate word.
         */
        String one_to_100[] = new String[100];
        int i;
        for (i=0; i<=99; i++)
        {
           if (((i+1)%3 == 0)&&((i+1)%5 == 0))          // Double condition first to avoid repetition.
           {
               one_to_100[i] = "FizzBuzz";
           }
           else if((i+1)%3 == 0)
           {
               one_to_100[i] = "Fizz";
           }
           else if((i+1)%5 == 0)
           {
               one_to_100[i] = "Buzz";
           }
           else
           {
               one_to_100[i] = Integer.toString(i+1);
           }
        }
        /*
        Now that the array is filled appropriately, let's print it out.
         */
        for (i=0; i<=99; i++)
        {
            System.out.println(one_to_100[i]);
        }

    }
}
