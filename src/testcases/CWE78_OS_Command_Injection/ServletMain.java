package testcases.CWE78_OS_Command_Injection;

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
            (new testcases.CWE78_OS_Command_Injection.J20755()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20754()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20717()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20716()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20713()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20712()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20659()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20658()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20751()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20750()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20707()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20706()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20703()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20702()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20701()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20700()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20665()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20664()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20711()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20710()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20759()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20758()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20697()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20696()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20739()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20738()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20667()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20666()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20749()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20748()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20725()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20724()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20649()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20648()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20661()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20660()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20757()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20756()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20719()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20718()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20685()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20684()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20681()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20680()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20767()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20766()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20689()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20688()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20733()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20732()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20747()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20746()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20709()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20708()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20645()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20644()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20731()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20730()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20695()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20694()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20671()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20670()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20647()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20646()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20651()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20650()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20727()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20726()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20705()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20704()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20761()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20760()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20679()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20678()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20663()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20662()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20657()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20656()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20735()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20734()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20743()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20742()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20729()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20728()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20721()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20720()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20643()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20642()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20675()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20674()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20691()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20690()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20745()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20744()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20771()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20770()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20693()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20692()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20653()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20652()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20773()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20772()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20687()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20686()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20683()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20682()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20655()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20654()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20673()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20672()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20723()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20722()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20715()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20714()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20753()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20752()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20741()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20740()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20765()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20764()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20699()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20698()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20677()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20676()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20769()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20768()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20669()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20668()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20763()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20762()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20737()).runTest(request, response);
            (new testcases.CWE78_OS_Command_Injection.J20736()).runTest(request, response);
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

