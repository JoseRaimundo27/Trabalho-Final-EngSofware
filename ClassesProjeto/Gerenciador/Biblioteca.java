package ClassesProjeto.Gerenciador;
//CLASSE FACHADA e SINGLETON -> SÓ TERÁ UMA ISNTÂNCIA
//NO FINAL DIMINUIR A CLASSE BIBLIOTECA EM UMA SERIE DE OUTRAS CLASSES - DISTRIBUIR A FUNÇÃO!

import java.util.List;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class Biblioteca {
    private List<InterfaceLivro> livros;
    private List<InterfaceUsuario> usuarios; //Principio aberto e fechado -> Será do tipo da interface pai. Usarei obterTipoUsuario() para retornar o tipo de usário em questão, e não usar instanceOFF

    getByCodigo buscador = new getByCodigo();

     //MÉTODOS:
   
    
    public String criarReserva(double codigoUsuario, double codigoLivro){
        InterfaceUsuario usuario = buscador.getUsuarioByCodigoUsuario(usuarios,codigoUsuario);
        InterfaceLivro livro = buscador.getLivroByCodigo(livros,codigoLivro);
        if(livro == null){
            return "Codigo do livro inválido!";
        }
        if(usuario == null){
            return "Código de usuário inválido!";
        }
        if(usuario.getLivrosReservados().size() == 3){
            return "Usuário já reservou 3 livros!";
        }else{
            livro.addReservaLivro();
            usuario.addReserva(livro);
            return "Sucesso ao reservar" + livro.getNomeLivro() + " pelo usuário" + usuario.getNome();
        }
    }
        
        
    public String criarEmprestimo(double codigoUsuario, double codigoLivro){
        InterfaceUsuario usuario = buscador.getUsuarioByCodigoUsuario(usuarios,codigoUsuario);
        InterfaceLivro livro = buscador.getLivroByCodigo(livros,codigoLivro);
        if(livro == null){
            return "Codigo do livro inválido!";
        }
        if(usuario == null){
            return "Código de usuário inválido!";
        }

        if(livro.isStatusExemplar()){ //verifica se exemplar está disponível
            return usuario.obterTipoEmprestimo().realizarEmprestimo(usuario,livro); // A partir do tipo de emprestimo em questão, eu vou criar o emprestimo, respeitando as regras da criação de empréstimo diferentes entre professores e alunos
            

        }else{
            return "Exemplar do livro não está disponível!";
        }
    }

    public void registroEmprestimo(){ //REGISTRAR OPERAÇÃO NO SISTEMA E FIXAR DATA DE DEVOLUÇÃO

    }
    
}
