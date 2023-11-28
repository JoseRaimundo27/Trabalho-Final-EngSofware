package ClassesProjeto.Gerenciador;

import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class VerificadorReserva {
    public boolean verificaReserva(InterfaceUsuario usuario, InterfaceLivro livro) { // Verifica se há reserva
        for (int i = 0; i < usuario.getLivrosReservados().size(); i++) {
            if (usuario.getLivrosReservados().get(i) == livro) {
                return true;
            }
        }
        return false;
    }
}
