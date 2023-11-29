package ClassesProjeto.Usuarios;

import java.util.List;

import ClassesProjeto.Livro.InterfaceLivro;

public interface InterfaceUsuarioProfessor extends InterfaceUsuario{
    //Professores podem observar livros ( que alunos ñ podem)
    List<InterfaceLivro> getLivrosObservados();
    int getQntDeNotificacao();

    void attLivrosObservados(InterfaceLivro livro);
    void registarNotificacao();
}
