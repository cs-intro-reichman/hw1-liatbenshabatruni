// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		// The following statement handles the hours and the minutes - the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		//in order to turn the time from 24 scale to 12 scale, if the time is bigget then 12 
		//will reduce it with 12, for example 23:00 in 12's scale is 11:00 (12 unit reduced)
		//now we will check the minutes, if it's less then 10 - will add '0' to the print so will get 00:05
		//and not 00:5
		if (hours > 12) {hours = hours-12;
			if (minutes <10) {System.out.println(hours+":"+"0"+minutes+" PM");}
			else System.out.println(hours+":"+minutes+" PM");
		}
		//if hours<12
		else  {
			if (hours <12){
			if (minutes <10) {System.out.println(hours+":"+"0"+minutes+" AM");}
			else System.out.println(hours+":"+minutes+" AM");}
			//if hours=12
			else {
			if (minutes <10) {System.out.println(hours+":"+"0"+minutes+" PM");}
			else System.out.println(hours+":"+minutes+" PM");}
			}
	}}
		