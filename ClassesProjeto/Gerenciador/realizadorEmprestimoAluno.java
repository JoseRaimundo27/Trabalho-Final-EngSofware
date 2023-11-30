package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuarioAluno;
import ClassesProjeto.Usuarios.InterfaceUsuario;
import ClassesProjeto.Livro.InterfaceLivro;

public class realizadorEmprestimoAluno implements InterfaceRealizadorEmprestimo {
   VerificadorReserva verifica = new VerificadorReserva();
    @Override
    public boolean realizarEmprestimo(InterfaceUsuario u, InterfaceLivro livro) {
        InterfaceUsuarioAluno usuario = (InterfaceUsuarioAluno) u; // Realizando Downcasting para acessar metodos do
                                                                   // filho InterfacUsuarioAluno (limite de emprestimo)
        if(livro == null){
            System.out.println("Codigo do livro inválido!"); 
            return false;
        }
        if(usuario == null){
            System.out.println("Codigo do usuário inválido!");
            return false;
        }

        //PARA USUARIOS COM RESERVA:
        if (verifica.verificaReserva(usuario, livro)) { //Verifica se há reserva
            if (usuario.isDevedor()) { //Verifica se é devedor
                System.out.println("Usuário é devedor!");
                return false;
            } else {
                if (usuario.isLimiteMaximo()) {// Verificando se ta no limite máximo
                    System.out.println("Usuário é devedor!");
                    return false;
                } else {
                    if (livro.getQuantidadeDeReservas() < livro.getQuantidadeDeExemplares()) { //"A quantidade de reservas for maior igual..."
                        System.out.println("Há uma quantidade de reserva maior que a de exemplares");
                        return false;

                    }for (int i = 0; i < usuario.getLivrosEmprestados().size(); i++) {
                        if (usuario.getLivrosEmprestados().get(i).getCodigoExemplar() == livro.getCodigoExemplar()) { // Se já
                                                                                                           // tiver
                                                                                                           // algum
                                                                                                           // exemplar
                            System.out.println("Usuário já possui um exemplar deste livro");
                            return false;
                        } 
                      }// Se não tiver exemplar:
                        usuario.addEmprestimo(livro); //Atualizar todos dados do emprestimo
                        usuario.removeReserva(livro);
                        livro.removeReservaLivro();
                        System.out.println("Sucesso" + usuario.getNome() + " " + livro.getNomeLivro());
                        return true;
                }
            }
        }
        
            //PARA USUARIOS SEM RESERVA:
        else {
            if (usuario.isDevedor()) {// Verificando se é devedor
                System.out.println("Usuário é devedor!");
                return false;
            } else {
                if (usuario.isLimiteMaximo()) {// Verificando se ta no limite máximo
                    System.out.println("Limite máximo de empréstimo atingido!");
                    return false;
                } else {
                    if (livro.getQuantidadeDeReservas()  > livro.getQuantidadeDeExemplares()) {
                        System.out.println("Há uma quantidade de reserva maior que a de exemplares");
                        return false;
                    }
                    for (int i = 0; i < usuario.getLivrosEmprestados().size(); i++) {
                        if (usuario.getLivrosEmprestados().get(i).getCodigoExemplar() == livro.getCodigoExemplar()) { // Se já
                                                                                                           // tiver
                                                                                                           // algum
                                                                                                           // exemplar
                            System.out.println("Usuário já possui um exemplar deste livro");
                            return false;
                        } 
                    }// Se não tiver exemplar:
                        usuario.addEmprestimo(livro); //Atualizar todos dados do emprestimo
                        livro.setDiasDevolucao(usuario.getTempoEmprestimo()); //seta quantidade de dias que ele pode ficar com o livro
                        System.out.println("Sucesso, o usuário " + usuario.getNome() + " pegou emprestado o livro " + livro.getNomeLivro());
                        return true;
                }
            }
        }
    }

    

}
