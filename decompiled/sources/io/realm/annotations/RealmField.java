package io.realm.annotations;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Inherited
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RealmField {
    java.lang.String name() default "";

    java.lang.String value() default "";
}
