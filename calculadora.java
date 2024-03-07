import java.util.Scanner;
//Hola oooo
public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextFloat();
        
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextFLoat();
        
        System.out.println("Seleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Raiz");

        int choice = scanner.nextInt();
        
        double result = 0;
        switch(choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    return;
                }
                break;
            case 5:
                if(num2 1 != 0){
                result = Math.pow(num1, 1/num2);
                }else{
                    System.out.println("El indice de la raiz no puede ser cero");
                    return;
                }
            break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        
        System.out.println("El resultado es: " + result);
    }
}
