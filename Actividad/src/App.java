import models.VendingMachine;

public class App {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertarDinero();
        vendingMachine.dispensarProducto();
    }
}