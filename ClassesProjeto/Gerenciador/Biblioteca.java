package ClassesProjeto.Gerenciador;
//CLASSE FACHADA e SINGLETON -> SÓ TERÁ UMA ISNTÂNCIA
//NO FINAL DIMINUIR A CLASSE BIBLIOTECA EM UMA SERIE DE OUTRAS CLASSES - DISTRIBUIR A FUNÇÃO!

import java.util.List;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class Biblioteca {
    private List<InterfaceLivro> livros;
    private List<InterfaceUsuario> usuarios; //Principio aberto e fechado -> Será do tipo da interface pai. Usarei obterTipoUsuario() para retornar o tipo de usário em questão, e não usar instanceOFF

    //Registro de operações:
    private List<InterfaceLivro> livrosEmprestados;
    private List<InterfaceLivro> livrosReservados;
    getByCodigo buscador = new getByCodigo();
   
    

     //MÉTODOS:
    public boolean criarReserva(double codigoUsuario, double codigoLivro){
        InterfaceUsuario usuario = buscador.getUsuarioByCodigoUsuario(usuarios,codigoUsuario);
        InterfaceLivro livro = buscador.getLivroByCodigo(livros,codigoLivro);
        if(livro == null){
            System.out.println("Codigo do livro inválido!");
            return false;
        }
        if(usuario == null){
            System.out.println( "Código de usuário inválido!");
            return false;
        }
        if(usuario.getLivrosReservados().size() == 3){
            System.out.println("Usuário já reservou 3 livros!"); 
            return false;
            
        }else{
            livro.addReservaLivro();
            usuario.addReserva(livro);
            livrosReservados.add(livro); //Salvando no sistema
            System.out.println("Sucesso ao reservar" + livro.getNomeLivro() + " pelo usuário" + usuario.getNome()); 
            return true;
        }
    }
        
        
    public boolean criarEmprestimo(double codigoUsuario, double codigoLivro){
        InterfaceUsuario usuario = buscador.getUsuarioByCodigoUsuario(usuarios,codigoUsuario);
        InterfaceLivro livro = buscador.getLivroByCodigo(livros,codigoLivro);
        if(livro == null){
            System.out.println("Codigo do livro inválido!"); 
            return false;
        }
        if(usuario == null){
            System.out.println("Codigo do usuário inválido!");
            return false;
        }

        if(livro.isStatusExemplar()){ //verifica se exemplar está disponível
            usuario.obterTipoEmprestimo().realizarEmprestimo(usuario,livro); // A partir do tipo de emprestimo em questão, eu vou criar o emprestimo, respeitando as regras da criação de empréstimo diferentes entre professores e alunos
            if( usuario.obterTipoEmprestimo().realizarEmprestimo(usuario,livro)){ //Se deu certo ( retornou true)
                this.livrosEmprestados.add(livro);
                return true;
            }else{
                return false;
            }

        }else{
            System.out.println( "Exemplar do livro não está disponível!");
            return false;
        }
    }
    

   
}
