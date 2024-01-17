package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19614 extends AbstractTestCase {
    private Integer dataB;
    private Integer dataGdG2B;
    private Integer dataGdB2G;
    private void badSink() throws Throwable {
        Integer data = dataB;
        IO.writeLine("" + data.toString());
    }
    public void handle() throws Throwable {
        Integer data;
        data = null;
        dataB = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
