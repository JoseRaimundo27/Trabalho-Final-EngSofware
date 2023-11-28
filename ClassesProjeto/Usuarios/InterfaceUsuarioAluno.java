package ClassesProjeto.Usuarios;
import ClassesProjeto.Livro.InterfaceLivro;

public interface InterfaceUsuarioAluno extends InterfaceUsuario{
    //Alunos têm limite de qntd de empréstimo (que professor ñ tem)
    int getQuantidadeDeEmprestimos();
    void setQuantidadeDeEmprestimos(int quantidadeDeEmprestimos);

    boolean isLimiteMaximo();
    void setLimiteMaximo(boolean limiteMaximo);
     
    
    
}
