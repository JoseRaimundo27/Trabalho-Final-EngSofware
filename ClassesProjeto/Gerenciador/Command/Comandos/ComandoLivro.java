package ClassesProjeto.Gerenciador.Command.Comandos;

import ClassesProjeto.Gerenciador.Biblioteca;
import ClassesProjeto.Gerenciador.Command.CarregadorArgs;
import ClassesProjeto.Gerenciador.Command.InterfaceComando;

public class ComandoLivro implements InterfaceComando {
    @Override
    public void executar(CarregadorArgs arg){
        Biblioteca bib = Biblioteca.obterInstancia();
        bib.infoLivro(arg.getArg1());
    }
    
}
