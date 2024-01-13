package testcases.CWE190_Integer_Overflow.s05;

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
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_53a()).runTest("CWE190_Integer_Overflow__short_rand_add_53a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_08()).runTest("CWE190_Integer_Overflow__short_rand_square_08");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_07()).runTest("CWE190_Integer_Overflow__short_rand_square_07");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_41()).runTest("CWE190_Integer_Overflow__short_rand_add_41");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_67a()).runTest("CWE190_Integer_Overflow__short_rand_add_67a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_75a()).runTest("CWE190_Integer_Overflow__short_max_square_75a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_68a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_68a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_68a()).runTest("CWE190_Integer_Overflow__short_max_multiply_68a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_71a()).runTest("CWE190_Integer_Overflow__short_max_square_71a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_67a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_67a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_22a()).runTest("CWE190_Integer_Overflow__short_max_square_22a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_13()).runTest("CWE190_Integer_Overflow__short_rand_square_13");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_73a()).runTest("CWE190_Integer_Overflow__short_max_multiply_73a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_52a()).runTest("CWE190_Integer_Overflow__short_rand_square_52a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_03()).runTest("CWE190_Integer_Overflow__short_rand_multiply_03");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_09()).runTest("CWE190_Integer_Overflow__short_rand_square_09");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_17()).runTest("CWE190_Integer_Overflow__short_max_multiply_17");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_61a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_61a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_10()).runTest("CWE190_Integer_Overflow__short_rand_add_10");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_61a()).runTest("CWE190_Integer_Overflow__short_max_multiply_61a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_31()).runTest("CWE190_Integer_Overflow__short_rand_add_31");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_52a()).runTest("CWE190_Integer_Overflow__short_max_multiply_52a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_01()).runTest("CWE190_Integer_Overflow__short_max_square_01");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_68a()).runTest("CWE190_Integer_Overflow__short_max_square_68a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_02()).runTest("CWE190_Integer_Overflow__short_rand_add_02");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_42()).runTest("CWE190_Integer_Overflow__short_max_multiply_42");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_11()).runTest("CWE190_Integer_Overflow__short_rand_add_11");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_06()).runTest("CWE190_Integer_Overflow__short_rand_square_06");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_10()).runTest("CWE190_Integer_Overflow__short_rand_multiply_10");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_15()).runTest("CWE190_Integer_Overflow__short_rand_square_15");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_66a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_66a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_54a()).runTest("CWE190_Integer_Overflow__short_max_square_54a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_73a()).runTest("CWE190_Integer_Overflow__short_rand_square_73a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_03()).runTest("CWE190_Integer_Overflow__short_max_square_03");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_61a()).runTest("CWE190_Integer_Overflow__short_max_square_61a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_04()).runTest("CWE190_Integer_Overflow__short_rand_add_04");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_13()).runTest("CWE190_Integer_Overflow__short_rand_multiply_13");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_05()).runTest("CWE190_Integer_Overflow__short_rand_add_05");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_06()).runTest("CWE190_Integer_Overflow__short_max_square_06");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_72a()).runTest("CWE190_Integer_Overflow__short_max_multiply_72a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_66a()).runTest("CWE190_Integer_Overflow__short_rand_square_66a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_53a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_53a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_67a()).runTest("CWE190_Integer_Overflow__short_max_square_67a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_31()).runTest("CWE190_Integer_Overflow__short_max_square_31");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_01()).runTest("CWE190_Integer_Overflow__short_rand_square_01");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_05()).runTest("CWE190_Integer_Overflow__short_rand_multiply_05");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_42()).runTest("CWE190_Integer_Overflow__short_rand_square_42");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_21()).runTest("CWE190_Integer_Overflow__short_rand_square_21");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_71a()).runTest("CWE190_Integer_Overflow__short_rand_square_71a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_51a()).runTest("CWE190_Integer_Overflow__short_max_square_51a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_74a()).runTest("CWE190_Integer_Overflow__short_max_square_74a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_04()).runTest("CWE190_Integer_Overflow__short_max_square_04");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_16()).runTest("CWE190_Integer_Overflow__short_rand_square_16");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_41()).runTest("CWE190_Integer_Overflow__short_max_square_41");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_05()).runTest("CWE190_Integer_Overflow__short_max_square_05");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_02()).runTest("CWE190_Integer_Overflow__short_rand_multiply_02");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_66a()).runTest("CWE190_Integer_Overflow__short_max_multiply_66a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_16()).runTest("CWE190_Integer_Overflow__short_rand_add_16");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_42()).runTest("CWE190_Integer_Overflow__short_rand_add_42");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_10()).runTest("CWE190_Integer_Overflow__short_rand_square_10");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_11()).runTest("CWE190_Integer_Overflow__short_rand_multiply_11");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_21()).runTest("CWE190_Integer_Overflow__short_max_square_21");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_72a()).runTest("CWE190_Integer_Overflow__short_max_square_72a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_45()).runTest("CWE190_Integer_Overflow__short_rand_add_45");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_21()).runTest("CWE190_Integer_Overflow__short_rand_multiply_21");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_08()).runTest("CWE190_Integer_Overflow__short_max_multiply_08");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_08()).runTest("CWE190_Integer_Overflow__short_rand_add_08");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_10()).runTest("CWE190_Integer_Overflow__short_max_multiply_10");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_81a()).runTest("CWE190_Integer_Overflow__short_max_multiply_81a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_51a()).runTest("CWE190_Integer_Overflow__short_rand_add_51a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_15()).runTest("CWE190_Integer_Overflow__short_rand_add_15");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_54a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_54a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_42()).runTest("CWE190_Integer_Overflow__short_rand_multiply_42");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_74a()).runTest("CWE190_Integer_Overflow__short_rand_add_74a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_07()).runTest("CWE190_Integer_Overflow__short_rand_add_07");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_22a()).runTest("CWE190_Integer_Overflow__short_max_multiply_22a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_41()).runTest("CWE190_Integer_Overflow__short_rand_multiply_41");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_45()).runTest("CWE190_Integer_Overflow__short_rand_square_45");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_12()).runTest("CWE190_Integer_Overflow__short_max_square_12");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_17()).runTest("CWE190_Integer_Overflow__short_max_square_17");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_71a()).runTest("CWE190_Integer_Overflow__short_rand_add_71a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_15()).runTest("CWE190_Integer_Overflow__short_rand_multiply_15");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_81a()).runTest("CWE190_Integer_Overflow__short_max_square_81a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_21()).runTest("CWE190_Integer_Overflow__short_rand_add_21");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_11()).runTest("CWE190_Integer_Overflow__short_max_square_11");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_75a()).runTest("CWE190_Integer_Overflow__short_rand_square_75a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_75a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_75a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_09()).runTest("CWE190_Integer_Overflow__short_rand_add_09");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_04()).runTest("CWE190_Integer_Overflow__short_max_multiply_04");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_14()).runTest("CWE190_Integer_Overflow__short_rand_square_14");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_41()).runTest("CWE190_Integer_Overflow__short_max_multiply_41");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_12()).runTest("CWE190_Integer_Overflow__short_max_multiply_12");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_01()).runTest("CWE190_Integer_Overflow__short_rand_multiply_01");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_68a()).runTest("CWE190_Integer_Overflow__short_rand_add_68a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_51a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_51a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_61a()).runTest("CWE190_Integer_Overflow__short_rand_square_61a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_01()).runTest("CWE190_Integer_Overflow__short_rand_add_01");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_14()).runTest("CWE190_Integer_Overflow__short_max_square_14");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_41()).runTest("CWE190_Integer_Overflow__short_rand_square_41");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_61a()).runTest("CWE190_Integer_Overflow__short_rand_add_61a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_13()).runTest("CWE190_Integer_Overflow__short_max_square_13");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_73a()).runTest("CWE190_Integer_Overflow__short_rand_add_73a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_17()).runTest("CWE190_Integer_Overflow__short_rand_multiply_17");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_14()).runTest("CWE190_Integer_Overflow__short_rand_multiply_14");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_15()).runTest("CWE190_Integer_Overflow__short_max_square_15");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_81a()).runTest("CWE190_Integer_Overflow__short_rand_add_81a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_08()).runTest("CWE190_Integer_Overflow__short_max_square_08");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_12()).runTest("CWE190_Integer_Overflow__short_rand_multiply_12");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_45()).runTest("CWE190_Integer_Overflow__short_max_multiply_45");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_66a()).runTest("CWE190_Integer_Overflow__short_max_square_66a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_05()).runTest("CWE190_Integer_Overflow__short_rand_square_05");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_16()).runTest("CWE190_Integer_Overflow__short_max_multiply_16");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_12()).runTest("CWE190_Integer_Overflow__short_rand_add_12");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_16()).runTest("CWE190_Integer_Overflow__short_max_square_16");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_52a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_52a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_11()).runTest("CWE190_Integer_Overflow__short_rand_square_11");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_71a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_71a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_03()).runTest("CWE190_Integer_Overflow__short_max_multiply_03");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_68a()).runTest("CWE190_Integer_Overflow__short_rand_square_68a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_04()).runTest("CWE190_Integer_Overflow__short_rand_square_04");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_42()).runTest("CWE190_Integer_Overflow__short_max_square_42");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_67a()).runTest("CWE190_Integer_Overflow__short_max_multiply_67a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_53a()).runTest("CWE190_Integer_Overflow__short_rand_square_53a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_09()).runTest("CWE190_Integer_Overflow__short_rand_multiply_09");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_06()).runTest("CWE190_Integer_Overflow__short_rand_multiply_06");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_53a()).runTest("CWE190_Integer_Overflow__short_max_square_53a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_81a()).runTest("CWE190_Integer_Overflow__short_rand_square_81a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_04()).runTest("CWE190_Integer_Overflow__short_rand_multiply_04");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_74a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_74a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_06()).runTest("CWE190_Integer_Overflow__short_max_multiply_06");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_31()).runTest("CWE190_Integer_Overflow__short_max_multiply_31");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_10()).runTest("CWE190_Integer_Overflow__short_max_square_10");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_14()).runTest("CWE190_Integer_Overflow__short_max_multiply_14");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_06()).runTest("CWE190_Integer_Overflow__short_rand_add_06");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_71a()).runTest("CWE190_Integer_Overflow__short_max_multiply_71a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_03()).runTest("CWE190_Integer_Overflow__short_rand_add_03");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_17()).runTest("CWE190_Integer_Overflow__short_rand_square_17");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_75a()).runTest("CWE190_Integer_Overflow__short_rand_add_75a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_31()).runTest("CWE190_Integer_Overflow__short_rand_square_31");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_81a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_81a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_22a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_22a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_51a()).runTest("CWE190_Integer_Overflow__short_max_multiply_51a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_08()).runTest("CWE190_Integer_Overflow__short_rand_multiply_08");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_14()).runTest("CWE190_Integer_Overflow__short_rand_add_14");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_17()).runTest("CWE190_Integer_Overflow__short_rand_add_17");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_07()).runTest("CWE190_Integer_Overflow__short_max_multiply_07");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_53a()).runTest("CWE190_Integer_Overflow__short_max_multiply_53a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_45()).runTest("CWE190_Integer_Overflow__short_rand_multiply_45");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_21()).runTest("CWE190_Integer_Overflow__short_max_multiply_21");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_13()).runTest("CWE190_Integer_Overflow__short_rand_add_13");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_16()).runTest("CWE190_Integer_Overflow__short_rand_multiply_16");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_74a()).runTest("CWE190_Integer_Overflow__short_max_multiply_74a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_52a()).runTest("CWE190_Integer_Overflow__short_max_square_52a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_75a()).runTest("CWE190_Integer_Overflow__short_max_multiply_75a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_11()).runTest("CWE190_Integer_Overflow__short_max_multiply_11");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_15()).runTest("CWE190_Integer_Overflow__short_max_multiply_15");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_73a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_73a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_02()).runTest("CWE190_Integer_Overflow__short_max_square_02");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_05()).runTest("CWE190_Integer_Overflow__short_max_multiply_05");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_74a()).runTest("CWE190_Integer_Overflow__short_rand_square_74a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_22a()).runTest("CWE190_Integer_Overflow__short_rand_add_22a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_72a()).runTest("CWE190_Integer_Overflow__short_rand_square_72a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_09()).runTest("CWE190_Integer_Overflow__short_max_square_09");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_72a()).runTest("CWE190_Integer_Overflow__short_rand_add_72a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_54a()).runTest("CWE190_Integer_Overflow__short_rand_square_54a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_02()).runTest("CWE190_Integer_Overflow__short_rand_square_02");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_45()).runTest("CWE190_Integer_Overflow__short_max_square_45");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_54a()).runTest("CWE190_Integer_Overflow__short_rand_add_54a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_07()).runTest("CWE190_Integer_Overflow__short_rand_multiply_07");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_07()).runTest("CWE190_Integer_Overflow__short_max_square_07");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_13()).runTest("CWE190_Integer_Overflow__short_max_multiply_13");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_31()).runTest("CWE190_Integer_Overflow__short_rand_multiply_31");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_52a()).runTest("CWE190_Integer_Overflow__short_rand_add_52a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_multiply_72a()).runTest("CWE190_Integer_Overflow__short_rand_multiply_72a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_add_66a()).runTest("CWE190_Integer_Overflow__short_rand_add_66a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_12()).runTest("CWE190_Integer_Overflow__short_rand_square_12");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_square_73a()).runTest("CWE190_Integer_Overflow__short_max_square_73a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_22a()).runTest("CWE190_Integer_Overflow__short_rand_square_22a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_54a()).runTest("CWE190_Integer_Overflow__short_max_multiply_54a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_51a()).runTest("CWE190_Integer_Overflow__short_rand_square_51a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_03()).runTest("CWE190_Integer_Overflow__short_rand_square_03");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_rand_square_67a()).runTest("CWE190_Integer_Overflow__short_rand_square_67a");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_02()).runTest("CWE190_Integer_Overflow__short_max_multiply_02");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_01()).runTest("CWE190_Integer_Overflow__short_max_multiply_01");
        (new testcases.CWE190_Integer_Overflow.s05.CWE190_Integer_Overflow__short_max_multiply_09()).runTest("CWE190_Integer_Overflow__short_max_multiply_09");
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

        /* END-AUTOGENERATED-JAVA-TESTS-8 */
    }

    private static void runTestCWE9() {
        /* BEGIN-AUTOGENERATED-JAVA-TESTS-9 */

        /* END-AUTOGENERATED-JAVA-TESTS-9 */
    }
}