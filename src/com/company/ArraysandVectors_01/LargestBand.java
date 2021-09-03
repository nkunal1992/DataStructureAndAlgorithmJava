package com.company.ArraysandVectors_01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class LargestBand {

    public static int largestBand(Vector<Integer> arr){
        int n = arr.size();
        Set<Integer> s = new HashSet<>();

        //Data inside a set
        s.addAll(arr);

        //Iterate over the arr
        int largestLen = 1;

        for(Integer element : s){
            int parent = element - 1;

            if(!s.contains(parent)){
                //find entire band / chain starting from element
                int next_no = element + 1;
                int cnt = 1;

                while(s.contains(next_no)){
                    next_no++;
                    cnt++;
                }

                if(cnt>largestLen){
                    largestLen = cnt;
                }
            }
        }


        return largestLen;
    }



    public static void main(){
        Integer [] a = {1,9,3,0,18,5,2,4,10,7,12,6};
        Vector<Integer> arr = new Vector<>();
        Collections.addAll(arr, a);

        System.out.println(largestBand(arr));
    }
}
