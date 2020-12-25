import java.time.LocalDateTime;

public class GameApp {
    public static void main(String[] args) {
        Load load = new Load(1, "Caravaneer1337", LocalDateTime.now());

        GameLogic game = new GameLogic("Caravaneer1337");

        LoadingCommand loadingCommand = new LoadingCommand(game);
        ResumeCommand resumeCommand = new ResumeCommand(game);
        SaveCommand saveCommand = new SaveCommand(game);
        NewGameCommand newGameCommand = new NewGameCommand(game);

        MainMenu mainMenu = new MainMenu();

        mainMenu.createCommand(1, resumeCommand);
        mainMenu.createCommand(2, newGameCommand);
        mainMenu.createCommand(3, saveCommand);
        mainMenu.createCommand(4, loadingCommand);

        mainMenu.display();

    }
}
