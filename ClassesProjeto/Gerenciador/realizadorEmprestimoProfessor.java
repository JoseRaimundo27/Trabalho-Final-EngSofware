package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Usuarios.InterfaceUsuarioProfessor;
import ClassesProjeto.Livro.InterfaceLivro;

public class realizadorEmprestimoProfessor implements InterfaceRealizadorEmprestimo {
    
    @Override
    public String realizarEmprestimo(InterfaceUsuario u, InterfaceLivro livro) {
        InterfaceUsuarioProfessor usuario = (InterfaceUsuarioProfessor)u;
        return "";
    }
}
