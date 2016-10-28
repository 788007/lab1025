
/**
 * Write a description of class Halloween here.
 * 
 * @Laurel Woods
 * @10/25/16
 */
import java.util.Scanner;
public class Halloween
{
    
    public Halloween()
    {
       
    }
    
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        String user = "hi";
        while(!user.equals("quit")){
            System.out.println("Type something!");
            user = scr.next();
            user.toCharArray();
            for(int i = 0; i < user.length(); i++) {
                if(user[i].equals(" ")){
                    
                }
            }
        }
    }
}
