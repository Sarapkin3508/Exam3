import java.io.IOException;

public class SaveCommand implements Command{
    GameLogic game;

    public SaveCommand(GameLogic game) {
        this.game = game;

    }

    @Override
    public void execute() throws IOException {
        game.save();

    }
}
