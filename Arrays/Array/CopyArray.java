package Array;

public class CopyArray {

	public static void main(String[] args) {
		int[] num1=new int[] {1,2,3,4,5};
		int[] num2=new int[] {5,6,7};
		
		int[] merge=new int[num1.length+num2.length];
		System.arraycopy(num1, 0, merge, 0, num1.length);
		System.arraycopy(num2, 0, merge, num1.length, num2.length);
		for(int i=0;i<merge.length;i++) {
		System.out.print(merge[i]);
		}
	}
}
