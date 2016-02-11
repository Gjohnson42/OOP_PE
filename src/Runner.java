/**
 * Created by garrett on 2/10/16.
 */

public class Runner {
    public static void main(String[] args) {
        SimpleDotCom hans = new SimpleDotCom();
        ReadyBakeInput inny= new ReadyBakeInput();
        boolean isAlive= true;
        System.out.println("Hans the dotcom yet lives. Make him run! Enter numbers 0-6 to hit him. 3 consecutive hits will kill him. ");
        while (isAlive==true){
            //now begins the great gameplay loop
            hans.setLocationArray();
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

