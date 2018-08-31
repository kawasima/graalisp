package net.unit8.graalisp;

import com.oracle.truffle.api.dsl.TypeSystem;

import java.math.BigInteger;

@TypeSystem({
        long.class,
        boolean.class,
        BigInteger.class,
        String.class
})
public class GraalispTypes {
}
