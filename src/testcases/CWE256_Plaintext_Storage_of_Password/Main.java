package testcases.CWE256_Plaintext_Storage_of_Password;

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
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18761()).runTest("CWE256_Plaintext_Storage_of_Password__basic_03_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18760()).runTest("CWE256_Plaintext_Storage_of_Password__basic_03_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18775()).runTest("CWE256_Plaintext_Storage_of_Password__basic_10_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18774()).runTest("CWE256_Plaintext_Storage_of_Password__basic_10_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18773()).runTest("CWE256_Plaintext_Storage_of_Password__basic_09_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18772()).runTest("CWE256_Plaintext_Storage_of_Password__basic_09_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18759()).runTest("CWE256_Plaintext_Storage_of_Password__basic_02_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18758()).runTest("CWE256_Plaintext_Storage_of_Password__basic_02_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18767()).runTest("CWE256_Plaintext_Storage_of_Password__basic_06_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18766()).runTest("CWE256_Plaintext_Storage_of_Password__basic_06_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18791()).runTest("CWE256_Plaintext_Storage_of_Password__basic_21_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18790()).runTest("CWE256_Plaintext_Storage_of_Password__basic_21_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18783()).runTest("CWE256_Plaintext_Storage_of_Password__basic_14_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18782()).runTest("CWE256_Plaintext_Storage_of_Password__basic_14_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18797()).runTest("CWE256_Plaintext_Storage_of_Password__basic_42_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18796()).runTest("CWE256_Plaintext_Storage_of_Password__basic_42_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18781()).runTest("CWE256_Plaintext_Storage_of_Password__basic_13_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18780()).runTest("CWE256_Plaintext_Storage_of_Password__basic_13_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18795()).runTest("CWE256_Plaintext_Storage_of_Password__basic_41_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18794()).runTest("CWE256_Plaintext_Storage_of_Password__basic_41_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18793()).runTest("CWE256_Plaintext_Storage_of_Password__basic_31_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18792()).runTest("CWE256_Plaintext_Storage_of_Password__basic_31_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18789()).runTest("CWE256_Plaintext_Storage_of_Password__basic_17_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18788()).runTest("CWE256_Plaintext_Storage_of_Password__basic_17_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18757()).runTest("CWE256_Plaintext_Storage_of_Password__basic_01_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18756()).runTest("CWE256_Plaintext_Storage_of_Password__basic_01_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18785()).runTest("CWE256_Plaintext_Storage_of_Password__basic_15_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18784()).runTest("CWE256_Plaintext_Storage_of_Password__basic_15_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18799()).runTest("CWE256_Plaintext_Storage_of_Password__basic_45_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18798()).runTest("CWE256_Plaintext_Storage_of_Password__basic_45_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18771()).runTest("CWE256_Plaintext_Storage_of_Password__basic_08_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18770()).runTest("CWE256_Plaintext_Storage_of_Password__basic_08_b");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18765()).runTest("CWE256_Plaintext_Storage_of_Password__basic_05_gd");
        (new testcases.CWE256_Plaintext_Storage_of_Password.J18764()).runTest("CWE256_Plaintext_Storage_of_Password__basic_05_b");
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
