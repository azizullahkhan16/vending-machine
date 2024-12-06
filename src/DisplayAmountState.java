public class DisplayAmountState implements State {

    @Override
    public void transitionToNextState(VendingMachine machine, State nextState) {
        if (machine.getState() instanceof DisplayAmountState && nextState instanceof WaitingForSelectionState) {
            System.out.println("Transitioning from DisplayAmountState to WaitingForSelectionState...");
            machine.setState(nextState);
        } else {
            throw new Error("Invalid state transition.");
        }
    }
}
