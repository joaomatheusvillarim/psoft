package app;

public interface CoordenadorInterface {

  public AlunoDTO cadastrarAluno(AlunoDTO aluno);

  public AlunoDTO acessarAluno(Long matricula);

  public AlunoDTO atualizarAluno(Long matricula, AlunoDTO aluno);

  public void removerAluno(Long matricula);

  public ProfessorDTO cadastrarProfessor(ProfessorDTO professor);

  public ProfessorDTO acessarProfessor(String email);

  public ProfessorDTO atualizarProfessor(String email, ProfessorDTO professor);

  public void removerProfessor(String email);

  public AreaDeEstudoDTO cadastrarAreaDeEstudo(String nome);

  public AreaDeEstudoDTO acessarAreaDeEstudo(String nome);

  public AreaDeEstudoDTO atualizarAreaDeEstudo(String nome);

  public void removerAreaDeEstudo(String nome);

}