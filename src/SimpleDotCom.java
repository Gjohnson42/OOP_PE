/**
 * Created by garrett on 2/2/16.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
public class SimpleDotCom {
    private ArrayList locationCells;



    void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    String checkYourself(String guess) {
        String result = "miss";
        for( locationCells){

        }
       int index=locationCells.indexOf(guess);
        if(index>=0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result="kill";
            }
            else{
                result="hit";
            }
            //end else
        }
        return result;
    }
}