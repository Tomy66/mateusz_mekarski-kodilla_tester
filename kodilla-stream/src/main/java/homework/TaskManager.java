package homework;

public class TaskManager {
    public static void main(String[] args) {
        TaskRepository.getTasks()
                .stream()
                .filter(task -> task.getDeadline().equals())
    }
}
