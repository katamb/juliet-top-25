/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__byte_max_multiply_54c.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-54c.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: max Set data to the max value for byte
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: multiply
 *    GoodSink: Ensure there will not be an overflow before multiplying data by 2
 *    BadSink : If data is positive, multiply by 2, which can cause an overflow
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package testcases.CWE190_Integer_Overflow.s01;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__byte_max_multiply_54c {
    public void badSink(byte data) throws Throwable {
        (new CWE190_Integer_Overflow__byte_max_multiply_54d()).badSink(data);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(byte data) throws Throwable {
        (new CWE190_Integer_Overflow__byte_max_multiply_54d()).goodG2BSink(data);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(byte data) throws Throwable {
        (new CWE190_Integer_Overflow__byte_max_multiply_54d()).goodB2GSink(data);
    }
}
