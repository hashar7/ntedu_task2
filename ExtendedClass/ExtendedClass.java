package com.company;

import java.util.Objects;

/**
 * Class that stores {@code byte}, {@code int},
 * {@code double} and {@code String} variables.
 */
public class ExtendedClass {
    byte b;
    int i;
    double d;
    String s;

    /**
     * Default constructor without parameters.
     */
    public ExtendedClass() {
        this.b = 0;
        this.i = 0;
        this.d = 0.0;
        this.s = null;
    }

    /**
     * Constructor from {@code byte}, {@code int},
     * {@code double} and {@code String} values.
     * @param b the {@code byte} value;
     * @param i the {@code int} value;
     * @param d the {@code double} value;
     * @param s the {@code String} value.
     */
    public ExtendedClass(byte b, int i, double d, String s) {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }

    /**
     * Checks whether this object equals to {@code anObject} or not.
     * @return {@code true} if {@code anObject} equals this object,
     * {@code false} otherwise.
     */
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject == null || anObject.getClass() != this.getClass()) {
            return false;
        }
        ExtendedClass that = (ExtendedClass) anObject;
        return this.b == that.b && this.i == that.i && Double.compare(this.d, that.d) == 0 && this.s.equals(that.s);
    }

    /**
     * Computes the hash code for object.
     * @return hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.b, this.i, this.d, this.s);
    }

    /**
     * Creates {@code String} presentation for object.
     * @return {@code String} presentation of the object.
     */
    @Override
    public String toString() {
        return "ExtendedClass{" +
                "b=" + b +
                ", i=" + i +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }
}