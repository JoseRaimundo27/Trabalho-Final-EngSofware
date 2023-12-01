package ClassesProjeto.Gerenciador;


import java.util.ArrayList;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class ServicoReserva {
    private InterfaceLivro livroReservado;
    private getByCodigo buscador;
    private InterfaceServicoObservador obs;

    public ServicoReserva() {
        this.buscador = new getByCodigo();
        this.obs = new ServicoObservador();
    }

    public boolean criarReserva(ArrayList<InterfaceUsuario> usuarios, ArrayList<InterfaceLivro> livros, int codigoUsuario, int codigoLivro) {
        InterfaceUsuario usuario = buscador.getUsuarioByCodigoUsuario(usuarios, codigoUsuario);
        InterfaceLivro livro = buscador.getLivroByCodigo(livros, codigoLivro);

        // Restante do método
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
            this.livroReservado = livro; //Salvando no sistema
            System.out.println("Sucesso ao reservar" + livro.getNomeLivro() + " pelo usuário" + usuario.getNome()); 
            obs.verificaReservaParaObservador(livro, usuario);
            return true;
        }

    }

    public InterfaceLivro getLivroReservados(){
        return this.livroReservado; //Retornar livro para salvar no sistema
    }
}