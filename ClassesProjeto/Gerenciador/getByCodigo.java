package ClassesProjeto.Gerenciador;

import java.util.ArrayList;


import ClassesProjeto.Livro.InterfaceLivro;
import ClassesProjeto.Usuarios.InterfaceUsuario;

public class getByCodigo {
     public InterfaceLivro getLivroByCodigo(ArrayList<InterfaceLivro> livros,double codigoLivro){
        for(int i=0;i<livros.size();i++){
            if(livros.get(i).getCodigoLivro() == codigoLivro){
                return livros.get(i);
            }
        }
        return null;

    }
   public InterfaceUsuario getUsuarioByCodigoUsuario(ArrayList<InterfaceUsuario> usuarios,double codigoIdentificacao){
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getCodigoIdentificacao() == codigoIdentificacao){
                return usuarios.get(i);
            }
        }
        return null;
    }
}
