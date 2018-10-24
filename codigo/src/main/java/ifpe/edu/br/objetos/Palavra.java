package ifpe.edu.br.objetos;

public class Palavra {

	private String texto;
	private int quantidadeDeLetras;
	private int quantidadeDeVogais = 0;
	
	public Palavra() {

//		char array[] = texto.toCharArray();
//		for(int i = 0; i < texto.length(); i++) {
//			if(array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
//				this.quantidadeDeVogais++;
//			}
//		}
//		
//		this.quantidadeDeLetras = array.length - quantidadeDeVogais;
		
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getQuantidadeDeLetras() {
		return quantidadeDeLetras;
	}
	public void setQuantidadeDeLetras(int quantidadeDeLetras) {
		this.quantidadeDeLetras = quantidadeDeLetras;
	}
	public int getQuantidadeDeVogais() {
		return quantidadeDeVogais;
	}
	public void setQuantidadeDeVogais(int quantidadeDeVogais) {
		this.quantidadeDeVogais = quantidadeDeVogais;
	}
	
	public static String inversoPalavra(String palavra) {
		char array[] = palavra.toCharArray();
		String inversa = "";
		
		for (int i = array.length - 1; i >= 0; i--) {
			inversa = inversa + array[i];
		}
		System.out.println(inversa);
		return inversa;
	}
	
	public static boolean palindromo(String palavra) {
		char array[] = palavra.toCharArray();
		String teste = "";
		for (int i = 0; i < array.length; i++) {
			teste += array[array.length - 1 - i];
		}
		
		if (palavra.equals(teste)) {
			return true;
		} else {
			return false;
		}
	} 

	@Override
	public String toString() {
		return "Palavra [texto=" + texto + ", quantidadeDeLetras=" + quantidadeDeLetras + ", quantidadeDeVogais="
				+ quantidadeDeVogais + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantidadeDeLetras;
		result = prime * result + quantidadeDeVogais;
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
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
		Palavra other = (Palavra) obj;
		if (quantidadeDeLetras != other.quantidadeDeLetras)
			return false;
		if (quantidadeDeVogais != other.quantidadeDeVogais)
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}
	
}
