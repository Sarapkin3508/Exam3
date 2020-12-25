import java.time.LocalDateTime;

public class TestAp {
    public static void main(String[] args) {
        Load load = new Load(1, "Caravaneer1337", LocalDateTime.now());
        GameLogic game = new GameLogic("Caravaneer1337");
        MainMenu mainMenu = new MainMenu();


    }
}
