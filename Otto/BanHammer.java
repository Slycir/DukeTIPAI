import java.util.Scanner;

public class BanHammer {
	public static void main(String[] args) {
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.println("Awaiting input:");
			String response = keyboard.nextLine();
			if(response.equals("ban")) {
				System.out.println("Goodbye TIPster!!");
				loop = false;
			} else if(response.equals("tip")) {
				System.out.println("Eliminating Wyoming");
				int time = 0;
				while(time < 8) {
					wait(250);
					linePeriod();
					time++;
				}
				System.out.println("Done!");
			} else if(response.equals("/help")) {
				printf("Current Commands:");
			} else {
				System.out.println("Do /help for help");
			}
		}
	}
	
	public static void linePeriod() {
		System.out.println(".");
	}//linePeriod
	
	public static void wait(int x) {
		try {Thread.sleep(x);}catch(InterruptedException e){}
	}
	
	public static void printf(String y) {
		System.out.println(y);
	}
}