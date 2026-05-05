/*
 * Problem:https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
 * Complex: O(n)
 * Goal: Read an integer N,if N is odd,print 'Weird'.if N es even and in the
 * inclusive range of 2 yo 5,print 'Not Weird'.If N is even and in the inclu-
 * sive range of 6 to 20,print 'Weird'. If N is even and greater than 20,print
 * 'Not weird'*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if (N % 2 != 0) {
            System.out.println("Weird");
            }else {
            if(N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            }else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            }else if (N > 20) {
                System.out.println("Not Weird");
            }
        }  
    }
}
