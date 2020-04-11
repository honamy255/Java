package arrayspartdois;

public class ArraysPartDois

{
    public static void main(String[] args)
    
    {
        //byte,short,int,long,float,double = 0
        //char = u00
        //boolean = false
        //reference = null
       String [] nomes = new String [4];
       nomes [0] = "midoria";
       nomes [1] = "goku";
       nomes [2] = "moni";
       nomes [3] = "madimbu";
       
        //informa o tamanho do array
        System.out.println("tamanho do array "+nomes.length);
        
       for(int i=0;i<=3;i++)
       {
           System.out.println(nomes[i]);
       }
    }
    
}
