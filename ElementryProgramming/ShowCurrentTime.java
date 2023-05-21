public class ShowCurrentTime {
	public static void main(String args[]) {
		// Obtain the current time in millis from 1-JAN-1970 midnight
		long totalSecondsMillis = System.currentTimeMillis();
		
		// Compute totalSeconds
		long totalSeconds = totalSecondsMillis / 1000;
		
		// obtain current Seconds
		long currentSeconds = totalSeconds % 60;
		
		// Compute the totalMinutes
		long totalMinutes = totalSeconds / 60;
		
		// Obtain the current Minute
	}
}