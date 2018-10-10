package astro;

public class UserService {
    User[] users = new User[4];

    public UserService() {
        users[0] = new User("admin", "pass", "mail", 32);
        users[1] = new User("user", "pass", "mail", 62);
        users[2] = new User("pablo", "pass", "mail", 52);
        users[3] = new User("esco", "pass", "mail", 21);
    }

    public User getUserByLogin(String login) {
        for (User user : users) {
            boolean isSameLogin = user.login.equals(login);
            if (isSameLogin) {
                return user;
            }

        }
        return null;
    }

    public int sumUserAge() {
        int sumAge = 0;
        for (User user : users) {
            sumAge = sumAge + user.age; // = sumAge+=user.age
        }
        return sumAge;
    }
}