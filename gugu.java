import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		System.out.print("원하는 단을 입력하세요: ");
		Scanner in =new Scanner(System.in);
		int num = in.nextInt();
		
		for(int i = 1;i<10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
		

	}

}
