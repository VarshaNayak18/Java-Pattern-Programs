/* Print the Pattern- Hollow Rectangle
*****
*   *
*   *
*****
*/

public class HollowRectangle {
    public static void main(String args[]){
        int m = 4;     //number of rows
        int n = 5;     //number of columns

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==m || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}