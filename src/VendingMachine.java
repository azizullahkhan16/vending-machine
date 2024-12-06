public class VendingMachine {
    private State currentState;

    public VendingMachine() {
        this.currentState = new IdleState();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.transitionToNextState(this, new DisplayAmountState());
    }

    public void displayProducts() {
        currentState.transitionToNextState(this, new WaitingForSelectionState());
    }

    public void selectProduct() {
        currentState.transitionToNextState(this, new ProductSelectedState());
    }

    public void dispenseProduct() {
        currentState.transitionToNextState(this, new DispenseState());
    }

    public void cancelTransaction() {
        currentState.transitionToNextState(this, new RefundChangeState());
    }

    public void refundChange() {
        currentState.transitionToNextState(this, new RefundChangeState());
    }

    public void returnToIdleState() {
        currentState.transitionToNextState(this, new IdleState());
    }

    public State getState() {
        return currentState;
    }
}
