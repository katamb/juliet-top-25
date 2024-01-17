package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J15274 extends AbstractTestCase {
    private void badSink(int data) throws Throwable {
        int result = (int) (data * data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
