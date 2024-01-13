/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE476_NULL_Pointer_Dereference__String_54d.java
Label Definition File: CWE476_NULL_Pointer_Dereference.label.xml
Template File: sources-sinks-54d.tmpl.java
*/
/*
 * @description
 * CWE: 476 Null Pointer Dereference
 * BadSource:  Set data to null
 * GoodSource: Set data to a non-null value
 * Sinks:
 *    GoodSink: add check to prevent possibility of null dereference
 *    BadSink : possibility of null dereference
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package testcases.CWE476_NULL_Pointer_Dereference;

import testcasesupport.*;

public class CWE476_NULL_Pointer_Dereference__String_54d {
    public void badSink(String data) throws Throwable {
        (new CWE476_NULL_Pointer_Dereference__String_54e()).badSink(data);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data) throws Throwable {
        (new CWE476_NULL_Pointer_Dereference__String_54e()).goodG2BSink(data);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(String data) throws Throwable {
        (new CWE476_NULL_Pointer_Dereference__String_54e()).goodB2GSink(data);
    }
}
