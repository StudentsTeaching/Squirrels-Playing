
public class squirrelPlay {
	public static boolean isPlaying(int temp, boolean isSummer) {
		if (isSummer == true && (temp >= 60 && temp <= 100)) {
			return true;
		}
		else if (isSummer == false && temp >= 60 && temp <= 90) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		
		System.out.println(isPlaying(70, false));
		System.out.println(isPlaying(95, false));
		System.out.println(isPlaying(95, true));
		System.exit(0);
	}
} 