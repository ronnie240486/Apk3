package com.google.gson.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnsafeAllocator {





    public UnsafeAllocator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void assertInstantiable(java.lang.Class<?> r2) {
            int r0 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isInterface(r0)
            if (r1 != 0) goto L28
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L11
            return
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Abstract class can't be instantiated! Class name: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L28:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Interface can't be instantiated! Interface name: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static com.google.gson.internal.UnsafeAllocator create() {
            java.lang.String r0 = "newInstance"
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "sun.misc.Unsafe"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L2c
            java.lang.String r5 = "theUnsafe"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L2c
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L2c
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L2c
            java.lang.String r6 = "allocateInstance"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2c
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            r7[r2] = r8     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch: java.lang.Exception -> L2c
            com.google.gson.internal.UnsafeAllocator$1 r6 = new com.google.gson.internal.UnsafeAllocator$1     // Catch: java.lang.Exception -> L2c
            r6.<init>(r4, r5)     // Catch: java.lang.Exception -> L2c
            return r6
        L2c:
            r4 = 2
            java.lang.Class<java.io.ObjectStreamClass> r5 = java.io.ObjectStreamClass.class
            java.lang.String r6 = "getConstructorId"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L67
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            r7[r2] = r8     // Catch: java.lang.Exception -> L67
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch: java.lang.Exception -> L67
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L67
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L67
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r2] = r7     // Catch: java.lang.Exception -> L67
            java.lang.Object r1 = r5.invoke(r1, r6)     // Catch: java.lang.Exception -> L67
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L67
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L67
            java.lang.Class<java.io.ObjectStreamClass> r5 = java.io.ObjectStreamClass.class
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L67
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            r6[r2] = r7     // Catch: java.lang.Exception -> L67
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L67
            r6[r3] = r7     // Catch: java.lang.Exception -> L67
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r0, r6)     // Catch: java.lang.Exception -> L67
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L67
            com.google.gson.internal.UnsafeAllocator$2 r6 = new com.google.gson.internal.UnsafeAllocator$2     // Catch: java.lang.Exception -> L67
            r6.<init>(r5, r1)     // Catch: java.lang.Exception -> L67
            return r6
        L67:
            java.lang.Class<java.io.ObjectInputStream> r1 = java.io.ObjectInputStream.class
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L80
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4[r2] = r5     // Catch: java.lang.Exception -> L80
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r4[r3] = r2     // Catch: java.lang.Exception -> L80
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r4)     // Catch: java.lang.Exception -> L80
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L80
            com.google.gson.internal.UnsafeAllocator$3 r1 = new com.google.gson.internal.UnsafeAllocator$3     // Catch: java.lang.Exception -> L80
            r1.<init>(r0)     // Catch: java.lang.Exception -> L80
            return r1
        L80:
            com.google.gson.internal.UnsafeAllocator$4 r0 = new com.google.gson.internal.UnsafeAllocator$4
            r0.<init>()
            return r0
    }

    public abstract <T> T newInstance(java.lang.Class<T> r1) throws java.lang.Exception;
}
