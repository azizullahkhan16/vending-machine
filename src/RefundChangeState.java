public class RefundChangeState implements State {

    @Override
    public void transitionToNextState(VendingMachine machine, State nextState) {
        if(machine.getState() instanceof RefundChangeState && nextState instanceof IdleState) {
            System.out.println("Transitioning from RefundChangeState to IdleState...");
            machine.setState(nextState);
        }else {
            throw new Error("Invalid state transition");
        }
    }
}
