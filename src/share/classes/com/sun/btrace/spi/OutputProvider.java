/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sun.btrace.spi;

import com.sun.btrace.api.BTraceTask;
import java.io.PrintWriter;

/**
 *
 * @author Jaroslav Bachorik <yardus@netbeans.org>
 */
public interface OutputProvider {
    final public static OutputProvider DEFAULT = new OutputProvider() {
        final PrintWriter stdout = new PrintWriter(System.out);
        final PrintWriter stderr = new PrintWriter(System.err);
        public PrintWriter getStdOut(BTraceTask task) {
            return stdout;
        }

        public PrintWriter getStdErr(BTraceTask task) {
            return stderr;
        }
    };

    PrintWriter getStdOut(BTraceTask task);
    PrintWriter getStdErr(BTraceTask task);
}
