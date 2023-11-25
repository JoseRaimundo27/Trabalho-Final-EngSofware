package ClassesProjeto.Gerenciador;

import ClassesProjeto.Usuarios.InterfaceUsuarioAluno;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class realizadorEmprestimoAluno implements InterfaceRealizadorEmprestimo {

    @Override
    public String realizarEmprestimo(InterfaceUsuario u) {
        InterfaceUsuarioAluno usuario = (InterfaceUsuarioAluno)u; //Realizando Downcasting para acessar metodos do filho InterfacUsuarioAluno (limite de emprestimo)
        if(verificaReserva(usuario)){
            return "";
        }else{
            if(usuario.isDevedor()){
                return "Usuário é devedor!"; //Verificando se é devedor
            }else{
                if(usuario.isLimiteMaximo()){//Verificando se ta no limite máximo
                    return "Limite máximo de empréstimo atingido!";
                } else{
                    //QUANTIDADE DE RESERVAS
                    return "";
                }   
            }
        }
    }

    public boolean verificaReserva(InterfaceUsuario usuario){ //Verifica se há reserva 
        return true;
    }
    
}
