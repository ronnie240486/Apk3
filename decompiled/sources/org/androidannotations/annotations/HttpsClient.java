package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface HttpsClient {
    public static final java.lang.String DEFAULT_PASSWD = "changeit";

    boolean allowAllHostnames() default true;

    int keyStore() default -1;

    java.lang.String keyStorePwd() default "changeit";

    java.lang.String keyStoreResName() default "";

    int trustStore() default -1;

    java.lang.String trustStorePwd() default "changeit";

    java.lang.String trustStoreResName() default "";
}
