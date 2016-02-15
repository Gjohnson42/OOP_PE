import java.util.ArrayList;

/**
 * Created by garrett on 2/10/16.
 */
import java.util.ArrayList;
public class Runner {
    int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
    ArrayList determineArrayList(){
        int x= randomWithRange(0,4);
        ArrayList chosenOne= new ArrayList<String>();
        chosenOne.add(0,x);
        chosenOne.add(1,x+1);
        chosenOne.add(2,x+1);
        return chosenOne;
    }

    public static void main(String[] args) {
        SimpleDotCom hans = new SimpleDotCom();
        ReadyBakeInput inny= new ReadyBakeInput();

        boolean isAlive= true;
        System.out.println("Hans the dotcom yet lives. Make him run! Enter numbers 0-6 to hit him. 3 consecutive hits will kill him. ");
        while (isAlive==true){
            //now begins the great gameplay loop

            String playerGuess= inny.getUserInput("Enter a number 0-6: ");
            String result= hans.checkYourself(playerGuess);
            System.out.println(result);
            if (result=="kill"){
                isAlive=false;
                System.out.println("Now, hans must run!");
            }

        }

        }



    }

