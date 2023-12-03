import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    // public String toString() {
    //     return "Hello World";
    // }

    
}

class Main {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee(1, "Shrikant");
        
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);

    }
    
}
