package ClassesProjeto.Gerenciador.Command.Comandos;

import ClassesProjeto.Gerenciador.Biblioteca;
import ClassesProjeto.Gerenciador.Command.InterfaceComando;

public class ComandoEmprestimo implements InterfaceComando {
    int codigoUsuario, codigoLivro;

    public ComandoEmprestimo(int codigoUsuario, int codigoLivro){
        this.codigoLivro = codigoLivro;
        this.codigoUsuario = codigoUsuario;
    }

     public void realizaEmprestimo(){
        Biblioteca bib = Biblioteca.obterInstancia();
        bib.criarEmprestimo(codigoUsuario, codigoLivro);
    }
    
    public void executar(){
        realizaEmprestimo();
    }


}
