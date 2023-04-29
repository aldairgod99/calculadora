import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Calculadora calculadora = new Calculadora();

        System.out.println("calculadora");

        int op = 0;

        Scanner e = new Scanner(System.in);

        while (op != 6)

        {
            System.out.println("SELECCIONE UNA OPERACION");
            System.out.println(" 1- SUMA");
            System.out.println(" 2- RESTA");
            System.out.println(" 3- MULTIPLICACION");
            System.out.println(" 4- DIVISION");
            System.out.println(" 5-EXPONENCIAL");
            System.out.println(" 6-SALIR");

            op = e.nextInt();

            switch (op) {
                case 1: {
                    System.out.println("Escribe el primer numero");
                    float n1 = e.nextFloat();
                    System.out.println("Escribe el segundo numero");
                    float n2 = e.nextFloat();

                    float resultado = calculadora.sumar(n1, n2);
                    System.out.println("el resultado es " + resultado);
                    break;
                }
                case 2: {

                    System.out.println("Escribe el primer numero");
                    float n1 = e.nextFloat();
                    System.out.println("Escribe el segundo numero");
                    float n2 = e.nextFloat();

                    float resultado = calculadora.restar(n1, n2);
                    System.out.println("el resultado es " + resultado);
                    break;
                }
                case 3: {

                    System.out.println("Escribe el primer numero");
                    float n1 = e.nextFloat();
                    System.out.println("Escribe el segundo numero");
                    float n2 = e.nextFloat();

                    float resultado = calculadora.multiplicar(n1, n2);
                    System.out.println("el resultado es " + resultado);
                    break;
                }
                case 4: {

                    System.out.println("Escribe el primer numero");
                    float n1 = e.nextFloat();
                    System.out.println("Escribe el segundo numero");
                    float n2 = e.nextFloat();

                    float resultado = calculadora.division(n1, n2);
                    System.out.println("el resultado es " + resultado);
                    break;
                }

                case 5: {
                    System.out.println("Escribe el primer numero");
                    float n1 = e.nextFloat();
                    System.out.println("Escribe la potencia");
                    int n2 = e.nextInt();

                    double resultado = calculadora.EXPONENCIAL(n1, n2);
                    System.out.println("el resultado   es " + resultado);
                    break;
                }
                case 6:
                    System.out.println("SALIR ");
                    break;

                default:
                    System.out.println("NO DISPONIBLE");
                    break;

            }

        }

    }

}
