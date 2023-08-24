package riccardogulin.u5d14.observer;

import java.util.ArrayList;
import java.util.List;

public class Apple { // PUBLISHER

	private List<Subscriber> subscribers = new ArrayList<>();

	public void addSubscriber(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}

	public void removeSubscriber(Subscriber subscriber) {
		this.subscribers.remove(subscriber);
	}

	public void makeAnnouncment(String text) {
		for (Subscriber subscriber : subscribers) {
			subscriber.receiveUpdate(text);
		}
	}

}
