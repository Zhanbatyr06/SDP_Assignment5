
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.setState("New State 1");
        subject.setState("New State 2");

        //Task 2
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println("Current State: " + context.getState());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println("Current State: " + context.getState());

        //Task 3
        Context2 context2 = new Context2(new OperationAdd());
        System.out.println("10 + 5 = " + context2.executeStrategy(10, 5));
        context2 = new Context2(new OperationSubtract());
        System.out.println("10 - 5 = " + context2.executeStrategy(10, 5));
        context2 = new Context2(new OperationMultiply());
        System.out.println("10 * 5 = " + context2.executeStrategy(10, 5));


        //Task 4
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

        //Task 5
        ComputerPart keyboard = new Keyboard();
        ComputerPart monitor = new Monitor();
        ComputerPart mouse = new Mouse();
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
        keyboard.accept(visitor);
        monitor.accept(visitor);
        mouse.accept(visitor);
    }
}