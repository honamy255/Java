package arrayspartum;

public class ArraysPartUm

{
    public static void main(String[] args)
    //size index+1 pois o array sempre começa de 0 a 1,2,3 ...
    {
      //criando referencia ao array 
      //referencia sempre sera a um objeto
      //new int [3] estou definindo o tamanho na memoria
      int [] idade = new int [3];  
      //index = 2 
      idade[0] = 20;
      idade[1] = 15;
      idade[2] = 30;
        System.out.println("idade 1 "+idade[0]);
        System.out.println("idade 2 "+idade[1]);
        System.out.println("idade 3 "+idade[2]);
    }
    
}
