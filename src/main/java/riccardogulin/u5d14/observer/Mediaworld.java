package riccardogulin.u5d14.observer;

public class Mediaworld implements Subscriber { // SUBSCRIBER 3

	@Override
	public void receiveUpdate(String message) {

		System.out.println("Ciao sono un Mediaworld e ho appena ricevuto la notizia che: ");
		System.out.println(message);
	}

}
