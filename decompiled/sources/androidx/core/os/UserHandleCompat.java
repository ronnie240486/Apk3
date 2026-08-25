package androidx.core.os;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(17)
public class UserHandleCompat {

    @androidx.annotation.Nullable
    private static java.lang.reflect.Method sGetUserIdMethod;

    @androidx.annotation.Nullable
    private static java.lang.reflect.Constructor<android.os.UserHandle> sUserHandleConstructor;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static android.os.UserHandle getUserHandleForUid(int r0) {
                android.os.UserHandle r0 = android.os.UserHandle.getUserHandleForUid(r0)
                return r0
        }
    }

    private UserHandleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.reflect.Method getGetUserIdMethod() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = androidx.core.os.UserHandleCompat.sGetUserIdMethod
            if (r0 != 0) goto L19
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2[r3] = r4
            java.lang.String r3 = "getUserId"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
            androidx.core.os.UserHandleCompat.sGetUserIdMethod = r0
            r0.setAccessible(r1)
        L19:
            java.lang.reflect.Method r0 = androidx.core.os.UserHandleCompat.sGetUserIdMethod
            return r0
    }

    private static java.lang.reflect.Constructor<android.os.UserHandle> getUserHandleConstructor() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Constructor<android.os.UserHandle> r0 = androidx.core.os.UserHandleCompat.sUserHandleConstructor
            if (r0 != 0) goto L17
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2[r3] = r4
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)
            androidx.core.os.UserHandleCompat.sUserHandleConstructor = r0
            r0.setAccessible(r1)
        L17:
            java.lang.reflect.Constructor<android.os.UserHandle> r0 = androidx.core.os.UserHandleCompat.sUserHandleConstructor
            return r0
    }

    @androidx.annotation.NonNull
    public static android.os.UserHandle getUserHandleForUid(int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            android.os.UserHandle r5 = androidx.core.os.UserHandleCompat.Api24Impl.getUserHandleForUid(r5)
            return r5
        Lb:
            java.lang.reflect.Method r0 = getGetUserIdMethod()     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            r1 = 0
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            r4 = 0
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.Object r5 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Constructor r0 = getUserHandleConstructor()     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            r1[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.Object r5 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            android.os.UserHandle r5 = (android.os.UserHandle) r5     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            return r5
        L2f:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        L36:
            r5 = move-exception
            java.lang.InstantiationError r0 = new java.lang.InstantiationError
            r0.<init>()
            r0.initCause(r5)
            throw r0
        L40:
            r5 = move-exception
            java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
            r0.<init>()
            r0.initCause(r5)
            throw r0
        L4a:
            r5 = move-exception
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            r0.initCause(r5)
            throw r0
    }
}
