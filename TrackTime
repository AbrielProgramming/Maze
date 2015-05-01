import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;




public class TrackTime {
	private Player player;
	private Timer timer;
	private int time;


	//timer max
	public TrackTime() {
		timer=new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time++;
			}
		});
		
	} 


	public void refreshTimer() {
		time=0;
	}

	public void stopTiming() {
		timer.stop();
	}

	public void startTiming() {
		timer.start();
	}
	
	public String getTime() {
		if (time>(99*60)+99) {
			return "99:99";
		} else {
			return toString(time);
		}
	}
	private int toInt(String time) {
		String timeStr=time;
		String min=timeStr.substring(0, 2);
		int minutes=Integer.parseInt(min);
		String sec=timeStr.substring(3, 5);
		int seconds=Integer.parseInt(sec);
		int total=(minutes*60)+seconds;
		return total;
	}
	private String toString(int time) {
		int min=0;
		while((time-60)>60) {
			min++;
			time-=60;
		}
		String minSpacer="";
		String secSpacer="";
		if (min<10) {
			minSpacer="0";
		} 
		if (time<10) {
			secSpacer="0";
		}
		String timeStr=minSpacer+min+":"+secSpacer+time;
		return timeStr;


	}
	public String compareTimes(String time1, String time2) {
		int timeUno=toInt(time1);
		int timeDos=toInt(time2);
		if (timeUno==0)
			return time2;
		if (timeDos==0)
			return time1;
		if (timeUno<timeDos) {
			return time1;
		} else {
			return time2;
		}
	}



}
