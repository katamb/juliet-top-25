package testcases.CWE190_Integer_Overflow.s06;

import javax.servlet.http.*;

public class ServletMain extends HttpServlet {

    private static final long serialVersionUID = 1L; /* needed since Servlets are serializable */


    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        doGetCWE1(request, response);
        doGetCWE2(request, response);
        doGetCWE3(request, response);
        doGetCWE4(request, response);
        doGetCWE5(request, response);
        doGetCWE6(request, response);
        doGetCWE7(request, response);
        doGetCWE8(request, response);
        doGetCWE9(request, response);
    }

    private static void doGetCWE1(HttpServletRequest request, HttpServletResponse response) {
        try {
            /* BEGIN-AUTOGENERATED-SERVLET-TESTS-1 */
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_21_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_21_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_17_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_17_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_08_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_08_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_45_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_45_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_04_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_04_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_03_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_03_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_14_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_14_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_08_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_08_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_10_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_10_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_31_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_31_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_08_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_08_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_21_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_21_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_45_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_45_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_04_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_04_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_45_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_45_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_13_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_13_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_01_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_01_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_41_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_41_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_09_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_09_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_14_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_14_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_01_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_01_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_14_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_14_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_17_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_17_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_11_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_11_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_41_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_41_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_15_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_15_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_10_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_10_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_10_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_10_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_07_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_07_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_01_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_01_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_12_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_12_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_05_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_05_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_31_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_31_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_11_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_11_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_02_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_02_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_15_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_15_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_02_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_02_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_06_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_06_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_31_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_31_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_16_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_16_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_15_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_15_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_09_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_09_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_13_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_13_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_12_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_12_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_02_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_02_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_42_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_42_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_11_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_11_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_07_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_07_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_03_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_03_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_16_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_16_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_05_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_05_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_09_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_09_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_12_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_12_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_21_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_21_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_17_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_17_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_42_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_42_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_05_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_05_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_41_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_41_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_42_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_42_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_04_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_04_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_06_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_06_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_13_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_13_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_07_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_07_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_06_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getQueryString_Servlet_postinc_06_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_03_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_03_bad()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_16_good()).runTest(request, response);
            (new testcases.CWE190_Integer_Overflow.s06.CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_16_bad()).runTest(request, response);
            /* END-AUTOGENERATED-SERVLET-TESTS-1 */
        } catch (Throwable t) {

            /* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
             * and write to the console (since we can't write to the response without possibly throwing another exception)
             */

            System.out.println(
                    " Caught thowable from doGetCWE1 ");

            System.out.println(" Throwable's message = " + t.getMessage());

            System.out.println("Stack trace below");

            StackTraceElement stes[] = t.getStackTrace();

            for (StackTraceElement ste : stes) {
                System.out.println("  " + ste.toString());
            }
        }
    }

    private static void doGetCWE2(HttpServletRequest request, HttpServletResponse response) {
        try {
            /* BEGIN-AUTOGENERATED-SERVLET-TESTS-2 */

            /* END-AUTOGENERATED-SERVLET-TESTS-2 */
        } catch (Throwable t) {

            /* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
             * and write to the console (since we can't write to the response without possibly throwing another exception)
             */

            System.out.println(
                    " Caught thowable from doGetCWE2 ");

            System.out.println(" Throwable's message = " + t.getMessage());

            System.out.println("Stack trace below");

            StackTraceElement stes[] = t.getStackTrace();

            for (StackTraceElement ste : stes) {
                System.out.println("  " + ste.toString());
            }
        }
    }

    private static void doGetCWE3(HttpServletRequest request, HttpServletResponse response) {
        try {
            /* BEGIN-AUTOGENERATED-SERVLET-TESTS-3 */

            /* END-AUTOGENERATED-SERVLET-TESTS-3 */
        } catch (Throwable t) {

            /* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
             * and write to the console (since we can't write to the response without possibly throwing another exception)
             */

            System.out.println(
                    " Caught thowable from doGetCWE3 ");

            System.out.println(" Throwable's message = " + t.getMessage());

            System.out.println("Stack trace below");

            StackTraceElement stes[] = t.getStackTrace();

            for (StackTraceElement ste : stes) {
                System.out.println("  " + ste.toString());
            }
        }
    }

    private static void doGetCWE4(HttpServletRequest request, HttpServletResponse response) {
        try {
            /* BEGIN-AUTOGENERATED-SERVLET-TESTS-4 */

            /* END-AUTOGENERATED-SERVLET-TESTS-4 */
        } catch (Throwable t) {

            /* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
             * and write to the console (since we can't write to the response without possibly throwing another exception)
             */

            System.out.println(
                    " Caught thowable from doGetCWE4 ");

            System.out.println(" Throwable's message = " + t.getMessage());

            System.out.println("Stack trace below");

            StackTraceElement stes[] = t.getStackTrace();

            for (StackTraceElement ste : stes) {
                System.out.println("  " + ste.toString());
            }
        }
    }

    private static void doGetCWE5(HttpServletRequest request, HttpServletResponse response) {
        try {
            /* BEGIN-AUTOGENERATED-SERVLET-TESTS-5 */

            /* END-AUTOGENERATED-SERVLET-TESTS-5 */
        } catch (Throwable t) {

            /* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
             * and write to the console (since we can't write to the response without possibly throwing another exception)
             */

            System.out.println(
                    " Caught thowable from doGetCWE5 ");

            System.out.println(" Throwable's message = " + t.getMessage());

            System.out.println("Stack trace below");

            StackTraceElement stes[] = t.getStackTrace();

            for (StackTraceElement ste : stes) {

                System.out.println("  " + ste.toString());
            }
        }
    }

    private static void doGetCWE6(HttpServletRequest request, HttpServletResponse response) {
        try {
            /* BEGIN-AUTOGENERATED-SERVLET-TESTS-6 */

            /* END-AUTOGENERATED-SERVLET-TESTS-6 */
        } catch (Throwable t) {

            /* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
             * and write to the console (since we can't write to the response without possibly throwing another exception)
             */

            System.out.println(
                    " Caught thowable from doGetCWE6 ");

            System.out.println(" Throwable's message = " + t.getMessage());

            System.out.println("Stack trace below");

            StackTraceElement stes[] = t.getStackTrace();

            for (StackTraceElement ste : stes) {
                System.out.println("  " + ste.toString());
            }
        }
    }

    private static void doGetCWE7(HttpServletRequest request, HttpServletResponse response) {
        try {
            /* BEGIN-AUTOGENERATED-SERVLET-TESTS-7 */

            /* END-AUTOGENERATED-SERVLET-TESTS-7 */
        } catch (Throwable t) {

            /* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
             * and write to the console (since we can't write to the response without possibly throwing another exception)
             */

            System.out.println(
                    " Caught thowable from doGetCWE7 ");

            System.out.println(" Throwable's message = " + t.getMessage());

            System.out.println("Stack trace below");

            StackTraceElement stes[] = t.getStackTrace();

            for (StackTraceElement ste : stes) {
                System.out.println("  " + ste.toString());
            }
        }
    }

    private static void doGetCWE8(HttpServletRequest request, HttpServletResponse response) {
        try {
            /* BEGIN-AUTOGENERATED-SERVLET-TESTS-8 */

            /* END-AUTOGENERATED-SERVLET-TESTS-8 */
        } catch (Throwable t) {

            /* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
             * and write to the console (since we can't write to the response without possibly throwing another exception)
             */

            System.out.println(
                    " Caught thowable from doGetCWE8 ");

            System.out.println(" Throwable's message = " + t.getMessage());

            System.out.println("Stack trace below");

            StackTraceElement stes[] = t.getStackTrace();

            for (StackTraceElement ste : stes) {
                System.out.println("  " + ste.toString());
            }
        }
    }

    private static void doGetCWE9(HttpServletRequest request, HttpServletResponse response) {
        try {
            /* BEGIN-AUTOGENERATED-SERVLET-TESTS-9 */

            /* END-AUTOGENERATED-SERVLET-TESTS-9 */
        } catch (Throwable t) {

            /* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
             * and write to the console (since we can't write to the response without possibly throwing another exception)
             */

            System.out.println(
                    " Caught thowable from doGetCWE9 ");

            System.out.println(" Throwable's message = " + t.getMessage());

            System.out.println("Stack trace below");

            StackTraceElement stes[] = t.getStackTrace();

            for (StackTraceElement ste : stes) {
                System.out.println("  " + ste.toString());
            }
        }
    }
}

