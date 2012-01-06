package examples.cap1;

class Pessoa{
    private String nome;
    private int fone;
    public String getDados(){ return nome + fone; }
	public void setNome(String nome){ this.nome = nome;}
	public void setFone(int fone){
		if(fone > 0){
			this.fone = fone;
		}
	};
}

public class Encapsulation{
	static public void main(String... args){
		Pessoa p = new Pessoa();
		p.setNome("Ze");
		p.setFone(-123);//mas isso nao pode!
		
		System.out.println(p.getDados());
	}
}