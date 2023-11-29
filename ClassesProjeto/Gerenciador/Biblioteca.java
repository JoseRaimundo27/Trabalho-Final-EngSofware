package ClassesProjeto.Gerenciador;
//CLASSE FACHADA e SINGLETON -> SÓ TERÁ UMA ISNTÂNCIA
//TRANSFORMAR EM SINGLETON
//NO FINAL DIMINUIR A CLASSE BIBLIOTECA EM UMA SERIE DE OUTRAS CLASSES - DISTRIBUIR A FUNÇÃO!

import java.util.List;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class Biblioteca {
    private List<InterfaceLivro> livros;
    private List<InterfaceUsuario> usuarios; //Principio aberto e fechado -> Será do tipo da interface pai. Usarei obterTipoUsuario() para retornar o tipo de usário em questão, e não usar instanceOFF

    //Registro de operações:
    private List<InterfaceLivro> livrosEmprestados;
    private List<InterfaceLivro> livrosReservados;
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
    public void criarReserva(double codigoUsuario, double codigoLivro){
        ServicoReserva res = new ServicoReserva();
        res.criarReserva(this.usuarios, this.livros, codigoUsuario, codigoLivro);
        if(res.criarReserva(this.usuarios, this.livros,codigoUsuario,codigoLivro)){ //Se efetuou a reserva:
            this.livrosReservados.add(res.getLivroReservados());// Salvando livro no sistema
        }
    }
        
        
    public void criarEmprestimo(double codigoUsuario, double codigoLivro){
        InterfaceUsuario usuario = buscador.getUsuarioByCodigoUsuario(usuarios,codigoUsuario);
        InterfaceLivro livro = buscador.getLivroByCodigo(livros,codigoLivro);

        if(livro.isStatusExemplar()){ //verifica se exemplar está disponível
            usuario.obterTipoEmprestimo().realizarEmprestimo(usuario,livro); // A partir do tipo de emprestimo em questão, eu vou criar o emprestimo, respeitando as regras da criação de empréstimo diferentes entre professores e alunos
            if( usuario.obterTipoEmprestimo().realizarEmprestimo(usuario,livro)){ //Se deu certo ( retornou true)
                this.livrosEmprestados.add(livro);
            }
        }else{
            System.out.println( "Exemplar do livro não está disponível!");
        }
    }
    
    public void criaDevolucao(double codigoUsuario, double codigoLivro){
        ServicoDevolucao dev = new ServicoDevolucao();
        dev.criarDevolucao(codigoUsuario, codigoLivro, this.usuarios, this.livros);
    }

    public void criarObservador(double codigoUsuario, double codigoLivro){
        InterfaceServicoObservador obs = new ServicoObservador();
        obs.criarObservador(codigoUsuario, codigoLivro, usuarios, livros);
    }
   
}
