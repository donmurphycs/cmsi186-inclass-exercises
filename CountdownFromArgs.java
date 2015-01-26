public class CountdownFromArgs {
	public static void main(String[] args) {
		try {
			int maxCount = Integer.parseInt(args[0]);
			if (maxCount > 0) {
				for (int i = maxCount; i >= 0; i--) {
					System.out.printf(i + " ");
				}
			}
			else {
				System.out.println("Integer argument must be greater than 0.");
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No argument given. Enter an integer.");
		}
		catch (NumberFormatException e2) {
			System.out.println("The argument must be an integer.");
		}
		catch (Exception e3) {
			System.out.println("An unknown error occurred. Please try again.");
		}
	}
}
