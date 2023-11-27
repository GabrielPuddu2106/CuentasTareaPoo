public class Cuenta {
    private int numCuenta;
    private double saldo;

    public Cuenta(int numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositarDinero(double cantidad) {
        saldo += cantidad;
    }

    public void retirarDinero(double cantidad) {
        saldo -= cantidad;
    }
}