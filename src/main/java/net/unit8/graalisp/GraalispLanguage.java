package net.unit8.graalisp;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.source.Source;
import net.unit8.graalisp.parser.GraalispLexer;
import net.unit8.graalisp.parser.GraalispParser;
import net.unit8.graalisp.runtime.GraalispContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

@TruffleLanguage.Registration(
        name ="Graalisp",
        version="0.1.0",
        mimeType = "application/x-graalisp")
public class GraalispLanguage extends TruffleLanguage<GraalispContext> {
    @Override
    protected boolean isObjectOfLanguage(Object object) {
        return false;
    }

    @Override
    protected GraalispContext createContext(Env env) {
        return new GraalispContext();
    }
}
