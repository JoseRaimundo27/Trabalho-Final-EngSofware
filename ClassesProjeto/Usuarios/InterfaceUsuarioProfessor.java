package ClassesProjeto.Usuarios;

public interface InterfaceUsuarioProfessor extends InterfaceUsuario{
    //Professores podem observar livros ( que alunos ñ podem)
    String observarLivro();
}
