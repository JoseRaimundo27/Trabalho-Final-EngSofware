package ClassesProjeto.Usuarios;


public class AlunoPosGraduacao implements InterfaceUsuario{
    String nome;
    double codigoIdentificacao;
    //Especifidades:
    int tempoEmprestimo = 4;
    int limiteDeEmprestimos = 4;


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

    //Para retornar o tipo de usuário (não fazer instanceOFF):
    public InterfaceUsuario obterTipoUsuario(){
        return new AlunoPosGraduacao();
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

}

    

