
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" 1 2  3";
		String d = " ";
		String[] data = s.split(d);
		for(int i=0;i<data.length;i++) {
			System.out.println("*"+ data[i]);
		}
	}

}
