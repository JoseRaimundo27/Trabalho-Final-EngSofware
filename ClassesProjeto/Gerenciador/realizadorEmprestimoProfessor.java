package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Usuarios.InterfaceUsuarioProfessor;
import ClassesProjeto.Livro.InterfaceLivro;

public class realizadorEmprestimoProfessor implements InterfaceRealizadorEmprestimo {
    
    @Override
    public String realizarEmprestimo(InterfaceUsuario u, InterfaceLivro livro) {
        InterfaceUsuarioProfessor usuario = (InterfaceUsuarioProfessor)u;
        if (usuario.isDevedor()) {
            return "Usuário é devedor!"; // Verificando se é devedor
        }else{
            usuario.addEmprestimo(livro);
            return "Sucesso" + usuario.getNome() + " " + livro.getNomeLivro();
        }
    }
}
