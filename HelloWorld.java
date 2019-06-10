
public class HelloWorld {

	public static void main(String args[]) 
	{  System.out.println("we are in main") ; 
	int a=10,b=5;
	 System.out.println("summation of two number is " +summation(a,b)); 
	 System.out.println("substraction of two number is " +substraction(a,b));
	 System.out.println("multiplication of two number is " +multiplication(a,b));
	 System.out.println("division of two number is "+division(a,b) );
		}
	public static int summation(int n,int m) {
		int result = m+n;
		return result;
	}
	public static int substraction(int m, int n) {
		int result =m-n;
		return result;
	}
	public static int multiplication(int m, int n) {
		int result =m*n;
		return result;
	}
	public static int division(int m, int n) {
		int result =m/n;
		return result;
	}
	}


