package testcases.CWE23_Relative_Path_Traversal;

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
        (new testcases.CWE23_Relative_Path_Traversal.J18631()).runTest("CWE23_Relative_Path_Traversal__PropertiesFile_04_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18630()).runTest("CWE23_Relative_Path_Traversal__PropertiesFile_04_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18737()).runTest("CWE23_Relative_Path_Traversal__URLConnection_13_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18736()).runTest("CWE23_Relative_Path_Traversal__URLConnection_13_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18749()).runTest("CWE23_Relative_Path_Traversal__URLConnection_31_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18748()).runTest("CWE23_Relative_Path_Traversal__URLConnection_31_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18273()).runTest("CWE23_Relative_Path_Traversal__console_readLine_01_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18272()).runTest("CWE23_Relative_Path_Traversal__console_readLine_01_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18703()).runTest("CWE23_Relative_Path_Traversal__Property_21_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18702()).runTest("CWE23_Relative_Path_Traversal__Property_21_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18687()).runTest("CWE23_Relative_Path_Traversal__Property_10_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18686()).runTest("CWE23_Relative_Path_Traversal__Property_10_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18585()).runTest("CWE23_Relative_Path_Traversal__listen_tcp_03_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18584()).runTest("CWE23_Relative_Path_Traversal__listen_tcp_03_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18369()).runTest("CWE23_Relative_Path_Traversal__Environment_05_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18368()).runTest("CWE23_Relative_Path_Traversal__Environment_05_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18265()).runTest("CWE23_Relative_Path_Traversal__connect_tcp_31_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18264()).runTest("CWE23_Relative_Path_Traversal__connect_tcp_31_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18235()).runTest("CWE23_Relative_Path_Traversal__connect_tcp_04_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18234()).runTest("CWE23_Relative_Path_Traversal__connect_tcp_04_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18597()).runTest("CWE23_Relative_Path_Traversal__listen_tcp_09_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18596()).runTest("CWE23_Relative_Path_Traversal__listen_tcp_09_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18671()).runTest("CWE23_Relative_Path_Traversal__Property_02_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18670()).runTest("CWE23_Relative_Path_Traversal__Property_02_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18605()).runTest("CWE23_Relative_Path_Traversal__listen_tcp_13_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18604()).runTest("CWE23_Relative_Path_Traversal__listen_tcp_13_b");
        (new testcases.CWE23_Relative_Path_Traversal.J18589()).runTest("CWE23_Relative_Path_Traversal__listen_tcp_05_gd");
        (new testcases.CWE23_Relative_Path_Traversal.J18588()).runTest("CWE23_Relative_Path_Traversal__listen_tcp_05_b");
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

        /* END-AUTOGENERATED-JAVA-TESTS-8 */
    }

    private static void runTestCWE9() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-9 */

        /* END-AUTOGENERATED-JAVA-TESTS-9 */
    }
}
