/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_54c.java
Label Definition File: CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet.label.xml
Template File: sources-sink-54c.tmpl.java
*/
/*
 * @description
 * CWE: 566 Authorization Bypass through SQL primary
 * BadSource:  user id taken from url parameter
 * GoodSource: hardcoded user id
 * Sinks: writeConsole
 *    BadSink : user authorization not checked
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package testcases.CWE566_Authorization_Bypass_Through_SQL_Primary;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_54c {
    public void badSink(String data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        (new CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_54d()).badSink(data, request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        (new CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_54d()).goodG2BSink(data, request, response);
    }
}
