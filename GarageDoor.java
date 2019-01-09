//This program simulates a garage door opening and closing. Edited question from An Introduction to Java, Figure 4.18
// Upon the command to close / open the door there will be a count to 15 before the operation is finished


import java.util.*;
import java.util.Scanner;

public class GarageDoor{

public static void main(String[] args){

Scanner j = new Scanner (System.in);
String entry; //user entry
boolean Direction = true; //is the current direction up
boolean inMotion = false; // is the garage door currently moving?





System.out.println("Type up, down  or 'q' to quit");
entry = j.nextLine();


if(entry.equals("up")){


 
inMotion = !inMotion; // garage door starts to move


if(inMotion){ // if garage door is moving
if(Direction){ // and the direction is up
System.out.println("moving up"); 
}

else {//do nothing}
}}
else{//do nothing
}
for(int i = 1; i <= 15; i++){System.out.println(i);}

inMotion = !inMotion; //door has stopped moving
Direction = !Direction; //direction has changed to move downwards
System.out.println("Garage door has opened, door has stopped moving.");
}

//entry equals up function ends here


else if(entry.equals("down")){

inMotion = !inMotion;

if(inMotion){
if(Direction){System.out.println("moving down");} // updirection has to be false of false ( true)
else{}
}
else{}

for(int i = 1; i <= 15; i++){System.out.println(i);}

inMotion = !inMotion; // door stops moving
Direction = !Direction; // upDirection changes from false to true
System.out.println("Garage door has closed, door has stopped moving.");
}






else if (entry.equals("q")){System.out.println("Program terminated. Thank you for using GarageDoor.");}

// entry response for q
else{}

//else do nothing



}
// end main

}
//end of class
