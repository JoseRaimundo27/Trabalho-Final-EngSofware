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

    
    List<InterfaceLivro> getLivrosEmprestados();
    void setLivrosEmprestados(List<InterfaceLivro> livros);

    List<InterfaceLivro> getLivrosReservados();

    // Métodos comuns para alunos e professores:

    void addEmprestimo(InterfaceLivro livro);
    void addReserva(InterfaceLivro livro);
    void removeReserva(InterfaceLivro livro);
    void attDevolucao(InterfaceLivro livro);

    // Para retornar o tipo de usuário (não fazer instanceOFF):
    public InterfaceRealizadorEmprestimo obterTipoEmprestimo();

}