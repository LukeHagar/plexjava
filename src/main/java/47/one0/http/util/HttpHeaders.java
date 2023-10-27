package 47.one0.http.util;

    import static 47.one0.http.util.HttpArgumentConverter.toStringArgument;

    import 47.one0.exceptions.ArgumentCannotBeNullException;
import okhttp3.Headers;

/**
 * HttpHeaders represents a utility class for building HTTP headers.
 */
public class HttpHeaders {

    /**
     * Private constructor to prevent direct instantiation of the class.
     */
    private HttpHeaders() {
    }

    /**
     * Creates a new instance of the HttpHeaders.Builder.
     *
     * @return A new instance of HttpHeaders.Builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder class for constructing HTTP headers.
     */
    public static class Builder {

        private final Headers.Builder headersBuilder;

        /**
         * Constructs a new instance of the Builder.
         */
        private Builder() {
            this.headersBuilder = new Headers.Builder();
        }

        /**
         * Adds a required header with the specified name and value to the headers' builder.
         *
         * @param name The name of the header.
         * @param value The value of the header.
         * @return The current Builder instance.
         * @throws ArgumentCannotBeNullException If the value is null.
         */
        public Builder addRequiredHeader(String name, Object value)
            throws ArgumentCannotBeNullException {
            if (value == null) {
                throw new ArgumentCannotBeNullException(name);
            }
            this.headersBuilder.add(name, toStringArgument(value));

            return this;
        }

        /**
         * Adds an optional header with the specified name and value to the headers' builder.
         *
         * @param name The name of the header.
         * @param value The value of the header.
         * @return The current Builder instance.
         */
        public Builder addOptionalHeader(String name, Object value) {
            if (value != null) {
                this.headersBuilder.add(name, toStringArgument(value));
            }

            return this;
        }

        /**
         * Builds the headers using the configured values in the builder.
         *
         * @return The constructed Headers object.
         */
        public Headers build() {
            return this.headersBuilder.build();
        }
    }
}
