// Exercise 5: Task Management System
class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int id, String name, String status) {
        this.taskId = id;
        this.taskName = name;
        this.status = status;
        this.next = null;
    }
}

class TaskList {
    Task head = null;

    void add(Task task) {
        task.next = head;
        head = task;
    }

    Task search(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) return current;
            current = current.next;
        }
        return null;
    }

    void delete(int id) {
        Task current = head, prev = null;
        while (current != null && current.taskId != id) {
            prev = current;
            current = current.next;
        }
        if (current == null) return;
        if (prev == null) head = current.next;
        else prev.next = current.next;
    }

    void traverse() {
        Task current = head;
        while (current != null) {
            System.out.println(current.taskId + ": " + current.taskName);
            current = current.next;
        }
    }
}
