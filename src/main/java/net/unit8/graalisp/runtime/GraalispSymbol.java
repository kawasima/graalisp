package net.unit8.graalisp.runtime;

public class GraalispSymbol {
    private final String name;
    public GraalispSymbol(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "'" + name;
    }
}
