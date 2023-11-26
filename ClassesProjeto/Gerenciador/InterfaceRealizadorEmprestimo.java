package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Livro.InterfaceLivro;

public interface InterfaceRealizadorEmprestimo {
    
    String realizarEmprestimo(InterfaceUsuario usuario, InterfaceLivro livro);
}