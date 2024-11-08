package models;

public class DineroInsertado implements State {
    private VendingMachine vendingMachine;

    public DineroInsertado(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertarDinero() {
        System.out.println("Dinero ya insertado.");
    }

    @Override
    public void dispensarProducto() {
        System.out.println("Producto dispensado.");
        vendingMachine.setState(vendingMachine.getSinDinero());
    }
}