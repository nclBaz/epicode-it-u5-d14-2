package riccardogulin.u5d14.chainofresponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		User u = new User("admin@gmaila.com", "1234", "USER");
		LoggerFilter logger = new LoggerFilter();
		CredentialsFilter credentials = new CredentialsFilter();
		RoleCheckerFilter role = new RoleCheckerFilter();

		// Imposto l'ordine degli elementi della catena
		logger.setNext(credentials);
		credentials.setNext(role);

		// Faccio partire la catena chiamando il metodo check del primo
		logger.check(u);

	}

}
