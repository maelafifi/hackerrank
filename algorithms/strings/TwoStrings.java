import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String twoStrings(String s1, String s2){
        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");
        
        List<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
        List<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
        
        Set<String> hs1 = new HashSet<String>();
        Set<String> hs2 = new HashSet<String>();
        
        hs1.addAll(list1);
        list1.clear();
        list1.addAll(hs1);
        
        
        hs2.addAll(list2);
        list2.clear();
        list2.addAll(hs2);
        
        for(int i = 1; i < list1.size(); i++){
            if(list1.get(i).equals("")){
                continue;
            }
            if(list2.contains(list1.get(i))){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        } 
    }
}
