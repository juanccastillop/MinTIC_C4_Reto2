package co.edu.usa.lasartenreto2.reto2_lasarten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import co.edu.usa.lasartenreto2.reto2_lasarten.repositories.crud.CookwareInterface;
import co.edu.usa.lasartenreto2.reto2_lasarten.repositories.crud.UserInterface;

@Component
@SpringBootApplication
public class Reto2LasartenApplication implements CommandLineRunner {

	@Autowired
	private CookwareInterface cookwareInterface;

	@Autowired
	private UserInterface userInterface;

	public static void main(String[] args) {
		SpringApplication.run(Reto2LasartenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cookwareInterface.deleteAll();
		userInterface.deleteAll();
	}

}
