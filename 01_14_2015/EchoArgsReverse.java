public class EchoArgsReverse {
    public static void main(String[] args) {
	    int numOfArgs = args.length;
		for (int i = numOfArgs - 1; i >= 0; i--) {
		    System.out.println(args[i]);
		}
	}
}