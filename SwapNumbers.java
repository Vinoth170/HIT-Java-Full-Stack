package labexercise._1;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=120, second=220;
		System.out.println("--Before Swap--");
		System.out.println("First number: "+first);
		System.out.println("Second number: "+second);
		first-=second;
		second+=first;
		first=second-first;
		System.out.println("--After Swap--");
		System.out.println("First number: "+first);
		System.out.println("Second number: "+second);
	}

}
