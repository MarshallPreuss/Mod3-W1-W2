package assignments;

public class loops {
 public static void main(String[] args) {
	 printStars();
 }
	 
 static void printStars() {
 	
	int i;
	int x;
	 
	 for(i = 0; i<=6;i++) {
		 for(x=1;x<=7-i;x++) {
			 System.out.println("*");
			 System.out.println("");
		 }
	 }
 }
}
