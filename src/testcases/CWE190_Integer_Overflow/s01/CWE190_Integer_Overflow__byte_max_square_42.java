/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__byte_max_square_42.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-42.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: max Set data to the max value for byte
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: square
 *    GoodSink: Ensure there will not be an overflow before squaring data
 *    BadSink : Square data, which can lead to overflow
 * Flow Variant: 42 Data flow: data returned from one method to another in the same class
 *
 * */

package testcases.CWE190_Integer_Overflow.s01;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__byte_max_square_42 extends AbstractTestCase {
    private byte badSource() throws Throwable {
        byte data;

        /* POTENTIAL FLAW: Use the maximum size of the data type */
        data = Byte.MAX_VALUE;

        return data;
    }

    public void bad() throws Throwable {
        byte data = badSource();

        /* POTENTIAL FLAW: if (data*data) > Byte.MAX_VALUE, this will overflow */
        byte result = (byte) (data * data);

        IO.writeLine("result: " + result);

    }

    /* goodG2B() - use goodsource and badsink */
    private byte goodG2BSource() throws Throwable {
        byte data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        return data;
    }

    private void goodG2B() throws Throwable {
        byte data = goodG2BSource();

        /* POTENTIAL FLAW: if (data*data) > Byte.MAX_VALUE, this will overflow */
        byte result = (byte) (data * data);

        IO.writeLine("result: " + result);

    }

    /* goodB2G() - use badsource and goodsink */
    private byte goodB2GSource() throws Throwable {
        byte data;

        /* POTENTIAL FLAW: Use the maximum size of the data type */
        data = Byte.MAX_VALUE;

        return data;
    }

    private void goodB2G() throws Throwable {
        byte data = goodB2GSource();

        /* FIX: Add a check to prevent an overflow from occurring */
        /* NOTE: Math.abs of the minimum int or long will return that same value, so we must check for it */
        if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Byte.MAX_VALUE))) {
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform squaring.");
        }

    }

    public void good() throws Throwable {
        goodG2B();
        goodB2G();
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
