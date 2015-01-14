public class CountToTenRead {
    public static void main(String[] args) {
	    String readWord = "";
	    for (int i = 0; i <= 10; i++) {
		    switch(i) {
			    case 0: readWord = "zero";
				        break;
				case 1: readWord = "one";
				        break;
				case 2: readWord = "two";
				        break;
				case 3: readWord = "three";
				        break;
				case 4: readWord = "four";
				        break;
				case 5: readWord = "five";
				        break;
				case 6: readWord = "six";
				        break;
				case 7: readWord = "seven";
				        break;
				case 8: readWord = "eight";
				        break;
				case 9: readWord = "nine";
				        break;
				case 10: readWord = "ten";
				        break;
				default: readWord = "Can't count that number!";
				        break;
			}
			System.out.println(readWord);
		}
	}
}