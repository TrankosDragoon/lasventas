package lasventaas;
/**
 * @author Xavi Capilla <xavicapi88@gmail.com>
 * @version 1.0 (versi� actual del programa)
 * @since 1.0 (La primera versi� del programa descripci�: Aquesta clase rebr� 4
 *        ints i donar� una de dues String diferent depenent dels seus valors.*/
import static org.junit.Assert.assertEquals;

 
import java.util.Scanner;



public class lasventas {

	/**
	 * main M�tode que crida a altre m�tode.
	 */
	public static void main(String[] args) {
		resultado();

	}

	/**
	 *
	 * 
	 * resultado  M�tode que genera una String..
	 * @return retorna una String
	 */
	public static String resultado() {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();

		if (i - k == 3 || j - l == 3 || i - k == -3 || j - l == -3) {

			System.out.println("Te han vendido");
			return "Te han vendido";

		} else
			System.out.println("Fracaso");
		return "Fracaso";

	}

}
