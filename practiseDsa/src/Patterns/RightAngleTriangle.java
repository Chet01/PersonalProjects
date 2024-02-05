package Patterns;

public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rightAngle(5);
        rightAngleRev(5);
	}
	
	public static void rightAngle(int n) {
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}
	
	public static void rightAngleRev(int n) {
		for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n-i+1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}

//chethan sakaria
