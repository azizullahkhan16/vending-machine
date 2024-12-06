public interface State {
    void transitionToNextState(VendingMachine machine, State nextState);
}
