
package banco;

public class Banco {

    // ATRIBUTOS
            private String nome;
            private int quantidadeCliente;
            private  int numeroBanco; 
         
   // METODO ESPECIAL : CONSTRUTOR
    public Banco() {
    }

    public Banco(String nome, int quantidadeCliente, int numeroBanco) {
        this.nome = nome;
        this.quantidadeCliente = quantidadeCliente;
        this.numeroBanco = numeroBanco;
    }
   
 // METODOS 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeCliente() {
        return quantidadeCliente;
    }

    public void setQuantidadeCliente(int quantidadeCliente) {
        this.quantidadeCliente = quantidadeCliente;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }
             
            
    
}
