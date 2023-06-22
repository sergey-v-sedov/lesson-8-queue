import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Task task = new Task(new StringBuffer("Описание"));

        Stack<Task> tasks = new Stack<>();
        tasks.push(task);
        tasks.push(new Task(new StringBuffer("Описание 222")));
        tasks.push(new Task(new StringBuffer("Описание 222")));
        tasks.push(new Task(new StringBuffer("Описание 333")));
        tasks.push(new Task(new StringBuffer("Описание 444")));
        tasks.push(new Task(new StringBuffer("Описание 333")));
        tasks.push(new Task(new StringBuffer("Описание 555")));
        System.out.println(tasks);

        /*Task upperTask = tasks.pop();
        System.out.println(upperTask);
        System.out.println(tasks);*/

        int index = tasks.search(new Task(new StringBuffer("Описание 333")));
        System.out.println(index);


    }
}