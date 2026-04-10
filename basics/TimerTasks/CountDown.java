package TimerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class CountDown {

	public static void main(String[] args) {
		
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			int count=5;
			@Override
			public void run() {
				System.out.println(count);
				count--;
				if(count<0) {
					System.out.println("HAPPY BIRTH-DAY");
					timer.cancel();
				}
			}
			
		};
		timer.scheduleAtFixedRate(task,  0,1000);  //this is used to print the countdown

	}

}
