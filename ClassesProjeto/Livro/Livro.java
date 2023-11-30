package ClassesProjeto.Livro;

public class Livro implements InterfaceLivro {
    private int codigoLivro;
    private String nomeLivro;
    private int codigoExemplar;
    private boolean statusExemplar = true; //True = disponivel;   False = não disponível
    private boolean statusReserva = false; // //True = reservado;   False = não reservado
    //"informações adicionais":
    private String editora, autores,edicao;

    private double anoPublicacao;
    
    //Quantidade de exemplares disponíveis
    private int quantidadeDeExemplares;
    private int quantidadeDeReservas;
    private int diasDevolucao;


    public Livro(int codigoLivro, String nomeLivro, String editora, String autores, String edicao, double anoPublicacao){
         this.codigoLivro = codigoLivro;
        this.nomeLivro = nomeLivro;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }
    public void addEmprestimoLivro(){
        this.quantidadeDeExemplares --;
    }
    public void addReservaLivro(){
        //Incrementa a reserva do livro
        this.quantidadeDeReservas ++;
        setStatusReserva(true);
    }
    public void removeReservaLivro(){
        //Decrementa a reserva do livro
        this.quantidadeDeReservas --;
        setStatusReserva(false);
    }
    public void decrementaDiasDevolucao(){
        this.diasDevolucao --; //A cada dia o dia de devolução é decrementado
    }
    public void attDevolucao(){
        this.quantidadeDeExemplares ++; //atualiza qntd de exemplares disponiveis
        setStatusExemplar(true);//Diz q exemplar está disponível
    }

    //GETTERS E SETTER:
    @Override
    public int getCodigoLivro() {
        return codigoLivro;
    }
    
    
    @Override
    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }
    
    
    @Override
    public String getNomeLivro() {
        return nomeLivro;
    }
    
    
    @Override
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    
    
    @Override
    public int getCodigoExemplar() {
        return codigoExemplar;
    }
    
    
    @Override
    public void setCodigoExemplar(int codigoExemplar) {
        this.codigoExemplar = codigoExemplar;
    }
    
    
    @Override
    public boolean isStatusExemplar() {
        return statusExemplar;
    }
    
    
    @Override
    public void setStatusExemplar(boolean statusExemplar) {
        this.statusExemplar = statusExemplar;
    }
    
    
    @Override
    public String getEditora() {
        return editora;
    }
    
    
    @Override
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
    @Override
    public String getAutores() {
        return autores;
    }
    
    
    @Override
    public void setAutores(String autores) {
        this.autores = autores;
    }
    
    
    @Override
    public String getEdicao() {
        return edicao;
    }
    
    
    @Override
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    
    @Override
    public double getAnoPublicacao() {
        return anoPublicacao;
    }
    
    
    @Override
    public void setAnoPublicacao(double anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public int getQuantidadeDeExemplares(){
        return this.quantidadeDeExemplares;
    }
    public void setQuantidadeDeExemplares(int quantidadeDeExemplares) {
        this.quantidadeDeExemplares = quantidadeDeExemplares;
    }
    
    public boolean isStatusReserva() {
        return statusReserva;
    }
    
    public void setStatusReserva(boolean statusReserva) {
        this.statusReserva = statusReserva;
    }
    public int getQuantidadeDeReservas() {
        return quantidadeDeReservas;
    }

    public void setQuantidadeDeReservas(int quantidadeDeReservas) {
        this.quantidadeDeReservas = quantidadeDeReservas;
    }
     public int getDiasDevolucao() {
        return diasDevolucao;
    }
    public void setDiasDevolucao(int diasDevolucao) {
        this.diasDevolucao = diasDevolucao;
    }
}
