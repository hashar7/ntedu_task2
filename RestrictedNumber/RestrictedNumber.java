package com.company;

/**
 * Interface for {@code RestrictedNumberImpl} class.
 */
public interface RestrictedNumber {

    /**
     * Sets {@code x} to the given value if {@code value} ranges from {@code LOWER_BOUND} to
     * {@code UPPER_BOUND}. Otherwise {@code x} is assigned to {@code LOWER_BOUND} if {@parm value}
     * is less than or equal to {@code LOWER_BOUND}, or {@code UPPER_BOUND} if {@parm value} is
     * greater than or equal to {@code UPPER_BOUND}.
     * @param value — value to assign to {@code x}.
     */
    void setValue(int value);

    /**
     * Prints {@code x} to the output stream.
     * @return {@code x} value.
     */
    int getValue();
}
