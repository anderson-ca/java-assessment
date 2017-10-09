public class Person implements Greeter {

    ////////////////// Properties.
    protected String firstName;

    protected String lastName;

    ////////////////// Constructor.
    public Person(String firstName, String lastName) {

        this.firstName = firstName;

        this.lastName = lastName;

        if(firstName.equalsIgnoreCase(null) || lastName.equalsIgnoreCase(null)) {
            throw new IllegalArgumentException();
        }
    }

    public Person() {

    }

    /////////////////// Getters.
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    /////////////////// Setters.
    public void  setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void  setLastName(String lastName) {
        this.lastName = lastName;
    }

    //////////////// Interface Implementation.


    @Override
    public String sayHello() {
        return "Hello from " + this.firstName + " " + this.lastName;
    }
}
