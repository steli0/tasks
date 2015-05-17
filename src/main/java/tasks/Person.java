package tasks;

public class Person {
    private int age;
    private String name;
    private String address;
    private double cash;
    
    public Person(String name, String address, int age, double cash) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.cash = cash;
    }

    @Override
    public int hashCode() {
        int result = 23;
        result = result * 31 + name.hashCode();
        result = result * 31 + address.hashCode();
        result = result * 31 + age;
        result = result * 31 + (int) Double.doubleToLongBits(cash);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;
        return p.name.equals(this.name) && p.address.equals(this.address)
                && p.age == this.age && p.cash == this.cash;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + ", address=" + address
                + ", cash=" + cash + "]";
    }
}
