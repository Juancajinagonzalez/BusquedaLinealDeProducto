import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos que desea registrar:");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); 

        String[] inventario = new String[cantidadProductos];

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            inventario[i] = scanner.nextLine();
        }

        System.out.println("Ingrese el nombre del producto que desea buscar:");
        String productoBuscado = scanner.nextLine();

        buscarProducto(inventario, productoBuscado);
    }

    public static void buscarProducto(String[] inventario, String productoBuscado) {
        boolean encontrado = false;

        for (String producto : inventario) {
            if (producto.equalsIgnoreCase(productoBuscado)) {
                System.out.println("El producto " + productoBuscado + " está en el inventario.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El producto " + productoBuscado + " no está disponible en el inventario.");
        }
    }

}
