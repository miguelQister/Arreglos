	 import java.util.Scanner;
	public class Ejercicio710 {
    

	  public static void main(String[] args) {
   
	 /*  (Comisión por ventas) Utilice un arreglo unidimensional para resolver el siguiente problema: una compañía
	paga a sus vendedores por comisión. Los vendedores reciben $200 por semana más el 9% de sus ventas totales de esa
	semana. Por ejemplo, un vendedor que acumule $5,000 en ventas en una semana, recibirá $200 más el 9% de $5,000, 
	o un total de $650. Escriba una aplicación (utilizando un arreglo de contadores) que determine cuántos vendedores 
	recibieron salarios en cada uno de los siguientes rangos (suponga que el salario de cada vendedor se trunca a una can-
	tidad entera):
	a) $200-299
	b) $300-399
	c) $400-499
	d) $500-599
	e) $600-699
	f) $700-799
	g) $800-899
	h) $900-999
	i) $1,000 en adelante
	Sintetice los resultados en formato tabular.
	*/
 		Scanner lee=new Scanner(System.in);
 			int numTra;

		int []cont= new int[9];
		int aux;
		float vS;
      System.out.println("Inrese el numero de trabajadores;");
      numTra=lee.nextInt();
	float  []trabajadores=new  float[numTra];
 	for(int i=0;i <trabajadores.length;i++){ System.out.println ("ingrese ventas de la semana del trabajador "+(i+1));
 	 vS=lee.nextFloat();
 	 trabajadores [i]=((vS*0.09f)+200);
	  }
  
  		for(int i=0;i <trabajadores.length;i++){
  		  aux = (int)trabajadores[i]/100-2;
    			if (aux>9)
      				cont [8]++;
    			else
    				cont [aux]++;
  		}
  			for (int i=0;i <9;i++){
    				if (i==8)
      					System.out.printf ("%5d en adelante %d",1000,cont [i]);
      				else 
      					System.out.printf ("%02d-%02d: %02d",(i+2)*100,(i+2)*100+99,cont [i]);
      				System.out.println  ();
       			 }

      		}
	

   }

