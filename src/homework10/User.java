package homework10;

import java.util.Objects;

public class User {
    private final int id;
    private final String login;
    private final String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Information User " +
                "\n\tid: " + this.id+
                "\n\tlogin: " + this.login+
                "\n\tpassword: " + this.password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return this.id == user.id &&
                Objects.equals(this.login, user.login) &&
                Objects.equals(this.password, user.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.login, this.password);
    }
}
