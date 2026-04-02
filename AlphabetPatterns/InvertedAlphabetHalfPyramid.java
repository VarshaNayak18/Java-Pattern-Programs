/* Print the Pattern- Alphabet Half Pyramid
A B C D E 
B C D E 
C D E 
D E 
E 
*/

package AlphabetPatterns;

public class InvertedAlphabetHalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print((char)('A' - 1 + j) + " ");
            }
            System.out.println();
        }
    }
}
