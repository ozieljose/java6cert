package examples.cap1;

class Teste{
	public static void main(String... args){
		Teste t1 = new Teste();
		Teste t2 = new Teste();
		System.out.println(t1.toString());
		if(t2 instanceof Object){
			System.out.println("Eh Object");
		}
	}
}

class Pessoa{
	private String nome;
	public String getNome(){return nome;}
	public void setNome(String nome){this.nome = nome;}
}
class Aluno extends Pessoa implements AcessadorLaboratorio{
	void responderProva(){}
	public void acessarComputador(){}
}
class Professor extends Pessoa implements AcessadorLaboratorio{
	void criarProva(){}
	public void acessarComputador(){}
}
interface AcessadorLaboratorio{
	void acessarComputador();
}

class Heranca{
	public void assinar(Pessoa pessoa){
		System.out.println(pessoa.getNome());
	}
	public static void main(String... args){
		
		/*Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		AbaixoAssinado abaixoAssinado = new AbaixoAssinado();
		
		abaixoAssinado.assinar(pessoa);
		abaixoAssinado.assinar(aluno);
		abaixoAssinado.assinar(professor);
		
		AcessadorLaboratorio al1 = aluno;
		AcessadorLaboratorio al2 = professor;
		al1.acessarComputador();
		al2.acessarComputador();*/
		
		Electronic e = new Electronic();
		Phone3 p = new Phone3();
		System.out.println(e instanceof Device);
		System.out.println(p instanceof Device);
	}
}

class Electronic implements Device{ public void doIt() { } }

abstract class Phone1 extends Electronic { }

abstract class Phone2 extends Electronic{ public void doIt(int x) { } }

class Phone3 extends Electronic implements Device{ public void doStuff() { } }

interface Device { public void doIt(); }