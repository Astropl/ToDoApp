package astro;

public class MainUser {
    public static void main(String arg[]) {
        User user = new User();

        System.out.println(user.age);
        System.out.println(user.email);
        System.out.println(user.login);
        System.out.println(user.password);

        User pablo = new User ("log","passw","jakis@eamil.cxom",45);
        System.out.println("");
        System.out.println(pablo.age);
        System.out.println(pablo.email);
        System.out.println(pablo.login);
        System.out.println(pablo.password);
    }
}
