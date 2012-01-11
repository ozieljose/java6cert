package examples.cap2;

class Pessoa{}
class Aluno extends Pessoa{}

class CastTest{
	public static void main(String[]args){
		Pessoa p = new Pessoa();
		Aluno a = (Aluno)p;
	}
}