public class ResumeCommand implements Command{
    GameLogic game;

    public ResumeCommand(GameLogic game) {
         this.game = game;
    }

    @Override
    public void execute() {
        game.resume();

    }
}
