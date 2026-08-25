package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.util.RetainForClient
@com.google.android.gms.common.annotation.KeepForSdk
public final class ObjectWrapper<T> extends com.google.android.gms.dynamic.IObjectWrapper.Stub {
    private final T zza;

    private ObjectWrapper(T r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> T unwrap(@androidx.annotation.NonNull com.google.android.gms.dynamic.IObjectWrapper r7) {
            boolean r0 = r7 instanceof com.google.android.gms.dynamic.ObjectWrapper
            if (r0 == 0) goto L9
            com.google.android.gms.dynamic.ObjectWrapper r7 = (com.google.android.gms.dynamic.ObjectWrapper) r7
            T r7 = r7.zza
            return r7
        L9:
            android.os.IBinder r7 = r7.asBinder()
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 0
        L19:
            if (r3 >= r1) goto L29
            r5 = r0[r3]
            boolean r6 = r5.isSynthetic()
            if (r6 != 0) goto L26
            int r4 = r4 + 1
            r2 = r5
        L26:
            int r3 = r3 + 1
            goto L19
        L29:
            r1 = 1
            if (r4 != r1) goto L57
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            boolean r0 = r2.isAccessible()
            if (r0 != 0) goto L4f
            r2.setAccessible(r1)
            java.lang.Object r7 = r2.get(r7)     // Catch: java.lang.IllegalAccessException -> L3d java.lang.NullPointerException -> L46
            return r7
        L3d:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Could not access the field in remoteBinder."
            r0.<init>(r1, r7)
            throw r0
        L46:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Binder object is null."
            r0.<init>(r1, r7)
            throw r0
        L4f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "IObjectWrapper declared field not private!"
            r7.<init>(r0)
            throw r7
        L57:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            int r0 = r0.length
            r1 = 64
            java.lang.String r2 = "Unexpected number of IObjectWrapper declared fields: "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
            r7.<init>(r0)
            throw r7
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> com.google.android.gms.dynamic.IObjectWrapper wrap(@androidx.annotation.NonNull T r1) {
            com.google.android.gms.dynamic.ObjectWrapper r0 = new com.google.android.gms.dynamic.ObjectWrapper
            r0.<init>(r1)
            return r0
    }
}
