/*********************************
* Group 1 : Shel Plo Wah & Kerry Regan 
* Date : 07/22/2020
* Project: Vitual Pets
**********************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class CatClass
{
    private static String petName;
    //constructor
    public CatClass(String petName)
    {
      this.petName = petName;
    }
    //petname
    public static String getPetName()
    {
      return petName;
    }   
    
    //randomly create the color of the cat
    public static void createColor()
      {
         ArrayList<String> cColor = new ArrayList<String>();
         cColor.add("Calico");
         cColor.add("Tabby");
         cColor.add("Black");
         cColor.add("White");
         cColor.add("Brown");
         cColor.add("Grey");
      
         Random rand = new Random();
         int indexColor = rand.nextInt(6);
            
         String catColor = cColor.get(indexColor);
         System.out.printf("%s cat ", catColor);
      }
      
      //randomly create the age of the cat
      public static void createAge()
      {
         ArrayList<String> cAge = new ArrayList<String>();
         cAge.add("1");
         cAge.add("2");
         cAge.add("3");
         cAge.add("4");
         cAge.add("5");
         cAge.add("6");
      
         Random rand = new Random();
         int indexAge = rand.nextInt(6);
      
         String catAge = (String) cAge.get(indexAge);
         System.out.printf("of age %s. %n", catAge);
      }
      //Setter and getter for boolean - is the cat alive?
      private boolean alive = true;
      public boolean getAlive()
      {
         return alive;
      }
      public void setAlive(boolean isAlive)
      {
         this.alive = isAlive; 
      }
      
      //purr method
      public static void cPurr()
      {
        System.out.printf("%s is happy and purring.%n", petName);
      }
      
      //eat method
      public void cEat()
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

            System.out.printf("%s is startving.%n", petName);
            System.out.printf("%s is hungry. Would you like to feed %s (Yes or No)? ", petName, petName);

            eat = input.nextLine();

            if(eat.equals("Yes") || eat.equals("yes"))
            {
               System.out.printf("%s is eating.%n", petName);      
            }else if(eat.equals("No") || eat.equals("no"))
            {           
               setAlive(false); 
            }                    
        } //pet dies when neglected - program exits              
      }
      
      //sleep method
      public static void cSleep()
      {
        System.out.printf("%s is tired. Sleeping...%n", petName);
      }
      
      //clean litter method        
      public void cLitter()
      {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s has used the litter box. Would you like to clean the litter (Yes or No)? ", petName);
        String litter = input.nextLine();
        if(litter.equals("Yes") || litter.equals("yes"))
        {
            System.out.printf("%s has a clean litter box.%n", petName);      
        }
        else if(litter.equals("No") || litter.equals("no"))
        {
            System.out.printf("%s's litter is not clean. %s is unhappy.%n", petName, petName);
            System.out.printf("%s has used the litter box. Would you like to clean the litter (Yes or No)? ", petName);

            litter = input.nextLine();

            if(litter.equals("Yes") || litter.equals("yes"))
            {
               System.out.printf("%s has a clean litter box.%n", petName);      
            }else if(litter.equals("No") || litter.equals("no"))
            {
               setAlive(false); 
            } //pet dies when neglected - program exits                      
        }        
      }        
      public static void cPlay()
      {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s wants to play. Would you like to play (Yes or No)? ", petName);
        String play = input.nextLine();
        if(play.equals("Yes") || play.equals("yes"))
        {
            System.out.printf("%s has played and is happy.%n", petName);      
        }
        else if(play.equals("No") || play.equals("no"))
        {
            System.out.printf("%s still wants to play. %s is unhappy.%n", petName, petName);        
        }              
    }     
}