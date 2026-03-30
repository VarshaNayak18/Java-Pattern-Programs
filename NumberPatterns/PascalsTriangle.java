/* Print the Pattern- Pascal's Triangle
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
*/

public class PascalsTriangle {
    public static void main(String args[]){
        int n = 5;

        for (int i=1;i<=n;i++) {
            for (int j=0;j<=n-i;j++) {
                System.out.print(" ");
            }
            // used to represent x(i, k)
            int x = 1;
            for (int k=1;k<=i;k++) {
                // The first value in a line is always 1
                System.out.print(x+" ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
}
