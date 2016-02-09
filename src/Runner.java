/**
 * Created by garrett on 2/1/16.
 */
public class Runner {
    public static void main(String[] args){
        SimpleDotCom one= new SimpleDotCom();
        int [] locations = {2,3,4};
        one.setLocationArray(locations);
        if(one.checkYourself("2")=="hit"){
            System.out.println("The method works as intended");
        }else{
            System.out.println("Nope. Something went wrong.");
            System.out.println();
        }




    }
}
