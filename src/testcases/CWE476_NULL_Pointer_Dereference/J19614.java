package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19614 extends AbstractTestCase {
    private Integer dataBad;
    private Integer dataGoodG2B;
    private Integer dataGoodB2G;
    private void badSink() throws Throwable {
        Integer data = dataBad;
        IO.writeLine("" + data.toString());
    }
    public void handle() throws Throwable {
        Integer data;
        data = null;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
