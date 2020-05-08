import java.lang.*;
import java.util.Scanner;
class OutOfRangeException extends Exception{
	OutOfRangeException(){
		super("OutOfRangeException");
	}
}

class AddZeroException extends Exception{
	AddZeroException(){
		super("AddZeroException");
	}
}

class SubtractZeroException extends Exception{
	SubtractZeroException(){
		super("SubtractZeroException");
	}
}
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String input = sc.next();
		String[] arr;
		char ch;
		if(input.indexOf('-')==-1) {//-1
			arr=input.split("\\+");
			ch='+';
		}
		else { 
			arr=input.split("-");
			ch='-';
		}
		
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);

		try {
			if(ch=='-') {
				if(a==0 || b==0) throw new SubtractZeroException();
				else if(a-b<0) throw new OutOfRangeException();
				else if(a>1000 || b>1000) throw new OutOfRangeException();
				else System.out.println(a-b);
			}
			else {
				if(a==0 || b==0) throw new AddZeroException();
				else if(a+b>1000) throw new OutOfRangeException();
				else if(a>1000 || b>1000) throw new OutOfRangeException();
				else System.out.println(a+b);
			}
			
		}
		catch(Exception o) {
			System.out.println(o.getMessage());
		}
		
		
	}

}
