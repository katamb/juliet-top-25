/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE23_Relative_Path_Traversal__connect_tcp_81_goodG2B.java
Label Definition File: CWE23_Relative_Path_Traversal.label.xml
Template File: sources-sink-81_goodG2B.tmpl.java
*/
/*
 * @description
 * CWE: 23 Relative Path Traversal
 * BadSource: connect_tcp Read data using an outbound tcp connection
 * GoodSource: A hardcoded string
 * Sinks: readFile
 *    BadSink : no validation
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package testcases.CWE23_Relative_Path_Traversal;

import testcasesupport.*;

import java.io.*;
import javax.servlet.http.*;

import java.util.logging.Level;

public class CWE23_Relative_Path_Traversal__connect_tcp_81_goodG2B extends CWE23_Relative_Path_Traversal__connect_tcp_81_base {
    public void action(String data) throws Throwable {

        String root;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            /* running on Windows */
            root = "C:\\uploads\\";
        } else {
            /* running on non-Windows */
            root = "/home/user/uploads/";
        }

        if (data != null) {
            /* POTENTIAL FLAW: no validation of concatenated value */
            File file = new File(root + data);
            FileInputStream streamFileInputSink = null;
            InputStreamReader readerInputStreamSink = null;
            BufferedReader readerBufferdSink = null;
            if (file.exists() && file.isFile()) {
                try {
                    streamFileInputSink = new FileInputStream(file);
                    readerInputStreamSink = new InputStreamReader(streamFileInputSink, "UTF-8");
                    readerBufferdSink = new BufferedReader(readerInputStreamSink);
                    IO.writeLine(readerBufferdSink.readLine());
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                } finally {
                    /* Close stream reading objects */
                    try {
                        if (readerBufferdSink != null) {
                            readerBufferdSink.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try {
                        if (readerInputStreamSink != null) {
                            readerInputStreamSink.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }

                    try {
                        if (streamFileInputSink != null) {
                            streamFileInputSink.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
        }

    }
}
