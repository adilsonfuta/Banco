
package banco;

import java.util.Scanner;

public class Executar {
    
    
    public static void main(String[] args) {
  
//        Banco bic=new Banco("BANCO BIC", 500, 001);        
//        Banco  atlantico=new Banco("Atlantico", 1000, 002);
//        System.out.println("O nome do Banco é "+ bic.getNome());
         
         
        Scanner ler=new Scanner(System.in);        
        String nomeBanco;      
        
        System.out.println(" Diga por favor o nome do Banco ");
        nomeBanco=ler.next();
        
        System.out.println(" Diga a Quantidade de Cliente do Banco");
        int qtdClientBanco=ler.nextInt();
        
        System.out.println(" Informe o Numero do seu Banco ");
         int numBanco=ler.nextInt();       
       
         Banco b1=new Banco(nomeBanco, qtdClientBanco, numBanco);
         
        System.out.println(" O numero do Banco "+b1.getNumeroBanco());
        
        System.out.println("Nome do seu banco "+b1.getNome());
        
        System.out.println("Quantidade de Cliente "
                + "do seu banco "+b1.getQuantidadeCliente());
        
       
        System.out.println(" Mudando o valor do numero de clientes (NOVO) ");
        int novonumeroC=ler.nextInt();
        b1.setQuantidadeCliente(novonumeroC);
        
          System.out.println("nova Quantidade de Cliente "
            + "do seu banco "+b1.getQuantidadeCliente());      
           
        
    }
    
    
}
