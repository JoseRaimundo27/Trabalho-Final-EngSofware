package ClassesProjeto.Usuarios;

import java.util.List;

import ClassesProjeto.Gerenciador.InterfaceRealizadorEmprestimo;
import ClassesProjeto.Livro.InterfaceLivro;

public interface InterfaceUsuario {

    String getNome();
    void setNome(String nome);

    double getCodigoIdentificacao();
    void setCodigoIdentificacao(double codigoIdentifcacao);

    int getTempoEmprestimo();
    void setTempoEmprestimo(int tempoEmprestimo);

    boolean isDevedor();
    void setDevedor(boolean devedor);

    int getQuantidadeDeReservas();
    void setQuantidadeDeReservas(int quantidadeDeReservas);

    List<InterfaceLivro> getLivros();
    void setLivros(List<InterfaceLivro> livros);

    // Métodos comuns para alunos e professores:
    String devolucaoLivro();

    String reservaLivro();

    String emprestimo(double codigoLivro);

    void addEmprestimo(InterfaceLivro livro);
    void addReserva();
    void attDevolucao();

    // Para retornar o tipo de usuário (não fazer instanceOFF):
    public InterfaceRealizadorEmprestimo obterTipoEmprestimo();

}