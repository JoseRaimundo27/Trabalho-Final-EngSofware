package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Livro.InterfaceLivro;

public interface InterfaceRealizadorEmprestimo {
    
    boolean realizarEmprestimo(InterfaceUsuario usuario, InterfaceLivro livro);
}