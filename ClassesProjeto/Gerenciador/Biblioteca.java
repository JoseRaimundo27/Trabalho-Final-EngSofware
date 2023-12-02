package ClassesProjeto.Gerenciador;
//CLASSE FACHADA e SINGLETON -> SÓ TERÁ UMA ISNTÂNCIA
//TRANSFORMAR EM SINGLETON
//NO FINAL DIMINUIR A CLASSE BIBLIOTECA EM UMA SERIE DE OUTRAS CLASSES - DISTRIBUIR A FUNÇÃO!


import java.util.ArrayList;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceObservador;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class Biblioteca {
    private ArrayList<InterfaceLivro> livros = new ArrayList<InterfaceLivro>();
    private ArrayList<InterfaceUsuario> usuarios = new ArrayList<InterfaceUsuario>(); //Principio aberto e fechado -> Será do tipo da interface pai. Usarei obterTipoUsuario() para retornar o tipo de usário em questão, e não usar instanceOFF

    //Registro de operações:
    private ArrayList<InterfaceLivro> livrosEmprestados = new ArrayList<InterfaceLivro>();
    private ArrayList<InterfaceLivro> livrosReservados = new ArrayList<InterfaceLivro>();
    private ArrayList<InterfaceObservador> observadores = new ArrayList<InterfaceObservador>();
    getByCodigo buscador = new getByCodigo();
    
    //Garatindo que biblioteca é um SINGLETON:
    private Biblioteca(){} //construtor privado
    private static Biblioteca bib; //Já crio um objeto biblioteca, sendo statico 

    public static Biblioteca obterInstancia(){
        if(bib == null){
            bib = new Biblioteca();
        }
        return bib;
    }
     //MÉTODOS:
    public void criarReserva(int codigoUsuario, int codigoLivro){
        ServicoReserva res = new ServicoReserva();
        //Cria reserva e verifica se deu certo:
        if(res.criarReserva(this.usuarios, this.livros,codigoUsuario,codigoLivro)){ //Se efetuou a reserva:
            this.livrosReservados.add(res.getLivroReservados());// Salvando livro no sistema
            notifyObservers(res.getLivroReservados());
        }
        
    }
        
    public void notifyObservers(InterfaceLivro livro){
        InterfaceServicoObservador obs = new ServicoObservador();
        for(int i=0;i<observadores.size();i++){
            obs.verificaReservaParaObservador(livro,observadores.get(i));
        }
    }
    public void quantidadeNotificacao(int codigoUsuario){
        InterfaceUsuario usuario = buscador.getUsuarioByCodigoUsuario(usuarios,codigoUsuario);
        InterfaceObservador u = (InterfaceObservador)usuario;
        System.out.println(u.getQntDeNotificacao());
    }
    
    public void criarEmprestimo(int codigoUsuario, int codigoLivro){
        InterfaceUsuario usuario = buscador.getUsuarioByCodigoUsuario(usuarios,codigoUsuario);
        InterfaceLivro livro = buscador.getLivroByCodigo(livros,codigoLivro);

        if(livro.isStatusExemplar()){ //verifica se exemplar está disponível
         // A partir do tipo de emprestimo em questão, eu vou criar o emprestimo, respeitando as regras da criação de empréstimo diferentes entre professores e alunos:
            if( usuario.obterTipoEmprestimo().realizarEmprestimo(usuario,livro)){ //Se deu certo ( retornou true)
                this.livrosEmprestados.add(livro);
            }
        }else{
            System.out.println( "Exemplar do livro não está disponível!");
        }
    }
    
    public void criaDevolucao(int codigoUsuario, int codigoLivro){
        ServicoDevolucao dev = new ServicoDevolucao();
        dev.criarDevolucao(codigoUsuario, codigoLivro, this.usuarios, this.livros);
    }

    public void criarObservador(int codigoUsuario, int codigoLivro){
        InterfaceServicoObservador obs = new ServicoObservador();
        obs.criarObservador(codigoUsuario, codigoLivro, usuarios, livros);
    }
   
    public void adicionarLivro(InterfaceLivro livro){
        this.livros.add(livro);
    }
    public void adicionarUsuario(InterfaceUsuario usuario){
        this.usuarios.add(usuario);
    }
    public void adicionaObservador(InterfaceObservador observador){
        this.observadores.add(observador);
    }
    public void infoLivro(int codigoLivro){
        InterfaceLivro liv = buscador.getLivroByCodigo(this.livros,codigoLivro);
        if(liv.getQuantidadeDeReservas() > 0){
            for(int i =0; i<usuarios.size();i++){
            for(int j=0;j<usuarios.get(i).getLivrosReservados().size(); j++){
                if (usuarios.get(i).getLivrosReservados().get(j) == liv) {
                    System.out.println(liv.toString() + " usuario que reservou: " + usuarios.get(i).getNome());
                }
            }
        }

        }else{
            System.out.println(liv.toString());
        }
        
    }
    public void listarEmprestimo(int codigoUsuario){
        InterfaceUsuario user = buscador.getUsuarioByCodigoUsuario(this.usuarios, codigoUsuario);
        user.listaLivrosEmprestados();
    }
}
