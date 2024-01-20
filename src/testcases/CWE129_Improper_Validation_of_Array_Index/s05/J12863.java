package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J12863 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        int data;
        if (false) {
            data = 0;
        } else {
            data = 2;
        }
        if (true) {
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
    private void processG2B2() throws Throwable {
        int data;
        if (true) {
            data = 2;
        } else {
            data = 0;
        }
        if (true) {
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
    private void processB2G1() throws Throwable {
        int data;
        if (true) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (false) {
            IO.writeLine("Benign, fixed string");
        } else {
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
    private void processB2G2() throws Throwable {
        int data;
        if (true) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (true) {
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
    public void process() throws Throwable {
        processG2B1();
        processG2B2();
        processB2G1();
        processB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
