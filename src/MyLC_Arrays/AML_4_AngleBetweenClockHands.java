// LC 1344

package MyLC_Arrays;

public class AML_4_AngleBetweenClockHands {

	public static double angleClock(int hour, int minutes) {

		// (30 * H) - ((11 / 2) * M)

		double hr = (double) hour;
		double min = (double) minutes;

		double calc = (double) (11.00 / 2.00);

		double value1 = Math.abs((hr * 30.00) - (calc * min));
		double value2 = 180 - (value1 - 180);

		return Math.min(value1, value2); // We want acute angle

	}

	public static void main(String[] args) {

		int hour = 3;
		int minutes = 30;

		System.out.println(angleClock(hour, minutes));

	}

}