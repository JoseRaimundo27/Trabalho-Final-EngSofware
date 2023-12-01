package ClassesProjeto.Gerenciador.Command.Comandos;

import ClassesProjeto.Gerenciador.Command.CarregadorArgs;
import ClassesProjeto.Gerenciador.Command.InterfaceComando;

public class ComandoSair implements InterfaceComando {
    public static boolean ativo = true;
    @Override
    public void executar(CarregadorArgs args) {
        System.out.println("Desligando sistema");
        setAtivo(false);
    }
    public static boolean isAtivo() {
        return ativo;
    }
    public static void setAtivo(boolean ativo) {
        ComandoSair.ativo = ativo;
    }
    
}
