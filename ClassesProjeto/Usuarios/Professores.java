package ClassesProjeto.Usuarios;

import java.util.List;

import ClassesProjeto.Gerenciador.InterfaceRealizadorEmprestimo;
import ClassesProjeto.Gerenciador.realizadorEmprestimoProfessor;
import ClassesProjeto.Livro.InterfaceLivro;

public class Professores implements InterfaceUsuario {
    String nome;
    double codigoIdentificacao;
    //Especificidades:
     int tempoEmprestimo = 7;
     int limiteDeEmprestimos = 0;
    //para verificar se é devedor ou não:
    boolean devedor; //True caso seja devedor
    
    //Usuários tem uma lista de livros:
    private List<InterfaceLivro> livrosEmprestados;
    private List<InterfaceLivro> livrosReservados;
    //MÉTODOS:
    
    public String observarLivro(){
        return "";
    }
    
    //Para retornar o tipo de empréstimo (não fazer instanceOFF):
    public InterfaceRealizadorEmprestimo obterTipoEmprestimo(){
        return new realizadorEmprestimoProfessor();
    }
    
    public void addEmprestimo(InterfaceLivro livro){
        this.livrosEmprestados.add(livro); //atualiza Lista de livros
    }
    
    public void addReserva(InterfaceLivro livro){
        this.livrosReservados.add(livro);
        
    }
    public void attDevolucao(){
        //Retirar da lista de livros
        //Setar devedor pra 0
    }
    
    //GETTER E SETTERS:
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getCodigoIdentificacao() {
        return codigoIdentificacao;
    }
    
    public void setCodigoIdentificacao(double codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }
    
    public int getTempoEmprestimo() {
        return tempoEmprestimo;
    }
    
    public void setTempoEmprestimo(int tempoEmprestimo) {
        this.tempoEmprestimo = tempoEmprestimo;
    }
    
    public int getLimiteDeEmprestimos() {
        return limiteDeEmprestimos;
    }
    
    public void setLimiteDeEmprestimos(int limiteDeEmprestimos) {
        this.limiteDeEmprestimos = limiteDeEmprestimos;
    }
    public boolean isDevedor() {
        return devedor;
    }
    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }
    public List<InterfaceLivro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    
    public void setLivrosEmprestados(List<InterfaceLivro> livros) {
        this.livrosEmprestados = livros;
    }
    public List<InterfaceLivro> getLivrosReservados() {
        return livrosReservados;
    }
    
}
