package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15623 extends AbstractTestCase {
    private boolean bPrivate = false;
    private boolean gB2G1Private = false;
    private boolean gB2G2Private = false;
    private boolean gG2BPrivate = false;
    public void process() throws Throwable {
        processB2G1();
        processB2G2();
        processG2B();
    }
    private void processB2G1() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        gB2G1Private = false;
        gB2G1Sink(data);
    }
    private void gB2G1Sink(long data) throws Throwable {
        if (gB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data > 0)  {
                if (data < (Long.MAX_VALUE / 2)) {
                    long result = (long) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    private void processB2G2() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        gB2G2Private = true;
        goodB2G2Sink(data);
    }
    private void goodB2G2Sink(long data) throws Throwable {
        if (gB2G2Private) {
            if (data > 0)  {
                if (data < (Long.MAX_VALUE / 2)) {
                    long result = (long) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    private void processG2B() throws Throwable {
        long data;
        data = 2;
        gG2BPrivate = true;
        gG2BSink(data);
    }
    private void gG2BSink(long data) throws Throwable {
        if (gG2BPrivate) {
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
