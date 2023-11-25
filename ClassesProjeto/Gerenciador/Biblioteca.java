package ClassesProjeto.Gerenciador;

import java.util.Date;
import java.util.List;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class Biblioteca {
    private List<InterfaceLivro> livros;
    private List<InterfaceUsuario> usuarios; //Principio aberto e fechado -> Será do tipo da interface pai. Usarei obterTipoUsuario() para retornar o tipo de usário em questão, e não usar instanceOFF

     //USAR DATE PARA A DATA DE DEVOLUCAO?:
     private Date dataDevolucao;

     //MÉTODOS:

   public void getUsuarioByCodigoUsuario(double codigoIdentificacao){
        //vai percorrer lista usuarios e RETORNAR TIPO InterfaceUsuario
    }
    
    public void solicitacaoEmprestimo(InterfaceUsuario usuario){
        //return usuario.obterTipoUsuario().emprestimo();
    
    }
    
}
