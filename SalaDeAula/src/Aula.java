
public class Aula {

	private String data;
	private String descricao;
	private boolean []chamada = new boolean[5];
	
	public Aula (String data, String descricao) {
		this.data = data;
		this.descricao = descricao;
	}
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public boolean [] getChamada() {
		return chamada;
	}


	public void setChamada(boolean [] chamada) {
		this.chamada = chamada;
	}
	
	public void chamadaAlunos(Aluno[] alunos) {
		System.out.println("Chamada do dia " +data);
		System.out.println("Digite P para presença ou F para falta: ");
		int i = 0;
		
		while(i<alunos.length) {
			
			
			String valor = salaDeAula.teclado(alunos[i].getNome());
			if((valor.toLowerCase().equals("p")) ||  (valor.toLowerCase().equals("f"))){
				
				if (valor.equalsIgnoreCase("p")) {
					chamada[i] = true;
				} else {
					chamada[i] = false;
				}
					
				 i++;
			} else {
				System.out.println("Valor inválido");
				
				
			}		
		}
	}
	public void listaPresenca(Aluno[] alunos) {
		System.out.println("\n");
		for(int i=0; i<alunos.length; i++) {
			if(chamada[i]) {
				System.out.println(alunos[i].getNome() +" Presente!");
			} else {
				System.out.println(alunos[i].getNome() + " Ausente");
			}
		}	
		
	}
	
	
}
