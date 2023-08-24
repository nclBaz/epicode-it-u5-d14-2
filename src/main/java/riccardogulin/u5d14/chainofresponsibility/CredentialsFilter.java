package riccardogulin.u5d14.chainofresponsibility;

public class CredentialsFilter extends Filter {

	@Override
	public void check(User u) {
		if (u.getPassword().equals("1234") && u.getEmail().equals("admin@gmail.com")) {
			System.out.println("Credenziali corrette!");
			this.goNext(u);
		} else {
			System.err.println("Catena terminata --> credenziali non corrette");
		}

	}

}
