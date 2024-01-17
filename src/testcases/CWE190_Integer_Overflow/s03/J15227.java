package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J15227 extends AbstractTestCase {
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
        int data;
        data = (new SecureRandom()).nextInt();
        gB2G1Private = false;
        gB2G1Sink(data);
    }
    private void gB2G1Sink(int data) throws Throwable {
        if (gB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data > 0)  {
                if (data < (Integer.MAX_VALUE / 2)) {
                    int result = (int) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    private void processB2G2() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        gB2G2Private = true;
        goodB2G2Sink(data);
    }
    private void goodB2G2Sink(int data) throws Throwable {
        if (gB2G2Private) {
            if (data > 0)  {
                if (data < (Integer.MAX_VALUE / 2)) {
                    int result = (int) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    private void processG2B() throws Throwable {
        int data;
        data = 2;
        gG2BPrivate = true;
        gG2BSink(data);
    }
    private void gG2BSink(int data) throws Throwable {
        if (gG2BPrivate) {
            if (data > 0)  {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
