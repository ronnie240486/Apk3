package retrofit2;

/* JADX INFO: loaded from: classes2.dex */
abstract class ServiceMethod<T> {
    public ServiceMethod() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> retrofit2.ServiceMethod<T> parseAnnotations(retrofit2.Retrofit r5, java.lang.reflect.Method r6) {
            retrofit2.RequestFactory$Builder r0 = new retrofit2.RequestFactory$Builder
            r0.<init>(r5, r6)
            retrofit2.RequestFactory r0 = r0.build()
            java.lang.reflect.Type r1 = r6.getGenericReturnType()
            boolean r2 = retrofit2.Utils.hasUnresolvableType(r1)
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L27
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L1e
            retrofit2.HttpServiceMethod r5 = retrofit2.HttpServiceMethod.parseAnnotations(r5, r6, r0)
            return r5
        L1e:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r0 = "Service methods cannot return void."
            java.lang.RuntimeException r5 = retrofit2.Utils.methodError(r6, r3, r0, r5)
            throw r5
        L27:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r1
            java.lang.String r0 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.RuntimeException r5 = retrofit2.Utils.methodError(r6, r3, r0, r5)
            throw r5
    }

    @javax.annotation.Nullable
    public abstract T invoke(java.lang.Object[] r1);
}
