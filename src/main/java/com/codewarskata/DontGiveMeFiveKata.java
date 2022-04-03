package com.codewarskata;

public class DontGiveMeFiveKata {

    public static int dontGiveMeFive(int start, int end){
        int i=start;
        int count=0;
        while(i<=end){
            if(String.valueOf(i).indexOf("5")==-1){
                count++;
            }
            i++;
        }

        return count;
    }
}