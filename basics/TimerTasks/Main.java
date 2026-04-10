package TimerTasks;

import java.util.Timer;
import java.util.TimerTask;

		/*
		 * Timertask is used to schedule the updates.
		 */
public class Main {

	public static void main(String[] args) {
		
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		timer.schedule(task,0,1000);
		//timer.cancel();   //->used to stop the timer
	}

}
