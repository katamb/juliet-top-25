/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_write_no_check_54b.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-54b.tmpl.java
*/
/*
 * @description
 * CWE: 129 Improper Validation of Array Index
 * BadSource: negative_fixed Set data to a negative value
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: array_write_no_check
 *    GoodSink: Write to array after verifying index
 *    BadSink : Write to array without any verification of index
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package testcases.CWE129_Improper_Validation_of_Array_Index.s04;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_write_no_check_54b {
    public void badSink(int data) throws Throwable {
        (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_write_no_check_54c()).badSink(data);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data) throws Throwable {
        (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_write_no_check_54c()).goodG2BSink(data);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data) throws Throwable {
        (new CWE129_Improper_Validation_of_Array_Index__negative_fixed_array_write_no_check_54c()).goodB2GSink(data);
    }
}
