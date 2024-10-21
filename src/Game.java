abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
class Cricket extends Game {
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
class Football extends Game {
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}