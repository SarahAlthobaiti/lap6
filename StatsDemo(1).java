

import java.util.Scanner;

// TASK #1 Add the file I/O import statement here 



/**
 * This class reads numbers from a file, calculates the mean and standard
 * deviation, and writes the results to a file.
 */
 
public class StatsDemo {


    // TASK #2 Add the throws clause  
   
    public static void main(String[] args) {
        
        //------------------------------------------------------------
        double sum = 0;	// The sum of the numbers 
        int count = 0;	// The number of numbers added 
        double mean = 0;	// The average of the numbers 
        double stdDev = 0;   // The standard deviation 
        String line;	// To hold a line from the file 
        double difference;   // The value and mean difference 
        //------------------------------------------------------------
        
        // Create an object of type Scanner 
        Scanner keyboard = new Scanner(System.in);
        String filename;	// The user input file name 
        
        //------------------------------------------------------------

        // Prompt the user and read in the input file name 
        System.out.println("This program calculates "
                + "statistics on a file " + "containing a series of numbers");
        System.out.println("Enter the input file name:  ");
        filename= keyboard.nextLine();  // should write Numbers.txt;
        
        
        // TASK #3
        // Create a File object passing it the filename 
        // Create a Scanner object passing File object 
        //Loop until you are at the end of the file 
            // read the line as string
            // convert the string to double and add the value to sum 
            // Increment the counter 
        // Close the input file 
        // calculate the mean and Store it 
        
        
		
		
		

        //**********************************************************
        
        // Task #4
        // Reinitialize the sum of the numbers (sum) to zero 
        // Reinitialize the number of numbers added (count) to zero
        // Reconnect File object by passing it the input filename 
        // Reconnect Scanner object by passing File object  
        // Loop until you are at the end of the file 
            // read the line as string
            // convert the string to double and subtract the mean from the value
            // Add the square of the difference to the sum 
            // Increment the counter 
        // Close the input file 
        // calculate the standard deviation and store it
        
		
		
		
        
        //**********************************************************
         
        // TASK #5
        // read the output filename from the user
        // Create a PrintWriter object passing the filename to it
        // Print the results to the output file 
        // Close the output file 
        
        System.out.println(" ");
        
        System.out.println("We read the file and calculated the mean and stdDev, now we will write the results in output file. Enter the output file name:  ");
        filename=keyboard.nextLine();  // should write Results.txt;
        
		
		
		
		
		
		//write your code here
		
		
		
		
		
		
        System.out.println(" ");
        System.out.println("We wrote the results in the file "+ filename +" and closed the file");
       
        

    }
}
