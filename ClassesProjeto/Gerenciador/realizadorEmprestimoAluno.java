package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuarioAluno;
import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Livro.InterfaceLivro;

public class realizadorEmprestimoAluno implements InterfaceRealizadorEmprestimo {
   VerificadorReserva verifica = new VerificadorReserva();
    @Override
    public String realizarEmprestimo(InterfaceUsuario u, InterfaceLivro livro) {
        InterfaceUsuarioAluno usuario = (InterfaceUsuarioAluno) u; // Realizando Downcasting para acessar metodos do
                                                                   // filho InterfacUsuarioAluno (limite de emprestimo)


        //PARA USUARIOS COM RESERVA:
        if (verifica.verificaReserva(usuario, livro)) { //Verifica se há reserva
            if (usuario.isDevedor()) {
                return "Usuário é devedor!"; // Verificando se é devedor
            } else {
                if (usuario.isLimiteMaximo()) {// Verificando se ta no limite máximo
                    return "Limite máximo de empréstimo atingido!";
                } else {
                    if (livro.getQuantidadeDeReservas() < livro.getQuantidadeDeExemplares()) { //"A quantidade de reservas for maior igual..."
                        return "Há uma quantidade de reserva maior que a de exemplares";

                    }for (int i = 0; i < usuario.getLivrosEmprestados().size(); i++) {
                        if (usuario.getLivrosEmprestados().get(i).getCodigoExemplar() == livro.getCodigoExemplar()) { // Se já
                                                                                                           // tiver
                                                                                                           // algum
                                                                                                           // exemplar
                            return "Usuário já possui um exemplar deste livro";
                        } 
                      }// Se não tiver exemplar:
                        usuario.addEmprestimo(livro); //Atualizar todos dados do emprestimo
                        usuario.removeReserva(livro);
                        livro.removeReservaLivro();
                        return "Sucesso" + usuario.getNome() + " " + livro.getNomeLivro();
                }
            }
        }
        
            //PARA USUARIOS SEM RESERVA:
        else {
            if (usuario.isDevedor()) {
                return "Usuário é devedor!"; // Verificando se é devedor
            } else {
                if (usuario.isLimiteMaximo()) {// Verificando se ta no limite máximo
                    return "Limite máximo de empréstimo atingido!";
                } else {
                    if (livro.getQuantidadeDeReservas()  > livro.getQuantidadeDeExemplares()) {
                        return "Há uma quantidade de reserva maior que a de exemplares";
                    }
                    for (int i = 0; i < usuario.getLivrosEmprestados().size(); i++) {
                        if (usuario.getLivrosEmprestados().get(i).getCodigoExemplar() == livro.getCodigoExemplar()) { // Se já
                                                                                                           // tiver
                                                                                                           // algum
                                                                                                           // exemplar
                            return "Usuário já possui um exemplar deste livro";
                        } 
                    }// Se não tiver exemplar:
                        usuario.addEmprestimo(livro); //Atualizar todos dados do emprestimo
                        return "Sucesso" + usuario.getNome() + " " + livro.getNomeLivro();
                }
            }
        }
    }

    

}
