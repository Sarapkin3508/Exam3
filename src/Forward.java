import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Forward extends Thread {

    public Forward() {
    }

    public int forward(int k){
        Map<Integer, Transition> transitionMap = new HashMap<>();

        Transition transition1 = new Transition(1, Events.EVENT1, 6, 2);
        Transition transition2 = new Transition(2, Events.EVENT2, 4, 3);
        Transition transition3 = new Transition(3, Events.EVENT3, 0, 0);
        Transition transition4 = new Transition(4, Events.EVENT4, 5, 8);
        Transition transition5 = new Transition(5, Events.EVENT5, 6, 3);
        Transition transition6 = new Transition(6, Events.EVENT6, 0, 0);
        Transition transition7 = new Transition(7, Events.EVENT7, 9, 3);
        Transition transition8 = new Transition(8, Events.EVENT8, 7, 3);
        Transition transition9 = new Transition(9, Events.EVENT9, 12, 10);
        Transition transition10 = new Transition(10, Events.EVENT10, 0, 0);
        Transition transition11 = new Transition(11, Events.EVENT11, 6, 3);
        Transition transition12 = new Transition(12, Events.EVENT12, 11, 13);
        Transition transition13 = new Transition(13, Events.EVENT13, 0, 0);

        transitionMap.put(1, transition1);
        transitionMap.put(2, transition2);
        transitionMap.put(3, transition3);
        transitionMap.put(4, transition4);
        transitionMap.put(5, transition5);
        transitionMap.put(6, transition6);
        transitionMap.put(7, transition7);
        transitionMap.put(8, transition8);
        transitionMap.put(9, transition9);
        transitionMap.put(10, transition10);
        transitionMap.put(11, transition11);
        transitionMap.put(12, transition12);
        transitionMap.put(13, transition13);

        boolean flag1 = true;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (flag1) {

                if (k == 0){
                    flag1 = false;
                }else {
                    System.out.println(transitionMap.get(k).getEvents().getText()
                            + "\n1)" + transitionMap.get(k).getEvents().getFirstVar()
                            + "\n2)" + transitionMap.get(k).getEvents().getSecondVar()
                            + "\n3)Выход в меню");
                    int j =  Integer.parseInt(reader.readLine());
                    if (j == 1){
                          k = transitionMap.get(k).getFirstId();
                    }else if (j == 2){
                          k = transitionMap.get(k).getSecondId();
                    }else if (j==3){
                        return k;
                    }
                    else{
                        System.out.println("Неверно набрано число, нажмите 1 или 2");

                    }
                }

            }


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return k;
    }
}
