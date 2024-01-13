/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__long_rand_preinc_45.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-45.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: rand Set data to result of rand()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: increment
 *    GoodSink: Ensure there will not be an overflow before incrementing data
 *    BadSink : Increment data, which can cause an overflow
 * Flow Variant: 45 Data flow: data passed as a private class member variable from one function to another in the same class
 *
 * */

package testcases.CWE190_Integer_Overflow.s07;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__long_rand_preinc_45 extends AbstractTestCase {
    private long dataBad;
    private long dataGoodG2B;
    private long dataGoodB2G;

    private void badSink() throws Throwable {
        long data = dataBad;

        /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
        long result = (long) (++data);

        IO.writeLine("result: " + result);

    }

    public void bad() throws Throwable {
        long data;

        /* POTENTIAL FLAW: Use a random value */
        data = (new java.security.SecureRandom()).nextLong();

        dataBad = data;
        badSink();
    }

    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }

    private void goodG2BSink() throws Throwable {
        long data = dataGoodG2B;

        /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
        long result = (long) (++data);

        IO.writeLine("result: " + result);

    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable {
        long data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        dataGoodG2B = data;
        goodG2BSink();
    }

    private void goodB2GSink() throws Throwable {
        long data = dataGoodB2G;

        /* FIX: Add a check to prevent an overflow from occurring */
        if (data < Long.MAX_VALUE) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }

    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable {
        long data;

        /* POTENTIAL FLAW: Use a random value */
        data = (new java.security.SecureRandom()).nextLong();

        dataGoodB2G = data;
        goodB2GSink();
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
