package ClassesProjeto.Gerenciador;
//PARA FACILITAR MUDANÇAS FUTURAS NA FUNCIONALIDADE DE OBSERVADOR
import java.util.List;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public interface InterfaceServicoObservador {

    void criarObservador(double codigoUsuario, double codigoLivro, List<InterfaceUsuario> usuarios,
            List<InterfaceLivro> livros);

    void verificaReservaParaObservador(InterfaceLivro livro, InterfaceUsuario u);

}