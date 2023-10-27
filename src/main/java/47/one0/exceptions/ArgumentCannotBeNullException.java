package 47.one0.exceptions;

/**
 * Thrown to indicate that a service method has been passed an illegal or inappropriate argument.
 * For example, if a required argument is being passed as null.
 */
public class ArgumentCannotBeNullException extends RuntimeException {

    private static final String ARGUMENT_NAME_MESSAGE_FORMAT = "Required argument %s cannot be null.";
    private static final String DEFAULT_MESSAGE = "Required argument cannot be null.";

    public ArgumentCannotBeNullException() {
        super(DEFAULT_MESSAGE);
    }

    public ArgumentCannotBeNullException(String argumentName) {
        super(String.format(ARGUMENT_NAME_MESSAGE_FORMAT, argumentName));
    }
}
