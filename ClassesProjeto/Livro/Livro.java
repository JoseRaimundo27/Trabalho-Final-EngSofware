package ClassesProjeto.Livro;

public class Livro implements InterfaceLivro {
    private double codigoLivro;
    private String nomeLivro;
    private int codigoExemplar;
    private boolean statusExemplar; //True = disponivel;   False = não disponível

    //"informações adicionais":
    private String editora, autores, edicao;
    private double anoPublicacao;
    

    public Livro(double codigoLivro, String nomeLivro, int codigoExemplar, boolean statusExemplar, String editora,
            String autores, String edicao, double anoPublicacao) {
        this.codigoLivro = codigoLivro;
        this.nomeLivro = nomeLivro;
        this.codigoExemplar = codigoExemplar;
        this.statusExemplar = statusExemplar;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }

    //GETTERS E SETTER:
    @Override
    public double getCodigoLivro() {
        return codigoLivro;
    }


    @Override
    public void setCodigoLivro(double codigoLivro) {
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

}