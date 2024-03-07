import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int op;
        do{    
        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextFloat();
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextFloat(); // Aquí hay un error tipográfico, debería ser nextFloat() en lugar de nextFLoat()
        
        // Mostrar al usuario las operaciones disponibles
        System.out.println("Seleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Raiz");
        System.out.println("6. Potencia");
        System.out.println("7. salir");    
        // Leer la elección del usuario
        op = scanner.nextInt();
        
        // Variable para almacenar el resultado de la operación
        double result = 0;
        
        // Realizar la operación seleccionada
        switch(op) {
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
                // Calcular la raíz, asegurándose de que el índice no sea cero
                if(num2 != 0){
                    result = Math.pow(num1, 1/num2);
                } else {
                    System.out.println("El índice de la raíz no puede ser cero");
                    return;
                }
                break;
            case 6:
                result= Math.pow(num1,num2);
            break;
            case 7:
                System.out.println("bay bay");
            break;

            default:
                System.out.println("Opción no válida.");
        
        }
        
        if(op != 7){
        // Mostrar el resultado de la operación
        System.out.println("El resultado es: " + result);
        }
            
    }while(op != 7);
    
}
    
}
