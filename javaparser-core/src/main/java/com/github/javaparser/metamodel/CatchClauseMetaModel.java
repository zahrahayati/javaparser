package com.github.javaparser.metamodel;

import java.util.Optional;

public class CatchClauseMetaModel extends ClassMetaModel {

    public CatchClauseMetaModel(JavaParserMetaModel parent, Optional<ClassMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, null, com.github.javaparser.ast.stmt.CatchClause.class, "CatchClause", "com.github.javaparser.ast.stmt.CatchClause", "com.github.javaparser.ast.stmt", false);
    }
}

