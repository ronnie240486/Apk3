package io.realm.log;

/* JADX INFO: loaded from: classes2.dex */
public final class RealmLog {
    private static java.lang.String REALM_JAVA_TAG = "REALM_JAVA";

    public RealmLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void add(io.realm.log.RealmLogger r1) {
            if (r1 == 0) goto L6
            nativeAddLogger(r1)
            return
        L6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A non-null logger has to be provided"
            r1.<init>(r0)
            throw r1
    }

    public static void clear() {
            nativeClearLoggers()
            return
    }

    public static void debug(java.lang.String r1, java.lang.Object... r2) {
            r0 = 0
            debug(r0, r1, r2)
            return
    }

    public static void debug(@javax.annotation.Nullable java.lang.Throwable r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            debug(r2, r1, r0)
            return
    }

    public static void debug(@javax.annotation.Nullable java.lang.Throwable r1, @javax.annotation.Nullable java.lang.String r2, java.lang.Object... r3) {
            r0 = 3
            log(r0, r1, r2, r3)
            return
    }

    public static void error(java.lang.String r1, java.lang.Object... r2) {
            r0 = 0
            error(r0, r1, r2)
            return
    }

    public static void error(java.lang.Throwable r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            error(r2, r1, r0)
            return
    }

    public static void error(@javax.annotation.Nullable java.lang.Throwable r1, @javax.annotation.Nullable java.lang.String r2, java.lang.Object... r3) {
            r0 = 6
            log(r0, r1, r2, r3)
            return
    }

    public static void fatal(java.lang.String r1, java.lang.Object... r2) {
            r0 = 0
            fatal(r0, r1, r2)
            return
    }

    public static void fatal(java.lang.Throwable r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            fatal(r2, r1, r0)
            return
    }

    public static void fatal(@javax.annotation.Nullable java.lang.Throwable r1, @javax.annotation.Nullable java.lang.String r2, java.lang.Object... r3) {
            r0 = 7
            log(r0, r1, r2, r3)
            return
    }

    public static int getLevel() {
            int r0 = nativeGetLogLevel()
            return r0
    }

    public static void info(java.lang.String r1, java.lang.Object... r2) {
            r0 = 0
            info(r0, r1, r2)
            return
    }

    public static void info(java.lang.Throwable r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            info(r2, r1, r0)
            return
    }

    public static void info(@javax.annotation.Nullable java.lang.Throwable r1, @javax.annotation.Nullable java.lang.String r2, java.lang.Object... r3) {
            r0 = 4
            log(r0, r1, r2, r3)
            return
    }

    private static void log(int r2, @javax.annotation.Nullable java.lang.Throwable r3, @javax.annotation.Nullable java.lang.String r4, @javax.annotation.Nullable java.lang.Object... r5) {
            int r0 = getLevel()
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 == 0) goto L19
            if (r5 == 0) goto L19
            int r1 = r5.length
            if (r1 <= 0) goto L19
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r4 = java.lang.String.format(r1, r4, r5)
        L19:
            if (r3 == 0) goto L22
            java.lang.String r5 = android.util.Log.getStackTraceString(r3)
            r0.append(r5)
        L22:
            if (r4 == 0) goto L2e
            if (r3 == 0) goto L2b
            java.lang.String r5 = "\n"
            r0.append(r5)
        L2b:
            r0.append(r4)
        L2e:
            java.lang.String r4 = io.realm.log.RealmLog.REALM_JAVA_TAG
            java.lang.String r5 = r0.toString()
            nativeLog(r2, r4, r3, r5)
            return
    }

    private static native void nativeAddLogger(io.realm.log.RealmLogger r0);

    private static native void nativeClearLoggers();

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int r0, java.lang.String r1, @javax.annotation.Nullable java.lang.Throwable r2, @javax.annotation.Nullable java.lang.String r3);

    private static native void nativeRegisterDefaultLogger();

    private static native void nativeRemoveLogger(io.realm.log.RealmLogger r0);

    private static native void nativeSetLogLevel(int r0);

    public static void registerDefaultLogger() {
            nativeRegisterDefaultLogger()
            return
    }

    public static boolean remove(io.realm.log.RealmLogger r1) {
            if (r1 == 0) goto L7
            nativeRemoveLogger(r1)
            r1 = 1
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A non-null logger has to be provided"
            r1.<init>(r0)
            throw r1
    }

    public static void setLevel(int r2) {
            r0 = 1
            if (r2 < r0) goto Lb
            r0 = 8
            if (r2 > r0) goto Lb
            nativeSetLogLevel(r2)
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid log level: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    public static void trace(java.lang.String r1, java.lang.Object... r2) {
            r0 = 0
            trace(r0, r1, r2)
            return
    }

    public static void trace(java.lang.Throwable r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            trace(r2, r1, r0)
            return
    }

    public static void trace(@javax.annotation.Nullable java.lang.Throwable r1, @javax.annotation.Nullable java.lang.String r2, java.lang.Object... r3) {
            r0 = 2
            log(r0, r1, r2, r3)
            return
    }

    public static void warn(java.lang.String r1, java.lang.Object... r2) {
            r0 = 0
            warn(r0, r1, r2)
            return
    }

    public static void warn(java.lang.Throwable r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            warn(r2, r1, r0)
            return
    }

    public static void warn(@javax.annotation.Nullable java.lang.Throwable r1, @javax.annotation.Nullable java.lang.String r2, java.lang.Object... r3) {
            r0 = 5
            log(r0, r1, r2, r3)
            return
    }
}
