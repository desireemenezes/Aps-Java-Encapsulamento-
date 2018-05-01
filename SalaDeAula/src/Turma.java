
public class Turma {
	
	private Aluno[] alunos = new Aluno[5];
	private Avaliacao[] avaliacoes = new Avaliacao[3];
	private String disciplina;
	
	
	public Turma(String disciplina) {
		this.disciplina = disciplina;
		turmaNova();
	}
	
	public Avaliacao[] getAvaliacoes() {
		return avaliacoes;
	}


	public void setAvaliacoes(Avaliacao[] avaliacoes) {
		this.avaliacoes = avaliacoes;
	}	

	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	private void turmaNova() {
		
		System.out.println("Disciplina: " +this.disciplina);
		
			Aluno aluno1 = new Aluno();	
			aluno1.setNome("João");
			aluno1.setMatricula(01);
			alunos[0] = aluno1;
			
			
			Aluno aluno2 = new Aluno();
			aluno2.setNome("Maria");
			aluno2.setMatricula(02);
			alunos[1] = aluno2;
			
			Aluno aluno3 = new Aluno();
			aluno3.setNome("Julia");
			aluno3.setMatricula(03);
			alunos[2] = aluno3;
			
			Aluno aluno4 = new Aluno();
			aluno4.setNome("Carol");
			aluno4.setMatricula(04);
			alunos[3] = aluno4;
			
			Aluno aluno5 = new Aluno();
			aluno5.setNome("Carlos");
			aluno5.setMatricula(05);
			alunos[4] = aluno5;
				
	}


	public void avaliacoes() {
		
		Avaliacao avaliacao1 = new Avaliacao();
		avaliacao1.setDataAvaliacao("10/05/2018");
		avaliacao1.setPeso(10);
		
		Avaliacao avaliacao2 = new Avaliacao();
		avaliacao2.setDataAvaliacao("20/05/2018");
		avaliacao2.setPeso(10);
		
		Avaliacao avaliacao3 = new Avaliacao();
		avaliacao3.setDataAvaliacao("25/05/2018");
		avaliacao3.setPeso(10);
		
		System.out.println("Avaliações da disciplina:\n ");
	
		
	}




}
