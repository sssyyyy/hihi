import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		System.out.print("원하는 단을 입력하세요: ");
		Scanner in =new Scanner(System.in);
		int num = in.nextInt();
		
		if(num==0)
		{
		for(int i = 1;i<10;i++)
		{
			System.out.println(i+"단");
			for(int j=1;j<10;j++)
				System.out.println(i+" * "+j+" = "+i*j);
		}
		}
		else if(num>0)
		{
			for(int i = 1;i<10;i++)
				System.out.println(num+" * "+i+" = "+num*i);
		}
		else
		{
			System.out.println("출력 불가");
		}

	}

}
