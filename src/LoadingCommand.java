public class LoadingCommand implements Command{
    GameLogic game;

    public LoadingCommand(GameLogic game) {
        this.game = game;

    }

    @Override
    public void execute() {
     game.loading();
    }
}
