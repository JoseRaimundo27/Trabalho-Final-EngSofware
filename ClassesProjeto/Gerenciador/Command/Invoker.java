package ClassesProjeto.Gerenciador.Command;
// A classe invoker é quem chama o comando
public class Invoker {
    private InterfaceComando c;

    public void setComando(InterfaceComando comando){
        this.c = comando; //Setando meu comando
    }

    public void executarComando(){
        c.executar();
    }
}
