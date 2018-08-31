package net.unit8.graalisp.builtin;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.NodeChild;
import net.unit8.graalisp.GraalispLanguage;
import net.unit8.graalisp.node.GraalispNode;
import net.unit8.graalisp.runtime.GraalispContext;


@NodeChild(value = "arguments", type = GraalispNode[].class)
@GenerateNodeFactory
public abstract class BuiltinNode extends GraalispNode {
    public final GraalispContext getContext() {
        return getRootNode().getLanguage(GraalispLanguage.class).getContextReference().get();
    }
}
