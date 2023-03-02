import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess(rnd_number);
 	}


    private static void makeAGuess(int random){
		// Create a Scanner object
        Scanner scan = new Scanner (System.in);   	 
    	// Read user input
    	int input = scan.nextInt();
        
        if (scan.hasNextDouble ()){

            if (random == input){
                System.out.println(" They are:" + random);
  
              }

              else { 

                     if (input > random){
                     System.out.println ( " Try again, too high ");             
                     makeAGuess(random);
                 }

                    if (input < random ){
                    System.out.println ( " Try again, too low ");
                     makeAGuess(random);
                 }


              }



           }

           else {
            System.out.println ( " Please write a number");


           }

        }

        //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }
   

