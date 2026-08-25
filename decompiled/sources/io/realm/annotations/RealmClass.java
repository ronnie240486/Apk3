package io.realm.annotations;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Inherited
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RealmClass {
    boolean embedded() default false;

    io.realm.annotations.RealmNamingPolicy fieldNamingPolicy() default io.realm.annotations.RealmNamingPolicy.NO_POLICY;

    java.lang.String name() default "";

    java.lang.String value() default "";
}
