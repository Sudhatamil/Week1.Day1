package Week1.Day1;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, r, n = 153, temp = 153;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + (r * r * r);

		}
		if (temp == sum) {
			System.out.println("Amstrongnumber");
		} else {
			System.out.println("notAmstrongnumber");

		}
	}

}
