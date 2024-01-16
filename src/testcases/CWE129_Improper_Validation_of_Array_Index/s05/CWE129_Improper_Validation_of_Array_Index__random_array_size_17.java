package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE129_Improper_Validation_of_Array_Index__random_array_size_17 extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        for (int j = 0; j < 1; j++) {
            int array[] = null;
            if (data >= 0) {
                array = new int[data];
            } else {
                IO.writeLine("Array size is negative");
            }
            array[0] = 5;
            IO.writeLine(array[0]);
        }
    }
    private void goodG2B() throws Throwable {
        int data;
        data = 2;
        for (int j = 0; j < 1; j++) {
            int array[] = null;
            if (data >= 0) {
                array = new int[data];
            } else {
                IO.writeLine("Array size is negative");
            }
            array[0] = 5;
            IO.writeLine(array[0]);
        }
    }
    private void goodB2G() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        for (int k = 0; k < 1; k++) {
            int array[] = null;
            if (data > 0) {
                array = new int[data];
            } else {
                IO.writeLine("Array size is negative");
            }
            array[0] = 5;
            IO.writeLine(array[0]);
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}