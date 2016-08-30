class TesteDaTurma{
	public static void main(String[] args){
		Turma java = new Turma();
		java.alunos = new Aluno[10];
		
		java.alunos[0] = new Aluno();
		java.alunos[0].nome = "Guimarães Neto";
		java.alunos[0].nota = 10;
		
		java.alunos[1] = new Aluno();
		java.alunos[1].nome = "Rapunzel Guimarães";
        java.alunos[1].nota = 8;
		
		java.alunos[2] = new Aluno();
		java.alunos[2].nome = "Sasha Guimarães";
        java.alunos[2].nota = 9;

		java.alunos[3] = new Aluno();
		java.alunos[3].nome = "Frederico Guimarães";
        java.alunos[3].nota = 7;
	
		java.alunos[4] = new Aluno();
		java.alunos[4].nome = "Beijamin Guimarães";
                java.alunos[4].nota = 6;

		java.alunos[5] = new Aluno();
		java.alunos[5].nome = "Coragem Guimarães";
        java.alunos[5].nota = 5;

		java.alunos[6] = new Aluno();
		java.alunos[6].nome = "Candy Guimarães";
        java.alunos[6].nota = 10;

		java.alunos[7] = new Aluno();
		java.alunos[7].nome = "Ralph Guimarães";
        java.alunos[7].nota = 2;
		
		java.imprimeNotas();
	}
}
