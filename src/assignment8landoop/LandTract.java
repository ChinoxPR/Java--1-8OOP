/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment8landoop;

/**
 *
 * @author John Hernandez
 */
public class LandTract 
{
    //created private and final fields for LandTract class
    private final int length;
    private final int width;
    private final int area;
    
    /* 
    Default constructor will collect length 
    and width in fields and create the area of the Landtract
    */
    
    public LandTract(int length, int width) // will accept two int in parameter
    {
        this.length = length; //this. represents the private field length. so no confustion with naming
        this.width = width;
        this.area = length*width;
        
    } 
     /* 
    TractArea will return the area field
    */
    public int TractArea()
    {
        
        return this.area; //returns area field
    }
    
     /* 
    Equal method will return a boolean either true or false comparing the inner fields 
    of the two objects it is comparing.
    */
    public boolean Equal(LandTract object2) // accepts one LandTract object in parameter
    {
        if(this.length == object2.length && this.width == object2.width) // compares the inner fields of the two objects 
        {
           return true; // will activate the true bracket in main
        } 
        else
        {
            return false; // will activate the flase bracket in main 
        }
        
    }
     /* 
    toString method will produce an Output if object is called from Main 
    */
    public String toString()
    {
        String str = "Length = " + this.length + "\n" +
                     "Width = " + this.width + "\n" +
                     "Area = " + this.area +"\n" ;
    
        return str;
    }
     
    
}
