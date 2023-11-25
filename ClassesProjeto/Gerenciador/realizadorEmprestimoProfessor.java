package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Usuarios.InterfaceUsuarioProfessor;

public class realizadorEmprestimoProfessor implements InterfaceRealizadorEmprestimo {
    
    @Override
    public String realizarEmprestimo(InterfaceUsuario u) {
        InterfaceUsuarioProfessor usuario = (InterfaceUsuarioProfessor)u;
        return "";
    }
}
