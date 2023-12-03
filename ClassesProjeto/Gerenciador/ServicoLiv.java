package ClassesProjeto.Gerenciador;

import java.util.ArrayList;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class ServicoLiv {
    Biblioteca bib = Biblioteca.obterInstancia();

    public boolean informacaoLivro(int codigoLivro, ArrayList<InterfaceLivro> livros,
            ArrayList<InterfaceUsuario> usuarios) {
        getByCodigo buscador = new getByCodigo();
        InterfaceLivro liv = buscador.getLivroByCodigo(livros, codigoLivro);
        VerificadorReserva verifica = new VerificadorReserva();
        if (liv == null) {
            System.out.println("Codigo do livro inválido!");
            return false;
        } else {
            System.out.println(liv.toString());
            for (int i = 0; i < usuarios.size(); i++) {
                if (verifica.verificaReserva(usuarios.get(i), liv)) {
                    System.out.println(" usuario que reservou: " + usuarios.get(i).getNome());
                    return true;
                }
            }
            return true;
        }
    }
}
