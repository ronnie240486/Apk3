package org.bson.codecs.pojo.annotations;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Inherited
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface BsonDiscriminator {
    java.lang.String key() default "_t";

    java.lang.String value() default "";
}
