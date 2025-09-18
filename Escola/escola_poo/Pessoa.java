
package escola_poo;

import java.util.Date;


public class Pessoa {
     public String nome;
    public String cpf;
    public Date datanascimento;
    
    public Pessoa(String nome, String cpf, Date datanascimento) { 
        this.nome = nome;
        this.cpf = cpf; 
        this.datanascimento = datanascimento;
    } 
    
    public double tirarCopias(int qtd) { 
        return 0.10 * qtd; 
    }
}
