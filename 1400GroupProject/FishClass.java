/*********************************
* Group 1 : Shel Plo Wah & Kerry Regan 
* Date : 07/22/2020
* Project: Vitual Pets
**********************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class FishClass
{
   //fields
   private String petName;
   
   //Constructor
   public FishClass(String petName)
   {
      this.petName = petName;
   } 
   
   //randomly create fish species
   public static void createSpecies()
   {
      ArrayList<String> fColor = new ArrayList<String>();
      fColor.add("Beta Fish");
      fColor.add("Gold Fish");
      fColor.add("Zebrafish");
      fColor.add("Catfish");
      fColor.add("Paradise Fish");
   
      Random rand = new Random();
      int indexColor = rand.nextInt(5);
         
      String fishColor = fColor.get(indexColor);
      System.out.printf("%s  ", fishColor);
   }
   
   //randomly create fish age
   public static void createAge()
   {
      ArrayList<String> fAge = new ArrayList<String>();
      fAge.add("2 weeks");
      fAge.add("1 month");
      fAge.add("3 months");
      fAge.add("6 months");
      fAge.add("8 months");
      fAge.add("1 year");
   
      Random rand = new Random();
      int indexAge = rand.nextInt(6);
   
      String fishAge = (String) fAge.get(indexAge);
      System.out.printf("of age %s. %n", fishAge);
    }
   

   
    //petname
    public String getPetName()
    {
      return petName;
    }
    
    //is the fish alive?
    private boolean alive = true;
    public boolean getAlive()
    {
         return alive;
    }
    public void setAlive(boolean isAlive)
    {
       this.alive = isAlive; 
    }

    
    //Eat method
    public void fEat()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s is hungry. Would you like to feed %s (Yes or No)? ", petName, petName);
        String eat = input.nextLine();
        if(eat.equals("Yes") || eat.equals("yes"))
        {
            System.out.printf("Your fish %s is eating.%n", petName);     
        }
        else if(eat.equals("No") || eat.equals("no"))
        {
               System.out.printf("%s is startving and will die without food.%n", petName);
               System.out.printf("%s is hungry. Would you like to feed %s (Yes or No)? ", petName, petName);
               eat = input.nextLine();
          	   if(eat.equals("Yes") || eat.equals("yes")) {
                 	System.out.printf("Your fish %s is eating.%n", petName);    
               } else {          		
                 	setAlive(false);   
               }     
        } //exit program when pet is neglected

    }
   
    //clean cage method
    public void fCleanTank()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s's tank is not clean. Would you like to clean the fishtank (Yes or No)? ", petName);
        String tank = input.nextLine();
        if(tank.equals("Yes") || tank.equals("yes"))
        {
            System.out.printf("%s has a clean fishtank. %s is a happy fish! %n", petName, petName);      
        }
        else if(tank.equals("No") || tank.equals("no"))
        {
               System.out.printf("%s's fishtank is so gross! %s is not happy.%n", petName, petName);
               System.out.println("Would you like to clean the fishtank (Yes or No)? ");
               tank = input.nextLine();
               if(tank.equals("Yes") || tank.equals("yes")) {
                 	  System.out.printf("%s has a clean fishtank.%n", petName);    
               } else {          		
                 	setAlive(false);   
               }
         } //pet dies when neglected - program exits
    }
    
    //fish sleep method
    public void fSleep()
    {
        System.out.printf("%s is sleeping. ZZZZZZZZZZZ%n", petName);
    } 
    
    //create a swimming method
    public void fSwim()
    {
        System.out.printf("%s is swimming.%n", petName);
    } 
   

    
    //Fish dies - flush method - fish will randomly die
    public void fFlush()
    {
         Scanner input = new Scanner(System.in);
         System.out.printf("%s has died. Do you want to flush %s? ", petName, petName);
         String flush = input.nextLine();
         if(flush.equals("Yes") || flush.equals("yes"))
         {
            System.out.printf("%s has been sent out to the ocean.%n", petName);
         }else{
            System.out.printf("%s has been buried in the backyard.%n", petName);
         }
        	setAlive(false);   

   }
    
    
        
            
    
}