package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16295 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        byte data;
        if (false) {
            data = 0;
        } else {
            data = 2;
        }
        if (true) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        byte data;
        if (true) {
            data = 2;
        } else {
            data = 0;
        }
        if (true) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        byte data;
        if (true) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (false) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Byte.MAX_VALUE) {
                data++;
                byte result = (byte) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    private void processB2G2() throws Throwable {
        byte data;
        if (true) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (true) {
            if (data < Byte.MAX_VALUE) {
                data++;
                byte result = (byte) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
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
