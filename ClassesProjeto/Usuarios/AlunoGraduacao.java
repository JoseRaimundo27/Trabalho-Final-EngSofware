package ClassesProjeto.Usuarios;

import ClassesProjeto.Gerenciador.InterfaceRealizadorEmprestimo;
import ClassesProjeto.Gerenciador.realizadorEmprestimoAluno;

public class AlunoGraduacao implements InterfaceUsuarioAluno {
    String nome;
    double codigoIdentificacao;
    //Especifidades:
    int tempoEmprestimo = 3;
    int limiteDeEmprestimos = 3;
    //para verificar se é devedor ou não:
    boolean devedor,limiteMaximo; //True caso seja devedor ou estorou limite de emprestimos
    int quantidadeDeEmprestimos = 0; //Inicializa com 0 a quantidade de emprestimos


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

    //Para retornar o tipo de empréstimo (não fazer instanceOFF):
    public InterfaceRealizadorEmprestimo obterTipoEmprestimo(){
        return new realizadorEmprestimoAluno();
    }

    /*Incrementa quantidade de emprestimos
    public int addEmprestimo(){
        this.quantidadeDeEmprestimos+= 1;
        if(this.quantidadeDeEmprestimos  == limiteDeEmprestimos){
            setLimiteMaximo(true); //Seta limite máximo
        }
        return this.quantidadeDeEmprestimos;
    } */


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
    public boolean isLimiteMaximo() {
        return limiteMaximo;
    }
    public void setLimiteMaximo(boolean limiteMaximo) {
        this.limiteMaximo = limiteMaximo;
    }
    public int getQuantidadeDeEmprestimos() {
        return quantidadeDeEmprestimos;
    }
    public void setQuantidadeDeEmprestimos(int quantidadeDeEmprestimos) {
        this.quantidadeDeEmprestimos = quantidadeDeEmprestimos;
    }

}
