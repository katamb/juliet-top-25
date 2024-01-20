package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16041 extends AbstractTestCase {
    private int privateFive = 5;
    private void processG2B1() throws Throwable {
        short data;
        if (privateFive != 5) {
            data = 0;
        } else {
            data = 2;
        }
        if (privateFive == 5) {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        short data;
        if (privateFive == 5) {
            data = 2;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        short data;
        if (privateFive == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFive != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Short.MAX_VALUE))) {
                short result = (short) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    private void processB2G2() throws Throwable {
        short data;
        if (privateFive == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Short.MAX_VALUE))) {
                short result = (short) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
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
