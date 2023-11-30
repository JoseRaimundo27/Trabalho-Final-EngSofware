package ClassesProjeto.Gerenciador.Command;

import java.util.Scanner;

import ClassesProjeto.Gerenciador.Biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca bib;
        bib = Biblioteca.obterInstancia();

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
            String comando = scanner.nextLine();
            

            String[] partes = comando.split(" ");
            if (partes[0].equals("emp")) {
                double codigoUsuario = Integer.parseInt(partes[1]);
                double codigoLivro = Integer.parseInt(partes[2]);

                //invoker.setCommand(comando)
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

