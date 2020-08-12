/*********************************
* Group 1 : Shel Plo Wah & Kerry Regan 
* Date : 07/22/2020
* Project: Vitual Pets
**********************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class DogClass
{
  //fields
  private String petName; 
  
  //randomly select breed of dog 
  public static void createBreed()
  {
      ArrayList<String> dBreed = new ArrayList<String>();
      dBreed.add("Maltese");
      dBreed.add("Golden Retriever");
      dBreed.add("Border Collie");
      dBreed.add("Cairn Terrier");
      dBreed.add("Dalmatian");
      dBreed.add("Corgi"); 
   
      Random rand = new Random();
      int indexColor = rand.nextInt(6);
         
      String dogBreed = dBreed.get(indexColor);
      System.out.printf("%s ", dogBreed);
  }
  
  //randomly select age of dog 
  public static void createAge()
  {
      ArrayList<String> dAge = new ArrayList<String>();
      dAge.add("1");
      dAge.add("2");
      dAge.add("3");
      dAge.add("4");
      dAge.add("5");
      dAge.add("6");
   
      Random rand = new Random();
      int indexAge = rand.nextInt(6);
   
      String dogAge = (String) dAge.get(indexAge);
      System.out.printf("of age %s. %n", dogAge);
  }
   
   //Constructor
   public DogClass(String petName)
   {
      this.petName = petName;
   }
   
   //petname
   public String getPetName()
   {
        return petName;
   }
   //is the dog alive?
   private boolean alive = true;
   public boolean getAlive()
   {
        return alive;
   }
   public void setAlive(boolean isAlive)
   {
      this.alive = isAlive; 
   }
 
   //walk-the-dog method
   public void walkTheDog()
   {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s needs to go out. Would you like to walk %s? (Yes or No)? ", petName, petName);
        String walk = input.nextLine();
        
        if(walk.equals("Yes") || walk.equals("yes"))
        {
            System.out.printf("%s is happy after the walk.%n", petName);      
        }
        else if(walk.equals("No") || walk.equals("no"))
        {
               System.out.printf("%s still needs to go out. %s is unhappy and will die without going out.%n", petName, petName);
               System.out.printf("Would you like to walk %s (Yes or No)? ", petName);
               walk = input.nextLine();
            
               if(walk.equals("Yes") || walk.equals("yes"))
               {
                  System.out.printf("is happy after the walk.%n", petName);      
               } else {          		
                  setAlive(false); 
               } //pet dies when neglected - program exits         
        } 
   }
   
   //Eat method
   public void dEat()
   {
      Scanner input = new Scanner(System.in);
      System.out.printf("%s is hungry. Would you like to feed %s (Yes or No)? ", petName, petName);
      String eat = input.nextLine();
      
        if(eat.equals("Yes") || eat.equals("yes"))
        {
            System.out.printf("%s is eating the kibble.%n", petName);     
        }
        else if(eat.equals("No") || eat.equals("no"))
        {
               System.out.printf("%s is startving and will die without being fed.%n", petName);
               System.out.printf("%s is hungry. Would you like to feed %s (Yes or No)? ", petName, petName);
               eat = input.nextLine();
          	   if(eat.equals("Yes") || eat.equals("yes")) 
               {
                 	System.out.printf("%s is eating.%n", petName);    
               } else {          		
                 	setAlive(false);  
               }     
        } //pet dies when neglected - program exits 
   }
  
   //Sleep method 
   public void dSleep()
   {
       System.out.printf("%s is tired. Sleeping... (ZZZZZZZZZZZ)%n", petName);
   }
   
   //Play method
   public void dPlay()
   {
      Scanner input = new Scanner(System.in);
      System.out.printf("%s wants to play. Would you like to play with %s? (Yes or No)? ", petName, petName);
      String play = input.nextLine();
        
        if(play.equals("Yes") || play.equals("yes"))
        {
            System.out.printf("%s has played fetch and is happy.%n", petName);      
        }
        else if(play.equals("No") || play.equals("no"))
        {
               System.out.printf("%s still wants to play. %s is unhappy.%n", petName, petName);
               System.out.printf("Would you like to play with %s (Yes or No)? ", petName);
               play = input.nextLine();
            
               if(play.equals("Yes") || play.equals("yes"))
               {
                  System.out.printf("%s has played fetch and is happy.%n", petName);      
               } else {          		
                 	setAlive(false);  
               }          
        }
    }   
        
      //Add a training method to train the dog - teach the dog to sit and give paw  
      public void dTrain()
      {
         Scanner input = new Scanner(System.in);
         System.out.printf("Would you like to train %s? ", petName);
         String train = input.nextLine();
         if(train.equals("Yes") || train.equals("yes"))
         {
            System.out.printf("Say \"sit\" to teach %s to sit: ", petName);
            train = input.nextLine();
            if(train.equals("sit"))
            {
               System.out.printf("You have taught %s to sit!%n", petName);
               System.out.printf("Say \"paw\" to teach %s to give paw: ", petName);
               train = input.nextLine();
               if(train.equals("paw"))
               {
                  System.out.printf("You have taught %s to give paw!%n", petName);
               }else{
                  System.out.printf("%s is mis-behaving and needs to be trained!%n", petName);
               }
            }else{
               System.out.printf("%s is mis-behaving and needs to be trained!%n", petName);
            }

         }else{
            System.out.printf("%s is mis-behaving and needs to be trained!%n", petName);
         }
      }
  
}