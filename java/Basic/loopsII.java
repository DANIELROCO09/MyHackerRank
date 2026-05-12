/*
 * Problem:https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
 * Complex:O(n^2)
 * Goal:Read 'q' queries. For each query,read a,b, and n to calculate and print 
 * the terms of series
 */
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int acumulador=a;
            for(int j=0;j<n;j++){
                acumulador+=(Math.pow(2, j)*b);
                System.out.print(acumulador+" ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
