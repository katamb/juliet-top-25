package testcases.CWE89_SQL_Injection.s02;

import testcasesupport.*;

public class Main {

    public static void main(String[] args) {

        if (args.length != 0) {

            if (args[0].equals("-h") || args[0].equals("--help")) {

                System.err.println("To use this main, you can either run the program with no " +
                        "command line arguments to run all test cases or you can specify one or more classes to test");
                System.err.println("For example:");
                System.err.println("java testcasesupport.Main testcases.CWE690_Unchecked_Return_Value_to_NULL_Pointer_Dereference.custom_function.CWE690_Unchecked_Return_Value_to_NULL_Pointer_Dereference__custom_function_01 testcases.CWE481_Assigning_instead_of_Comparing.bool.CWE481_Assigning_instead_of_Comparing__bool_01");
                System.exit(1);
            }

            /* User supplied some class names on the command line, just use those with introspection
             *
             * String classNames[] = { "CWE481_Assigning_instead_of_Comparing__boolean_01",
             *		"CWE476_Null_Pointer_Dereference__getProperty_01" };
             * could read class names from command line or use
             * http://sadun-util.sourceforge.net/api/org/sadun/util/
             * ClassPackageExplorer.html
             */

            for (String className : args) {

                try {

                    /* String classNameWithPackage = "testcases." + className; */

                    /* IO.writeLine("classNameWithPackage = " + classNameWithPackage); */

                    Class<?> myClass = Class.forName(className);

                    AbstractTestCase myObject = (AbstractTestCase) myClass
                            .newInstance();

                    myObject.runTest(className);

                } catch (Exception ex) {

                    IO.writeLine("Could not run test for class " + className);
                    ex.printStackTrace();

                }

                IO.writeLine(""); /* leave a blank line between classes */

            }

        } else {

            /* No command line args were used, we want to run every testcase */
			
			/* needed to separate these calls into other methods because
			   we were running into the size limit Java has for a single method */
            runTestCWE1();
            runTestCWE2();
            runTestCWE3();
            runTestCWE4();
            runTestCWE5();
            runTestCWE6();
            runTestCWE7();
            runTestCWE8();
            runTestCWE9();
        }
    }

    private static void runTestCWE1() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-1 */

        /* END-AUTOGENERATED-JAVA-TESTS-1 */
    }

    private static void runTestCWE2() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-2 */

        /* END-AUTOGENERATED-JAVA-TESTS-2 */
    }

    private static void runTestCWE3() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-3 */

        /* END-AUTOGENERATED-JAVA-TESTS-3 */
    }

    private static void runTestCWE4() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-4 */

        /* END-AUTOGENERATED-JAVA-TESTS-4 */
    }

    private static void runTestCWE5() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-5 */

        /* END-AUTOGENERATED-JAVA-TESTS-5 */
    }

    private static void runTestCWE6() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-6 */

        /* END-AUTOGENERATED-JAVA-TESTS-6 */
    }

    private static void runTestCWE7() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-7 */

        /* END-AUTOGENERATED-JAVA-TESTS-7 */
    }

    private static void runTestCWE8() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-8 */
        (new testcases.CWE89_SQL_Injection.s02.J1609()).runTest("CWE89_SQL_Injection__Environment_execute_01");
        (new testcases.CWE89_SQL_Injection.s02.J1608()).runTest("CWE89_SQL_Injection__Environment_execute_01");
        (new testcases.CWE89_SQL_Injection.s02.J1607()).runTest("CWE89_SQL_Injection__Environment_executeUpdate_01");
        (new testcases.CWE89_SQL_Injection.s02.J1606()).runTest("CWE89_SQL_Injection__Environment_executeUpdate_01");
        (new testcases.CWE89_SQL_Injection.s02.J1605()).runTest("CWE89_SQL_Injection__Environment_executeQuery_01");
        (new testcases.CWE89_SQL_Injection.s02.J1604()).runTest("CWE89_SQL_Injection__Environment_executeQuery_01");
        (new testcases.CWE89_SQL_Injection.s02.J1613()).runTest("CWE89_SQL_Injection__File_executeBatch_01");
        (new testcases.CWE89_SQL_Injection.s02.J1612()).runTest("CWE89_SQL_Injection__File_executeBatch_01");
        (new testcases.CWE89_SQL_Injection.s02.J1621()).runTest("CWE89_SQL_Injection__File_prepareStatement_01");
        (new testcases.CWE89_SQL_Injection.s02.J1620()).runTest("CWE89_SQL_Injection__File_prepareStatement_01");
        (new testcases.CWE89_SQL_Injection.s02.J1617()).runTest("CWE89_SQL_Injection__File_executeUpdate_01");
        (new testcases.CWE89_SQL_Injection.s02.J1616()).runTest("CWE89_SQL_Injection__File_executeUpdate_01");
        (new testcases.CWE89_SQL_Injection.s02.J1615()).runTest("CWE89_SQL_Injection__File_executeQuery_01");
        (new testcases.CWE89_SQL_Injection.s02.J1614()).runTest("CWE89_SQL_Injection__File_executeQuery_01");
        (new testcases.CWE89_SQL_Injection.s02.J1619()).runTest("CWE89_SQL_Injection__File_execute_01");
        (new testcases.CWE89_SQL_Injection.s02.J1618()).runTest("CWE89_SQL_Injection__File_execute_01");
        (new testcases.CWE89_SQL_Injection.s02.J1611()).runTest("CWE89_SQL_Injection__Environment_prepareStatement_01");
        (new testcases.CWE89_SQL_Injection.s02.J1610()).runTest("CWE89_SQL_Injection__Environment_prepareStatement_01");
        /* END-AUTOGENERATED-JAVA-TESTS-8 */
    }

    private static void runTestCWE9() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-9 */

        /* END-AUTOGENERATED-JAVA-TESTS-9 */
    }
}
