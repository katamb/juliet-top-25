package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19613 extends AbstractTestCase {
    private Integer bSce() throws Throwable {
        Integer data;
        data = null;
        return data;
    }
    private Integer processG2BSce() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        return data;
    }
    private void processG2B() throws Throwable {
        Integer data = processG2BSce();
        IO.writeLine("" + data.toString());
    }
    private Integer processB2GSce() throws Throwable {
        Integer data;
        data = null;
        return data;
    }
    private void processB2G() throws Throwable {
        Integer data = processB2GSce();
        if (data != null) {
            IO.writeLine("" + data.toString());
        } else {
            IO.writeLine("data is null");
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
