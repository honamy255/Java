package professor;

import matricula.ProfessorMatricula;
        
public class Professor

{

    public static void main(String[] args)
    
    {
     
      ProfessorMatricula prof = new ProfessorMatricula();
      
      prof.nome = "deadpool";
      prof.cpf = "111.222.345.98";
      prof.matricula = "2550";
      prof.rg = "28.345.987-0";
      
        
      System.out.println("Nome :" + prof.nome);
      System.out.println("Cpf :" + prof.cpf);
      System.out.println("Matricula :" + prof.matricula);
      System.out.println("Rg :" + prof.rg);
              
                  
    }
    
}
