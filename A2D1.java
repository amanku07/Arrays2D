package Arrays2D;

public class A2D1 {
    public static void main(String[] args) {
         int  [][] a = {
               {1,2,3},
               {3,4,5},
               {6,7,8}
          };
          int sum = 0;
          for (int i = 0; i < a.length; i++) {
                 sum += a[i][i];    
          }
          System.out.println(sum);
    }
}
