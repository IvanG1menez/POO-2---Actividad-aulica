package models;

public class VendingMachine {
    private State sinDinero;
    private State dineroInsertado;
    private State productoDispensado;
    private State estadoActual;

    public VendingMachine() {
        sinDinero = new SinDinero(this);
        dineroInsertado = new DineroInsertado(this);
        productoDispensado = new ProductoDispensado(this);
        estadoActual = sinDinero;
    }

    public void setState(State state) {
        estadoActual = state;
    }

    public State getSinDinero() {
        return sinDinero;
    }

    public State getDineroInsertado() {
        return dineroInsertado;
    }

    public State getProductoDispensado() {
        return productoDispensado;
    }

    public void insertarDinero() {
        estadoActual.insertarDinero();
    }

    public void dispensarProducto() {
        estadoActual.dispensarProducto();
    }
}