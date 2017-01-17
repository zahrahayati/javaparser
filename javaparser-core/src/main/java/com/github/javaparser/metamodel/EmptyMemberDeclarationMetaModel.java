package com.github.javaparser.metamodel;

import java.util.Optional;

public class EmptyMemberDeclarationMetaModel extends ClassMetaModel {

    public EmptyMemberDeclarationMetaModel(JavaParserMetaModel parent, Optional<ClassMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, null, com.github.javaparser.ast.body.EmptyMemberDeclaration.class, "EmptyMemberDeclaration", "com.github.javaparser.ast.body.EmptyMemberDeclaration", "com.github.javaparser.ast.body", false);
    }
}

