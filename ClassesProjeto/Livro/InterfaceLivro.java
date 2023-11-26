package ClassesProjeto.Livro;

public interface InterfaceLivro {

    double getCodigoLivro();

    void setCodigoLivro(double codigoLivro);

    String getNomeLivro();

    void setNomeLivro(String nomeLivro);

    int getCodigoExemplar();

    void setCodigoExemplar(int codigoExemplar);

    boolean isStatusExemplar();

    void setStatusExemplar(boolean statusExemplar);

    String getEditora();

    void setEditora(String editora);

    String getAutores();

    void setAutores(String autores);

    String getEdicao();

    void setEdicao(String edicao);

    double getAnoPublicacao();

    void setAnoPublicacao(double anoPublicacao);

    int getQuantidadeDeExemplares();
    void setQuantidadeDeExemplares(int quantidadeDeExemplares);

    boolean isStatusReserva();
    void setStatusReserva(boolean statusReserva);
    
    int getQuantidadeDeReservas();
    void setQuantidadeDeReservas(int quantidadeDeReservas);

    void addReservaLivro();
    void removeReservaLivro();
}