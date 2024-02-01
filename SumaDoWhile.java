public class SumaDoWhile{
	public static void main(String[] args){

		int n = 12;

		int suma = 0;
        int i = 1;

        do {
        	suma += i;
            i++;
        } while (i <= n);
        	System.out.println("Suma primelor " + n + " este: " + suma);


	}
}