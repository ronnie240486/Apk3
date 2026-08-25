package com.google.gson.internal.reflect;

/* JADX INFO: loaded from: classes.dex */
final class UnsafeReflectionAccessor extends com.google.gson.internal.reflect.ReflectionAccessor {
    private static java.lang.Class unsafeClass;
    private final java.lang.reflect.Field overrideField;
    private final java.lang.Object theUnsafe;

    public UnsafeReflectionAccessor() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = getUnsafeInstance()
            r1.theUnsafe = r0
            java.lang.reflect.Field r0 = getOverrideField()
            r1.overrideField = r0
            return
    }

    private static java.lang.reflect.Field getOverrideField() {
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "override"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    private static java.lang.Object getUnsafeInstance() {
            r0 = 0
            java.lang.String r1 = "sun.misc.Unsafe"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L19
            com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass = r1     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = "theUnsafe"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L19
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L19
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L19
        L19:
            return r0
    }

    @Override // com.google.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(java.lang.reflect.AccessibleObject r11) {
            r10 = this;
            java.lang.Object r0 = r10.theUnsafe
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L56
            java.lang.reflect.Field r0 = r10.overrideField
            if (r0 == 0) goto L56
            java.lang.Class r0 = com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass     // Catch: java.lang.Exception -> L56
            java.lang.String r3 = "objectFieldOffset"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L56
            java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
            r4[r1] = r5     // Catch: java.lang.Exception -> L56
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.Exception -> L56
            java.lang.Object r3 = r10.theUnsafe     // Catch: java.lang.Exception -> L56
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L56
            java.lang.reflect.Field r5 = r10.overrideField     // Catch: java.lang.Exception -> L56
            r4[r1] = r5     // Catch: java.lang.Exception -> L56
            java.lang.Object r0 = r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L56
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Exception -> L56
            long r3 = r0.longValue()     // Catch: java.lang.Exception -> L56
            java.lang.Class r0 = com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = "putBoolean"
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L56
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r7[r1] = r8     // Catch: java.lang.Exception -> L56
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L56
            r7[r2] = r8     // Catch: java.lang.Exception -> L56
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L56
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Exception -> L56
            java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch: java.lang.Exception -> L56
            java.lang.Object r5 = r10.theUnsafe     // Catch: java.lang.Exception -> L56
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L56
            r6[r1] = r11     // Catch: java.lang.Exception -> L56
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L56
            r6[r2] = r3     // Catch: java.lang.Exception -> L56
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L56
            r6[r9] = r3     // Catch: java.lang.Exception -> L56
            r0.invoke(r5, r6)     // Catch: java.lang.Exception -> L56
            r1 = 1
        L56:
            if (r1 != 0) goto L79
            r11.setAccessible(r2)     // Catch: java.lang.SecurityException -> L5c
            goto L79
        L5c:
            r0 = move-exception
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Gson couldn't modify fields for "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe."
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r1.<init>(r11, r0)
            throw r1
        L79:
            return
    }
}
