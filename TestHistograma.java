import java.util.Scanner;
public class TestHistograma {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Introduce los votos segun secuencia de partidos: ");
		int votos = t.nextInt();
		int partido = 1;
		while (votos>0){
			System.out.printf("Partido %d: ", partido);
			votos = votos/5000;
			for(int i = 1; i<=votos;i++){
				partido = i;
				System.out.print("*");
			}
			System.out.println();
			votos = t.nextInt();
		}
	}

}
