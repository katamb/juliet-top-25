/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_53b.java
Label Definition File: CWE190_Integer_Overflow__int.label.xml
Template File: sources-sinks-53b.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: getCookies_Servlet Read data from the first cookie using getCookies()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: increment
 *    GoodSink: Ensure there will not be an overflow before incrementing data
 *    BadSink : Increment data, which can cause an overflow
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */

package testcases.CWE190_Integer_Overflow.s06;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_53b {
    public void badSink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        (new CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_53c()).badSink(data, request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        (new CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_53c()).goodG2BSink(data, request, response);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        (new CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_53c()).goodB2GSink(data, request, response);
    }
}
