package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19612 extends AbstractTestCase {
    private Integer badSource() throws Throwable {
        Integer data;
        data = null;
        return data;
    }
    public void handle() throws Throwable {
        Integer data = badSource();
        IO.writeLine("" + data.toString());
    }
    private Integer goodG2BSource() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        return data;
    }
    private Integer goodB2GSource() throws Throwable {
        Integer data;
        data = null;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
