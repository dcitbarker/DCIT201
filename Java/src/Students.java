public class Students extends User implements IShape{

    public Students(String email, String password) {
        super(email, password);
        setEmail(email);
        getPassword();
        super.getPassword();
    }

    public String getPassword() {
        return "hello";
    }

    @Override
    boolean login() {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
