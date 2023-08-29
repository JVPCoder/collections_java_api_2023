package set.Pesquisa;

public class Tarefa {
	private String desc;
	private boolean feito;
	
	public Tarefa(String desc) {
		this.desc = desc;
		this.feito = false;
	}

	public boolean isFeito() {
		return feito;
	}

	public void setFeito(boolean feito) {
		this.feito = feito;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "Tarefa [desc=" + desc + ", feito=" + feito + "]";
	}
	
	
	
}
