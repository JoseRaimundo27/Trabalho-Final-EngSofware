package ClassesProjeto.Gerenciador;



import java.util.ArrayList;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class ServicoDevolucao {
    private getByCodigo buscador;

    public ServicoDevolucao(){
        this.buscador = new getByCodigo();
    }
    public boolean criarDevolucao(int codigoUsuario, int codigoLivro, ArrayList<InterfaceUsuario> usuarios, ArrayList<InterfaceLivro> livros){
        InterfaceUsuario user = buscador.getUsuarioByCodigoUsuario(usuarios, codigoUsuario);
        InterfaceLivro livro = buscador.getLivroByCodigo(livros, codigoLivro);
        if(livro == null){
            System.out.println("Codigo do livro inválido!"); 
            return false;
        }
        if(user == null){
            System.out.println("Codigo do usuário inválido!");
            return false;
        }

        for(int i=0;i<user.getLivrosEmprestados().size();i++){
            if(user.getLivrosEmprestados().get(i).getCodigoLivro() == codigoLivro){ // Se ele tiver emprestimo em aberto do livro
                user.attDevolucao(livro); //Atualiza devolução
                livro.attDevolucao(); //Atualiza devolução
                System.out.println("Devolução feita com sucessor por " + user.getNome() + ", livro:" + livro.getNomeLivro());
                return true;
            }   
        }
        System.out.println("Usuário não tem esse livro emprestado!");
        return false;
    }
}
