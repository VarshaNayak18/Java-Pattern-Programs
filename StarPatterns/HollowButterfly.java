/* Print the Pattern- Hollow Butterfly
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *
*/

public class HollowButterfly {
  public static void main(String args[]){
    int n = 5;
    
    //Upper Half
    for(int i=1;i<=n;i++){
      //1st Part
      for(int j=1;j<=n;j++){
        if(i==j || j==1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      //2nd Part
      for(int j=n;j>=1;j--){
        if(i==j || j==1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    //Lower Half
    for(int i=n;i>=1;i--){
      //1st Part
      for(int j=1;j<=n;j++){
        if(i==j || j==1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      //2nd Part
      for(int j=n;j>=1;j--){
        if(i==j || j==1){
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
               
