package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_42_good extends AbstractTestCase {
    private Integer badSource() throws Throwable {
        Integer data;
        data = null;
        return data;
    }
    private Integer goodG2BSource() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        return data;
    }
    private void goodG2B() throws Throwable {
        Integer data = goodG2BSource();
        IO.writeLine("" + data.toString());
    }
    private Integer goodB2GSource() throws Throwable {
        Integer data;
        data = null;
        return data;
    }
    private void goodB2G() throws Throwable {
        Integer data = goodB2GSource();
        if (data != null) {
            IO.writeLine("" + data.toString());
        } else {
            IO.writeLine("data is null");
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
