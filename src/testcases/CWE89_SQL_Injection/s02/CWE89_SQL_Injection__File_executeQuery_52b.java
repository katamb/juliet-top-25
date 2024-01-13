/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE89_SQL_Injection__File_executeQuery_52b.java
Label Definition File: CWE89_SQL_Injection.label.xml
Template File: sources-sinks-52b.tmpl.java
*/
/*
 * @description
 * CWE: 89 SQL Injection
 * BadSource: File Read data from file (named c:\data.txt)
 * GoodSource: A hardcoded string
 * Sinks: executeQuery
 *    GoodSink: Use prepared statement and executeQuery (properly)
 *    BadSink : data concatenated into SQL statement used in executeQuery(), which could result in SQL Injection
 * Flow Variant: 52 Data flow: data passed as an argument from one method to another to another in three different classes in the same package
 *
 * */

package testcases.CWE89_SQL_Injection.s02;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE89_SQL_Injection__File_executeQuery_52b {
    public void badSink(String data) throws Throwable {
        (new CWE89_SQL_Injection__File_executeQuery_52c()).badSink(data);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data) throws Throwable {
        (new CWE89_SQL_Injection__File_executeQuery_52c()).goodG2BSink(data);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(String data) throws Throwable {
        (new CWE89_SQL_Injection__File_executeQuery_52c()).goodB2GSink(data);
    }
}
