package ClassesProjeto.Gerenciador;
import java.util.ArrayList;
//PARA FACILITAR MUDANÇAS FUTURAS NA FUNCIONALIDADE DE OBSERVADOR


import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public interface InterfaceServicoObservador {

    void criarObservador(double codigoUsuario, double codigoLivro, ArrayList<InterfaceUsuario> usuarios,
            ArrayList<InterfaceLivro> livros);

    void verificaReservaParaObservador(InterfaceLivro livro, InterfaceUsuario u);

}