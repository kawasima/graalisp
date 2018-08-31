package net.unit8.graalisp.builtin;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

import java.io.PrintWriter;

import static com.oracle.truffle.api.CompilerDirectives.*;

@NodeInfo(shortName = "println")
public abstract class PrintlnBuiltin extends BuiltinNode {
    @Specialization
    public long println(long value) {
        doPrint(getContext().getOutput(), value);
        return value;
    }

    @TruffleBoundary
    private static void doPrint(PrintWriter out, long value) {
        out.println(value);
    }
}
