package homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    String name;
    LocalDate opened;
    LocalDate deadline;

    public Task(String name, LocalDate opened, LocalDate deadline){
        this.name=name;
        this.deadline=deadline;
        this.opened=opened;
    }

    public String getName(){
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public LocalDate getOpened() {
        return opened;
    }
}
