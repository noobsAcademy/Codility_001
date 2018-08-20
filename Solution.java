// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
package binarygap;
class Solution {
    //Must return the max number of consecutive 0s between 1s
    //Example: N = 41 -> Binary = 101001 -> Máx = 2
    //Example: N = 40 -> Binary = 101000 -> Máx = 1
    public static int solution(int N) {
        int maxCeros=0;
        int actCeros=0;
        while (N>1) {
            if  (N%2==0)  {
                N/=2;
                continue;
            }
            N/=2;
            while (N%2==0) {
                actCeros++;
                N/=2;
            }
            if (maxCeros<actCeros) maxCeros = actCeros;
            actCeros=0;
        }
        return maxCeros;
    }
}