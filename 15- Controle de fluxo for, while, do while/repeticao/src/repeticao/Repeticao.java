package repeticao;

public class Repeticao
{
    public static void main(String[] args)
    
    {
      int contador = 0;
      while(contador < 10 )
      {
          System.out.println(contador);
          contador++;
      }
      do 
      {
          System.out.println("dentro do while");
      }while(contador<10);
      
      for(int i=0;i<10;i++)
      
      {
          System.out.println("o valor de i "+i);
      }
    }
    
}
