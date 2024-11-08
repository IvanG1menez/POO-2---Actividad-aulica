package models;

public class SinDinero implements State {
    private VendingMachine vendingMachine;

    public SinDinero(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertarDinero() {
        System.out.println("Dinero insertado.");
        vendingMachine.setState(vendingMachine.getDineroInsertado());
    }

    @Override
    public void dispensarProducto() {
        System.out.println("Inserte dinero primero.");
    }
}