/* Print the Pattern- Solid Rectangle
*****
*****
*****
*****
*/

public class SolidRectangle {
    public static void main(String args[]){
        int m = 4;     //number of rows
        int n = 5;     //number of columns

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}