package creational.factory_method;

import java.util.List;

public record Letter(List<String> contents, float postage)
        implements Container {
}
