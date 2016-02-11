/**
 * Created by garrett on 2/2/16.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numHits = 0;

    void setLocationArray(int[] loci) {
        locationCells = loci;
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