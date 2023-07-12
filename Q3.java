class Person {
    private String name;
    private int age;
    private String address;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Person person = new Person();
        
        person.setName("Nirmeet Gandhi");
        person.setAge(30);
        person.setAddress("123 Barcelona , City");
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
