public class NewGameCommand implements Command{
    GameLogic game;

    public NewGameCommand(GameLogic game) {
        this.game = game;

    }

    @Override
    public void execute() {
   game.newGame();
    }
}
