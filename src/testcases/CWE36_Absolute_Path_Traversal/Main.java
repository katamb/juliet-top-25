package testcases.CWE36_Absolute_Path_Traversal;

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
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_10()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_10");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_08()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_08");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_12()).runTest("CWE36_Absolute_Path_Traversal__database_12");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_09()).runTest("CWE36_Absolute_Path_Traversal__database_09");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_16()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_16");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_42()).runTest("CWE36_Absolute_Path_Traversal__Environment_42");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_01()).runTest("CWE36_Absolute_Path_Traversal__File_01");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_15()).runTest("CWE36_Absolute_Path_Traversal__database_15");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_01()).runTest("CWE36_Absolute_Path_Traversal__database_01");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_02()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_02");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_41()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_41");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_04()).runTest("CWE36_Absolute_Path_Traversal__Property_04");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_01()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_01");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_15()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_15");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_09()).runTest("CWE36_Absolute_Path_Traversal__Property_09");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_41()).runTest("CWE36_Absolute_Path_Traversal__Environment_41");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_21()).runTest("CWE36_Absolute_Path_Traversal__database_21");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_01()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_01");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_01()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_01");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_41()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_41");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_08()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_08");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_10()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_10");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_12()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_12");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_01()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_01");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_17()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_17");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_11()).runTest("CWE36_Absolute_Path_Traversal__File_11");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_41()).runTest("CWE36_Absolute_Path_Traversal__database_41");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_02()).runTest("CWE36_Absolute_Path_Traversal__Environment_02");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_16()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_16");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_04()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_04");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_15()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_15");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_11()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_11");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_21()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_21");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_13()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_13");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_05()).runTest("CWE36_Absolute_Path_Traversal__database_05");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_07()).runTest("CWE36_Absolute_Path_Traversal__File_07");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_16()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_16");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_15()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_15");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_17()).runTest("CWE36_Absolute_Path_Traversal__Property_17");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_21()).runTest("CWE36_Absolute_Path_Traversal__File_21");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_14()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_14");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_17()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_17");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_13()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_13");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_06()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_06");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_07()).runTest("CWE36_Absolute_Path_Traversal__Property_07");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_42()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_42");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_02()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_02");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_11()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_11");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_16()).runTest("CWE36_Absolute_Path_Traversal__Environment_16");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_17()).runTest("CWE36_Absolute_Path_Traversal__File_17");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_42()).runTest("CWE36_Absolute_Path_Traversal__database_42");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_42()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_42");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_02()).runTest("CWE36_Absolute_Path_Traversal__Property_02");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_12()).runTest("CWE36_Absolute_Path_Traversal__Property_12");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_03()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_03");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_12()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_12");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_12()).runTest("CWE36_Absolute_Path_Traversal__File_12");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_15()).runTest("CWE36_Absolute_Path_Traversal__Environment_15");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_21()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_21");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_08()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_08");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_09()).runTest("CWE36_Absolute_Path_Traversal__File_09");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_09()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_09");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_10()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_10");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_08()).runTest("CWE36_Absolute_Path_Traversal__database_08");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_16()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_16");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_17()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_17");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_41()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_41");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_45()).runTest("CWE36_Absolute_Path_Traversal__database_45");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_01()).runTest("CWE36_Absolute_Path_Traversal__Property_01");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_05()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_05");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_16()).runTest("CWE36_Absolute_Path_Traversal__File_16");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_05()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_05");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_03()).runTest("CWE36_Absolute_Path_Traversal__Property_03");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_16()).runTest("CWE36_Absolute_Path_Traversal__database_16");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_21()).runTest("CWE36_Absolute_Path_Traversal__Environment_21");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_42()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_42");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_42()).runTest("CWE36_Absolute_Path_Traversal__Property_42");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_17()).runTest("CWE36_Absolute_Path_Traversal__Environment_17");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_04()).runTest("CWE36_Absolute_Path_Traversal__File_04");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_21()).runTest("CWE36_Absolute_Path_Traversal__Property_21");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_13()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_13");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_10()).runTest("CWE36_Absolute_Path_Traversal__database_10");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_04()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_04");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_06()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_06");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_06()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_06");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_04()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_04");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_07()).runTest("CWE36_Absolute_Path_Traversal__Environment_07");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_12()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_12");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_06()).runTest("CWE36_Absolute_Path_Traversal__database_06");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_31()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_31");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_03()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_03");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_45()).runTest("CWE36_Absolute_Path_Traversal__Property_45");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_15()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_15");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_03()).runTest("CWE36_Absolute_Path_Traversal__File_03");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_11()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_11");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_02()).runTest("CWE36_Absolute_Path_Traversal__File_02");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_10()).runTest("CWE36_Absolute_Path_Traversal__File_10");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_09()).runTest("CWE36_Absolute_Path_Traversal__Environment_09");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_14()).runTest("CWE36_Absolute_Path_Traversal__Property_14");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_15()).runTest("CWE36_Absolute_Path_Traversal__File_15");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_09()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_09");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_14()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_14");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_17()).runTest("CWE36_Absolute_Path_Traversal__database_17");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_03()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_03");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_06()).runTest("CWE36_Absolute_Path_Traversal__Property_06");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_45()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_45");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_15()).runTest("CWE36_Absolute_Path_Traversal__Property_15");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_05()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_05");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_04()).runTest("CWE36_Absolute_Path_Traversal__database_04");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_11()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_11");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_09()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_09");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_12()).runTest("CWE36_Absolute_Path_Traversal__Environment_12");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_11()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_11");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_31()).runTest("CWE36_Absolute_Path_Traversal__database_31");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_41()).runTest("CWE36_Absolute_Path_Traversal__File_41");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_31()).runTest("CWE36_Absolute_Path_Traversal__File_31");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_12()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_12");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_01()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_01");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_14()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_14");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_13()).runTest("CWE36_Absolute_Path_Traversal__Environment_13");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_04()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_04");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_45()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_45");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_03()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_03");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_07()).runTest("CWE36_Absolute_Path_Traversal__database_07");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_41()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_41");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_21()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_21");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_05()).runTest("CWE36_Absolute_Path_Traversal__File_05");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_06()).runTest("CWE36_Absolute_Path_Traversal__Environment_06");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_03()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_03");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_07()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_07");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_10()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_10");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_13()).runTest("CWE36_Absolute_Path_Traversal__File_13");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_31()).runTest("CWE36_Absolute_Path_Traversal__Environment_31");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_31()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_31");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_31()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_31");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_05()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_05");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_17()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_17");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_45()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_45");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_13()).runTest("CWE36_Absolute_Path_Traversal__Property_13");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_14()).runTest("CWE36_Absolute_Path_Traversal__Environment_14");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_42()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_42");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_10()).runTest("CWE36_Absolute_Path_Traversal__Environment_10");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_16()).runTest("CWE36_Absolute_Path_Traversal__Property_16");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_04()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_04");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_13()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_13");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_12()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_12");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_08()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_08");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_02()).runTest("CWE36_Absolute_Path_Traversal__database_02");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_45()).runTest("CWE36_Absolute_Path_Traversal__Environment_45");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_45()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_45");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_45()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_45");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_15()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_15");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_07()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_07");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_41()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_41");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_10()).runTest("CWE36_Absolute_Path_Traversal__Property_10");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_09()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_09");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_06()).runTest("CWE36_Absolute_Path_Traversal__File_06");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_13()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_13");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_05()).runTest("CWE36_Absolute_Path_Traversal__Environment_05");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_07()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_07");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_06()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_06");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_07()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_07");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_02()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_02");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_13()).runTest("CWE36_Absolute_Path_Traversal__database_13");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_02()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_02");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_14()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_14");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_09()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_09");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_07()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_07");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_06()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_06");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_14()).runTest("CWE36_Absolute_Path_Traversal__File_14");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_11()).runTest("CWE36_Absolute_Path_Traversal__Environment_11");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_42()).runTest("CWE36_Absolute_Path_Traversal__File_42");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_08()).runTest("CWE36_Absolute_Path_Traversal__Property_08");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_03()).runTest("CWE36_Absolute_Path_Traversal__Environment_03");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_10()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_10");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_05()).runTest("CWE36_Absolute_Path_Traversal__Property_05");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_08()).runTest("CWE36_Absolute_Path_Traversal__Environment_08");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__URLConnection_16()).runTest("CWE36_Absolute_Path_Traversal__URLConnection_16");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_14()).runTest("CWE36_Absolute_Path_Traversal__database_14");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_14()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_14");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_31()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_31");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_05()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_05");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__connect_tcp_02()).runTest("CWE36_Absolute_Path_Traversal__connect_tcp_02");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_31()).runTest("CWE36_Absolute_Path_Traversal__Property_31");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_31()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_31");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_08()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_08");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__console_readLine_42()).runTest("CWE36_Absolute_Path_Traversal__console_readLine_42");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_45()).runTest("CWE36_Absolute_Path_Traversal__File_45");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__File_08()).runTest("CWE36_Absolute_Path_Traversal__File_08");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_03()).runTest("CWE36_Absolute_Path_Traversal__database_03");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_21()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_21");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__database_11()).runTest("CWE36_Absolute_Path_Traversal__database_11");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_41()).runTest("CWE36_Absolute_Path_Traversal__Property_41");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Property_11()).runTest("CWE36_Absolute_Path_Traversal__Property_11");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_01()).runTest("CWE36_Absolute_Path_Traversal__Environment_01");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__Environment_04()).runTest("CWE36_Absolute_Path_Traversal__Environment_04");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__PropertiesFile_21()).runTest("CWE36_Absolute_Path_Traversal__PropertiesFile_21");
        (new testcases.CWE36_Absolute_Path_Traversal.CWE36_Absolute_Path_Traversal__listen_tcp_17()).runTest("CWE36_Absolute_Path_Traversal__listen_tcp_17");
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