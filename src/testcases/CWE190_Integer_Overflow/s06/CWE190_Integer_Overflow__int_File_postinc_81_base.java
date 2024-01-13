/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__int_File_postinc_81_base.java
Label Definition File: CWE190_Integer_Overflow__int.label.xml
Template File: sources-sinks-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: File Read data from file (named c:\data.txt)
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: increment
 *    GoodSink: Ensure there will not be an overflow before incrementing data
 *    BadSink : Increment data, which can cause an overflow
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package testcases.CWE190_Integer_Overflow.s06;

import testcasesupport.*;

import javax.servlet.http.*;

public abstract class CWE190_Integer_Overflow__int_File_postinc_81_base {
    public abstract void action(int data) throws Throwable;
}
