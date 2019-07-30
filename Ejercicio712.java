	public class Ejercicio712 {
    public static void main(String[] args) {
      /* Use un arreglo unidimensional para resolver el siguiente problema:
        escriba una aplicación que reciba como entrada cinco números, cada uno 
        de los cuales debe estar entre 10 y 100, inclusive. A medida que se lea
        cada número, muéstrelo solamente si no es un duplicado de un número que
        ya se haya leído. Prepárese para el “peor caso”, en el que los cinco
        números son diferentes. Use el arreglo más pequeño que sea posible para 
        resolver este problema. Muestre el conjunto completo de valores únicos 
        introducidos, después de que el usuario introduzca cada nuevo valor. 
      */
     
   int[] arreglo=new int[5];
    int numero;
     Scanner lee= new Scanner(System.in);

   
    
     for(int i=0;i<arreglo.length;i++){
         do{
     System.out.println(" Ingrese un numero:");
     numero=lee.nextInt();
     if(numero < 11|| numero > 99)
     System.out.println("Error Ingrese numeros entre 10 y 100");
        }while(numero < 10 || numero > 100);
         arreglo[i]=numero;
     }
     System.out.println("mostrando datos");
     for(int i=0;i<arreglo.length;i++)
     
     System.out.println(arreglo[i]);
     
    }
}
