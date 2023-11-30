package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Usuarios.InterfaceObservador;
import ClassesProjeto.Livro.InterfaceLivro;

public class realizadorEmprestimoProfessor implements InterfaceRealizadorEmprestimo {
    
    @Override
    public boolean realizarEmprestimo(InterfaceUsuario u, InterfaceLivro livro) {
        InterfaceObservador usuario = (InterfaceObservador)u;
        if (usuario.isDevedor()) {// Verificando se é devedor
            System.out.println("Usuário é devedor!");
            return false;
        }else{
            usuario.addEmprestimo(livro);
            livro.setDiasDevolucao(usuario.getTempoEmprestimo()); //seta quantidade de dias que ele pode ficar com o livro
            System.out.println("Sucesso" + usuario.getNome() + " " + livro.getNomeLivro()); 
            return true;
        }
    }
}
