package riccardogulin.u5d14.observer;

public class User implements Subscriber {// SUBSCRIBER 2

	@Override
	public void receiveUpdate(String message) {
		System.out.println("Ciao sono un utente e ho appena ricevuto la notizia che: ");
		System.out.println(message);

	}

}
