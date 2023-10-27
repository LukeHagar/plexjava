package 47.one0;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Environment {
    DEFAULT("http://10.10.10.47:32400");

    private final String url;

    public String getUrl() {
        return this.url;
    }
}
