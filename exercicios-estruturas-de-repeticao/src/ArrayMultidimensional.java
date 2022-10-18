import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] M = new int[4][4];
        Random random = new Random();

        for (int x=0;x<M.length;x++){
            for (int y=0;y<M.length;y++){
                M[x][y] = random.nextInt(9);
            }
        }
          for (int x=0;x<M.length;x++){
              for (int y=0;y<M.length;y++){
                  System.out.println("Numero da posição ("+(x+1)+","+(y+1)+"):"+ M[x][y]);
            }
          }
        }
    }

