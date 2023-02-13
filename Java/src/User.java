public abstract class User {
    private String password;
    private String email;

    // contain fully implemented methods and abstract methods
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public String getPassword(String name) {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    abstract boolean login();

    public abstract boolean logout();

}