
package escola_poo;

import java.util.Date;

public class Professor extends Pessoa {
    public double salario;
    public String materia;

    public Professor(String nome, String cpf, Date datanascimento, double salario, String materia) {
        super(nome, cpf, datanascimento);
        this.salario = salario;
        this.materia = materia;
    }
}

