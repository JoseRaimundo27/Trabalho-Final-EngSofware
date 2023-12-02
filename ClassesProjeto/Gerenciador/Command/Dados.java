package ClassesProjeto.Gerenciador.Command;

import java.util.HashMap;

import ClassesProjeto.Gerenciador.Command.Comandos.ComandoDevolucao;
import ClassesProjeto.Gerenciador.Command.Comandos.ComandoEmprestimo;
import ClassesProjeto.Gerenciador.Command.Comandos.ComandoListaEmprestimo;
import ClassesProjeto.Gerenciador.Command.Comandos.ComandoLivro;
import ClassesProjeto.Gerenciador.Command.Comandos.ComandoNotificacao;
import ClassesProjeto.Gerenciador.Command.Comandos.ComandoObservar;
import ClassesProjeto.Gerenciador.Command.Comandos.ComandoReserva;
import ClassesProjeto.Gerenciador.Command.Comandos.ComandoSair;

public class Dados {
    private HashMap<String, InterfaceComando> mapComandos = new HashMap<>();
    public Dados(){
        initComandos();
    }
    private void initComandos(){
        mapComandos.put("sair", new ComandoSair());
        mapComandos.put("emp", new ComandoEmprestimo());
        mapComandos.put("dev", new ComandoDevolucao());
        mapComandos.put("res", new ComandoReserva());
        mapComandos.put("obs", new ComandoObservar());
        mapComandos.put("liv", new ComandoLivro());
        mapComandos.put("usu", new ComandoListaEmprestimo());
        mapComandos.put("ntf", new ComandoNotificacao());

    }

    public HashMap<String, InterfaceComando> getMapComandos() {
        return mapComandos;
    }
}
