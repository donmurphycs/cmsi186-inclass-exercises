class HelloYouTryCatch {
    public static void main(String[] args) {
		try {
            System.out.println("Hello "+ args[0] + "!"); // Prints out a greeting, including the first argument string
        } catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("No arguments, so Hello World!");
		}
	}
}