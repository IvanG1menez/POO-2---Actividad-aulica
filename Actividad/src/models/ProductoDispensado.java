package models;

public class ProductoDispensado implements State {
    private VendingMachine vendingMachine;

    public ProductoDispensado(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertarDinero() {
        System.out.println("Producto ya dispensado. Inserte dinero para otro producto.");
        vendingMachine.setState(vendingMachine.getSinDinero());
    }

    @Override
    public void dispensarProducto() {
        System.out.println("Producto ya dispensado.");
    }
}