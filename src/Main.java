import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Task> queue = new ArrayDeque<>();//new PriorityQueue<>();
        queue.add(new Task(new StringBuffer("Описание 222")));
        queue.add(new Task(new StringBuffer("Описание 333")));
        queue.add(new Task(new StringBuffer("Описание 111")));
        queue.add(new Task(new StringBuffer("Описание 444")));
        System.out.println(queue);

        Task t = queue.poll();
        System.out.println(t);

        Task tsk = queue.poll();
        System.out.println(tsk);

        System.out.println(queue);
        System.out.println("======================================");







        // ============================================

        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            System.out.println("Input was: " + input);
        }

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