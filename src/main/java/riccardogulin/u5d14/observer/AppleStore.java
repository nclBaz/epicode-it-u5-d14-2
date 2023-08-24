package riccardogulin.u5d14.observer;

public class AppleStore implements Subscriber {// SUBSCRIBER 1

	@Override
	public void receiveUpdate(String message) {
		System.out.println("Ciao sono un Apple Store e ho appena ricevuto la notizia che: ");
		System.out.println(message);

	}

}
