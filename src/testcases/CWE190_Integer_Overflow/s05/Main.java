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
        (new testcases.CWE190_Integer_Overflow.s05.J16175()).runTest("CWE190_Integer_Overflow__short_rand_square_08_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16174()).runTest("CWE190_Integer_Overflow__short_rand_square_08_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16173()).runTest("CWE190_Integer_Overflow__short_rand_square_07_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16172()).runTest("CWE190_Integer_Overflow__short_rand_square_07_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16111()).runTest("CWE190_Integer_Overflow__short_rand_add_41_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16110()).runTest("CWE190_Integer_Overflow__short_rand_add_41_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16185()).runTest("CWE190_Integer_Overflow__short_rand_square_13_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16184()).runTest("CWE190_Integer_Overflow__short_rand_square_13_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16121()).runTest("CWE190_Integer_Overflow__short_rand_multiply_03_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16120()).runTest("CWE190_Integer_Overflow__short_rand_multiply_03_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16177()).runTest("CWE190_Integer_Overflow__short_rand_square_09_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16176()).runTest("CWE190_Integer_Overflow__short_rand_square_09_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16017()).runTest("CWE190_Integer_Overflow__short_max_multiply_17_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16016()).runTest("CWE190_Integer_Overflow__short_max_multiply_17_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16091()).runTest("CWE190_Integer_Overflow__short_rand_add_10_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16090()).runTest("CWE190_Integer_Overflow__short_rand_add_10_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16109()).runTest("CWE190_Integer_Overflow__short_rand_add_31_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16108()).runTest("CWE190_Integer_Overflow__short_rand_add_31_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16029()).runTest("CWE190_Integer_Overflow__short_max_square_01_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16028()).runTest("CWE190_Integer_Overflow__short_max_square_01_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16075()).runTest("CWE190_Integer_Overflow__short_rand_add_02_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16074()).runTest("CWE190_Integer_Overflow__short_rand_add_02_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16025()).runTest("CWE190_Integer_Overflow__short_max_multiply_42_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16024()).runTest("CWE190_Integer_Overflow__short_max_multiply_42_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16093()).runTest("CWE190_Integer_Overflow__short_rand_add_11_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16092()).runTest("CWE190_Integer_Overflow__short_rand_add_11_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16171()).runTest("CWE190_Integer_Overflow__short_rand_square_06_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16170()).runTest("CWE190_Integer_Overflow__short_rand_square_06_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16135()).runTest("CWE190_Integer_Overflow__short_rand_multiply_10_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16134()).runTest("CWE190_Integer_Overflow__short_rand_multiply_10_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16189()).runTest("CWE190_Integer_Overflow__short_rand_square_15_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16188()).runTest("CWE190_Integer_Overflow__short_rand_square_15_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16033()).runTest("CWE190_Integer_Overflow__short_max_square_03_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16032()).runTest("CWE190_Integer_Overflow__short_max_square_03_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16079()).runTest("CWE190_Integer_Overflow__short_rand_add_04_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16078()).runTest("CWE190_Integer_Overflow__short_rand_add_04_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16141()).runTest("CWE190_Integer_Overflow__short_rand_multiply_13_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16140()).runTest("CWE190_Integer_Overflow__short_rand_multiply_13_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16081()).runTest("CWE190_Integer_Overflow__short_rand_add_05_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16080()).runTest("CWE190_Integer_Overflow__short_rand_add_05_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16039()).runTest("CWE190_Integer_Overflow__short_max_square_06_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16038()).runTest("CWE190_Integer_Overflow__short_max_square_06_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16065()).runTest("CWE190_Integer_Overflow__short_max_square_31_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16064()).runTest("CWE190_Integer_Overflow__short_max_square_31_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16161()).runTest("CWE190_Integer_Overflow__short_rand_square_01_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16160()).runTest("CWE190_Integer_Overflow__short_rand_square_01_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16125()).runTest("CWE190_Integer_Overflow__short_rand_multiply_05_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16124()).runTest("CWE190_Integer_Overflow__short_rand_multiply_05_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16201()).runTest("CWE190_Integer_Overflow__short_rand_square_42_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16200()).runTest("CWE190_Integer_Overflow__short_rand_square_42_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16195()).runTest("CWE190_Integer_Overflow__short_rand_square_21_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16194()).runTest("CWE190_Integer_Overflow__short_rand_square_21_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16035()).runTest("CWE190_Integer_Overflow__short_max_square_04_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16034()).runTest("CWE190_Integer_Overflow__short_max_square_04_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16191()).runTest("CWE190_Integer_Overflow__short_rand_square_16_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16190()).runTest("CWE190_Integer_Overflow__short_rand_square_16_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16067()).runTest("CWE190_Integer_Overflow__short_max_square_41_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16066()).runTest("CWE190_Integer_Overflow__short_max_square_41_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16037()).runTest("CWE190_Integer_Overflow__short_max_square_05_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16036()).runTest("CWE190_Integer_Overflow__short_max_square_05_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16119()).runTest("CWE190_Integer_Overflow__short_rand_multiply_02_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16118()).runTest("CWE190_Integer_Overflow__short_rand_multiply_02_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16103()).runTest("CWE190_Integer_Overflow__short_rand_add_16_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16102()).runTest("CWE190_Integer_Overflow__short_rand_add_16_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16113()).runTest("CWE190_Integer_Overflow__short_rand_add_42_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16112()).runTest("CWE190_Integer_Overflow__short_rand_add_42_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16179()).runTest("CWE190_Integer_Overflow__short_rand_square_10_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16178()).runTest("CWE190_Integer_Overflow__short_rand_square_10_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16137()).runTest("CWE190_Integer_Overflow__short_rand_multiply_11_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16136()).runTest("CWE190_Integer_Overflow__short_rand_multiply_11_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16063()).runTest("CWE190_Integer_Overflow__short_max_square_21_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16062()).runTest("CWE190_Integer_Overflow__short_max_square_21_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16115()).runTest("CWE190_Integer_Overflow__short_rand_add_45_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16114()).runTest("CWE190_Integer_Overflow__short_rand_add_45_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16151()).runTest("CWE190_Integer_Overflow__short_rand_multiply_21_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16150()).runTest("CWE190_Integer_Overflow__short_rand_multiply_21_b");
        (new testcases.CWE190_Integer_Overflow.s05.J15999()).runTest("CWE190_Integer_Overflow__short_max_multiply_08_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J15998()).runTest("CWE190_Integer_Overflow__short_max_multiply_08_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16087()).runTest("CWE190_Integer_Overflow__short_rand_add_08_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16086()).runTest("CWE190_Integer_Overflow__short_rand_add_08_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16003()).runTest("CWE190_Integer_Overflow__short_max_multiply_10_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16002()).runTest("CWE190_Integer_Overflow__short_max_multiply_10_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16101()).runTest("CWE190_Integer_Overflow__short_rand_add_15_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16100()).runTest("CWE190_Integer_Overflow__short_rand_add_15_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16157()).runTest("CWE190_Integer_Overflow__short_rand_multiply_42_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16156()).runTest("CWE190_Integer_Overflow__short_rand_multiply_42_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16085()).runTest("CWE190_Integer_Overflow__short_rand_add_07_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16084()).runTest("CWE190_Integer_Overflow__short_rand_add_07_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16155()).runTest("CWE190_Integer_Overflow__short_rand_multiply_41_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16154()).runTest("CWE190_Integer_Overflow__short_rand_multiply_41_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16203()).runTest("CWE190_Integer_Overflow__short_rand_square_45_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16202()).runTest("CWE190_Integer_Overflow__short_rand_square_45_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16051()).runTest("CWE190_Integer_Overflow__short_max_square_12_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16050()).runTest("CWE190_Integer_Overflow__short_max_square_12_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16061()).runTest("CWE190_Integer_Overflow__short_max_square_17_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16060()).runTest("CWE190_Integer_Overflow__short_max_square_17_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16145()).runTest("CWE190_Integer_Overflow__short_rand_multiply_15_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16144()).runTest("CWE190_Integer_Overflow__short_rand_multiply_15_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16107()).runTest("CWE190_Integer_Overflow__short_rand_add_21_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16106()).runTest("CWE190_Integer_Overflow__short_rand_add_21_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16049()).runTest("CWE190_Integer_Overflow__short_max_square_11_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16048()).runTest("CWE190_Integer_Overflow__short_max_square_11_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16089()).runTest("CWE190_Integer_Overflow__short_rand_add_09_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16088()).runTest("CWE190_Integer_Overflow__short_rand_add_09_b");
        (new testcases.CWE190_Integer_Overflow.s05.J15991()).runTest("CWE190_Integer_Overflow__short_max_multiply_04_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J15990()).runTest("CWE190_Integer_Overflow__short_max_multiply_04_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16187()).runTest("CWE190_Integer_Overflow__short_rand_square_14_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16186()).runTest("CWE190_Integer_Overflow__short_rand_square_14_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16023()).runTest("CWE190_Integer_Overflow__short_max_multiply_41_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16022()).runTest("CWE190_Integer_Overflow__short_max_multiply_41_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16007()).runTest("CWE190_Integer_Overflow__short_max_multiply_12_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16006()).runTest("CWE190_Integer_Overflow__short_max_multiply_12_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16117()).runTest("CWE190_Integer_Overflow__short_rand_multiply_01_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16116()).runTest("CWE190_Integer_Overflow__short_rand_multiply_01_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16073()).runTest("CWE190_Integer_Overflow__short_rand_add_01_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16072()).runTest("CWE190_Integer_Overflow__short_rand_add_01_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16055()).runTest("CWE190_Integer_Overflow__short_max_square_14_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16054()).runTest("CWE190_Integer_Overflow__short_max_square_14_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16199()).runTest("CWE190_Integer_Overflow__short_rand_square_41_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16198()).runTest("CWE190_Integer_Overflow__short_rand_square_41_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16053()).runTest("CWE190_Integer_Overflow__short_max_square_13_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16052()).runTest("CWE190_Integer_Overflow__short_max_square_13_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16149()).runTest("CWE190_Integer_Overflow__short_rand_multiply_17_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16148()).runTest("CWE190_Integer_Overflow__short_rand_multiply_17_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16143()).runTest("CWE190_Integer_Overflow__short_rand_multiply_14_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16142()).runTest("CWE190_Integer_Overflow__short_rand_multiply_14_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16057()).runTest("CWE190_Integer_Overflow__short_max_square_15_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16056()).runTest("CWE190_Integer_Overflow__short_max_square_15_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16043()).runTest("CWE190_Integer_Overflow__short_max_square_08_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16042()).runTest("CWE190_Integer_Overflow__short_max_square_08_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16139()).runTest("CWE190_Integer_Overflow__short_rand_multiply_12_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16138()).runTest("CWE190_Integer_Overflow__short_rand_multiply_12_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16027()).runTest("CWE190_Integer_Overflow__short_max_multiply_45_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16026()).runTest("CWE190_Integer_Overflow__short_max_multiply_45_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16169()).runTest("CWE190_Integer_Overflow__short_rand_square_05_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16168()).runTest("CWE190_Integer_Overflow__short_rand_square_05_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16015()).runTest("CWE190_Integer_Overflow__short_max_multiply_16_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16014()).runTest("CWE190_Integer_Overflow__short_max_multiply_16_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16095()).runTest("CWE190_Integer_Overflow__short_rand_add_12_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16094()).runTest("CWE190_Integer_Overflow__short_rand_add_12_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16059()).runTest("CWE190_Integer_Overflow__short_max_square_16_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16058()).runTest("CWE190_Integer_Overflow__short_max_square_16_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16181()).runTest("CWE190_Integer_Overflow__short_rand_square_11_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16180()).runTest("CWE190_Integer_Overflow__short_rand_square_11_b");
        (new testcases.CWE190_Integer_Overflow.s05.J15989()).runTest("CWE190_Integer_Overflow__short_max_multiply_03_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J15988()).runTest("CWE190_Integer_Overflow__short_max_multiply_03_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16167()).runTest("CWE190_Integer_Overflow__short_rand_square_04_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16166()).runTest("CWE190_Integer_Overflow__short_rand_square_04_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16069()).runTest("CWE190_Integer_Overflow__short_max_square_42_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16068()).runTest("CWE190_Integer_Overflow__short_max_square_42_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16133()).runTest("CWE190_Integer_Overflow__short_rand_multiply_09_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16132()).runTest("CWE190_Integer_Overflow__short_rand_multiply_09_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16127()).runTest("CWE190_Integer_Overflow__short_rand_multiply_06_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16126()).runTest("CWE190_Integer_Overflow__short_rand_multiply_06_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16123()).runTest("CWE190_Integer_Overflow__short_rand_multiply_04_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16122()).runTest("CWE190_Integer_Overflow__short_rand_multiply_04_b");
        (new testcases.CWE190_Integer_Overflow.s05.J15995()).runTest("CWE190_Integer_Overflow__short_max_multiply_06_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J15994()).runTest("CWE190_Integer_Overflow__short_max_multiply_06_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16021()).runTest("CWE190_Integer_Overflow__short_max_multiply_31_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16020()).runTest("CWE190_Integer_Overflow__short_max_multiply_31_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16047()).runTest("CWE190_Integer_Overflow__short_max_square_10_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16046()).runTest("CWE190_Integer_Overflow__short_max_square_10_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16011()).runTest("CWE190_Integer_Overflow__short_max_multiply_14_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16010()).runTest("CWE190_Integer_Overflow__short_max_multiply_14_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16083()).runTest("CWE190_Integer_Overflow__short_rand_add_06_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16082()).runTest("CWE190_Integer_Overflow__short_rand_add_06_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16077()).runTest("CWE190_Integer_Overflow__short_rand_add_03_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16076()).runTest("CWE190_Integer_Overflow__short_rand_add_03_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16193()).runTest("CWE190_Integer_Overflow__short_rand_square_17_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16192()).runTest("CWE190_Integer_Overflow__short_rand_square_17_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16197()).runTest("CWE190_Integer_Overflow__short_rand_square_31_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16196()).runTest("CWE190_Integer_Overflow__short_rand_square_31_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16131()).runTest("CWE190_Integer_Overflow__short_rand_multiply_08_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16130()).runTest("CWE190_Integer_Overflow__short_rand_multiply_08_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16099()).runTest("CWE190_Integer_Overflow__short_rand_add_14_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16098()).runTest("CWE190_Integer_Overflow__short_rand_add_14_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16105()).runTest("CWE190_Integer_Overflow__short_rand_add_17_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16104()).runTest("CWE190_Integer_Overflow__short_rand_add_17_b");
        (new testcases.CWE190_Integer_Overflow.s05.J15997()).runTest("CWE190_Integer_Overflow__short_max_multiply_07_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J15996()).runTest("CWE190_Integer_Overflow__short_max_multiply_07_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16159()).runTest("CWE190_Integer_Overflow__short_rand_multiply_45_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16158()).runTest("CWE190_Integer_Overflow__short_rand_multiply_45_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16019()).runTest("CWE190_Integer_Overflow__short_max_multiply_21_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16018()).runTest("CWE190_Integer_Overflow__short_max_multiply_21_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16097()).runTest("CWE190_Integer_Overflow__short_rand_add_13_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16096()).runTest("CWE190_Integer_Overflow__short_rand_add_13_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16147()).runTest("CWE190_Integer_Overflow__short_rand_multiply_16_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16146()).runTest("CWE190_Integer_Overflow__short_rand_multiply_16_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16005()).runTest("CWE190_Integer_Overflow__short_max_multiply_11_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16004()).runTest("CWE190_Integer_Overflow__short_max_multiply_11_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16013()).runTest("CWE190_Integer_Overflow__short_max_multiply_15_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16012()).runTest("CWE190_Integer_Overflow__short_max_multiply_15_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16031()).runTest("CWE190_Integer_Overflow__short_max_square_02_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16030()).runTest("CWE190_Integer_Overflow__short_max_square_02_b");
        (new testcases.CWE190_Integer_Overflow.s05.J15993()).runTest("CWE190_Integer_Overflow__short_max_multiply_05_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J15992()).runTest("CWE190_Integer_Overflow__short_max_multiply_05_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16045()).runTest("CWE190_Integer_Overflow__short_max_square_09_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16044()).runTest("CWE190_Integer_Overflow__short_max_square_09_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16163()).runTest("CWE190_Integer_Overflow__short_rand_square_02_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16162()).runTest("CWE190_Integer_Overflow__short_rand_square_02_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16071()).runTest("CWE190_Integer_Overflow__short_max_square_45_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16070()).runTest("CWE190_Integer_Overflow__short_max_square_45_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16129()).runTest("CWE190_Integer_Overflow__short_rand_multiply_07_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16128()).runTest("CWE190_Integer_Overflow__short_rand_multiply_07_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16041()).runTest("CWE190_Integer_Overflow__short_max_square_07_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16040()).runTest("CWE190_Integer_Overflow__short_max_square_07_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16009()).runTest("CWE190_Integer_Overflow__short_max_multiply_13_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16008()).runTest("CWE190_Integer_Overflow__short_max_multiply_13_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16153()).runTest("CWE190_Integer_Overflow__short_rand_multiply_31_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16152()).runTest("CWE190_Integer_Overflow__short_rand_multiply_31_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16183()).runTest("CWE190_Integer_Overflow__short_rand_square_12_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16182()).runTest("CWE190_Integer_Overflow__short_rand_square_12_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16165()).runTest("CWE190_Integer_Overflow__short_rand_square_03_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16164()).runTest("CWE190_Integer_Overflow__short_rand_square_03_b");
        (new testcases.CWE190_Integer_Overflow.s05.J15987()).runTest("CWE190_Integer_Overflow__short_max_multiply_02_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J15986()).runTest("CWE190_Integer_Overflow__short_max_multiply_02_b");
        (new testcases.CWE190_Integer_Overflow.s05.J15985()).runTest("CWE190_Integer_Overflow__short_max_multiply_01_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J15984()).runTest("CWE190_Integer_Overflow__short_max_multiply_01_b");
        (new testcases.CWE190_Integer_Overflow.s05.J16001()).runTest("CWE190_Integer_Overflow__short_max_multiply_09_gd");
        (new testcases.CWE190_Integer_Overflow.s05.J16000()).runTest("CWE190_Integer_Overflow__short_max_multiply_09_b");
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
