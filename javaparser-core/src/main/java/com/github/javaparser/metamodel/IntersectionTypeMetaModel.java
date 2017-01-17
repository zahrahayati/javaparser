package com.github.javaparser.metamodel;

import java.util.Optional;

public class IntersectionTypeMetaModel extends ClassMetaModel {

    public IntersectionTypeMetaModel(JavaParserMetaModel parent, Optional<ClassMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, null, com.github.javaparser.ast.type.IntersectionType.class, "IntersectionType", "com.github.javaparser.ast.type.IntersectionType", "com.github.javaparser.ast.type", false);
    }
}

