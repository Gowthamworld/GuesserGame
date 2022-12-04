


import java.util.*;

class guesser{
	int guessNum;
	
	public int guessNum() {
		
		System.out.println("please guesser, guess the number");
		
		Scanner scan= new Scanner(System.in);
		guessNum=scan.nextInt();
		
	     return guessNum;
		
	}
}


class player{
	
	int guessNum;
	
	public int guessNum()
	{	
		System.out.println("Player1 please guess the number");
		Scanner scan= new Scanner(System.in);
		guessNum=scan.nextInt();
		return guessNum;
	}
	
	public int guessNum1()
	{
		System.out.println("player 2 please guess the number");
		Scanner scan= new Scanner(System.in);
		guessNum=scan.nextInt();
		return guessNum;
	}
	public int guessNum2() {
		System.out.println(" player 3 please the guess the number");
		Scanner scan= new  Scanner(System.in);
		guessNum=scan.nextInt();
		
		return guessNum;
	}
}

class umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		
		guesser	g=new guesser();
		
		numFromGuesser=g.guessNum();
		
	}
	void collectNumFromplayer() {
		
		player p1=new player();
		player p2 =new player();
		player p3 =new player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum1();
		numFromPlayer3=p3.guessNum2();
	}
	
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			
			System.out.println("player1 won the game");
		}
		else if(numFromGuesser==numFromPlayer2) {
			System.out.println("player2 won the game");
		}
		else if(numFromGuesser==numFromPlayer3) {
			
			System.out.println("player3 won the game");
		}
		
		else {
			System.out.println("Game Lost try again");
		}
		
	}
}






public class Guesserapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		umpire um=new umpire();
		
		um.collectNumFromGuesser();
		um.collectNumFromplayer();
		um.compare();
		

	}

}
