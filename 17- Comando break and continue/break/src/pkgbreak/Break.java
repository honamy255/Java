package pkgbreak;

public class Break

{

    public static void main(String[] args)
    
    {
     //dado valor de carro descubra quantas vezes ele pode ser parcelado 
        //porem as parcelas nao podem ser menores que 1000
        
        double valortotal = 30000;
        for(int parcela=1;parcela<=valortotal;parcela++)
        
        {
         double valorparcela = valortotal/parcela;
         if(valorparcela >=1000)
         {
           System.out.println("parcela "+parcela+"x R$ "+valorparcela);
         }
         break;
        }
    }
    
}
