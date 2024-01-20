package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13517 extends AbstractTestCase {
    private byte bSce() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        return data;
    }
    private byte processG2BSce() throws Throwable {
        byte data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        byte data = processG2BSce();
        if (data > 0)  {
            byte result = (byte) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private byte processB2GSce() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        return data;
    }
    private void processB2G() throws Throwable {
        byte data = processB2GSce();
        if (data > 0)  {
            if (data < (Byte.MAX_VALUE / 2)) {
                byte result = (byte) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
            }
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
