package ClassesProjeto.Gerenciador.Command;

import java.util.HashMap;

import ClassesProjeto.Gerenciador.Command.Comandos.ComandoEmprestimo;
import ClassesProjeto.Gerenciador.Command.Comandos.ComandoSair;

public class Dados {
    private HashMap<String, InterfaceComando> mapComandos = new HashMap<>();
    public Dados(){
        initComandos();
    }
    private void initComandos(){
        mapComandos.put("sair", new ComandoSair());
        mapComandos.put("emp", new ComandoEmprestimo());
    }

    public HashMap<String, InterfaceComando> getMapComandos() {
        return mapComandos;
    }
}
