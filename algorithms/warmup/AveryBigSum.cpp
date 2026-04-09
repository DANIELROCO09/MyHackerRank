/**
 * Problem: A Very Big Sum
 * Link: https://www.hackerrank.com/challenges/a-very-big-sum/problem
 * Note: El reto principal es el manejo de tipos de datos grandes (64-bit integers).
 */
long aVeryBigSum(vector<long> ar) {
    long sum=0;
    for(long i=0;i<ar.size();i++){
        sum+=ar[i];
    }
    return sum;
}
/*Se hace la suma de los elementos del vector atraves de un for con la cual podemos
 * obtener la complejidad de O(n)*/
