/**
 * Created by garrett on 2/11/16.
 */
import java.io.*;
import java.util.ArrayList;

public class BattleController {
    //this isn't my class, so I won't understand it all, but in the meantime, I can use it's methods to get input.
   //This method requires a prompt that it will display to the user, then returns the String it reads from the user.
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt+ "  ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e)
        {
            System.out.println("IOexception:" +e);
        }
        return inputLine;
    }
    ArrayList<Permanent> initial= new ArrayList<Permanent>();
    //adds a new permanent to the end of the initial arraylist.

    public ArrayList<Permanent> getInitial() {
        return initial;
    }

    void addPermanent(Permanent p){
        initial.add(p);
        String m= "A "+p.getName()+" Has been added.\n";
        System.out.println(m);}
    void setToAlteredArray(ArrayList original, ArrayList altered){
        original= altered;
    }
    //This method takes in an arraylist, and then will return an arraylist that is sorted by initiative order.
    ArrayList sortByInit(ArrayList<Permanent> temp) {
        ArrayList<Permanent> sorted = new ArrayList<Permanent>();
        int originalSize=temp.size();
        while (temp.size>1){

          }
        }


   //Displays the enter the battlefield message for each permanent in the given ArrayList
    void displayETBMessage(ArrayList<Permanent> toBePrinted) {
        for (Permanent canary : toBePrinted) {
            System.out.println(canary.getEntryMessage());
        }
    }
    // iterates, displaying the toString method of each item in the grid.
    void printContents(ArrayList<Permanent> toBePrinted){
        for (Permanent canary:toBePrinted){
            System.out.println(canary.toString());
        }
    }



}
