package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19729 extends AbstractTestCase {
    private boolean badPrivate = false;
    private boolean goodB2G1Private = false;
    private boolean goodB2G2Private = false;
    private boolean goodG2BPrivate = false;
    public void process() throws Throwable {
        goodB2G1();
        goodB2G2();
        processG2B();
    }
    private void goodB2G1() throws Throwable {
        StringBuilder data;
        data = null;
        goodB2G1Private = false;
        goodB2G1Sink(data);
    }
    private void goodB2G1Sink(StringBuilder data) throws Throwable {
        if (goodB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        StringBuilder data;
        data = null;
        goodB2G2Private = true;
        goodB2G2Sink(data);
    }
    private void goodB2G2Sink(StringBuilder data) throws Throwable {
        if (goodB2G2Private) {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void processG2B() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        goodG2BPrivate = true;
        goodG2BSink(data);
    }
    private void goodG2BSink(StringBuilder data) throws Throwable {
        if (goodG2BPrivate) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
