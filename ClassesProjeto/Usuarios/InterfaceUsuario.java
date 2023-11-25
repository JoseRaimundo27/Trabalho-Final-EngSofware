package ClassesProjeto.Usuarios;

import ClassesProjeto.Gerenciador.InterfaceRealizadorEmprestimo;

public interface InterfaceUsuario {

    String getNome();
    void setNome(String nome);
    
    double getCodigoIdentificacao();
    void setCodigoIdentificacao(double codigoIdentifcacao);

    int getTempoEmprestimo();
    void setTempoEmprestimo(int tempoEmprestimo);

    boolean isDevedor();
    void setDevedor(boolean devedor);

    //Métodos comuns para alunos e professores:
    String devolucaoLivro();
    String reservaLivro();
    String emprestimo();

    //Para retornar o tipo de usuário (não fazer instanceOFF):
    public InterfaceRealizadorEmprestimo obterTipoEmprestimo();




}