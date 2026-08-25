package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class Util {
    private static java.lang.Boolean coroutinesAvailable;
    private static java.lang.Boolean rxJavaAvailable;

    public Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkContainsKey(java.lang.String r2, java.util.Map<java.lang.String, ?> r3, java.lang.String r4) {
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Key '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "' required in '"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = "'."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static void checkEmpty(java.lang.String r2, java.lang.String r3) {
            boolean r2 = isEmptyString(r2)
            if (r2 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Non-empty '"
            java.lang.String r1 = "' required."
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
            r2.<init>(r3)
            throw r2
    }

    public static void checkLooperThread(java.lang.String r1) {
            io.realm.internal.android.AndroidCapabilities r0 = new io.realm.internal.android.AndroidCapabilities
            r0.<init>()
            r0.checkCanDeliverNotification(r1)
            return
    }

    public static void checkNotOnMainThread(java.lang.String r1) {
            io.realm.internal.android.AndroidCapabilities r0 = new io.realm.internal.android.AndroidCapabilities
            r0.<init>()
            boolean r0 = r0.isMainThread()
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    public static void checkNull(@javax.annotation.Nullable java.lang.Object r2, java.lang.String r3) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Nonnull '"
            java.lang.String r1 = "' required."
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
            r2.<init>(r3)
            throw r2
    }

    public static boolean deleteRealm(java.lang.String r8, java.io.File r9, java.lang.String r10) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".management"
            java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r1)
            r0.<init>(r9, r10)
            java.io.File r9 = new java.io.File
            r9.<init>(r8)
            java.io.File r10 = new java.io.File
            java.lang.String r1 = ".note"
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r1)
            r10.<init>(r8)
            java.io.File[] r8 = r0.listFiles()
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L47
            int r3 = r8.length
            r4 = 0
        L25:
            if (r4 >= r3) goto L47
            r5 = r8[r4]
            boolean r6 = r5.delete()
            if (r6 != 0) goto L44
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r5 = r5.getAbsolutePath()
            r7[r2] = r5
            java.lang.String r5 = "Realm temporary file at %s cannot be deleted"
            java.lang.String r5 = java.lang.String.format(r6, r5, r7)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            io.realm.log.RealmLog.warn(r5, r6)
        L44:
            int r4 = r4 + 1
            goto L25
        L47:
            boolean r8 = r0.exists()
            if (r8 == 0) goto L68
            boolean r8 = r0.delete()
            if (r8 != 0) goto L68
            java.util.Locale r8 = java.util.Locale.ENGLISH
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getAbsolutePath()
            r3[r2] = r0
            java.lang.String r0 = "Realm temporary folder at %s cannot be deleted"
            java.lang.String r8 = java.lang.String.format(r8, r0, r3)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            io.realm.log.RealmLog.warn(r8, r0)
        L68:
            boolean r8 = r9.exists()
            if (r8 == 0) goto L8a
            boolean r8 = r9.delete()
            if (r8 != 0) goto L8b
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r9 = r9.getAbsolutePath()
            r3[r2] = r9
            java.lang.String r9 = "Realm file at %s cannot be deleted"
            java.lang.String r9 = java.lang.String.format(r0, r9, r3)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            io.realm.log.RealmLog.warn(r9, r0)
            goto L8b
        L8a:
            r8 = 1
        L8b:
            boolean r9 = r10.exists()
            if (r9 == 0) goto Lac
            boolean r9 = r10.delete()
            if (r9 != 0) goto Lac
            java.util.Locale r9 = java.util.Locale.ENGLISH
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r10 = r10.getAbsolutePath()
            r0[r2] = r10
            java.lang.String r10 = ".note file at %s cannot be deleted"
            java.lang.String r9 = java.lang.String.format(r9, r10, r0)
            java.lang.Object[] r10 = new java.lang.Object[r2]
            io.realm.log.RealmLog.warn(r9, r10)
        Lac:
            return r8
    }

    public static java.lang.Class<?> getClassForName(java.lang.String r3) {
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L5
            return r3
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Class '"
            java.lang.String r2 = "' does not exist."
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    public static java.lang.Class<? extends io.realm.RealmModel> getOriginalModelClass(java.lang.Class<? extends io.realm.RealmModel> r3) {
            java.lang.Class<io.realm.RealmObject> r0 = io.realm.RealmObject.class
            java.lang.Class<io.realm.RealmModel> r1 = io.realm.RealmModel.class
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L24
            boolean r1 = r3.equals(r0)
            if (r1 != 0) goto L24
            java.lang.Class r1 = r3.getSuperclass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L23
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            r3 = r1
        L23:
            return r3
        L24:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class."
            r3.<init>(r0)
            throw r3
    }

    public static java.lang.String getStackTrace(java.lang.Throwable r3) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = 1
            r1.<init>(r0, r2)
            r3.printStackTrace(r1)
            java.lang.StringBuffer r3 = r0.getBuffer()
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.String getTablePrefix() {
            java.lang.String r0 = nativeGetTablePrefix()
            return r0
    }

    public static synchronized boolean isCoroutinesAvailable() {
            java.lang.Class<io.realm.internal.Util> r0 = io.realm.internal.Util.class
            monitor-enter(r0)
            java.lang.Boolean r1 = io.realm.internal.Util.coroutinesAvailable     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L10
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.ClassNotFoundException -> Lc java.lang.Throwable -> L18
            io.realm.internal.Util.coroutinesAvailable = r1     // Catch: java.lang.ClassNotFoundException -> Lc java.lang.Throwable -> L18
            goto L10
        Lc:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L18
            io.realm.internal.Util.coroutinesAvailable = r1     // Catch: java.lang.Throwable -> L18
        L10:
            java.lang.Boolean r1 = io.realm.internal.Util.coroutinesAvailable     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            return r1
        L18:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static boolean isEmptyString(@javax.annotation.Nullable java.lang.String r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public static boolean isEmulator() {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "generic"
            boolean r2 = r0.startsWith(r1)
            if (r2 != 0) goto L52
            java.lang.String r2 = "unknown"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L52
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r2 = "google_sdk"
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L52
            java.lang.String r3 = "Emulator"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L52
            java.lang.String r3 = "Android SDK built for x86"
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L52
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "Genymotion"
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L52
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L47
            java.lang.String r0 = android.os.Build.DEVICE
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L52
        L47:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L50
            goto L52
        L50:
            r0 = 0
            goto L53
        L52:
            r0 = 1
        L53:
            return r0
    }

    public static synchronized boolean isRxJavaAvailable() {
            java.lang.Class<io.realm.internal.Util> r0 = io.realm.internal.Util.class
            monitor-enter(r0)
            java.lang.Boolean r1 = io.realm.internal.Util.rxJavaAvailable     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L15
            java.lang.String r1 = "io.reactivex.Flowable"
            java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.Throwable -> L1d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.Throwable -> L1d
            io.realm.internal.Util.rxJavaAvailable = r1     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.Throwable -> L1d
            goto L15
        L11:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1d
            io.realm.internal.Util.rxJavaAvailable = r1     // Catch: java.lang.Throwable -> L1d
        L15:
            java.lang.Boolean r1 = io.realm.internal.Util.rxJavaAvailable     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return r1
        L1d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static native java.lang.String nativeGetTablePrefix();

    public static <T> java.util.Set<T> toSet(T... r3) {
            if (r3 != 0) goto L7
            java.util.Set r3 = java.util.Collections.emptySet()
            return r3
        L7:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1 = 0
        Ld:
            int r2 = r3.length
            if (r1 >= r2) goto L1a
            r2 = r3[r1]
            if (r2 == 0) goto L17
            r0.add(r2)
        L17:
            int r1 = r1 + 1
            goto Ld
        L1a:
            return r0
    }
}
