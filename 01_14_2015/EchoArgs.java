public class EchoArgs {
    public static void main(String[] args) {
	    int numOfArgs = args.length;
		for (int i = 0; i < numOfArgs; i++) {
		    System.out.println(args[i]);
		}
	}
}