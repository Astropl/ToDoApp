package astro;

public class MainUser {
    public static void main(String arg[]) {
//        User user = new User();
//
//        System.out.println(user.age);
//        System.out.println(user.email);
//        System.out.println(user.login);
//        System.out.println(user.password);
//
//        User pablo = new User ("log","passw","jakis@eamil.cxom",45);
//        System.out.println("");
//        System.out.println(pablo.age);
//        System.out.println(pablo.email);
//        System.out.println(pablo.login);
//        System.out.println(pablo.password);


        UserService userService = new UserService();
        User user = userService.getUserByLogin("pablo");
        User kamil = userService.getUserByLogin("kamil");
        System.out.println("znaleziono usera : "+ user.login +" "+ user.email);
        if (kamil !=null) {
            System.out.println("znaleziono usera : " + kamil.login + " " + kamil.email);
        }else{
            System.out.println(" Nie znaleziono kamila");
        }
        int sumAge = userService.sumUserAge();
        System.out.println("suma wieku wszytskich userrów to :" +sumAge);
    }
}
