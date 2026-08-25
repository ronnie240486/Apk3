package io.realm.annotations;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Inherited
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RealmModule {
    boolean allClasses() default false;

    io.realm.annotations.RealmNamingPolicy classNamingPolicy() default io.realm.annotations.RealmNamingPolicy.NO_POLICY;

    java.lang.Class<?>[] classes() default {};

    io.realm.annotations.RealmNamingPolicy fieldNamingPolicy() default io.realm.annotations.RealmNamingPolicy.NO_POLICY;

    boolean library() default false;
}
