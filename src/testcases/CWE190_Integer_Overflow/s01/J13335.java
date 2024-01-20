package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13335 extends AbstractTestCase {
    private boolean bPrivate = false;
    private boolean gB2G1Private = false;
    private boolean gB2G2Private = false;
    private boolean gG2BPrivate = false;
    public void process() throws Throwable {
        processB2G1();
        processB2G2();
        processG2B();
    }
    private void processB2G1() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        gB2G1Private = false;
        gB2G1S(data);
    }
    private void gB2G1S(byte data) throws Throwable {
        if (gB2G1Private) {
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
        data = Byte.MAX_VALUE;
        gB2G2Private = true;
        gB2G2S(data);
    }
    private void gB2G2S(byte data) throws Throwable {
        if (gB2G2Private) {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void processG2B() throws Throwable {
        byte data;
        data = 2;
        gG2BPrivate = true;
        gG2BS(data);
    }
    private void gG2BS(byte data) throws Throwable {
        if (gG2BPrivate) {
            byte result = (byte) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
