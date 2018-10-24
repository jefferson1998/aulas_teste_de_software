package ifpe.edu.br.objetos;

import java.util.List;

public class Frase {
	
	private List<Palavra> frases;
	
	public Frase () {
		
	}

	public List<Palavra> getFrases() {
		return frases;
	}

	public void setFrases(List<Palavra> frases) {
		this.frases = frases;
	}

	@Override
	public String toString() {
		return "Frase [frases=" + frases + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((frases == null) ? 0 : frases.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Frase other = (Frase) obj;
		if (frases == null) {
			if (other.frases != null)
				return false;
		} else if (!frases.equals(other.frases))
			return false;
		return true;
	}
	
	
	
}
