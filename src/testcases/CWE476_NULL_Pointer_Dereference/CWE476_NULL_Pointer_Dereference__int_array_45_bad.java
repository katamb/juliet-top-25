package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_45_bad extends AbstractTestCase {
    private int[] dataBad;
    private int[] dataGoodG2B;
    private int[] dataGoodB2G;
    private void badSink() throws Throwable {
        int[] data = dataBad;
        IO.writeLine("" + data.length);
    }
    public void bad() throws Throwable {
        int[] data;
        data = null;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
