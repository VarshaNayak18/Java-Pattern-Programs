/* Print the Pattern- Inverted Half Pyramid (rotated by 180 degree)
   *
  **
 ***
****
*/

public class InvertedHalfPyramid180 {
    public static void main(String args[]){
        int n = 4;        

        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");      //space
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");      //star
            }
            System.out.println();
        }
    }
}