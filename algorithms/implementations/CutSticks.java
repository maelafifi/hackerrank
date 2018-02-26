import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void cutTheSticks(ArrayList<Integer> arr) {
        int count = 0;
        int skipped = 0;
        while(skipped != arr.size()){
            int min = Integer.MAX_VALUE;
            skipped = 0;
            count = 0;
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) != 0 && arr.get(i) < min){
                    min = arr.get(i);
                }
            }
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) == 0){
                    skipped++;
                }
                else{
                    int x = arr.get(i);
                    arr.set(i, x-min);
                    count++;
                }
            }
            if(skipped != arr.size()){
                System.out.println(count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr.add(in.nextInt());
        }
        cutTheSticks(arr);



        in.close();
    }
}
