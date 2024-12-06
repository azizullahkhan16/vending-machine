public class IdleState implements State {

    @Override
    public void transitionToNextState(VendingMachine machine, State nextState) {
        if (machine.getState() instanceof IdleState && nextState instanceof DisplayAmountState) { // Verify current state
            System.out.println("Transitioning from IdleState to DisplayAmountState...");
            machine.setState(nextState);
        } else {
            throw new Error("Invalid state transition.");
        }
    }
}
