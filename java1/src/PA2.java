import java.util.Scanner;


import java.io.*;
import java.lang.*;


class BombInputException extends Exception{
	BombInputException(){
		super("BombInputException");
	}
}
class ModeInputException extends Exception{
	ModeInputException(){
		super("ModeInputException");
	}
}
class HitException extends Exception{
	HitException(){
		super("HitException");
	}
}
public class PA2 {
	static int score=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[][] = new String[10][10];
		Scanner sc = new Scanner(System.in);
		int bombs = sc.nextInt();
		String mode = sc.next();
		String name = sc.nextLine();
		String filename = name.trim();
		
		try {
			if(bombs<0) throw new BombInputException();
			if(!(mode.equals("d")||mode.equals("D")||mode.equals("r")||mode.equals("R")))
				throw new ModeInputException();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		try {
			ReadFile(arr, filename);

		}
		catch(FileNotFoundException e) {
			MakeBoard(arr);
			
		}
		catch(IOException e) {
			MakeBoard(arr);
		}
		
		if(mode.equals("d")||mode.equals("D")) DebugMode(arr,bombs);
		else ReleaseMode(arr, bombs);
		
		
		return;
	}

	
	
static void MakeBoard(String arr[][]) {
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				arr[i][j] = " ";
		
		LocateShip(arr, "A",6, 1);
		LocateShip(arr, "B",4, 2);
		LocateShip(arr, "S",3, 2);
		LocateShip(arr, "D",3, 1);
		LocateShip(arr, "P",2, 4);
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				if(arr[i][j].equals("n")) arr[i][j]=" ";
		
	}
static void LocateShip(String arr[][],String type,int length, int num) {
	int dir;
	int row, column;
	int i=0;
	Label1: while(i<num) {
		dir= (int)(Math.random()*2);
		if(dir==1) {
			row=(int)(Math.random()*10);
			column = (int)(Math.random()*10)%(11-length);
			for(int k=0;k<length;k++) 
				if(!arr[row][column+k].equals(" ")) continue Label1;
			for(int s=0;s<length;s++)
				arr[row][column+s] = type;
			RecordShip(arr, length, row, column, dir);
		}
		else {
			row= (int)(Math.random()*10)%(11-length);
			column =(int)(Math.random()*10);
			for(int k=0;k<length;k++) 
				if(!arr[row+k][column].equals(" ")) continue Label1;
			for(int s=0;s<length;s++)
				arr[row+s][column] = type;
			RecordShip(arr, length, row, column, dir);
			
		}
		i++;
	}
	
}
static void RecordShip(String arr[][],int length,int row, int column, int dir) {
	int[][] d= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	if(dir==1) {
		for(int i=0;i<length;i++) 
			for(int j=0;j<8;j++) 
				if(OutofRange(d[j][0], d[j][1], row, column+i))
					if(arr[row+d[j][0]][column+i+d[j][1]]==" ") arr[row+d[j][0]][column+i+d[j][1]]= "n";
	}
	else {
		for(int i=0;i<length;i++) 
			for(int j=0;j<8;j++) 
				if(OutofRange(d[j][0], d[j][1], row+i, column))
					if(arr[row+i+d[j][0]][column+d[j][1]]==" ") arr[row+i+d[j][0]][column+d[j][1]]= "n";
	}
	
}
static boolean OutofRange(int d1,int d2,int row,int column ) {
	if(row+d1<0 || row+d1>9) return false;
	if(column+d2<0||column +d2>9) return false;
	return true;
}
static void ShowBoard(String arr[][]) {
	System.out.println("     A  B  C  D  E  F  G  H  I  J  ");
	System.out.println("     -  -  -  -  -  -  -  -  -  -  ");
	for(int i=0;i<10;i++) {
		if(i>=9) System.out.print(i+1+" | ");
		else System.out.print(i+1+"  | " );
		for(int j=0;j<10;j++) {
			if(arr[i][j].length()>1) System.out.print(arr[i][j]+" ");
			else System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
	}
}

static void ReadFile(String arr[][], String filename) throws IOException{
	FileReader reader = new FileReader(filename);
	int data=0;
	int j;
	for(int i=0;i<10;i++) {
		j=0;
		while(true) {
			data = reader.read();
			if(data==13) {
				data = reader.read();
				break;
			}
			else if(data==-1) break;
			arr[i][j]=Character.toString(data);
			j++;
		}	
		while(j<10) {
			arr[i][j] = " ";
			j++;
		}
	}
}

static void DebugMode(String arr[][], int bombs) {
	int i=0;
	ShowBoard(arr);
	while(i<bombs) {
		try {
			Play(arr);
			ShowBoard(arr);
		}
		catch(Exception e) {
			System.out.println("Try again");
			ShowBoard(arr);
			continue;
		}
		i++;
	}
	System.out.println("Score "+score);
}
static void Play(String arr[][]) throws HitException{
	Scanner sc = new Scanner(System.in);
	String input;
	int row,column;
	input = sc.next();
	
	column = input.charAt(0)-65;
	if(input.length() == 3 ) row = 9;
	else row = input.charAt(1)-49;
	
	if(arr[row][column].equals(" ")) {
		arr[row][column] ="X";
		System.out.println("Miss");
	}
	else if(arr[row][column].charAt(0)=='X') throw new HitException();
	else {
		System.out.println("Hit "+arr[row][column]);
		Score(arr[row][column]);
		arr[row][column] = "X"+arr[row][column].toLowerCase();
	}
	
}
static void Score(String ship) {
	if(ship.charAt(0)=='P') score+=2;
	else if(ship.charAt(0)=='B') score +=4;
	else if(ship.charAt(0)=='D') score+=3;
	else if(ship.charAt(0)=='A') score+=6;
	else if(ship.charAt(0)=='S') score+=3;
}
static void ReleaseMode(String arr[][],int bombs) {
	int i=0;
	while(i<bombs) {
		try {
			Play(arr);
		}
		catch(Exception e) {
			System.out.println("Try again");
			continue;
		}
		i++;
	}
	ShowBoard(arr);
	System.out.println("Score "+score);
}
}
