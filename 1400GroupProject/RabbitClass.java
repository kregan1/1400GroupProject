/*********************************
* Group 1 : Shel Plo Wah & Kerry Regan 
* Date : 07/22/2020
* Project: Vitual Pets
**********************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class RabbitClass
{
   //fields
   private String petName;
   
   //Constructor
   public RabbitClass(String petName)
   {
      this.petName = petName;
   } 
   
   //Randomly select a color of the rabbit
   public static void createColor()
   {
      ArrayList<String> rColor = new ArrayList<String>();
      rColor.add("Red");
      rColor.add("Lynx");
      rColor.add("Black");
      rColor.add("White");
      rColor.add("Brown");
      rColor.add("Grey");
   
      Random rand = new Random();
      int indexColor = rand.nextInt(6);
         
      String rabbitColor = rColor.get(indexColor);
      System.out.printf("%s rabbit ", rabbitColor);
   }
   
   //randomly select age of the rabbit
   public static void createAge()
   {
      ArrayList<String> rAge = new ArrayList<String>();
      rAge.add("3 months");
      rAge.add("6 months");
      rAge.add("1 year");
      rAge.add("1 year 6 months");
      rAge.add("2 years");
      rAge.add("3 years");
   
      Random rand = new Random();
      int indexAge = rand.nextInt(6);
   
      String rabbitAge = (String) rAge.get(indexAge);
      System.out.printf("of age %s. %n", rabbitAge);
    }
   

   
    //methods
    
    //petname
    public String getPetName()
    {
      return petName;
    }
    
    //is the pet alive or dead
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
    public void rEat()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s is hungry. Would you like to feed %s (Yes or No)? ", petName, petName);
        String eat = input.nextLine();
        if(eat.equals("Yes") || eat.equals("yes"))
        {
            System.out.printf("%s is eating.%n", petName);     
        }
        else if(eat.equals("No") || eat.equals("no"))
        {
               System.out.printf("%s is startving and will die without food.%n", petName);
               System.out.printf("%s is hungry. Would you like to feed %s (Yes or No)? ", petName, petName);
               eat = input.nextLine();
          	   if(eat.equals("Yes") || eat.equals("yes")) {
                 	System.out.printf("%s is eating.%n", petName);    
               } else {          		
                 	setAlive(false);  
               }     
        } //exit program when pet is neglected

    }
   
    //clean cage method
    public void rCleanCage()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s's cage is dirty. Would you like to clean the cage (Yes or No)? ", petName);
        String cage = input.nextLine();
        if(cage.equals("Yes") || cage.equals("yes"))
        {
            System.out.printf("%s has a clean cage. %s is happy! %n", petName, petName);      
        }
        else if(cage.equals("No") || cage.equals("no"))
        {
               System.out.printf("%s's case is not clean. %s is not happy.%n", petName, petName);
               System.out.println("Would you like to clean the cage (Yes or No)? ");
               cage = input.nextLine();
               if(cage.equals("Yes") || cage.equals("yes")) {
                 	  System.out.printf("%s has a clean cage.%n", petName);    
               } else {          		
                 	setAlive(false);  
               }
         } //exit program when pet is neglected
    }
   
    //Play method
    public void rPlay()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s wants to play. Would you like to play with %s? (Yes or No)? ", petName, petName);
        String play = input.nextLine();
        if(play.equals("Yes") || play.equals("yes"))
        {
            System.out.printf("%s is playing.%n", petName);      
        }
        else if(play.equals("No") || play.equals("no"))
        {
               System.out.printf("%s still wants to play. %s is unhappy.%n", petName, petName);
               System.out.printf("Would you like to play with %s (Yes or No)? ", petName);
               play = input.nextLine();
            
               if(play.equals("Yes") || play.equals("yes"))
               {
                  System.out.printf("%s has played and is happy.%n", petName);      
               } else {          		
                 	setAlive(false);  
               }          
        } //exit program when pet is neglected
    }
   
      //create a vet method
      public void rVet()
      {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s is sick. Would you like to take %s to the vet (Yes or No)? ", petName, petName);
        String vet = input.nextLine();
        if(vet.equals("Yes") || vet.equals("yes"))
        {
            System.out.printf("%s is feeling better.%n", petName);      
        }
        else if(vet.equals("No") || vet.equals("no"))
        {

            System.out.printf("%s is really sick and will die.%n", petName);
            System.out.printf("%s needs to see a vet. Would you like to take %s to the vet?", petName, petName);
            vet = input.nextLine();
              
            if(vet.equals("Yes") || vet.equals("yes"))
            {
               System.out.printf("%s is feeling better.%n", petName);
            }else{
               System.out.printf("%s is really sick and will die.%n", petName);
               setAlive(false);
            }
        }               
      } //exit program when pet is neglected

   
     //get larger cage method
     public void makeCageLarger()
     {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s want a bigger cage. Would you like to make the cage bigger for %s (Yes or No)? ", petName, petName);
        String cage = input.nextLine();
        if(cage.equals("Yes") || cage.equals("yes"))
        {
            System.out.printf("%s is happy .%n", petName);      
        }
        else if(cage.equals("No") || cage.equals("no"))
        {

            System.out.printf("%s is not happy and needs a larger cage %n", petName);  
            System.out.printf("%s still needs a larger cage. Would you like to make %s's cage bigger? ", petName, petName);
            cage = input.nextLine();
            if(cage.equals("Yes") || cage.equals("yes"))
            {
               System.out.printf("%s is happy.%n", petName);
            }else{
               System.out.printf("%s is not happy.%n", petName);
               setAlive(false);
            }              
        }//exit program when pet is neglected               
     } 
 }
