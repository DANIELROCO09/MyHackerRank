/*
 *Problem:https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
 *Complex: O(n)
 *Goal: Read a string and integer, then print them as formatted table where
 the string is left-justified and the integer is padded with zeros.*/
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
    //format:15 characters in string, 3 in int
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }
}
