import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String organizingContainers(int[][] container, int n) {
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i] += container[j][i];
                arr2[i] += container[i][j];
            }
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(Arrays.equals(arr, arr2)){
            return "Possible";
        }
        return "Impossible";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] container = new int[n][n];
            for(int container_i = 0; container_i < n; container_i++){
                for(int container_j = 0; container_j < n; container_j++){
                    container[container_i][container_j] = in.nextInt();
                }
            }
            String result = organizingContainers(container, n);
            System.out.println(result);
        }
        in.close();
    }
}
