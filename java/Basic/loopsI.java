/*
 * Problem:https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
 * Complex: O(n)
 * Goal: Read an integer and print its multiplication table from 1 to 10.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        for(int i=1;i<11;i++){
            System.out.println(N+" x "+i+" = "+N * i);
        }
    }
}
