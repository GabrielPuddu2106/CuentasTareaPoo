public class ClienteVip {

    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];

    public ClienteVip(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public double consultarSaldo(int ns) {
        return cuentas[ns].getSaldo();
    }

    public void ingresarDinero(int ns, double cantidad) {
        cuentas[ns].depositarDinero(cantidad);
    }

    // Metodo para depositar dinero

    public void retirarDinero(int ns, double cantidad) {
        cuentas[ns].retirarDinero(cantidad);
    }
}