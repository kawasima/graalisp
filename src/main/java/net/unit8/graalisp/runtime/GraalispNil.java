package net.unit8.graalisp.runtime;

import com.oracle.truffle.api.interop.ForeignAccess;
import com.oracle.truffle.api.interop.TruffleObject;

public class GraalispNil implements TruffleObject {
    public static final GraalispNil SINGLETON = new GraalispNil();

    /**
     * Disallow instantiation from outside to ensure that the {@link #SINGLETON} is the only
     * instance.
     */
    private GraalispNil() {
    }

    /**
     * This method is, e.g., called when using the {@code null} value in a string concatenation. So
     * changing it has an effect on SL programs.
     */
    @Override
    public String toString() {
        return "nil";
    }

    /**
     * In case you want some of your objects to co-operate with other languages, you need to make
     * them implement {@link TruffleObject} and provide additional {@link SLNullMessageResolution
     * foreign access implementation}.
     */
    @Override
    public ForeignAccess getForeignAccess() {
        return null;
        //return GraalispNilMessageResolutionForeign.ACCESS;
    }
}
