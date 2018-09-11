package astro;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int radix;
        boolean isApplicationRun = true;

        while (isApplicationRun) {
            displayMenu();
            System.out.println("Type number to choose option");
            radix = sc.nextInt();
            switch (radix) {
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
                case 1:
                    System.out.println("Podaj nazwe zadania do dodania");
                    String task = sc.next();
                    addTask(task);
                    break;
                case 2:
                    System.out.println("Podaj index zadania do usuniecia");
                    int index = sc.nextInt();
                    removeTask(index);
                    break;
                case 5:
                    displayTasks();
                    break;
                case 0:
                    isApplicationRun = false;
                    break;
                case 7:
                    displayChangeLog();
            }


        }


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
            changeLog("Add Task from list");
        }
    }

    public static void removeTask(int indexTask) {
        boolean isTaskExist = indexTask < taskCount;
        if (isTaskExist) {
            for (int i = indexTask; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];

            }
            taskCount--;
            changeLog("Remove Task from list");
        }
    }

    public static void displayTasks() {
        System.out.println("Lists of tasks");
        for (int i = 0; i < taskCount; i++) {

            System.out.println("========================");
            System.out.println("= " + tasks[i]);
            changeLog("Show: Lists of Task");
        }

    }

    public static void changeLog(String log) {
        boolean hasCapacityChangeLog = changeLogCount < changeLog.length;
        if (hasCapacityChangeLog) {
            for (int i = 0; i < changeLogCount + 1; i++) {
                changeLog[i + 1] = changeLog[i];
                changeLog[i] = log;

            }
            changeLogCount++;
        }
    }

    public static void displayChangeLog() {
        for (int i = 0; i < changeLogCount; i++) {
            System.out.println(changeLog[i]);
        }
        changeLog("Show all change log");
    }


}
