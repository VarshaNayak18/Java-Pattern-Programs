/* Print the Pattern
A 
B A 
C B A 
D C B A 
E D C B A 
*/

package AlphabetPatterns;

public class ReverseAlphabetTriangle{
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print((char)('A' + j - 1)+ " ");
            }
            System.out.println();
        }
    }
}