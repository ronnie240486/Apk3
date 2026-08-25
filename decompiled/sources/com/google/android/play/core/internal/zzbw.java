package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbw {
    public static com.google.android.play.core.internal.zzbu zza(java.lang.Object r1, java.lang.String r2, java.lang.Class r3) {
            com.google.android.play.core.internal.zzbu r0 = new com.google.android.play.core.internal.zzbu
            java.lang.reflect.Field r2 = zzh(r1, r2)
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.play.core.internal.zzbv zzb(java.lang.Object r1, java.lang.String r2, java.lang.Class r3) {
            com.google.android.play.core.internal.zzbv r0 = new com.google.android.play.core.internal.zzbv
            java.lang.reflect.Field r2 = zzh(r1, r2)
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static java.lang.Object zzc(java.lang.Class r4) {
            r0 = 1
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Constructor r2 = r4.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L18
            boolean r3 = r2.isAccessible()     // Catch: java.lang.Exception -> L18
            if (r3 != 0) goto L11
            r2.setAccessible(r0)     // Catch: java.lang.Exception -> L18
        L11:
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L18
            java.lang.Object r4 = r2.newInstance(r3)     // Catch: java.lang.Exception -> L18
            return r4
        L18:
            r2 = move-exception
            com.google.android.play.core.internal.zzbx r3 = new com.google.android.play.core.internal.zzbx
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = r4.getName()
            r0[r1] = r4
            java.lang.String r4 = "Failed to invoke default constructor on class %s"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r3.<init>(r4, r2)
            throw r3
    }

    public static java.lang.Object zzd(java.lang.Object r3, java.lang.String r4, java.lang.Class r5, java.lang.Class r6, java.lang.Object r7) {
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            r2 = 0
            r1[r2] = r6
            java.lang.Class r6 = r3.getClass()
            java.lang.reflect.Method r6 = zzi(r6, r4, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L1b
            r1[r2] = r7     // Catch: java.lang.Exception -> L1b
            java.lang.Object r6 = r6.invoke(r3, r1)     // Catch: java.lang.Exception -> L1b
            java.lang.Object r3 = r5.cast(r6)     // Catch: java.lang.Exception -> L1b
            return r3
        L1b:
            r5 = move-exception
            com.google.android.play.core.internal.zzbx r6 = new com.google.android.play.core.internal.zzbx
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r4
            java.lang.Class r3 = r3.getClass()
            r7[r0] = r3
            java.lang.String r3 = "Failed to invoke method %s on an object of type %s"
            java.lang.String r3 = java.lang.String.format(r3, r7)
            r6.<init>(r3, r5)
            throw r6
    }

    public static java.lang.Object zze(java.lang.Object r3, java.lang.String r4, java.lang.Class r5, java.lang.Class r6, java.lang.Object r7, java.lang.Class r8, java.lang.Object r9, java.lang.Class r10, java.lang.Object r11) {
            r0 = 3
            java.lang.Class[] r1 = new java.lang.Class[r0]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r8
            r8 = 2
            r1[r8] = r10
            java.lang.Class r10 = r3.getClass()
            java.lang.reflect.Method r10 = zzi(r10, r4, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L25
            r0[r2] = r7     // Catch: java.lang.Exception -> L25
            r0[r6] = r9     // Catch: java.lang.Exception -> L25
            r0[r8] = r11     // Catch: java.lang.Exception -> L25
            java.lang.Object r7 = r10.invoke(r3, r0)     // Catch: java.lang.Exception -> L25
            java.lang.Object r3 = r5.cast(r7)     // Catch: java.lang.Exception -> L25
            return r3
        L25:
            r5 = move-exception
            com.google.android.play.core.internal.zzbx r7 = new com.google.android.play.core.internal.zzbx
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r4
            java.lang.Class r3 = r3.getClass()
            r8[r6] = r3
            java.lang.String r3 = "Failed to invoke method %s on an object of type %s"
            java.lang.String r3 = java.lang.String.format(r3, r8)
            r7.<init>(r3, r5)
            throw r7
    }

    public static java.lang.Object zzf(java.lang.Class r3, java.lang.String r4, java.lang.Class r5, java.lang.Class r6, java.lang.Object r7) {
            r4 = 1
            java.lang.Class[] r0 = new java.lang.Class[r4]
            r1 = 0
            r0[r1] = r6
            java.lang.String r6 = "isDexOptNeeded"
            java.lang.reflect.Method r0 = zzi(r3, r6, r0)
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L1a
            r2[r1] = r7     // Catch: java.lang.Exception -> L1a
            r7 = 0
            java.lang.Object r7 = r0.invoke(r7, r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r3 = r5.cast(r7)     // Catch: java.lang.Exception -> L1a
            return r3
        L1a:
            r5 = move-exception
            com.google.android.play.core.internal.zzbx r7 = new com.google.android.play.core.internal.zzbx
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r6
            r0[r4] = r3
            java.lang.String r3 = "Failed to invoke static method %s on type %s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r7.<init>(r3, r5)
            throw r7
    }

    public static java.lang.Object zzg(java.lang.Class r3, java.lang.String r4, java.lang.Class r5, java.lang.Class r6, java.lang.Object r7, java.lang.Class r8, java.lang.Object r9) {
            r4 = 2
            java.lang.Class[] r0 = new java.lang.Class[r4]
            r1 = 0
            r0[r1] = r6
            r6 = 1
            r0[r6] = r8
            java.lang.String r8 = "optimizedPathFor"
            java.lang.reflect.Method r0 = zzi(r3, r8, r0)
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L1f
            r2[r1] = r7     // Catch: java.lang.Exception -> L1f
            r2[r6] = r9     // Catch: java.lang.Exception -> L1f
            r7 = 0
            java.lang.Object r7 = r0.invoke(r7, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.Object r3 = r5.cast(r7)     // Catch: java.lang.Exception -> L1f
            return r3
        L1f:
            r5 = move-exception
            com.google.android.play.core.internal.zzbx r7 = new com.google.android.play.core.internal.zzbx
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r6] = r3
            java.lang.String r3 = "Failed to invoke static method %s on type %s"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r7.<init>(r3, r5)
            throw r7
    }

    private static java.lang.reflect.Field zzh(java.lang.Object r4, java.lang.String r5) {
            java.lang.Class r0 = r4.getClass()
        L4:
            r1 = 1
            if (r0 == 0) goto L1a
            java.lang.reflect.Field r2 = r0.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L15
            boolean r3 = r2.isAccessible()     // Catch: java.lang.NoSuchFieldException -> L15
            if (r3 != 0) goto L14
            r2.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L15
        L14:
            return r2
        L15:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L1a:
            com.google.android.play.core.internal.zzbx r0 = new com.google.android.play.core.internal.zzbx
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r2[r1] = r4
            java.lang.String r4 = "Failed to find a field named %s on an object of instance %s"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
    }

    private static java.lang.reflect.Method zzi(java.lang.Class r4, java.lang.String r5, java.lang.Class... r6) {
            r0 = r4
        L1:
            r1 = 1
            if (r0 == 0) goto L17
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L12
            boolean r3 = r2.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L12
            if (r3 != 0) goto L11
            r2.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L12
        L11:
            return r2
        L12:
            java.lang.Class r0 = r0.getSuperclass()
            goto L1
        L17:
            com.google.android.play.core.internal.zzbx r0 = new com.google.android.play.core.internal.zzbx
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.util.List r5 = java.util.Arrays.asList(r6)
            r2[r1] = r5
            r5 = 2
            r2[r5] = r4
            java.lang.String r4 = "Could not find a method named %s with parameters %s in type %s"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
    }
}
