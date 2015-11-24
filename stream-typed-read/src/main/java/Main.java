import org.opu_newbee_education.java_oop_2015.stream_typed_read.ConsoleTypedReader;
import org.opu_newbee_education.java_oop_2015.stream_typed_read.TypedReadException;

/**
 * Created by salterok on 01.10.2015.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {


        try {
            Student student1 = ConsoleTypedReader.read(Student.class);
            Student student2 = ConsoleTypedReader.read(Student.class);



        } catch (TypedReadException e) {
            e.printStackTrace();
        }
    }
}
