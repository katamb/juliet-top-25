package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19651 extends AbstractTestCase {
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
        int[] data;
        data = null;
        gB2G1Private = false;
        gB2G1S(data);
    }
    private void gB2G1S(int[] data) throws Throwable {
        if (gB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.length);
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void processB2G2() throws Throwable {
        int[] data;
        data = null;
        gB2G2Private = true;
        gB2G2S(data);
    }
    private void gB2G2S(int[] data) throws Throwable {
        if (gB2G2Private) {
            if (data != null) {
                IO.writeLine("" + data.length);
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void processG2B() throws Throwable {
        int[] data;
        data = new int[5];
        gG2BPrivate = true;
        gG2BS(data);
    }
    private void gG2BS(int[] data) throws Throwable {
        if (gG2BPrivate) {
            IO.writeLine("" + data.length);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
