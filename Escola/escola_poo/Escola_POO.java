
package escola_poo;

import java.util.Date;
public class Escola_POO {

    
     public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria Eduarda", "342.657.428-79", new Date(), "A1234");
        Professor professor = new Professor("Carlos Silva", "245.376.795-95", new Date(), 5500.00, "Matemática");
        Funcionario funcionario = new Funcionario("Ana Paula", "236.534.872-42", new Date(), 3200.00, "Secretária", new Date());

        int qtdCopias = 100;

        System.out.println("Aluno: " + aluno.nome + " | Valor das cópias: R$" + aluno.tirarCopias(qtdCopias));
        System.out.println("Professor: " + professor.nome + " | Valor das cópias: R$" + professor.tirarCopias(qtdCopias));
        System.out.println("Funcionário: " + funcionario.nome + " | Valor das cópias: R$" + funcionario.tirarCopias(qtdCopias));
    }
}
