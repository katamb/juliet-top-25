/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__int_max_preinc_14.java
Label Definition File: CWE190_Integer_Overflow__int.label.xml
Template File: sources-sinks-14.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: max Set data to the maximum value for int
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: increment
 *    GoodSink: Ensure there will not be an overflow before incrementing data
 *    BadSink : Increment data, which can cause an overflow
 * Flow Variant: 14 Control flow: if(IO.staticFive==5) and if(IO.staticFive!=5)
 *
 * */

package testcases.CWE190_Integer_Overflow.s07;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__int_max_preinc_14 extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.staticFive == 5) {
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        }

        if (IO.staticFive == 5) {
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing first IO.staticFive==5 to IO.staticFive!=5 */
    private void goodG2B1() throws Throwable {
        int data;
        if (IO.staticFive != 5) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        } else {

            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;

        }

        if (IO.staticFive == 5) {
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    private void goodG2B2() throws Throwable {
        int data;
        if (IO.staticFive == 5) {
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        }

        if (IO.staticFive == 5) {
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second IO.staticFive==5 to IO.staticFive!=5 */
    private void goodB2G1() throws Throwable {
        int data;
        if (IO.staticFive == 5) {
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        }

        if (IO.staticFive != 5) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        } else {

            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }

        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    private void goodB2G2() throws Throwable {
        int data;
        if (IO.staticFive == 5) {
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = 0;
        }

        if (IO.staticFive == 5) {
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }

    public void good() throws Throwable {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
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
