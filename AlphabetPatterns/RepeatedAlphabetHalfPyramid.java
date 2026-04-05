/* Print the Pattern
A A A A A 
B B B B 
C C C 
D D 
E 
*/

package AlphabetPatterns;

public class RepeatedAlphabetHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print((char)('A' - 1 + i)+ " ");
            }
            System.out.println();
        }
    }
}
