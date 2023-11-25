package ClassesProjeto.Usuarios;

import ClassesProjeto.Gerenciador.InterfaceRealizadorEmprestimo;
import ClassesProjeto.Gerenciador.realizadorEmprestimoProfessor;

public class Professores implements InterfaceUsuario {
    String nome;
    double codigoIdentificacao;
    //Especificidades:
     int tempoEmprestimo = 7;
     int limiteDeEmprestimos = 0;
    //para verificar se é devedor ou não:
    boolean devedor; //True caso seja devedor
    
     //MÉTODOS:
     @Override
     public String emprestimo(){
         return "";
     }
     @Override
    public String devolucaoLivro(){
        return "";
    }
    @Override
    public String reservaLivro(){
        return "";
    }

    public String observarLivro(){
        return "";
     }

     //Para retornar o tipo de empréstimo (não fazer instanceOFF):
    public InterfaceRealizadorEmprestimo obterTipoEmprestimo(){
        return new realizadorEmprestimoProfessor();
    }


     //GETTER E SETTERS:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public void setCodigoIdentificacao(double codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public int getTempoEmprestimo() {
        return tempoEmprestimo;
    }

    public void setTempoEmprestimo(int tempoEmprestimo) {
        this.tempoEmprestimo = tempoEmprestimo;
    }

    public int getLimiteDeEmprestimos() {
        return limiteDeEmprestimos;
    }

    public void setLimiteDeEmprestimos(int limiteDeEmprestimos) {
        this.limiteDeEmprestimos = limiteDeEmprestimos;
    }
    public boolean isDevedor() {
        return devedor;
    }
    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }

}
