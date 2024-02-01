public class MultiplicativeTable{
	public static void main(String[] args){

		int number = 5;
		int suma = 0;

		for(int i=0; i<=10; i++){
			suma=number*i;
			System.out.println(i + " * " + number + " = " + suma);
		}
	}
}