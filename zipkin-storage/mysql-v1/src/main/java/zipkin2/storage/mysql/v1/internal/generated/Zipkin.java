/*
 * This file is generated by jOOQ.
 */
package zipkin2.storage.mysql.v1.internal.generated;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import zipkin2.storage.mysql.v1.internal.generated.tables.ZipkinAnnotations;
import zipkin2.storage.mysql.v1.internal.generated.tables.ZipkinDependencies;
import zipkin2.storage.mysql.v1.internal.generated.tables.ZipkinSpans;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Zipkin extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>zipkin</code>
     */
    public static final Zipkin ZIPKIN = new Zipkin();

    /**
     * The table <code>zipkin.zipkin_annotations</code>.
     */
    public final ZipkinAnnotations ZIPKIN_ANNOTATIONS = ZipkinAnnotations.ZIPKIN_ANNOTATIONS;

    /**
     * The table <code>zipkin.zipkin_dependencies</code>.
     */
    public final ZipkinDependencies ZIPKIN_DEPENDENCIES = ZipkinDependencies.ZIPKIN_DEPENDENCIES;

    /**
     * The table <code>zipkin.zipkin_spans</code>.
     */
    public final ZipkinSpans ZIPKIN_SPANS = ZipkinSpans.ZIPKIN_SPANS;

    /**
     * No further instances allowed
     */
    private Zipkin() {
        super("zipkin", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            ZipkinAnnotations.ZIPKIN_ANNOTATIONS,
            ZipkinDependencies.ZIPKIN_DEPENDENCIES,
            ZipkinSpans.ZIPKIN_SPANS);
    }
}
