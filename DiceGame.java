/*
Name: Saurav Arya
Student ID: A00236910
Program Description: DiceGame.java program creates different sized dice objects using each constructor from the Die class i.e., 0 argument default type constructor, 1 argument constructor with sides of dice as parameter and 2 argument constructor with sides and type of dice as parameters. Post that it tests the roll method from the Die class in order to roll the dice and displays the corresponding result (both before and after).
The program also sets and shows the highest value of a desired dice object and displays it in the console.
*/

public class DiceGame{
  public static void main(String[] args){

    System.out.println("\nCreating a default d6...");
    System.out.println("Creating a default d20...");
    System.out.println("Crreating a percentile Die...\n");

    // Creating 1st die object with the default size and showcasing its current up side
    Die Die1 = new Die();
    System.out.println("The current Side up for " + Die1.getType()+ " is "+ Die1.getCurrentSideUp());

    // Creating 2nd die object of 20 sides with a 1 arg constructor and showcasing its current up side
    Die Die2 = new Die((byte)20);
    System.out.println("The current Side up for " + Die2.getType()+ " is "+ Die2.getCurrentSideUp());

    // Creating 3rd die object of 120 sides and d120 type with a 2 arg constructor and showcasing its current up side
    Die Die3 = new Die((byte)120, "d120");
    System.out.println("The current Side up for " + Die3.getType() + "Percentile is " + Die3.getCurrentSideUp());

    System.out.println("\nTesting the roll method ******\n");

    // Testing the roll method to display the random current up side result for the 1st Die object
    System.out.println("Rolling the "+ Die1.getType()+"...");
    System.out.println("The new value for " + Die1.getType()+ " is "+ Die.roll(Die1.getSides())+"\n");

    // Testing the roll method to display the random current up side result for the 2nd Die object
    System.out.println("Rolling the "+ Die2.getType()+"...");
    System.out.println("The current Side up for " + Die2.getType()+ " is "+ Die.roll(Die2.getSides())+"\n");

    // Testing the roll method to display the random current up side result for the 3rd Die object
    System.out.println("Rolling the Percentile...");
    System.out.println("The new value for " + Die3.getType()+ " is "+ Die.roll(Die3.getSides())+"\n");

    // selecting the second die object to set its current up side to its highest value and displaying the result in the console
    byte maxValue = Die2.getSides();
    Die2.setCurrentSideUp(maxValue);
    System.out.println("Setting " + Die2.getType() + " to show " + Die2.getSides() + "...");
    System.out.println("The side up is now " + Die2.getCurrentSideUp() + ". Finally.");
  }
}
