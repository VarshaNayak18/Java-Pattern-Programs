/* Print the Pattern
E 
D E 
C D E 
B C D E 
A B C D E 
*/

package AlphabetPatterns;

public class ReverseAlphabetHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print((char)('A' + j - 1)+ " ");
            }
            System.out.println();
        }
    }
}
