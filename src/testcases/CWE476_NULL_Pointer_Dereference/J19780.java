package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19780 extends AbstractTestCase {
    private String dataB;
    private String dataGdG2B;
    private String dataGdB2G;
    private void bS() throws Throwable {
        String data = dataB;
        IO.writeLine("" + data.length());
    }
    public void handle() throws Throwable {
        String data;
        data = null;
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
