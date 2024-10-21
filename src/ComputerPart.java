interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
class Keyboard implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
class Monitor implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
class Mouse implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
}
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }
}