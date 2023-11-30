package ClassesProjeto.Usuarios;

import java.util.ArrayList;
import ClassesProjeto.Livro.InterfaceLivro;

public interface InterfaceObservador extends InterfaceUsuario {
    //Professores podem observar livros ( que alunos ñ podem)
    ArrayList<InterfaceLivro> getLivrosObservados();
    int getQntDeNotificacao();

    void attLivrosObservados(InterfaceLivro livro);
    void registarNotificacao();
}
