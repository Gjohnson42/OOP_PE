/**
 * Created by garrett on 2/2/16.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numHits = 0;
    int randomWithRange(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    int [] tossupArray(){
        int [] toss = new int [4];
        //the magic number here is the max and min
        int randArrayStart =randomWithRange(0,4);
        //now to use this as a startpoint to iterate through and set the rest of the array, setting it as need be.
        int x=0;
        while (x<toss.length){
            toss[x]=randArrayStart+x;
            x++;
        }
        return toss;
    }

    void setLocationArray() {
        locationCells=tossupArray();
    }
   int[] getLocationCells(){return locationCells;}
    void displayLocation(){
        System.out.println(locationCells[0]);
        System.out.println(locationCells[1]);
        System.out.println(locationCells[2]);


    }

    int getNumHits(){
        return  numHits;
    }
    String checkYourself(String guess) {
        String result = "miss";
        int guessInt = Integer.parseInt(guess);
        System.out.println(guessInt);
        for (int cell : locationCells) {
            if (cell == guessInt) {
                result = "hit";
                numHits++;
                break;
            }
        }
        if (numHits == 3) {
            System.out.println("You have killed this upstart!");
        }
        return result;

    }
}