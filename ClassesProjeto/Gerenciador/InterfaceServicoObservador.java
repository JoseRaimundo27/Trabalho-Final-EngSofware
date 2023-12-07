package ClassesProjeto.Gerenciador;
import java.util.ArrayList;
//PARA FACILITAR MUDANÇAS FUTURAS NA FUNCIONALIDADE DE OBSERVADOR


import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceObservador;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public interface InterfaceServicoObservador {

    void criarObservador(int codigoUsuario, int codigoLivro, ArrayList<InterfaceUsuario> usuarios,
            ArrayList<InterfaceLivro> livros);

    void verificaReservaParaObservador(InterfaceLivro livro, InterfaceObservador u);
    void notifyObservers(InterfaceLivro livro);

}