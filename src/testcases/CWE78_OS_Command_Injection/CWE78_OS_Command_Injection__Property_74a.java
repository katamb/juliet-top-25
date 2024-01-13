/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE78_OS_Command_Injection__Property_74a.java
Label Definition File: CWE78_OS_Command_Injection.label.xml
Template File: sources-sink-74a.tmpl.java
*/
/*
 * @description
 * CWE: 78 OS Command Injection
 * BadSource: Property Read data from a system property
 * GoodSource: A hardcoded string
 * Sinks: exec
 *    BadSink : dynamic command execution with Runtime.getRuntime().exec()
 * Flow Variant: 74 Data flow: data passed in a HashMap from one method to another in different source files in the same package
 *
 * */

package testcases.CWE78_OS_Command_Injection;

import testcasesupport.*;

import java.util.HashMap;

import javax.servlet.http.*;

public class CWE78_OS_Command_Injection__Property_74a extends AbstractTestCase {
    public void bad() throws Throwable {
        String data;

        /* get system property user.home */
        /* POTENTIAL FLAW: Read data from a system property */
        data = System.getProperty("user.home");

        HashMap<Integer, String> dataHashMap = new HashMap<Integer, String>();
        dataHashMap.put(0, data);
        dataHashMap.put(1, data);
        dataHashMap.put(2, data);
        (new CWE78_OS_Command_Injection__Property_74b()).badSink(dataHashMap);
    }

    public void good() throws Throwable {
        goodG2B();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable {
        String data;

        /* FIX: Use a hardcoded string */
        data = "foo";

        HashMap<Integer, String> dataHashMap = new HashMap<Integer, String>();
        dataHashMap.put(0, data);
        dataHashMap.put(1, data);
        dataHashMap.put(2, data);
        (new CWE78_OS_Command_Injection__Property_74b()).goodG2BSink(dataHashMap);
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
