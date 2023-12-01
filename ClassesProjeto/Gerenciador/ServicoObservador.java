package ClassesProjeto.Gerenciador;

import java.util.ArrayList;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Usuarios.InterfaceObservador;

public class ServicoObservador implements InterfaceServicoObservador {
    private getByCodigo buscador;
    
    public ServicoObservador(){
        this.buscador = new getByCodigo();
    }
    
    @Override
    public void criarObservador(int codigoUsuario, int codigoLivro, ArrayList<InterfaceUsuario> usuarios, ArrayList<InterfaceLivro> livros){
        InterfaceUsuario u = buscador.getUsuarioByCodigoUsuario(usuarios, codigoUsuario);
        InterfaceObservador usuario = (InterfaceObservador) u; //Realizando Downcasting para acessar metodos exclusivos de professor
        InterfaceLivro livro = buscador.getLivroByCodigo(livros, codigoLivro);

        usuario.attLivrosObservados(livro);

        System.out.println("O usuário" + usuario.getNome() + "está observando o livro" + livro.getNomeLivro());

    }
    
    @Override
    public void verificaReservaParaObservador(InterfaceLivro livro, InterfaceUsuario u){
        InterfaceObservador usuario = (InterfaceObservador) u;
        if(livro.getQuantidadeDeReservas() > 2){ //Se for maior, notifica
            usuario.registarNotificacao();
        }
    }
}
