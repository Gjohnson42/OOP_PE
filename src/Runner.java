import java.util.ArrayList;

/**
 * Created by garrett on 2/10/16.
 */

public class Runner {
    //These are all the variable and object instantiation for this class.
    private ReadyBakeInput helper = new ReadyBakeInput();
    private Runner mainGame= new Runner();
    private ArrayList<DotCom> dotComholder= new ArrayList<>();
    int numGuesses=0;
    void setUpGame(){
        DotCom pets= new DotCom("Pets.com");
        DotCom jazzercise= new DotCom("Jazzercise.com");
        DotCom go2=new DotCom("Go2.com");
        System.out.println("Three Dotcoms lie in wait, but not for long. Enter letters and Numbers to find them.");

    }
    void startPlaying(){

    }
    void checkUserGuess(){

    }
    void finishGame(){

    }

}

