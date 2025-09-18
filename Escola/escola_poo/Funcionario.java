
package escola_poo;

import java.util.Date;

public class Funcionario extends Pessoa {
    public double salario;
    public String cargo;
    public Date dataAdmissao;

    public Funcionario(String nome, String cpf, Date datanascimento, double salario, String cargo, Date dataAdmissao) {
        super(nome, cpf, datanascimento);
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }
}
