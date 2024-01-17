package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19780 extends AbstractTestCase {
    private String dataBad;
    private String dataGoodG2B;
    private String dataGoodB2G;
    private void badSink() throws Throwable {
        String data = dataBad;
        IO.writeLine("" + data.length());
    }
    public void handle() throws Throwable {
        String data;
        data = null;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
