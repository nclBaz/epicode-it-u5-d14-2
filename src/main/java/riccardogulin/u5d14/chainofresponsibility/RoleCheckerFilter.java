package riccardogulin.u5d14.chainofresponsibility;

public class RoleCheckerFilter extends Filter {

	@Override
	public void check(User u) {
		if (u.getRole().equals("ADMIN")) {
			System.out.println("Benvenuto admin!");
			this.goNext(u);
		} else {
			System.err.println("Catena terminata --> Solo gli admin accedono");
		}

	}

}
