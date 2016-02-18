/**
 * Created by garrett on 2/2/16.
 */
import java.util.ArrayList;
public class DotCom {
    private String name;
    private ArrayList<String> locationCells;
    DotCom(String NameEntry){
        name= NameEntry;
    }
    //tells me the first location in the array
    void testArray(){
        System.out.println(locationCells.get(0));
    }


    void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    //might not be needed, because I set the name in the constructor
    void setname(String nameIn){
        name=nameIn;
    }
    String getName(){
        return name;
    }

    String checkYourself(String guess) {
        String result = "miss";
       int index=locationCells.indexOf(guess);
        if(index>=0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result="kill";
            } else{
                result="hit";
            }
            //end else
        }
        return result;
    }
}