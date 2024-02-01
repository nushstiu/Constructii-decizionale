public class SumaWhile{
	public static void main(String[] args){
		
		int n = 12;

		int suma = 0;
        int i = 1;


        while (i <= n) {
            suma += i;
            i++;
        }
        System.out.println("Suma primelor " + n + " este: " + suma);

	}
}