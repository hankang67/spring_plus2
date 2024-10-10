package org.example.expert.domain.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLog is a Querydsl query type for Log
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLog extends EntityPathBase<Log> {

    private static final long serialVersionUID = 1639559560L;

    public static final QLog log = new QLog("log");

    public final StringPath action = createString("action");

    public final DateTimePath<java.time.LocalDateTime> creatAt = createDateTime("creatAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath manager = createString("manager");

    public final NumberPath<Long> managerId = createNumber("managerId", Long.class);

    public final StringPath message = createString("message");

    public QLog(String variable) {
        super(Log.class, forVariable(variable));
    }

    public QLog(Path<? extends Log> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLog(PathMetadata metadata) {
        super(Log.class, metadata);
    }

}

