package testcases.CWE129_Improper_Validation_of_Array_Index.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J11833 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        int data;
        switch (5) {
            case 6:
                data = 0;
                break;
            default:
                data = 2;
                break;
        }
        switch (7) {
            case 7:
                int array[] = {0, 1, 2, 3, 4};
                IO.writeLine(array[data]);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processG2B2() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = 2;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int array[] = {0, 1, 2, 3, 4};
                IO.writeLine(array[data]);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processB2G1() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = 100;
                break;
            default:
                data = 0;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                int array[] = {0, 1, 2, 3, 4};
                if (data >= 0 && data < array.length) {
                    IO.writeLine(array[data]);
                } else {
                    IO.writeLine("Array index out of bounds");
                }
                break;
        }
    }
    private void processB2G2() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = 100;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int array[] = {0, 1, 2, 3, 4};
                if (data >= 0 && data < array.length) {
                    IO.writeLine(array[data]);
                } else {
                    IO.writeLine("Array index out of bounds");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
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
