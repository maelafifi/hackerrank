import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        for(int i = 0; i < queries; i++){
            int x = 0;
            int count = 0;
            int curr = in.nextInt();
            for(int j = 2; j <= Math.sqrt(curr); j++){
                if(curr%j == 0 && j%2 == 0){
                    count++;
                }
                if(curr%(curr/j) == 0 && (curr/j) != j && (curr/j)%2 == 0){
                    count++;
                }
            }
            if(curr%2 == 0){
                count++;
            }
            System.out.println(count);
        }
    }
}
