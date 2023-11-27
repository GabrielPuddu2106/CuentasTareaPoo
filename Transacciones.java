import java.util.Scanner;

public class Transacciones {

    public static int buscarNumDeCuenta(Cuenta cuentas[], int NumDeCuentaABuscar) {
        int indice = 0;
        int iterador = 0;
        boolean numeroDeCuentaEncontrada = false;

        while ((iterador < cuentas.length) && (numeroDeCuentaEncontrada == false)) {
            if (cuentas[iterador].getNumCuenta() == NumDeCuentaABuscar) {
                numeroDeCuentaEncontrada = true;
                indice = iterador;
            }
            iterador++;

        }

        if (numeroDeCuentaEncontrada == false) {
            indice = -1;
        }

        return indice;
    }

    public static void main(String[] args) {

        Scannner lector = new Scanner(System.in);
        String nombre, apellido, dni;
        Cuenta cuentas[];
        Cliente cliente;
        int numCuenta, cantidadCuentas, indiceNumCuenta;
        double saldo, cantidadDinero;
        int opc;

        System.out.print("Digite el nombre del cliente: ");
        nombre = lector.next();

        System.out.print("Digite el apellido del cliente: ");
        apellido = lector.next();

        System.out.println("Digite el dni del cliente: ");
        dni = lector.next();

        System.out.print("Digite la cantidad de cuentas que tiene el cliente ");
        cantidadCuentas = lector.nextInt();

        System.out.println("");

        cuentas = new Cuenta[cantidadCuentas];

        // contador para rellenar las cuentas
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite la " + (i + 1) + " cuenta ");
            System.out.print("Digite el numero de cuenta:");
            numCuenta = lector.nextInt();

            System.out.prinltn("Digite el saldo de la cuenta: ");
            saldo = lector.nextInt();

            cuentas[i] = new Cuenta(numCuenta, saldo);
        }

        cliente = new Cliente(nombre, apellido, dni, cuentas);

        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Consultar saldo ");
            System.out.println("2. Ingresar saldo ");
            System.out.println("3. Retirar  saldo ");
            System.out.println("4. salir ");
            System.out.print("Digite una opcion: ");
            opc = lector.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\nDigite el numero de cuenta: ");
                    numCuenta = lector.nextInt();
                    indiceNumCuenta = buscarNumDeCuenta(cuentas, numCuenta);

                    if (indiceNumCuenta == -1) {
                        System.out.println("\nCuenta no encontrada , porfavor revise");
                        System.out.println("");
                    } else {
                        System.out.print("Digite la cantidad de dinero a depositar");
                        cantidadDinero = lector.nextDouble();

                        cliente.ingresarDinero(indiceNumCuenta, cantidadDinero);
                        System.out.println("\nDeposito con exito ");
                        System.out.println("Saldo disponible: " + cliente.consultarSaldo(indiceNumCuenta));
                    }

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    System.out.println("\nGracias por usar el servicio");
                    opc = 4;

                    break;

                default:
                    System.out.println("\nOpcion no disponible , vuelve a intentarlo ");
                    break;
            }
        } while (opc != 4);
    }
}