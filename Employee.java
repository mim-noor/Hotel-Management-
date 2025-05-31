public class Employee extends Person {
    private String type;

    public void method(String type) {
        this.type = type;
        System.out.println("Employee type: " + type);
    }
}

