package ClassesProjeto.Usuarios;

import java.util.List;
import ClassesProjeto.Gerenciador.InterfaceRealizadorEmprestimo;
import ClassesProjeto.Gerenciador.realizadorEmprestimoAluno;
import ClassesProjeto.Livro.InterfaceLivro;

public class AlunoGraduacao implements InterfaceUsuarioAluno {
    String nome;
    double codigoIdentificacao;
    // Especifidades:
    int tempoEmprestimo = 3; //FALTA FAZER CODIGO PRA ELE
    int limiteDeEmprestimos = 3;
    // para verificar se é devedor ou não:
    boolean devedor, limiteMaximo = false; // True caso seja devedor ou estorou limite de emprestimos
    int quantidadeDeEmprestimos = 0; // Inicializa com 0 a quantidade de emprestimos

    //Usuários tem uma lista de livros:
    private List<InterfaceLivro> livrosEmprestados;
    private List<InterfaceLivro> livrosReservados;
    

    // MÉTODOS:
    
    // Para retornar o tipo de empréstimo (não fazer instanceOFF):
    public InterfaceRealizadorEmprestimo obterTipoEmprestimo() {
        return new realizadorEmprestimoAluno();
    }
    
    
    public void addEmprestimo(InterfaceLivro livro){
        //atualizar quantidadeDeEmprestimo: verificar se estorou limite maximo e seta true
        this.quantidadeDeEmprestimos ++; //Incrementa qntd de emprestimos
        if(this.quantidadeDeEmprestimos == this.limiteDeEmprestimos){
            setLimiteMaximo(true);
        }
        this.livrosEmprestados.add(livro); //atualiza Lista de livros
    }
    
    public void addReserva(InterfaceLivro livro){
        this.livrosReservados.add(livro);
        
    }
    public void removeReserva(InterfaceLivro livro){
        //diminuir quantidadeDeReserva
    }
    public void attDevolucao(InterfaceLivro livro){
        this.livrosEmprestados.remove(livro);
        this.quantidadeDeEmprestimos --;
        //Retirar da lista de livros
        // Decrementar qntd de emprestimos e ver se saiu do limite
    }
    
    
    // GETTER E SETTERS:
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
    
    public boolean isLimiteMaximo() {
        return limiteMaximo;
    }
    
    public void setLimiteMaximo(boolean limiteMaximo) {
        this.limiteMaximo = limiteMaximo;
    }
    
    public int getQuantidadeDeEmprestimos() {
        return quantidadeDeEmprestimos;
    }
    
    public void setQuantidadeDeEmprestimos(int quantidadeDeEmprestimos) {
        this.quantidadeDeEmprestimos = quantidadeDeEmprestimos;
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
