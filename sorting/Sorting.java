
package sorting;


import java.util.Arrays;
import java.util.Random;

public class Sorting {

    public static void main(String[] args) {
        int j=0,counter=0;
        int[] x= new int[]{2,3,5,4,1};
        int[] y= new int[]{1,2,3,4,5};
        for(int i=0;i< 3;i++){
            while(x[i]!=y[j]){
                j++;
            }
            if(i<j)
                counter++;
        }
        System.out.println(counter);
    }


}