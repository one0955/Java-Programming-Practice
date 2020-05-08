import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
public class contactlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<>();
		Scanner sc =new Scanner(System.in);
		//map.put(key,value)
		//map.get(key)
		//map.remove(key)
		String order;
		while(true) {
			order = sc.nextLine();
			String[] arr =order.split(" ");

			if(arr[0].equals("show")) {
				if(arr.length !=1) System.out.println("error");
				else {
					TreeMap<String,String> tm = new TreeMap<String,String>(map);
					for(HashMap.Entry<String,String> entry : tm.entrySet()) {
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
				}
					
			}
			else if(arr[0].equals("add")) {
				if(arr.length!=3) {
					System.out.println("error");
				}
				else if(map.get(arr[1])!=null) {
					System.out.println("error");
				}
				else {
					map.put(arr[1], arr[2]);
				}
			}
			else if(arr[0].equals("find")) {
				if(arr.length!=2) {
					System.out.println("error");
				}
				else if(map.get(arr[1])==null) {
					System.out.println("error");
				}
				else {
					System.out.println(map.get(arr[1]));
				}
			}
			else if(arr[0].equals("delete")) {
				if(arr.length!=2) {
					System.out.println("error");
				}
				else if(map.get(arr[1])==null) System.out.println("error");
				else map.remove(arr[1]);
				
			}
			else System.out.println("error");
		
	 }

		
}
}