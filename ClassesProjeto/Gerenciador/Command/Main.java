package ClassesProjeto.Gerenciador.Command;

import java.util.Scanner;

import ClassesProjeto.Gerenciador.Biblioteca;
import ClassesProjeto.Gerenciador.Command.Comandos.ComandoEmprestimo;
import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Livro.Livro;
import ClassesProjeto.Usuarios.AlunoGraduacao;
import ClassesProjeto.Usuarios.AlunoPosGraduacao;
import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Usuarios.Professores;

public class Main {

    public static void main(String[] args) {
        Biblioteca bib;
        bib = Biblioteca.obterInstancia();

        //INSTANCIANDO DADOS DE TESTE:
        InterfaceUsuario joao = (new AlunoGraduacao(123, "João da Silva"));
    	InterfaceUsuario luiz = (new AlunoPosGraduacao(456, "Luiz Fernando Rodrigues"));
    	InterfaceUsuario pedro = (new AlunoGraduacao(789, "Pedro Paulo"));
    	InterfaceUsuario carlos = (new Professores(100, "Carlos Lucena")); 

        bib.adicionarUsuario(joao);
    	bib.adicionarUsuario(luiz);
    	bib.adicionarUsuario(pedro);
    	bib.adicionarUsuario(carlos);
    	
 
        InterfaceLivro livro1 = new Livro(100, "Engenharia de Software", "Ian Sommervile","AddisonWesley", "6ª", 2000);
        InterfaceLivro livro2 = new Livro(100, "Engenharia de Software", "Ian Sommervile","AddisonWesley", "6ª", 2000);
        InterfaceLivro livro3 = new Livro(101, "UML - Guia do Usuário", "Grady Booch, James Rumbaugh, Ivar Jacobson","Campus ", "7ª", 2000);
        InterfaceLivro livro4 = new Livro(200, "Code Complete", "Steve McConnell","MicrosoftPress", "2ª", 2014);
        InterfaceLivro livro5 = new Livro(201, "Agile Software Development, Principles, Patterns, and Practices", "Robert Martin ","Prentice Hall", "1ª", 2002);
        InterfaceLivro livro6 = new Livro(300, "Refactoring: Improving the Design of Existing Code", "Martin Fowler","AddisonWesley Professional", "1ª", 1999);
        InterfaceLivro livro7 = new Livro(301, "Software Metrics: A Rigorous and Practical Approach", "Norman Fenton, James Bieman","CRC Press", "3ª", 2014);
        InterfaceLivro livro8 = new Livro(400, "Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides","AddisonWesley Professional", "1ª", 1994);
        InterfaceLivro livro9 = new Livro(401, "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Martin Fowler","AddisonWesley Professional", "3ª", 2003);
    	
        
    	bib.adicionarLivro(livro1);
    	bib.adicionarLivro(livro2);
    	bib.adicionarLivro(livro3);
    	bib.adicionarLivro(livro4);
    	bib.adicionarLivro(livro5);
    	bib.adicionarLivro(livro6);
    	bib.adicionarLivro(livro7);
    	bib.adicionarLivro(livro8);
    	bib.adicionarLivro(livro9);


        Invoker invoker = new Invoker(); //O invoker vai invocar os commandos(preciso dar set commando depois executar comando)

        System.out.println("emp codigoUsuario codigoLivro");
        System.out.println("dev codigoUsuario codigoLivro");
        System.out.println("res codigoUsuario codigoLivro");
        System.out.println("obs codigoUsuario codigoLivro");
        System.out.println("liv codigoCopia");
        System.out.println("usu codigoUsuario");
        System.out.println("ntf codigoUsuario");
        System.out.println("sair");
        System.out.println(" ");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual comando a ser executado: ");
            String comandoUsuario = scanner.nextLine();
            

            String[] partes = comandoUsuario.split(" ");
            if (partes[0].equals("emp")) {
                double codigoUsuario = Integer.parseInt(partes[1]);
                double codigoLivro = Integer.parseInt(partes[2]);

                InterfaceComando comando = new ComandoEmprestimo(codigoUsuario,codigoLivro);
                invoker.setComando(comando);
                invoker.executarComando();
                //invoker.executar();
            } else if (partes[0].equals("dev")) {
                double codigoUsuario = Integer.parseInt(partes[1]);
                double codigoLivro = Integer.parseInt(partes[2]);

                //invoker.setCommand(comando)]);
                //invoker.executar();
            } else if (partes[0].equals("res")) {
                double codigoUsuario = Integer.parseInt(partes[1]);
                double codigoLivro = Integer.parseInt(partes[2]);

                //invoker.setCommand(comando)
                //invoker.executar();
            } else if (partes[0].equals("obs")) {
                double codigoUsuario = Integer.parseInt(partes[1]);
                double codigoLivro = Integer.parseInt(partes[2]);

                //invoker.setCommand(comando)
                //invoker.executar();
            } else if (partes[0].equals("liv")) {
                double codigoLivro = Integer.parseInt(partes[1]);
                //invoker.setCommand(comando)
                //invoker.executar();
                ;
            } else if (partes[0].equals("usu")) {
                double codigoUsuario = Integer.parseInt(partes[1]); 
                //invoker.setCommand(comando)
                //invoker.executar();

            } else if (partes[0].equals("ntf")) {
                double codigoUsuario = Integer.parseInt(partes[1]);
                //invoker.setCommand(comando)
                //invoker.executar();
            } else if (partes[0].equals("sair")) {
                System.out.println("Saindo do sistema");
                break;
            }
        }
    }
}

