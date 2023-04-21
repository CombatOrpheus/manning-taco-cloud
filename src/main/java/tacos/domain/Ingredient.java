package tacos.domain;

import tacos.enums.Type;

public record Ingredient(String id, String name, Type type) {}
