/* Print the Pattern
E E E E E 
D D D D 
C C C 
B B 
A 
*/

package AlphabetPatterns;

public class InvertedRepeatedAlphabetHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' - 1 + i)+ " ");
            }
            System.out.println();
        }
    }
}
