/*********************************
* Group 1 : Shel Plo Wah & Kerry Regan 
* Date : 07/22/2020
* Project: Vitual Pets
**********************************/


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class VirtualPetApp
{   
   public static void main(String[] args)
   {
      System.out.println("Welcome to the Virtual Pet!");
      System.out.println("Keep your pet alive by playing, feeding, or cleaning your pet when"
         + " they need it.");
      System.out.println("When the pet dies, you will exit the program.");
      System.out.println();
      
      String petType;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Do you want to play our vitual pet game? 'Yes' to continue playing or 'Exit' to quit: ");
      String userDecision = input.nextLine();
      
      boolean alive = true;

      
      
      
      //while loop to exit the program
      while(!userDecision.equalsIgnoreCase("exit") && alive == true)
      //for (int i = 0; i < 10; i++)
      {
      
      System.out.print("What kind of pet do you have (cat, dog, fish, rabbit): ");
      petType = input.nextLine();
         
      String petName;
      System.out.printf("What is the name of your %s: ", petType);
      petName = input.nextLine();
      System.out.printf("You have a %s named %s%n", petType, petName);
      
     // while(alive = true)
      //{
      //Select cat if user selects cat
         if(petType.equals("cat")) 
         {
            CatClass myCat = new CatClass(petName);
            //print the cat's color, age and name here
            System.out.printf("%s is a ", petName);
            myCat.createColor();
            myCat.createAge();
       
            while(alive == true)
            //for (int j = 0; j < 10; j++)//somehow say animal is not dead and I want this to be a while loop
            {
            
               ArrayList<String> callMethods = new ArrayList<String>();
         
               callMethods.add("purr");
               
               callMethods.add("eat");
              
               callMethods.add("sleep");
               callMethods.add("litter");
               callMethods.add("play");
         
               Random rand = new Random();
               int indexMethod = rand.nextInt(5);
      
               String whichMethod = callMethods.get(indexMethod);
         
               switch(whichMethod)
               {
                  case "purr":
                     myCat.cPurr();
                     break;
                  case "eat":
                     myCat.cEat();
                     break;
                  case "sleep":
                     myCat.cSleep();
                     break;
                  case "litter":
                     myCat.cLitter();
                     break;
                  case "play":
                     myCat.cPlay();
                     break;
                  default:
                     myCat.cPurr(); 
                     break; 
               }
               if(myCat.getAlive() == false)
               {
                  alive = false;
               }
            }
            System.out.print("Your cat has died. Thank you for playing Virtual Pet.");

         }
         
       //Select dog if user enters dog  
       if(petType.equals("dog")) 
         {
            DogClass myDog = new DogClass(petName);
            //print the cat's color, age and name here
            System.out.printf("%s is a ", petName);
            myDog.createBreed();
            myDog.createAge();
            alive = true;
       
            //for (int j = 0; j < 10; j++)
            while(alive == true)
            {
            
               ArrayList<String> callMethods = new ArrayList<String>();
         
               callMethods.add("walk");
               callMethods.add("eat");
               callMethods.add("sleep");
               callMethods.add("play");
               callMethods.add("train");
         
               Random rand = new Random();
               int indexMethod = rand.nextInt(5);
      
               String whichMethod = callMethods.get(indexMethod);
         
               switch(whichMethod)
               {
                  case "walk":
                     myDog.walkTheDog();
                     break;
                  case "eat":
                     myDog.dEat();
                     break;
                  case "sleep":
                     myDog.dSleep();
                     break;
                  case "play":
                     myDog.dPlay();
                     break;
                  case "train":
                     myDog.dTrain();
                     break;
                  default:
                     myDog.dPlay(); 
                     break; 
               }
               if(myDog.getAlive() == false)
               {
                  alive = false;
               }
               

            }
            System.out.print("Your dog has died. Thank you for playing Virtual Pet.");


         }
         
         //select rabbit if user enters rabbit
         if(petType.equals("rabbit")) 
         {
            RabbitClass myRabbit = new RabbitClass(petName);
            //print the  rabbit colod, age and name here
            System.out.printf("%s is a ", petName);
            myRabbit.createColor();
            myRabbit.createAge();
            alive = true;
       
            while(alive == true)
            {
            
               ArrayList<String> callMethods = new ArrayList<String>();
         
               callMethods.add("eat");
               callMethods.add("Clean");
               callMethods.add("play");
               callMethods.add("vet");
               callMethods.add("largerCage");
         
               Random rand = new Random();
               int indexMethod = rand.nextInt(5);
      
               String whichMethod = callMethods.get(indexMethod);
         
               switch(whichMethod)
               {
                  case "eat":
                     myRabbit.rEat();
                     break;
                  case "clean":
                     myRabbit.rCleanCage();
                     break;
                  case "play":
                     myRabbit.rPlay();
                     break;
                  case "vet":
                     myRabbit.rVet();
                     break;
                  case "largerCage":
                     myRabbit.makeCageLarger();
                     break;
                  default:
                     myRabbit.rPlay(); 
                     break; 
               }
               if(myRabbit.getAlive() == false)
               {
                  alive = false;
               }
            }
            System.out.print("Your rabbit has died. Thank you for playing Virtual Pet.");

         }
         
         //Create fish if fish is selected
         if(petType.equals("fish")) 
         {
            FishClass myFish = new FishClass(petName);
            //print the fish species, age and name here
            System.out.printf("%s is a ", petName);
            myFish.createSpecies();
            myFish.createAge();
            alive = true;
       
            while(alive == true)
            {
            
               ArrayList<String> callMethods = new ArrayList<String>();
         
               callMethods.add("eat");
               callMethods.add("Clean");
               callMethods.add("sleep");
               callMethods.add("swim");
               callMethods.add("eat");
               callMethods.add("Clean");
               callMethods.add("sleep");
               callMethods.add("swim");
               callMethods.add("flush");
               
         
               Random rand = new Random();
               int indexMethod = rand.nextInt(9);
      
               String whichMethod = callMethods.get(indexMethod);
         
               switch(whichMethod)
               {
                  case "eat":
                     myFish.fEat();
                     break;
                  case "clean":
                     myFish.fCleanTank();
                     break;
                  case "sleep":
                     myFish.fSleep();
                     break;
                  case "swim":
                     myFish.fSwim();
                     break;
                  case "flush":
                     myFish.fFlush();
                     break;
                  default:
                     myFish.fSwim(); 
                     break; 
               }
               if(myFish.getAlive() == false)
               {
                  alive = false;
               }

            }
            System.out.print("Your fish has died. Thank you for playing Virtual Pet.");

         } 
         
         //System.out.print("Do you want to play our vitual pet game? Enter 'Yes' to continue playing or 'Exit' to quit the game: ");
      	//userDecision = input.nextLine();
     
   }
   
   //System.out.println("Thank you for playing with our vitual pet.");
}
}
     
   
