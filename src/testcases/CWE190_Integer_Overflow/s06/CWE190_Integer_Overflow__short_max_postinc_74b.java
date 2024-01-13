/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__short_max_postinc_74b.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-74b.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: max Set data to the max value for short
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: increment
 *    GoodSink: Ensure there will not be an overflow before incrementing data
 *    BadSink : Increment data, which can cause an overflow
 * Flow Variant: 74 Data flow: data passed in a HashMap from one method to another in different source files in the same package
 *
 * */

package testcases.CWE190_Integer_Overflow.s06;

import testcasesupport.*;

import java.util.HashMap;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__short_max_postinc_74b {
    public void badSink(HashMap<Integer, Short> dataHashMap) throws Throwable {
        short data = dataHashMap.get(2);

        /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
        data++;
        short result = (short) (data);

        IO.writeLine("result: " + result);

    }

    /* goodG2B() - use GoodSource and BadSink */
    public void goodG2BSink(HashMap<Integer, Short> dataHashMap) throws Throwable {
        short data = dataHashMap.get(2);

        /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
        data++;
        short result = (short) (data);

        IO.writeLine("result: " + result);

    }

    /* goodB2G() - use BadSource and GoodSink */
    public void goodB2GSink(HashMap<Integer, Short> dataHashMap) throws Throwable {
        short data = dataHashMap.get(2);

        /* FIX: Add a check to prevent an overflow from occurring */
        if (data < Short.MAX_VALUE) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }

    }
}
