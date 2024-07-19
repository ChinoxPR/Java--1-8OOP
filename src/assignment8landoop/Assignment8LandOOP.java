/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment8landoop;
import java.util.Scanner;  // Import the Scanner class
/**
 *
 * @author John Hernandez
 */
public class Assignment8LandOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //variable for length and width input
        int length;
        int width;
        String str; // string variable for scanner class
        
        //Output and Input in Length variable for Object Land1
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the length of the 1st piece of land");
        str = input.nextLine();
        length = Integer.parseInt(str);
        
        //Output and Input in Width Variable for Object Land1
        System.out.println("Enter the width of the 1st piece of land");
        str = input.nextLine();
        width = Integer.parseInt(str);
        
        // LandTact Object created with user input length and width variables 
        LandTract land1 = new LandTract(length,width);
        
        // Output and Input in Length variable for object Land2
        System.out.println("Enter the length of the 2st piece of land");
        str = input.nextLine();
        length = Integer.parseInt(str);
        
        //Output and Input in width for object Land2
        System.out.println("Enter the width of the 2st piece of land");
        str = input.nextLine();
        width = Integer.parseInt(str);
        
        // landtract object is created in variable land2 with user input variable length and width
        LandTract land2 = new LandTract(length,width);
      
        // OutPut land1 and land2 objects activating toString method()
        System.out.println( "Land 1 \n" + land1);
        System.out.println("Land 2 \n" + land2);
        
        //Activate Equal Method and Output if equal or not
        if(land1.Equal(land2))
        {
            System.out.println("Both lands are the same in area size.");
        }
        else
        {
             System.out.println("Both lands are different in area size.");
        }
    }
    
}
