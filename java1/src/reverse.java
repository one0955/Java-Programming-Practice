
import java.io.*;

import java.io.OutputStreamWriter;

public class reverse {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream in = null;
		InputStreamReader isr = null;

		in = new FileInputStream("input.txt");
		isr = new InputStreamReader (in);
		// Data의 표시 대상 지정 System.out 에 문자를 출력한다.
		BufferedReader br = new BufferedReader(isr);

		PrintWriter pw = new PrintWriter("output.txt");

		String data;
		String arr[] = new String[100];
		int end=0;
		while(((data = br.readLine()) != null)) {
			arr[end]=data;
			end++;
		}
		for(int i=end-1;i>=0;i--) {
			pw.println(arr[i]);
		}


		in.close();isr.close();br.close();pw.close();

	
	
	
	}

}
