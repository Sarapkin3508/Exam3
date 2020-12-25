import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MainMenu {
    private Map<Integer, Command> commands;

    private void getMenuFrame(){
        String menuFrame = "<---------Главное меню--------->\n1)Продолжить игру\n2)Новая игра\n3)Сохранить игру\n4)Загрузить игру\n5)Выход";
        System.out.println(menuFrame);
    }


    public MainMenu(){
        commands = new HashMap<>();
    }

    public Command getMapCommands(int position){
       return commands.get(position);
    }

    public void createCommand(int position, Command command){
     commands.put(position, command);
    }

    public void display() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                getMenuFrame();
                int console = Integer.parseInt(reader.readLine());

                if (console >= 1 && console < 5) {
                    getMapCommands(console).execute();
                } else System.out.println("Неправильно набранная команда, пожалуйста введите корректное число");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
