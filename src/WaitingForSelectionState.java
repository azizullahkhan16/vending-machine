public class WaitingForSelectionState implements State {

    @Override
    public void transitionToNextState(VendingMachine machine, State nextState) {
        if(machine.getState() instanceof WaitingForSelectionState && nextState instanceof RefundChangeState) {
            System.out.println("Transitioning from WaitingForSelectionState to RefundChangeState...");
            machine.setState(nextState);
        } else if(machine.getState() instanceof WaitingForSelectionState && nextState instanceof ProductSelectedState) {
            System.out.println("Transitioning from WaitingForSelectionState... to ProductSelectedState...");
            machine.setState(nextState);
        } else {
            throw new Error("Invalid state transition");
        }
    }
}
