package teste_basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo_basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		EntityManagerFactory EntManFac = 
				Persistence.createEntityManagerFactory("jpa-exercises");
		EntityManager EntMan = EntManFac.createEntityManager();
		
		Usuario newUser0 = new Usuario("Bruce Wayne", "waynetech@bruce.com");
		Usuario newUser1 = new Usuario("Dick Grandson", "dickgrandson@grandson.com");
		Usuario newUser2 = new Usuario("Barbara Gordon", "barbaragordonh@gordon.com");
		Usuario newUser3 = new Usuario("Damian Wayne", "damianwayne@wayne.com");
		Usuario newUser4 = new Usuario("Tim Drake", "timdrake@drake.com");
		Usuario newUser5 = new Usuario("Jason Todd", "jasontodd@todd.com");
		
		EntMan.getTransaction().begin();
		EntMan.persist(newUser0);
		EntMan.getTransaction().commit();
		
		EntMan.close();
		EntManFac.close();
	}
}
