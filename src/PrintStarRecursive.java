

public class PrintStarRecursive {

	static int x = 5;
	public static void main(String[] args) {
		
		System.out.println("This is * in one line");
		printStarOneLine(x);
		System.out.println("\n\nThis is * Triangle");
		printStarTriangle(x);
		System.out.println("\n\nThis is Full Pyramid");
		printStarFullPyramid(x);
	}
	
	public static void printStarOneLine(int n) {
		if(n>0) {
			System.out.print("*");
			printStarOneLine(n-1);
		}
	}
	
	public static String printStarTriangle(int n) {
		if(n>0) {
			String p = printStarTriangle(n-1);
			p=p+"*";
			System.out.println(p);
			return p;
		}
		return "";
	}
	
	public static String printStarFullPyramid(int s) {
		if(s>0) {
			System.out.println(printSpace(s-1)+printStar((x-s)*2+1));
			return printStarFullPyramid(s-1);
		}
		return "";
	}
	
	public static String printStar(int n) {
		if(n>0) {
			return printStar(n-1)+"*";
		}
		return "";
	}

	public static String printSpace(int n) {
		if(n>0) {
			return printSpace(n-1)+" ";
		}
		return "";
	}
}
