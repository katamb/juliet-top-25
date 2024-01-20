package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13451 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        byte data;
        if (IO.staticFalse) {
            data = 0;
        } else {
            data = 2;
        }
        if (IO.staticTrue) {
            byte result = (byte) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        byte data;
        if (IO.staticTrue) {
            data = 2;
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
            byte result = (byte) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        byte data;
        if (IO.staticTrue) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (IO.staticFalse) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void processB2G2() throws Throwable {
        byte data;
        if (IO.staticTrue) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (data + 1);
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
