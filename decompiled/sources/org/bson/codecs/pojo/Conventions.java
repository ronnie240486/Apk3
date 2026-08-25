package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
public final class Conventions {
    public static final org.bson.codecs.pojo.Convention ANNOTATION_CONVENTION = null;
    public static final org.bson.codecs.pojo.Convention CLASS_AND_PROPERTY_CONVENTION = null;
    public static final java.util.List<org.bson.codecs.pojo.Convention> DEFAULT_CONVENTIONS = null;
    public static final java.util.List<org.bson.codecs.pojo.Convention> NO_CONVENTIONS = null;
    public static final org.bson.codecs.pojo.Convention OBJECT_ID_GENERATORS = null;
    public static final org.bson.codecs.pojo.Convention SET_PRIVATE_FIELDS_CONVENTION = null;
    public static final org.bson.codecs.pojo.Convention USE_GETTERS_FOR_SETTERS = null;

    static {
            org.bson.codecs.pojo.ConventionDefaultsImpl r0 = new org.bson.codecs.pojo.ConventionDefaultsImpl
            r0.<init>()
            org.bson.codecs.pojo.Conventions.CLASS_AND_PROPERTY_CONVENTION = r0
            org.bson.codecs.pojo.ConventionAnnotationImpl r1 = new org.bson.codecs.pojo.ConventionAnnotationImpl
            r1.<init>()
            org.bson.codecs.pojo.Conventions.ANNOTATION_CONVENTION = r1
            org.bson.codecs.pojo.ConventionSetPrivateFieldImpl r2 = new org.bson.codecs.pojo.ConventionSetPrivateFieldImpl
            r2.<init>()
            org.bson.codecs.pojo.Conventions.SET_PRIVATE_FIELDS_CONVENTION = r2
            org.bson.codecs.pojo.ConventionUseGettersAsSettersImpl r2 = new org.bson.codecs.pojo.ConventionUseGettersAsSettersImpl
            r2.<init>()
            org.bson.codecs.pojo.Conventions.USE_GETTERS_FOR_SETTERS = r2
            org.bson.codecs.pojo.ConventionObjectIdGeneratorsImpl r2 = new org.bson.codecs.pojo.ConventionObjectIdGeneratorsImpl
            r2.<init>()
            org.bson.codecs.pojo.Conventions.OBJECT_ID_GENERATORS = r2
            r3 = 3
            org.bson.codecs.pojo.Convention[] r3 = new org.bson.codecs.pojo.Convention[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.util.List r0 = java.util.Arrays.asList(r3)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            org.bson.codecs.pojo.Conventions.DEFAULT_CONVENTIONS = r0
            java.util.List r0 = java.util.Collections.emptyList()
            org.bson.codecs.pojo.Conventions.NO_CONVENTIONS = r0
            return
    }

    private Conventions() {
            r0 = this;
            r0.<init>()
            return
    }
}
