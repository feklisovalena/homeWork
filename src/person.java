import ArrayList.ArrayList;

public class person {
    protected List<Person> children = new ArrayList<>();

    static protected List<Person> persons;
    protected Person parent = null;
    protected String firstName = null;
    protected String secondName = null;

    static {
        persons = new List<Person>();
    }

    public person(String secondName, String firstName){
        this.secondName = secondName;
        this.firstName = firstName;
        this.addPerson(this.getParent());
    }

    public void Person(String secondName, String firstName, Person parent){
        this.secondName = secondName;
        this.firstName = firstName;
        this.parent = parent;
        parent.addChild(this);
        this.addPerson(this.getParent());
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public static <List> List<Person> getPersons(){
        return persons;
    }

    public List<Person> getChildren(){
        return children;
    }

    public void setParent(Person parent){
        this.parent = parent;
        parent.addChild(this);
    }

    public Person getParent(){
        return this.parent;
    }

    public void addChild(Person child){
        //child.setParent(this);
        this.children.add(child);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public void setFirstName(String firstName){
        this.secondName = firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    @Override
    public String toString(){
        return (firstName + " " + secondName);
    }

    private class Person {
    }
}
