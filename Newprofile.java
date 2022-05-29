import java.util.Scanner;
class profile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name");
		String name=sc.nextLine();
		System.out.println("Enter ur age");
		Byte age=sc.nextByte();
		System.out.println("Enter Marks in 6 subjects");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int n5=sc.nextInt();
		int n6=sc.nextInt();
		int total=n1+n2+n3+n4+n5+n6;
		double Avg=total/6.0;
		System.out.println("Total, Avg, Name = "+total+" " +Avg+" " +name);
	}
}