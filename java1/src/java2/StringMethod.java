package java2;
import java.util.Scanner;

public class StringMethod {
    static String addString(String s1, int index, String s2) {
    	String c ="";
    	for(int i=0;i<s1.length();i++){
    		c+=s1.charAt(i);
    		if(i==index) {
    			c+=s2;
    		}
    	}
    	return c;
    }
    static String reverse(String s) {
    	String c="";
    	for(int i=s.length()-1;i>=0;i--){
    		c+=s.charAt(i);
    	}
    	return c;
    }
    static String removeString(String s1, String s2) {
    	String c = "";
    	int i=0;
    	int s=0;
    	while(i<s1.length()) {
    		s=i;
    		if(s1.indexOf(s2,i)==-1)
    			i=s1.length();
    		else {
    			i=s1.indexOf(s2,i);
    		}
    		for(int k=s;k<i;k++) 
    			c+=s1.charAt(k);
    		
    		for(int j=0;j<s2.length();j++) i++;
    	}
    	
    	return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    return;
    
	}

}
