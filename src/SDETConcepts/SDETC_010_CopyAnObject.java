package SDETConcepts;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Person10 implements Cloneable {  // Implements Cloneable for shallow copy
    String name;
    int age;

    // Constructor
    Person10(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 1. **Using Constructor**
    Person10(Person10 other) { // Copy constructor	(Can be Shallow or Deep)
        this.name = other.name;
        this.age = other.age;
    }

    // 2. **Using Cloneable Interface** (Shallow Copy)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    // 3. **Using Serialization and Deserialization** (Deep Copy)
    public Person10 deepCopy() {
        try {
            // Convert object to byte stream
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();

            // Convert byte stream to object
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Person10) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 4. **Using Object Copying Libraries** (Apache Commons BeanUtils)
//    public Person10 libraryCopy() {
//        try {
//            Person10 target = new Person10("", 0);
//            org.apache.commons.beanutils.BeanUtils.copyProperties(target, this);
//            return target;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    // 5. **Using Java Streams (Serialization Alternative)** - Deep Copy
    public Person10 streamCopy() {
        return new Person10(this.name, this.age); // Manual deep copy
    }

    // toString for Display
    @Override
    public String toString() {
        return "Person10{name='" + name + "', age=" + age + '}';
    }
}

public class SDETC_010_CopyAnObject {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Original Object
        Person10 p1 = new Person10("John", 30);

        // 1. Constructor Copy
        Person10 copy1 = new Person10(p1);
        System.out.println("Constructor Copy: " + copy1);

        // 2. Cloneable Copy
        Person10 copy2 = (Person10) p1.clone();
        System.out.println("Cloneable Copy: " + copy2);

        // 3. Serialization Copy
        Person10 copy3 = p1.deepCopy();
        System.out.println("Serialization Copy: " + copy3);

        // 4. Library Copy (requires Apache Commons)
        // Person10 copy4 = p1.libraryCopy();
        // System.out.println("Library Copy: " + copy4);

        // 5. Stream Copy
        Person10 copy5 = p1.streamCopy();
        System.out.println("Stream Copy: " + copy5);
    }
}