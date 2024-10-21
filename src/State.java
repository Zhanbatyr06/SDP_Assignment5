interface State {
    void doAction(Context context);
}
class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    public String toString() {
        return "Start State";
    }
}
class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
    public String toString() {
        return "Stop State";
    }
}
class Context{
    private State state;
    public Context() {
        state = null;
    }
    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
}