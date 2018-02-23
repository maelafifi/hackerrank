// some of this stuff is awful and was completed years ago. Forgive my coding style and inefficiencies

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++)
        {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++)
        {
            orange[orange_i] = in.nextInt();
        }
        int apples = 0;
        int oranges = 0;
        for(int i = 0; i < apple.length; i++)
        {
            if(a + apple[i] >= s && a + apple[i] <= t)
            {
                apples++;
            }
        }
        
        for(int i = 0; i < orange.length; i++)
        {
            if(b + orange[i] >= s && b + orange[i] <= t)
            {
                oranges++;
            }
        }
        System.out.println(apples);
        System.out.println(oranges);
    }
}
