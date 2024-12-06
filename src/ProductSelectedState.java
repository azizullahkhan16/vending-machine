public class ProductSelectedState implements State {

    @Override
    public void transitionToNextState(VendingMachine machine, State nextState) {
        if(machine.getState() instanceof ProductSelectedState && nextState instanceof DispenseState) {
            System.out.println("Transitioning from ProductSelectedState to DispenseState...");
            machine.setState(nextState);
        }else {
            throw new Error("Invalid state transition");
        }
    }
}
