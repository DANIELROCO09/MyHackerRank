/*Problem:https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
 * Complex: O(1)
 * Goal: Read three numbers using java Scanner class and output
*/
public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        scanner.close();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
