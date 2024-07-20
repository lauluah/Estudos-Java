package Arrays;

public class Arrays {
    public static void main(String[] args) {
       int[][] dias  = new int[3][3];
       dias[0][0] = 31;
       dias[0][1] = 22;
       dias[0][2] = 20;

       dias[1][0] = 2;
       dias[1][1] = 0;
       dias[1][2] = 6;

       dias[2][0] = 9;
       dias[2][1] = 9;
       dias[2][2] = 9;

       for (int i = 0; i < dias.length; i++) {
           for(int j = 0; j < dias[0].length; j++)
           System.out.println(dias[i][j]);
       }
    }
}