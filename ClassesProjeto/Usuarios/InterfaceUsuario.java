package ClassesProjeto.Usuarios;

import java.util.ArrayList;

import ClassesProjeto.Gerenciador.InterfaceRealizadorEmprestimo;
import ClassesProjeto.Livro.InterfaceLivro;

public interface InterfaceUsuario {

    String getNome();
    void setNome(String nome);

    int getCodigoIdentificacao();
    void setCodigoIdentificacao(int codigoIdentifcacao);

    int getTempoEmprestimo();
    void setTempoEmprestimo(int tempoEmprestimo);

    boolean isDevedor();
    void setDevedor(boolean devedor);

    
    ArrayList<InterfaceLivro> getLivrosEmprestados();
    void setLivrosEmprestados(ArrayList<InterfaceLivro> livros);

    ArrayList<InterfaceLivro> getLivrosReservados();

    // Métodos comuns para alunos e professores:

    void addEmprestimo(InterfaceLivro livro);
    void addReserva(InterfaceLivro livro);
    void removeReserva(InterfaceLivro livro);
    void attDevolucao(InterfaceLivro livro);
    void listaLivrosEmprestados();

    // Para retornar o tipo de usuário (não fazer instanceOFF):
    public InterfaceRealizadorEmprestimo obterTipoEmprestimo();

}