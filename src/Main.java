public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.insertCoin();
        vm.displayProducts();
        vm.cancelTransaction();
        vm.returnToIdleState();
    }
}