import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        String x[] = S.split("");
        
        int z = 0;
        int count = 0;
        for(int i = 1; i < x.length; i++){
            if(z == 0){
                if(!x[i].equalsIgnoreCase("S")){
                    count++;
                }
                z = 1;
                continue;
            }
            else if(z == 1){
                if(!x[i].equalsIgnoreCase("O")){
                    count++;
                }
                z = 2;
                continue;
            }
            else if(z == 2){
                if(!x[i].equalsIgnoreCase("S")){
                    count++;
                }
                z = 0;
                continue;
            }
        }
        System.out.println(count);
    }
}
