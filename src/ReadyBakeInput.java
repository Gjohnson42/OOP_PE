/**
 * Created by garrett on 2/11/16.
 */
import java.io.*;
public class ReadyBakeInput {
    //this isn't my class, so I won't understand it all, but in the meantime, I can use it's methods to get input.
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt+ "  ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e)
        {
            System.out.println("IOexception:" +e);
        }
        return inputLine;
    }
}
