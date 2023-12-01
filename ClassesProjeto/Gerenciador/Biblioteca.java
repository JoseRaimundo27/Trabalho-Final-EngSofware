package ClassesProjeto.Gerenciador;
//CLASSE FACHADA e SINGLETON -> SÓ TERÁ UMA ISNTÂNCIA
//TRANSFORMAR EM SINGLETON
//NO FINAL DIMINUIR A CLASSE BIBLIOTECA EM UMA SERIE DE OUTRAS CLASSES - DISTRIBUIR A FUNÇÃO!


import java.util.ArrayList;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class Biblioteca {
    private ArrayList<InterfaceLivro> livros = new ArrayList<InterfaceLivro>();
    private ArrayList<InterfaceUsuario> usuarios = new ArrayList<InterfaceUsuario>(); //Principio aberto e fechado -> Será do tipo da interface pai. Usarei obterTipoUsuario() para retornar o tipo de usário em questão, e não usar instanceOFF

    //Registro de operações:
    private ArrayList<InterfaceLivro> livrosEmprestados = new ArrayList<InterfaceLivro>();
    private ArrayList<InterfaceLivro> livrosReservados = new ArrayList<InterfaceLivro>();
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
        }
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
}
