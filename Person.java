public class Person {
    private String name; // a property that uniquely identifies any object instance
    //private int order; // a parent property to designate order of objects

    public Person(String name) {
        this.name = name;

        //this.order = name.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Person p) {
        if (p == null) return false;
        if (p == this) return true;

        return this.name.equals(p.name);
    }

    public int hashCode() {
        return name.hashCode();
    }
}