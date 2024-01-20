package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19610 extends AbstractTestCase {
    private void bS(Integer data) throws Throwable {
        IO.writeLine("" + data.toString());
    }
    public void handle() throws Throwable {
        Integer data;
        data = null;
        bS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
