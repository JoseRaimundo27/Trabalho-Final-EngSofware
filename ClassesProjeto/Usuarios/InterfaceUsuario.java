package ClassesProjeto.Usuarios;

public interface InterfaceUsuario {

    String getNome();
    void setNome(String nome);
    
    double getCodigoIdentificacao();
    void setCodigoIdentificacao(double codigoIdentifcacao);

    int getTempoEmprestimo();
    void setTempoEmprestimo(int tempoEmprestimo);

    //Métodos comuns para alunos e professores:
    String devolucaoLivro();
    String reservaLivro();
    String emprestimo();

    //Para retornar o tipo de usuário (não fazer instanceOFF):
    public InterfaceUsuario obterTipoUsuario();




}