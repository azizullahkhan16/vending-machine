public class DispenseState implements State {

    @Override
    public void transitionToNextState(VendingMachine machine, State nextState) {
        if(machine.getState() instanceof DispenseState && nextState instanceof RefundChangeState) {
            System.out.println("Transitioning from DispenseState to RefundChangeState...");
            machine.setState(nextState);
        }else {
            throw new Error("Invalid state transition");
        }

    }
}
