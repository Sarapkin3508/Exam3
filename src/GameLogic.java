import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GameLogic implements Serializable{
    private String nickname;
    private Load load;
    BufferedReader input;
    int k;
    File fileName;
    PrintWriter printWriter;
    BufferedReader reader;
    private final static long serialVersionUID = 1L;
     Forward forward = new Forward();


    public GameLogic(String nickname) {
        this.nickname = nickname;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void resume(){
        forward.forward(k);
    }

    public void newGame(){
        int k = forward.forward(1);
        this.k = k;
    }

    public void loading() {
        // int k = 1;
        File dir = new File("src/saves/"); //path указывает на директорию
        List<File> lst = new ArrayList<>();
        for (File file : dir.listFiles()) {

            if (file.isFile())
                lst.add(file);
        }
        {
            for (int i = 0; i < lst.size(); i++)
            System.out.println((i+1) + ")" + lst.get((i)));
        }

        input = new BufferedReader(new InputStreamReader(System.in));
        try {
            int j =  Integer.parseInt(input.readLine()) - 1;
            reader = new BufferedReader(new FileReader(lst.get(j)));
            int line;
            line = Integer.parseInt(reader.readLine());
            forward.forward(line);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }



    }

    public void save() throws IOException {
        System.out.println("Enter name of file");
        input = new BufferedReader(new InputStreamReader(System.in));
        fileName = new File("src/saves/" + input.readLine() + ".txt");
        fileName.createNewFile();
        printWriter.println(k);


        /*
        try (FileOutputStream stream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream)) {
            objectOutputStream.writeObject(this);
        }

         */

    }
}
