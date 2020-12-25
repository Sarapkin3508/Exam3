import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Load {

    private final int progress;
    private final String nickname;
    private LocalDateTime timeOfLoad;

    public Load(int progress, String nickname, LocalDateTime timeOfLoad) {
        this.progress = progress;
        this.nickname = nickname;
        this.timeOfLoad = timeOfLoad;
    }

    public int getProgress() {
        return progress;
    }

    public String getNickname() {
        return nickname;
    }

    public LocalDateTime getTimeOfLoad() {
        return timeOfLoad;
    }

    public String getInfo(){
        return nickname + " | " +  timeOfLoad.format(DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z"));

    }
}
