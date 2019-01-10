//This is a 3 + 3D number generator. May lady luck be with you!

import java.lang.*;
import java.util.Scanner;


public class ThreePlus3D{
public static void main(String[] args){
Scanner j  = new Scanner(System.in);

String input;

System.out.println("Hey there would you like a million dollars? ");
System.out.println("If you want a million dollars, use my lucky 3+3D number generator");
System.out.println("Press enter to keep generating new combinations, or press 'q' to quit ");
    
do{
input = j.nextLine();
    if(input.equals("")){
        int prizeWinner = (int) ((Math.random() * 1000000)-1); // randomly generates a number between 0 to 999999
        int animal = (int) (Math.random() * 11); //randomly generates a number from  0 to 12
        String animalString;
    
        switch(animal){ // corresponding assignment of 0 to 12 to an animal
            case 0: animalString = "Rat";
                break;
            case 1: animalString = "Ox";
                break;
            case 2: animalString = "Tiger";
                break;
            case 3: animalString = "Rabbit";
                break;
            case 4: animalString = "Dragon";
                break;
            case 5: animalString = "Snake";
                break;
            case 6: animalString = "Horse";
                break;
            case 7: animalString = "Goat";
                break;
            case 8: animalString = "Monkey";
                break;
            case 9: animalString = "Rooster";
                break;
            case 10: animalString = "Dog";
                break;
            case 11: animalString = "Pig";
                break;
            default: animalString = "Sequence error, generate a new sequence";
                break;
    }
    

System.out.println( prizeWinner + "\t" + animalString );} // prints the lucky number + animal

else if(input.equals("q"))
{
    System.out.println("May lady luck be with you! :)");
}
else{}
}
while(input.equals(""));

}
}
