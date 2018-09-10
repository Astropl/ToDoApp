package astro;

/**
 * Hello world!
 */
public class App {
    static String[] tasks = new String[100];
    static String[] projects = new String[100];
    static String[] changeLog = new String[100];

    static int taskCount = 0;
    static int projectCount = 0;
    static int changeLogCount = 0;

    public static void main(String[] args) {
        displayMenu();

    }

    public static void displayMenu() {
        System.out.println("*****************************");
        System.out.println("* 1 - Create new Task       *");
        System.out.println("* 2 - Remove Task           *");
        System.out.println("* 3 - Create new project    *");
        System.out.println("* 4 - Remove project        *");
        System.out.println("* 5 - Display all tasks     *");
        System.out.println("* 6 - Display all projects  *");
        System.out.println("* 7 - Display Change log    *");
        System.out.println("* 0 - Exit                  *");
        System.out.println("*****************************");

    }

    public static void addTask(String task) {
        boolean hasCapacityForNewTask = taskCount < tasks.length;
        if (hasCapacityForNewTask) {
            tasks[taskCount] = task;
            taskCount++;
        }
    }

    public static void removeTask (int indexTask)
    {
        boolean isTaskExist = indexTask<taskCount;
        if (isTaskExist)
        {
            for (int i=indexTask; i<taskCount-1;i++)
            {
                tasks[i]=tasks[i+1];
                taskCount--;
            }
        }
    }

    public static void displayTasks()
    {
        System.out.println("Lists of tasks");
        for(int i=0;i<taskCount;i++)
        {
            System.out.println(tasks[i]);
        }
    }
}
