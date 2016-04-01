/**
 * Created by Garrett on 4/1/2016.
 */
public class Permanent {
    //This is the superclass for anything that requires a turn slot in the permanent ArrayList.
    private int initAdv;
    private String name;
    private String entryMessage;

    Permanent(){
    }
    Permanent (int init, String message, String n){
        initAdv= init;
        name= n;
        entryMessage = message;
    }

    public int getInitAdv() {
        return initAdv;
    }

    public String getEntryMessage() {
        return entryMessage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String summary= "This Permanent's name is: "+ getName() +"\nInitiative advantage is:"+ getInitAdv()+"\nEntry Message is: ";
        return summary;
    }
}
