import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int gemstones(String[] arr){
        List<String> al = new ArrayList<>(Arrays.asList(arr[0].split("")));
        Set<String> hs = new HashSet<>();
        hs.addAll(al);
        al.clear();
        al.addAll(hs);
        for(int i = 1; i < arr.length; i++){
            List<String> curr = new ArrayList<>(Arrays.asList(arr[i].split("")));
            Set<String> hs1 = new HashSet<>();
            hs1.addAll(curr);
            curr.clear();
            curr.addAll(hs1);
            al.retainAll(curr);
        }
        return al.size() - 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
