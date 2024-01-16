package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_add_41 extends AbstractTestCase {
    private void badSink(byte data) throws Throwable {
        byte result = (byte) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        badSink(data);
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink(byte data) throws Throwable {
        byte result = (byte) (data + 1);
        IO.writeLine("result: " + result);
    }
    private void goodG2B() throws Throwable {
        byte data;
        data = 2;
        goodG2BSink(data);
    }
    private void goodB2GSink(byte data) throws Throwable {
        if (data < Byte.MAX_VALUE) {
            byte result = (byte) (data + 1);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform addition.");
        }
    }
    private void goodB2G() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}