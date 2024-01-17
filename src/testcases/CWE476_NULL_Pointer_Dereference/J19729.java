package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19729 extends AbstractTestCase {
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
        StringBuilder data;
        data = null;
        gB2G1Private = false;
        gB2G1Sink(data);
    }
    private void gB2G1Sink(StringBuilder data) throws Throwable {
        if (gB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void processB2G2() throws Throwable {
        StringBuilder data;
        data = null;
        gB2G2Private = true;
        goodB2G2Sink(data);
    }
    private void goodB2G2Sink(StringBuilder data) throws Throwable {
        if (gB2G2Private) {
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
        gG2BPrivate = true;
        gG2BSink(data);
    }
    private void gG2BSink(StringBuilder data) throws Throwable {
        if (gG2BPrivate) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
