/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * The employee's name.
     */
    private String name;

    /**
     * The manager's name.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param n the employee's name
     * @param m the employee's manager's name
     */
    public Employee(final String n, final String m) {
        this.name = n;
        this.manager = m;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param n the new name
     */
    public void setName(final String n) {
        this.name = n;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param m the new name
     */
    public void setManager(final String m) {
        this.manager = m;
    }
}
