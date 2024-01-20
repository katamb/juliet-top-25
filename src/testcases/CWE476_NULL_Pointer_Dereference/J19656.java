package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19656 extends AbstractTestCase {
    private int[] bSce() throws Throwable {
        int[] data;
        data = null;
        return data;
    }
    public void handle() throws Throwable {
        int[] data = bSce();
        IO.writeLine("" + data.length);
    }
    private int[] processG2BSce() throws Throwable {
        int[] data;
        data = new int[5];
        return data;
    }
    private int[] processB2GSce() throws Throwable {
        int[] data;
        data = null;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
