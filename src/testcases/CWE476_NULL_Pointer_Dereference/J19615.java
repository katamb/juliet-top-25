package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19615 extends AbstractTestCase {
    private Integer dataB;
    private Integer dataGdG2B;
    private Integer dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS() throws Throwable {
        Integer data = dataGdG2B;
        IO.writeLine("" + data.toString());
    }
    private void processG2B() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        dataGdG2B = data;
        gG2BS();
    }
    private void gB2GS() throws Throwable {
        Integer data = dataGdB2G;
        if (data != null) {
            IO.writeLine("" + data.toString());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void processB2G() throws Throwable {
        Integer data;
        data = null;
        dataGdB2G = data;
        gB2GS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
