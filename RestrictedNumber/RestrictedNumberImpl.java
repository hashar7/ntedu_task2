package com.company;

/**
 * Class implements {@code RestrictedNumber} interface and stores
 * integer variable in range from 50 to -50.
 */
public class RestrictedNumberImpl implements RestrictedNumber{

    private int x;

    /**
     * Default constructor without parameters.
     */
    public RestrictedNumberImpl() {
        x = 0;
    }

    /**
     * Sets {@code x} to the given value if {@code value} ranges from {@code LOWER_BOUND} to
     * {@code UPPER_BOUND}. Otherwise {@code x} is assigned to {@code LOWER_BOUND} if {@parm value}
     * is less than or equal to {@code LOWER_BOUND}, or {@code UPPER_BOUND} if {@parm value} is
     * greater than or equal to {@code UPPER_BOUND}.
     * @param value — value to assign to {@code x}.
     */
    @Override
    public void setValue(int value) {
        x = value > UPPER_BOUND ? 50 : value < LOWER_BOUND ? -50 : value;
    }

    /**
     * Prints {@code x} to the output stream.
     * @return {@code x} value.
     */
    @Override
    public int getValue() {
        System.out.println("x = " + x);
        return x;
    }
}
