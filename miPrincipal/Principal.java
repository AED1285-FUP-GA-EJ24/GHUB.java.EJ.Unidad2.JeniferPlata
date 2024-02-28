package miPrincipal;



public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Hola soy Jenifer");
    /* Demostracion de tipo de variable
     * los tipos de datos float y double y tiene 3 valores especiales:
     * infinito positivo
     * infinito negativo
     * NaN ( Not a Num)
     */
    System.out.println(Math.sqrt(8));// retorna un punto flotante
    System.out.println(Math.sqrt(-1));//es un NaN
    System.out.println(1.1e5 * 1.1e2);
    System.out.println (1.10000 * 1.10);
    System.out.println(1.1e200 * 1.1e200); // esto retorna a un infinoto pos
    System.out.println(-1.1e200 * 1.1e200); //esto retorna a un infinito negat
//Tipo de dato char
char car='A'; //las constantes literales char se coloca entre comillas
System.out.println(car);
car = '/165';
System.out.println(car);
car = '/u0041',
System.out.println(car);
car = '/165'; 
System.out.println(car);
//tipo de dato logico
boolean bandera; // declarandp la variable bolean
bandera = true;
bandera = false;
if (bandera) System.out.println(x:"Es verdadero");
// ejemplo de envoltorios
//convertir la cadena "123"a un tipo de dato entero
System.out.println(Interger.parseInt(s:"123")); 
System.out.println(Interger.parseInt(s:"165"));
System.out.println(Interger.parseInt(s:"21"));
System.out.println(Interger.parseInt(s:"45"));
System.out.println(Interger.parseInt(s:"45.89"));
System.out.println(Interger.parseInt(s:"1.5e8"));
             //LITERALES Y CONSTANTES
 
 //para declararconstante ,anteponemos la palabra final en la declaracion
 //y se utiliza un identificador mayuscula

     final double PI =3.141592653586793;
     int octal = 0.15; // la constante 15 esta representada en base octal

     int decimal = 12;// la constante 12 esta representada en base decimal

     int hexadecimal = 0xAB;// la constante A esta presentada base 18
     // cuando se imprime se convierte en 171 por que AB en hexadecimal 
     //corresponde a 171 en decimal
     System.out.println(hexadecimal);

{
    
}

  }
}