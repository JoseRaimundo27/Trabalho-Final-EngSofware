package ClassesProjeto.Gerenciador.Command.Comandos;

import ClassesProjeto.Gerenciador.Biblioteca;
import ClassesProjeto.Gerenciador.Command.InterfaceComando;

public class ComandoEmprestimo implements InterfaceComando {
    Double codigoUsuario, codigoLivro;

    public ComandoEmprestimo(Double codigoUsuario, double codigoLivro){
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
