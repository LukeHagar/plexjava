/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.utils;

import com.fasterxml.jackson.core.type.TypeReference;

public final class LazySingletonValue<T> {
    
    private static final Object NOT_SET = new Object();
    
    private final String name;
    private final String json;
    private final TypeReference<T> typeReference;
    private Object value = NOT_SET;
    
    public LazySingletonValue(String name, String json, TypeReference<T> typeReference) {
        this.name = name;
        this.json = json;
        this.typeReference = typeReference;
    }

    @SuppressWarnings("unchecked")
    public T value() {
        if (value == NOT_SET) {
            value = Utils.readDefaultOrConstValue(name, json, typeReference);
        }
        return (T) value;
    }
}
