/**
 * Created by garrett on 2/10/16.
 */
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleDotCom hans = new SimpleDotCom();
        //just a little testcode for tossup array. delete it when you know it works
        hans.setLocationArray();
        for(int testIteration:hans.getLocationCells()){
            System.out.println(hans.getLocationCells()[testIteration]);
            testIteration++;
        }



    }
}
