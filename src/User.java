
import java.util.Scanner;

public class User {

	private String UserID;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private static String storedPassword;
	private static String storedEmail;
	private static String storedFirstName;
	private static String storedLastName;

	public User(String userID, String firstName, String lastName, String email, String password) {
		this.UserID = userID;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Email = email;
		this.Password = password;
	}

	public void Register() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("User registered successfully!");
		System.out.println("User Registration:");

		System.out.print("Enter First Name: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter Last Name: ");
		String lastName = scanner.nextLine();

		System.out.print("Enter Email: ");
		String email = scanner.nextLine();

		System.out.print("Enter Password: ");
		String password = scanner.nextLine();

		System.out.println("User Registered Successfully:");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);

	}

	public void Login() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("User Login:");

		System.out.print("Enter Email: ");
		String email = scanner.nextLine();

		System.out.print("Enter Password: ");
		String password = scanner.nextLine();

		if (checkCredentials(email, password)) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login failed. Invalid input!!!");
		}
	}

	private static boolean checkCredentials(String email, String password) {
		return email.equals(storedEmail) && password.equals(storedPassword);
	}

	public void UpdateProfile() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("User Profile Update:");

        System.out.print("Enter New First Name (leave blank to keep current): ");
        String newFirstName = scanner.nextLine();
        if (!newFirstName.isEmpty()) {
            storedFirstName = newFirstName;
        }

        System.out.print("Enter New Last Name (leave blank to keep current): ");
        String newLastName = scanner.nextLine();
        if (!newLastName.isEmpty()) {
            storedLastName = newLastName;
        }

        System.out.print("Enter New Email (leave blank to keep current): ");
        String newEmail = scanner.nextLine();
        if (!newEmail.isEmpty()) {
            storedEmail = newEmail;
        }

        System.out.print("Enter New Password (leave blank to keep current): ");
        String newPassword = scanner.nextLine();
        if (!newPassword.isEmpty()) {
            storedPassword = newPassword;
        }

        System.out.println("User Profile Updated Successfully:");
        System.out.println("First Name: " + storedFirstName);
        System.out.println("Last Name: " + storedLastName);
        System.out.println("Email: " + storedEmail);
        System.out.println("Password: " + storedPassword);
		
	}

	public void ResetPassword() {

		Scanner scanner = new Scanner(System.in);

        System.out.println("Password Reset:");

        System.out.print("Enter your Email: ");
        String userEmail = scanner.nextLine();

        if (userEmail.equals(storedEmail)) {
            String newPassword = generateTemporaryPassword();

            storedPassword = newPassword;

            System.out.println("Password reset successful! Your new temporary password is: " + newPassword);
        } else {
            System.out.println("Password reset failed. Invalid email.");
        }

    }

    private static String generateTemporaryPassword() {
        return "newTemporaryPassword123";
	}

}
