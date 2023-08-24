package riccardogulin.u5d14.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ObserverRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		User u = new User();
		Mediaworld m = new Mediaworld();
		AppleStore as = new AppleStore();

		Apple a = new Apple();

		a.addSubscriber(u);
		a.addSubscriber(as);
		a.addSubscriber(m);

		a.makeAnnouncment("E' uscito il nuovo iPhone 100000! ");

		a.removeSubscriber(u);
		a.makeAnnouncment("E' uscito il nuovo macbook pro 20");

	}

}
