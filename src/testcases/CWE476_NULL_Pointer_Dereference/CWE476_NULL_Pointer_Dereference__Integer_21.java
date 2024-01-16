package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_21 extends AbstractTestCase {
    private boolean badPrivate = false;
    public void bad() throws Throwable {
        Integer data;
        data = null;
        badPrivate = true;
        badSink(data);
    }
    private void badSink(Integer data) throws Throwable {
        if (badPrivate) {
            IO.writeLine("" + data.toString());
        }
    }
    private boolean goodB2G1Private = false;
    private boolean goodB2G2Private = false;
    private boolean goodG2BPrivate = false;
    public void good() throws Throwable {
        goodB2G1();
        goodB2G2();
        goodG2B();
    }
    private void goodB2G1() throws Throwable {
        Integer data;
        data = null;
        goodB2G1Private = false;
        goodB2G1Sink(data);
    }
    private void goodB2G1Sink(Integer data) throws Throwable {
        if (goodB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.toString());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        Integer data;
        data = null;
        goodB2G2Private = true;
        goodB2G2Sink(data);
    }
    private void goodB2G2Sink(Integer data) throws Throwable {
        if (goodB2G2Private) {
            if (data != null) {
                IO.writeLine("" + data.toString());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void goodG2B() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        goodG2BPrivate = true;
        goodG2BSink(data);
    }
    private void goodG2BSink(Integer data) throws Throwable {
        if (goodG2BPrivate) {
            IO.writeLine("" + data.toString());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}