package ru.job4j.oop.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User findEl = null;
        for (User u : users) {
            if (login.equals(u.getUsername())) {
                findEl = u;
                break;
            }
        }
        if (findEl == null) {
            throw new UserNotFoundException("User not found!");
        }
        return findEl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is invalid!");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user;
        try {
            user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
