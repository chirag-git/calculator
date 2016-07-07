package first_project;

import java.util.Scanner;

public class my_class implements my_interface {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int divide(int a, int b)throws ArithmeticException {
		try{
		return a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_interface obj= new my_class();
		int a,b,temp;
		Scanner inp =new Scanner(System.in);
		System.out.println("enter first no");
		a=inp.nextInt();
		
		System.out.println("enter second no");
		b=inp.nextInt();
		
		System.out.println("enter choice");
		temp=inp.nextInt();
		
		switch(temp)
		{
		case 1:
			System.out.println(obj.add(a, b));
			break;
		case 2:
			System.out.println(obj.subtract(a, b));
			break;
		case 3:
			System.out.println(obj.multiply(a, b));
			break;
		case 4:
			System.out.println(obj.divide(a, b));
			break;
		default:
			break;
		}

	}

}
