package ClassesProjeto.Usuarios;

import java.util.ArrayList;

import ClassesProjeto.Gerenciador.InterfaceRealizadorEmprestimo;
import ClassesProjeto.Gerenciador.realizadorEmprestimoProfessor;
import ClassesProjeto.Livro.InterfaceLivro;

public class Professores implements InterfaceUsuario {
    String nome;
    int codigoIdentificacao;
    //Especificidades:
     int tempoEmprestimo = 7;
     int limiteDeEmprestimos = 0;
    //para verificar se é devedor ou não:
    boolean devedor = false; //True caso seja devedor
    
    //Usuários tem uma lista de livros:
    private ArrayList<InterfaceLivro> livrosEmprestados = new ArrayList<InterfaceLivro>();
    private ArrayList<InterfaceLivro> livrosReservados = new ArrayList<InterfaceLivro>();

    //Para observadores:
    private ArrayList<InterfaceLivro> livrosObservados = new ArrayList<InterfaceLivro>();
    private int qntDeNotificacao = 0;

    public Professores(int codigoIdentificacao, String nome){
        this.codigoIdentificacao = codigoIdentificacao;
        this.nome = nome;
    }
    //MÉTODOS:
    public void attLivrosObservados(InterfaceLivro livro){
        this.livrosObservados.add(livro);
    }
    public void registarNotificacao(){
        this.qntDeNotificacao ++;
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
    public void removeReserva(InterfaceLivro livro){
        this.livrosReservados.remove(livro);
    }
    public void attDevolucao(InterfaceLivro livro){
        this.livrosEmprestados.remove(livro);
        
    }
    
    //GETTER E SETTERS:
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCodigoIdentificacao() {
        return codigoIdentificacao;
    }
    
    public void setCodigoIdentificacao(int codigoIdentificacao) {
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
    public ArrayList<InterfaceLivro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    
    public void setLivrosEmprestados(ArrayList<InterfaceLivro> livros) {
        this.livrosEmprestados = livros;
    }
    public ArrayList<InterfaceLivro> getLivrosReservados() {
        return livrosReservados;
    }
    public ArrayList<InterfaceLivro> getLivrosObservados() {
        return livrosObservados;
    }
    public int getQntDeNotificacao() {
        return qntDeNotificacao;
    }
}
