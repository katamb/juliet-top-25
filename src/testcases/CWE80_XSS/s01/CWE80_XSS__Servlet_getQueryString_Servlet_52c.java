/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__Servlet_getQueryString_Servlet_52c.java
Label Definition File: CWE80_XSS__Servlet.label.xml
Template File: sources-sink-52c.tmpl.java
*/
/*
 * @description
 * CWE: 80 Cross Site Scripting (XSS)
 * BadSource: getQueryString_Servlet Parse id param out of the URL query string (without using getParameter())
 * GoodSource: A hardcoded string
 * Sinks:
 *    BadSink : Display of data in web page without any encoding or validation
 * Flow Variant: 52 Data flow: data passed as an argument from one method to another to another in three different classes in the same package
 *
 * */

package testcases.CWE80_XSS.s01;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE80_XSS__Servlet_getQueryString_Servlet_52c {
    public void badSink(String data, HttpServletRequest request, HttpServletResponse response) throws Throwable {

        if (data != null) {
            /* POTENTIAL FLAW: Display of data in web page without any encoding or validation */
            response.getWriter().println("<br>bad(): data = " + data);
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data, HttpServletRequest request, HttpServletResponse response) throws Throwable {

        if (data != null) {
            /* POTENTIAL FLAW: Display of data in web page without any encoding or validation */
            response.getWriter().println("<br>bad(): data = " + data);
        }

    }
}
