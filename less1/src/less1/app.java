package less1;

public class app {
	public static void main(String[] args) {
//		byte a=1;
//		short b=23;
//		int c=21342423;
//		long d=999999999L;
//		char e='@';
//		float f=2134.234F;
//		double g=213443.2352342;		
//		boolean h=true;
//		
//		System.out.print("Byte max="+ Byte.MAX_VALUE+"   ");
//		System.out.println("Byte min="+ Byte.MIN_VALUE);
//	
//		System.out.print("Short max="+ Short.MAX_VALUE+"   ");
//		System.out.println("Short min="+ Short.MIN_VALUE);
//		
//		System.out.print("Int max="+ Integer.MAX_VALUE+"   ");
//		System.out.println("Int min="+ Integer.MIN_VALUE);
//
//		System.out.print("Long max="+ Long.MAX_VALUE+"   ");
//		System.out.println("Long min="+ Long.MIN_VALUE);
//		
//		System.out.print("Float max="+ Float.MAX_VALUE+"   ");
//		System.out.println("Float min="+ Float.MIN_VALUE);
//		
//		System.out.print("Double max="+ Double.MAX_VALUE+"   ");
//		System.out.println("Double min="+ Double.MIN_VALUE);
//		

		int arr1[] = { 1, 3, 8, 32, 74, 67, 8843, 23, -125, 643 };
		int min = arr1[0];
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "   ");
			if (arr1[i] < min)
				min = arr1[i];
			if (arr1[i] > max)
				max = arr1[i];
		}
		System.out.println("");
		System.out.println("Min=" + min);
		System.out.println("Max=" + max);

	}
}

// first commit to g