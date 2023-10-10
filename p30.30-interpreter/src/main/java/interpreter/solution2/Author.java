package interpreter.solution2;

public class Author {

    private int id;
    private String firstname;
    private String lastname;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Author [id=" + this.id + ", firstname=" + this.firstname + ", lastname=" + this.lastname + "]";
    }

}
