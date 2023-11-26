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
    int quantidadeDeReservas = 0; // Inicializa com 0 a quantidade de reservas
    
    //Usuários tem uma lista de livros:
    private List<InterfaceLivro> livros;
    //MÉTODOS:
    @Override
    public String emprestimo(){
        return "";
    }
    @Override
    public String devolucaoLivro(){
        return "";
    }
    @Override
    public String reservaLivro(){
        return "";
    }
    
    public String observarLivro(){
        return "";
    }
    
    //Para retornar o tipo de empréstimo (não fazer instanceOFF):
    public InterfaceRealizadorEmprestimo obterTipoEmprestimo(){
        return new realizadorEmprestimoProfessor();
    }
    
    public void addEmprestimo(InterfaceLivro livro){
        //atualizar quantidadeDeEmprestimo: verificar se estorou limite maximo
        //atualizar Lista de livros
    }
    
    public void addReserva(){
        //atualizar quantidadeDeReserva
        
    }
    public void attDevolucao(){
        //Retirar da lista de livros
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
    public int getQuantidadeDeReservas() {
        return quantidadeDeReservas;
    }
    public void setQuantidadeDeReservas(int quantidadeDeReservas) {
        this.quantidadeDeReservas = quantidadeDeReservas;
    }
    public List<InterfaceLivro> getLivros() {
       return livros;
    }
    public void setLivros(List<InterfaceLivro> livros) {
       this.livros = livros;
    }
    
}
