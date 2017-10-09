public class User extends Person {
    protected boolean isAdmin;

    public User(String firstName, String lastName, boolean isAdmin) {
        this.firstName = firstName;

        this.lastName = lastName;

        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        boolean isAdministrator;
        if(this.isAdmin) {
            isAdministrator = true;
        } else {
            isAdministrator = false;
        }

        return isAdministrator;
    }
}
