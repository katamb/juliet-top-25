package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15617 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        long data;
        switch (5) {
            case 6:
                data = 0L;
                break;
            default:
                data = 2;
                break;
        }
        switch (7) {
            case 7:
                if (data > 0)  {
                    long result = (long) (data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processG2B2() throws Throwable {
        long data;
        switch (6) {
            case 6:
                data = 2;
                break;
            default:
                data = 0L;
                break;
        }
        switch (7) {
            case 7:
                if (data > 0)  {
                    long result = (long) (data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processB2G1() throws Throwable {
        long data;
        switch (6) {
            case 6:
                data = Long.MAX_VALUE;
                break;
            default:
                data = 0L;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                if (data > 0)  {
                    if (data < (Long.MAX_VALUE / 2)) {
                        long result = (long) (data * 2);
                        IO.writeLine("result: " + result);
                    } else {
                        IO.writeLine("data value is too large to perform multiplication.");
                    }
                }
                break;
        }
    }
    private void processB2G2() throws Throwable {
        long data;
        switch (6) {
            case 6:
                data = Long.MAX_VALUE;
                break;
            default:
                data = 0L;
                break;
        }
        switch (7) {
            case 7:
                if (data > 0)  {
                    if (data < (Long.MAX_VALUE / 2)) {
                        long result = (long) (data * 2);
                        IO.writeLine("result: " + result);
                    } else {
                        IO.writeLine("data value is too large to perform multiplication.");
                    }
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public void process() throws Throwable {
        processG2B1();
        processG2B2();
        processB2G1();
        processB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
