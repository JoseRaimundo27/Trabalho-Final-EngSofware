package ClassesProjeto.Gerenciador.Command.Comandos;

import ClassesProjeto.Gerenciador.Command.InterfaceComando;

public class ComandoSair implements InterfaceComando {
    
    @Override
    public void executar() {
        System.out.println("Desligando sistema");
    }
    
}
