package FirstProgram;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int startHour = sc.nextInt();
		int startMinute = sc.nextInt();
		int endHour = sc.nextInt();
		int endMinute = sc.nextInt();

		int durationHours, durationMinutes;

		int totalStartMinutes = startHour * 60 + startMinute;
		int totalEndMinutes = endHour * 60 + endMinute;

		int totalDurationMinutes;

		if (totalEndMinutes >= totalStartMinutes) {
			totalDurationMinutes = totalEndMinutes - totalStartMinutes;
		} else {
			totalDurationMinutes = (24 * 60 - totalStartMinutes) + totalEndMinutes;
		}

		durationHours = totalDurationMinutes / 60;
		durationMinutes = totalDurationMinutes % 60;

		if (durationHours == 0 && durationMinutes == 0) {
			durationHours = 24;
		}

		System.out.println("O JOGO DUROU " + durationHours + " HORA(S) E " + durationMinutes + " MINUTO(S)");

		sc.close();
	}

}
