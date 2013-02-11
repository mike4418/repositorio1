public class Test {
public static void main(String[] args) {
String s= System.console().readLine(); // lee el primer dato de entrada y lo hace igual a s
String t= System.console().readLine(); // lee el segundo dato de entrada y lo hace igual a t

int i = Integer.parseInt(s);
double j = Double.parseDouble(t);

System.out.println(s+t); // concatena la cadena s 2 y la cadena t 4 y da como resultado una cadena
System.out.println(i+j); //suma int i 2 y double 4.0 y da como resultado un real
System.out.println(s+j); //concatena la cadena s 2 y el double 4.0 da como resultado una cadena
System.out.println(i+t); //concatena i int 2 y la cadena t 4 da como resultado una cadena
System.out.println(j+s); //concatena j double 4.0 y la cadena s 2 da como resultado una cadena
System.out.println(t+i); //concatena la cadena t 4 y i int 2 da como resultado una cadena
}
}