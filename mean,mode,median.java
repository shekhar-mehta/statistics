import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        scan.close();
        
        Arrays.sort(array);
        
        int mode = 0;
        double mean= 0;
        double median =0;
        
        int total = 0;
        
        for(int it : array){
            total += it;
        }
        
        mean = (double) total/n;
        
        median = (n&1) == 1 ? array[n/2] : (array[n/2 -1] + array[n/2]) / 2.0;
        
    mode = array[0];
    int max = 1;
    int appearance = 1;        

    for(int i=1; i<n; i++){

        if ( array[i] == array[i-1] ) {
            appearance ++; 

        } else {
            appearance = 1; 
        }

        if( appearance > max ){
            max = appearance; 
            mode = array[i]; 
        }

    }

        /* Print results */
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
    }
}