package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15943 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        short data;
        if (false) {
            data = 0;
        } else {
            data = 2;
        }
        if (true) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        short data;
        if (true) {
            data = 2;
        } else {
            data = 0;
        }
        if (true) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        short data;
        if (true) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (false) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Short.MAX_VALUE) {
                short result = (short) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void processB2G2() throws Throwable {
        short data;
        if (true) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (true) {
            if (data < Short.MAX_VALUE) {
                short result = (short) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
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
