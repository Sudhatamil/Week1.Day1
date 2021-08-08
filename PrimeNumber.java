package Week1.Day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=13,r;
boolean flag=false;
for (int i = 2; i < n / 2; i++) {
	if (n % i == 0) {
		flag = true;
		break;
	}
}
if (!flag)
	System.out.println("primeno");

else
	System.out.println("not prime no");
}

}

