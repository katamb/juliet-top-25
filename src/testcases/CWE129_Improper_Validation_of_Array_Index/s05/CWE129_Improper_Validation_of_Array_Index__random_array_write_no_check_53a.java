/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__random_array_write_no_check_53a.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-53a.tmpl.java
*/
/*
 * @description
 * CWE: 129 Improper Validation of Array Index
 * BadSource: random Set data to a random value
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: array_write_no_check
 *    GoodSink: Write to array after verifying index
 *    BadSink : Write to array without any verification of index
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */

package testcases.CWE129_Improper_Validation_of_Array_Index.s05;

import testcasesupport.*;

import javax.servlet.http.*;

import java.security.SecureRandom;

public class CWE129_Improper_Validation_of_Array_Index__random_array_write_no_check_53a extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;

        /* POTENTIAL FLAW: Set data to a random value */
        data = (new SecureRandom()).nextInt();

        (new CWE129_Improper_Validation_of_Array_Index__random_array_write_no_check_53b()).badSink(data);
    }

    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable {
        int data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        (new CWE129_Improper_Validation_of_Array_Index__random_array_write_no_check_53b()).goodG2BSink(data);
    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable {
        int data;

        /* POTENTIAL FLAW: Set data to a random value */
        data = (new SecureRandom()).nextInt();

        (new CWE129_Improper_Validation_of_Array_Index__random_array_write_no_check_53b()).goodB2GSink(data);
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
