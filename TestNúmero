import java.util.Scanner;
public class TestNúmeroE {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Introduce el n de aproximacion: ");
		int n = t.nextInt();
		double sumatorio = 0;
		for(int i=0; i<=n; i++){
			double factorial = 1;
			for(int j=1; j<=i;j++){
				factorial *= j;
			}
			sumatorio = sumatorio + (1/factorial);
		}
			
		System.out.printf("Aproximación del número e: %f\n",sumatorio);
	}
}
