package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_postinc_07_good extends AbstractTestCase {
    private int privateFive = 5;
    private void goodG2B1() throws Throwable {
        byte data;
        if (privateFive != 5) {
            data = 0;
        } else {
            data = 2;
        }
        if (privateFive == 5) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        byte data;
        if (privateFive == 5) {
            data = 2;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        byte data;
        if (privateFive == 5) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFive != 5) {
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
    private void goodB2G2() throws Throwable {
        byte data;
        if (privateFive == 5) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
            if (data < Byte.MAX_VALUE) {
                data++;
                byte result = (byte) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
