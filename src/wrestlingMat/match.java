package wrestlingMat;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class match {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		wrestlers w = new wrestlers();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first wrestlers name");

		String name1 = scan.nextLine();

		w.setName(name1);

		System.out.println("Enter your first wrestlers country");

		String country1 = scan.nextLine();
		w.setCountry(country1);


		System.out.println("Enter your second wrestlers name");

		String name2 = scan.nextLine();

		w.setName(name2);

		System.out.println("Enter your second wrestlers country");

		String country2 = scan.nextLine();
		w.setCountry(country2);

		

		
		
		Timer timer = new Timer();
		
		TimerTask task1 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Ladies and gentlemen! Lets get ready to rumble!.....IIIITS TIIIIIIIIME");
				System.out.println("Live from TheEpicSalad Arena");
			}

	};
		TimerTask task2 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Fighting out of the blue corner");
				System.out.println("Standing in at 6 feet 1 and weighing 175 pounds " + "He hails from " + country1);
				System.out.println(name1);
			}
		
	};
	
	
	TimerTask task3 = new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Fighting out of the red corner");
			System.out.println("Standing in at 5 feet 11 and weighing 175.5 pounds" + "He hails from " + country2);
			System.out.println(name2);
		}
	
};


TimerTask task4 = new TimerTask() {

	@Override
	public void run() {
		
		
		// random generates a random number which then chooses a random winner
				Random rand = new Random();
				String winner = null;
				int i = rand.nextInt();
				
				if (i < 5000) {
			    winner = name1; 
				}else if (i > 5000) {
			 	winner = name2; 
				}

		
		System.out.println("Your winner is " + winner);
	}
};

// Timer will execute the task (specifics in code above) with a delay of
// 5,10,15,20 seconds

timer.schedule(task1, 5000);
timer.schedule(task2, 10000);
timer.schedule(task3, 15000);
timer.schedule(task4, 20000);

       }
	
}
