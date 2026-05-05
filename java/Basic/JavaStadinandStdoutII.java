/*
 * Problem:https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
 * Complex:O(1)
 * Goal: Read three different data types-an integer,a double,an a string -
 * using the Scanner class and its methods,then print each value on a 
 * new line
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double n2=scanner.nextDouble();
        scanner.nextLine();//Flush the buffer
        String s=scanner.nextLine();
        scanner.close();
        System.out.println("String: "+s);
        System.out.println("Double: "+n2);
        System.out.println("Int: "+n);
    }
}


