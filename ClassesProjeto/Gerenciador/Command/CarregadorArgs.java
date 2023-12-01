package ClassesProjeto.Gerenciador.Command;

public class CarregadorArgs {
    private String comandoArg;
    private int codigoUsuarioArg;
    private int codigoLivroArg;

   
    public int getCodigoUsuarioArg() {
        return codigoUsuarioArg;
    }
    public void setCodigoUsuarioArg(int codigoUsuarioArg) {
        this.codigoUsuarioArg = codigoUsuarioArg;
    }
    public int getCodigoLivroArg() {
        return codigoLivroArg;
    }
    public void setCodigoLivroArg(int codigoLivroArg) {
        this.codigoLivroArg = codigoLivroArg;
    }
    public String getComandoArg() {
        return comandoArg;
    }
    public void setComandoArg(String comandoArg) {
        this.comandoArg = comandoArg;
    }
    

}
