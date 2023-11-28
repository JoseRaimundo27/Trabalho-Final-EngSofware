package ClassesProjeto.Gerenciador;

import java.util.List;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Usuarios.InterfaceUsuarioProfessor;

public class ServicoObservador implements InterfaceServicoObservador {
    private getByCodigo buscador;
    
    public ServicoObservador(){
        this.buscador = new getByCodigo();
    }
    
    @Override
    public void criarObservador(double codigoUsuario, double codigoLivro, List<InterfaceUsuario> usuarios, List<InterfaceLivro> livros){
        InterfaceUsuario u = buscador.getUsuarioByCodigoUsuario(usuarios, codigoUsuario);
        InterfaceUsuarioProfessor usuario = (InterfaceUsuarioProfessor) u; //Realizando Downcasting para acessar metodos exclusivos de professor
        InterfaceLivro livro = buscador.getLivroByCodigo(livros, codigoLivro);

        usuario.attLivrosObservados(livro);

        System.out.println("O usuário" + usuario.getNome() + "está observando o livro" + livro.getNomeLivro());

    }
    
    @Override
    public void verificaReservaParaObservador(InterfaceLivro livro, InterfaceUsuario u){
        InterfaceUsuarioProfessor usuario = (InterfaceUsuarioProfessor) u;
        if(livro.getQuantidadeDeReservas() > 2){ //Se for maior, notifica
            usuario.registarNotificacao();
        }
    }
}
