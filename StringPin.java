package com.wipro.practice;

import java.util.Scanner;

public class StringPin {
    static int stringCode(String input1){
        int split_len=0;
        for(String split:input1.split(" "))
            split_len+=split.length();
        int code=0;
        while (split_len>0 || code > 9) {
            if (split_len == 0) {
                split_len = code;
                code = 0;
            }
            code += split_len % 10;
            split_len /= 10;
        }
        System.out.println(code);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        stringCode(input1);
    }
}
