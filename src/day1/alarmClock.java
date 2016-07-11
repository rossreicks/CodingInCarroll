package day1;
/**
 * Things that I want:
 * 	Create a clock
 * 		When clock is created it is set to 00:00
 * 		alarm is set to off
 * 		ringing is set to off
 * 	Set Alarm
 * 		alarm is set to on
 * 		Specify a time that you want the alarm to go off
 * 		if time passes that time, ringing is set to on
 * 	advance time
 * 		alarm time does not move
 * 		clock time should move ahead
 * 		should take parameters hour and minutes
 * 
 * 	other notes:
 * 		all instance variables can be set to public
 * 		save all times in minutes. when you get to 24*60 it should go back to 0
 * 
 * 
 * @author Ross
 *
 */
public class alarmClock {
	public int clockTime;
	public int alarmTime;
	public boolean ringing;
	public boolean alarm;
	
	public alarmClock(){
		clockTime = 0;
		ringing = false;
		alarm = false;
	}
	
	public void advanceTime(int hours, int minutes){
		boolean nextDay = false;
		if(alarm && clockTime>alarmTime){
			nextDay = true;
		}
		clockTime += (hours*60+minutes);

		if((!nextDay && alarm && clockTime>alarmTime) || (nextDay && alarm && (clockTime>=1440+alarmTime))){
			ringing = true;
		}
		if(clockTime >= (24*60)){
			clockTime %= (24*60);
		}
	}
	
	public void setAlarm(int hours, int minutes){
		alarm = true;
		ringing = false;
		alarmTime = (hours*60+minutes);
		if(alarmTime >= (24*60))
			alarmTime %= (24*60);
	}
	
	public String getClockTime(){
		return clockTime/60 + " : " + clockTime%60; 
	}
	
	public void printClockTime(){
		System.out.println(getClockTime());
	}
	
	public String getAlarmTime(){
		return alarmTime/60 + " : " + alarmTime%60; 
	}
	
	public void printAlarmTime(){
		System.out.println(getAlarmTime());
	}
	
	public boolean isRinging(){
		return ringing;
	}
	
	public void printRinging(){
		System.out.println(isRinging());
	}
	
	public boolean isAlarm(){
		return alarm;
	}
	
	public void printAlarm(){
		System.out.println(isAlarm());
	}
	
	public static void main(String[] args){
		alarmClock clock = new alarmClock();
		clock.printClockTime();
		clock.printAlarm();
		clock.setAlarm(2, 30);
		clock.printAlarm();
		clock.printAlarmTime();
		clock.printRinging();
		clock.advanceTime(3, 0);
		clock.printRinging();
		clock.setAlarm(2,45);
		clock.printRinging();
		clock.advanceTime(24, 0);
		clock.printRinging();
		clock.printClockTime();
	}
	
}
