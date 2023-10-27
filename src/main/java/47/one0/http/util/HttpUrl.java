package 47.one0.http.util;

import static 47.one0.http.util.HttpArgumentConverter.toStringArgument;

import 47.one0.exceptions.ArgumentCannotBeNullException;
import java.util.Objects;

/**
 * The HttpUrl class provides a convenient way to construct HTTP URLs with query parameters and path parameters.
 */
public class HttpUrl {

    /**
     * Private constructor to prevent direct instantiation of the class.
     */
    private HttpUrl() {
    }

    /**
     * Creates a new instance of the Builder class to start constructing an HTTP URL.
     *
     * @param url The base URL for the HTTP request.
     * @return A new instance of the Builder class.
     */
    public static Builder builder(String url) {
        return new Builder(url);
    }

    /**
     * The Builder class provides methods to add query parameters and path parameters to an HTTP URL.
     */
    public static class Builder {

        private final okhttp3.HttpUrl.Builder httpUrlBuilder;

        /**
         * Constructs a new Builder instance with the specified base URL.
         *
         * @param url The base URL for the HTTP request.
         */
        private Builder(String url) {
            this.httpUrlBuilder = Objects.requireNonNull(okhttp3.HttpUrl.parse(url)).newBuilder();
        }

        /**
         * Adds a required query parameter to the HTTP URL.
         *
         * @param name  The name of the query parameter.
         * @param value The value of the query parameter.
         * @return The Builder instance.
         * @throws ArgumentCannotBeNullException If the value is null.
         */
        public Builder addRequiredQueryParameter(String name, Object value) throws ArgumentCannotBeNullException {
            if (value == null) {
                throw new ArgumentCannotBeNullException(name);
            }
            this.httpUrlBuilder.addQueryParameter(name, toStringArgument(value));

            return this;
        }

        /**
         * Adds an optional query parameter to the HTTP URL.
         *
         * @param name  The name of the query parameter.
         * @param value The value of the query parameter.
         * @return The Builder instance.
         */
        public Builder addOptionalQueryParameter(String name, Object value) {
            if (value != null) {
                this.httpUrlBuilder.addQueryParameter(name, toStringArgument(value));
            }

            return this;
        }

        /**
         * Adds a path parameter to the HTTP URL.
         *
         * @param value The value of the path parameter.
         * @return The Builder instance.
         * @throws ArgumentCannotBeNullException If the value is null.
         */
        public Builder addPathParameter(String value) throws ArgumentCannotBeNullException {
            if (value == null || value.isEmpty()) {
                throw new ArgumentCannotBeNullException();
            }
            this.httpUrlBuilder.addPathSegment(value);

            return this;
        }

        /**
         * Builds the final HTTP URL.
         *
         * @return The constructed HTTP URL as a string.
         */
        public String build() {
            return this.httpUrlBuilder.build().toString();
        }
    }
}
