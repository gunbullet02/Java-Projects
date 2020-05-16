package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email eml = new Email("Josh","Josol");
		
		System.out.println(eml.showInfo());
		
		//eml.setAlternateEmail("Your Alternate email is :Random@gmail.com");
		//System.out.println(eml.getAlternateEmail());
	}

}
