package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuarioAluno;
import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Livro.InterfaceLivro;

public class realizadorEmprestimoAluno implements InterfaceRealizadorEmprestimo {

    @Override
    public String realizarEmprestimo(InterfaceUsuario u, InterfaceLivro livro) {
        InterfaceUsuarioAluno usuario = (InterfaceUsuarioAluno) u; // Realizando Downcasting para acessar metodos do
                                                                   // filho InterfacUsuarioAluno (limite de emprestimo)
        if (verificaReserva(usuario)) { //Verifica se há reserva
            return "";
            //Terminar ifs para se há reserva
        
        }else {
            if (usuario.isDevedor()) {
                return "Usuário é devedor!"; // Verificando se é devedor
            } else {
                if (usuario.isLimiteMaximo()) {// Verificando se ta no limite máximo
                    return "Limite máximo de empréstimo atingido!";
                } else {
                    if (usuario.getQuantidadeDeReservas() > livro.getQuantidadeDeExemplares()) {
                        return "Há uma quantidade de reserva maior que a de exemplares";

                    }
                    for (int i = 0; i < usuario.getLivros().size(); i++) {
                        if (usuario.getLivros().get(i).getCodigoExemplar() == livro.getCodigoExemplar()) { // Se já
                                                                                                           // tiver
                                                                                                           // algum
                                                                                                           // exemplar
                            return "Usuário já possue um exemplar deste livro";
                        } else {
                            usuario.addEmprestimo(livro); //Atualizar todos dados do emprestimo
                            return "Sucesso" + usuario.getNome() + " " + livro.getNomeLivro();
                        }

                    }
                }
            }
        }
        return null;
    }

    

    public boolean verificaReserva(InterfaceUsuario usuario) { // Verifica se há reserva
        return true;
    }

}
