package hoot.services.models.db;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCommandStatus is a Querydsl query type for CommandStatus
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCommandStatus extends com.querydsl.sql.RelationalPathBase<CommandStatus> {

    private static final long serialVersionUID = -2130509949;

    public static final QCommandStatus commandStatus = new QCommandStatus("command_status");

    public final StringPath command = createString("command");

    public final NumberPath<Integer> exitCode = createNumber("exitCode", Integer.class);

    public final DateTimePath<java.sql.Timestamp> finish = createDateTime("finish", java.sql.Timestamp.class);

    public final StringPath id = createString("id");

    public final StringPath jobId = createString("jobId");

    public final DateTimePath<java.sql.Timestamp> start = createDateTime("start", java.sql.Timestamp.class);

    public final StringPath stderr = createString("stderr");

    public final StringPath stdout = createString("stdout");

    public final com.querydsl.sql.PrimaryKey<CommandStatus> commandStatusPkey = createPrimaryKey(id);

    public QCommandStatus(String variable) {
        super(CommandStatus.class, forVariable(variable), "public", "command_status");
        addMetadata();
    }

    public QCommandStatus(String variable, String schema, String table) {
        super(CommandStatus.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCommandStatus(Path<? extends CommandStatus> path) {
        super(path.getType(), path.getMetadata(), "public", "command_status");
        addMetadata();
    }

    public QCommandStatus(PathMetadata metadata) {
        super(CommandStatus.class, metadata, "public", "command_status");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(command, ColumnMetadata.named("command").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(exitCode, ColumnMetadata.named("exit_code").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(finish, ColumnMetadata.named("finish").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.VARCHAR).withSize(64).notNull());
        addMetadata(jobId, ColumnMetadata.named("job_id").withIndex(2).ofType(Types.VARCHAR).withSize(64).notNull());
        addMetadata(start, ColumnMetadata.named("start").withIndex(3).ofType(Types.TIMESTAMP).withSize(35).withDigits(6).notNull());
        addMetadata(stderr, ColumnMetadata.named("stderr").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(stdout, ColumnMetadata.named("stdout").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
    }

}
