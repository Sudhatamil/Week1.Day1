package Week1.Day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8, firstno = 0, secno = 1, sum;

		for (int i = 0; i < n; i++) {
			{
				System.out.println(firstno);
				sum = firstno + secno;
				firstno = secno;
				secno = sum;

			}
		}

	}

}
