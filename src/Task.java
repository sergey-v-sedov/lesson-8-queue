import java.util.Objects;
import java.util.Random;

public class Task {
    private final Integer id;
    private final StringBuffer description;

    public Task(StringBuffer description) {
        this.id = 1;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public StringBuffer getDescription() {
        return new StringBuffer(description.toString());
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(description.toString(), task.description.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }
}