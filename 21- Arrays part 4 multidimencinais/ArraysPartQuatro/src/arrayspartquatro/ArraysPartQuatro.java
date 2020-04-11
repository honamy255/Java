package arrayspartquatro;

public class ArraysPartQuatro

{

    public static void main(String[] args)
    //array bidimencional
    {
       int[][] dias = new int [2][2];
       dias[0][0] = 30 ;
       dias[0][1] = 31 ;
       dias[1][0] = 29 ;
       dias[1][1] = 28 ;
       //[I@1db9742 localização da memoria no array i
       //[I@106d69c localização da memoria no array k
       for (int i = 0 ; i<dias.length ; i++)
       {
           System.out.println(dias[i]);
       for (int k =0 ; k<dias[1].length ; k++)
          {
            System.out.println(dias[i][k]);
          }
       }
        
        System.out.println("-----------------------------------");
       for(int[] ref : dias)
       {
          for(int dia : ref)
          {
              System.out.println(dia);
          }
          
       }
    }
  }
