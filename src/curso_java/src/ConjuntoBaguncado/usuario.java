package ConjuntoBaguncado;

import java.util.Objects;

public class usuario {
	String nome;
	
	usuario(String nome){
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Meu nome é " + nome + "!";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		usuario other = (usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}
