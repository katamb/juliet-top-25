package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19573 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        IO.writeLine("" + data.toString());
    }
    private void processB2G() throws Throwable {
        Integer data;
        data = null;
        if (data != null) {
            IO.writeLine("" + data.toString());
        } else {
            IO.writeLine("data is null");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
