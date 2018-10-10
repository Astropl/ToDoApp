package astro;

import java.util.Scanner;

public class CalcTest {


    private int a, b;
    Scanner sc = new Scanner(System.in);

    CalcTest() {

    }

    private void menu() {
        System.out.println(" Dodawanie");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Wynik to :" + addNumbers(a, b));
        isTrue(false);

    }

    @org.jetbrains.annotations.Contract(pure = true)
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        CalcTest calcTest = new CalcTest();
        calcTest.menu();
    }

    public boolean isTrue(boolean isTrue) {
        return isTrue;
    }
}
