package net.unit8.graalisp.runtime;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.dsl.NodeFactory;
import net.unit8.graalisp.GraalispLanguage;
import net.unit8.graalisp.builtin.BuiltinNode;
import net.unit8.graalisp.node.GraalispNode;
import net.unit8.graalisp.node.local.ReadArgumentNode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GraalispContext {
    private final BufferedReader input;
    private final PrintWriter output;

    public GraalispContext(GraalispLanguage language, TruffleLanguage.Env env) {
        this.input = new BufferedReader(new InputStreamReader(env.in()));
        this.output = new PrintWriter(env.out(), true);
        installBuiltins();
    }

    public PrintWriter getOutput() {
        return output;
    }

    private void installBuiltins() {

    }

    public void installBuiltin(NodeFactory<? extends BuiltinNode> factory) {
        int argumentCount = factory.getExecutionSignature().size();
        GraalispNode[] argumentNodes = new GraalispNode[argumentCount];

        for (int i = 0; i < argumentCount; i++) {
            argumentNodes[i] = new ReadArgumentNode(i);
        }

        BuiltinNode builtinBodyNode = factory.createNode((Object) argumentNodes);
        /*
        builtinBodyNode.addRootTag();
        String name = lookupNodeInfo(builtinBodyNode.getClass()).shortName();
        builtinBodyNode.setUnavailableSourceSection();

        GraalispRootNode rootNode = new GraalispRootNode(language, new FrameDescriptor(), builtinBodyNode, BUILTIN_SOURCE.createUnavailableSection(), name);

        getFunctionRegistry().register(name, Truffle.getRuntime().createCallTarget(rootNode));
        */
    }
}
