/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__int_console_readLine_square_81_base.java
Label Definition File: CWE190_Integer_Overflow__int.label.xml
Template File: sources-sinks-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: console_readLine Read data from the console using readLine
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: square
 *    GoodSink: Ensure there will not be an overflow before squaring data
 *    BadSink : Square data, which can lead to overflow
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package testcases.CWE190_Integer_Overflow.s01;

import testcasesupport.*;

import javax.servlet.http.*;

public abstract class CWE190_Integer_Overflow__int_console_readLine_square_81_base {
    public abstract void action(int data) throws Throwable;
}
