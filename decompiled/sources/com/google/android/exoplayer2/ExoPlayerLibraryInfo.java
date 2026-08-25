package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;
    public static final java.lang.String TAG = "ExoPlayerLib";
    public static final boolean TRACE_ENABLED = true;
    public static final java.lang.String VERSION = "2.18.6";
    public static final int VERSION_INT = 2018006;
    public static final java.lang.String VERSION_SLASHY = "ExoPlayerLib/2.18.6";
    private static final java.util.HashSet<java.lang.String> registeredModules = null;
    private static java.lang.String registeredModulesString;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registeredModules = r0
            java.lang.String r0 = "goog.exo.core"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registeredModulesString = r0
            return
    }

    private ExoPlayerLibraryInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized void registerModule(java.lang.String r3) {
            java.lang.Class<com.google.android.exoplayer2.ExoPlayerLibraryInfo> r0 = com.google.android.exoplayer2.ExoPlayerLibraryInfo.class
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = com.google.android.exoplayer2.ExoPlayerLibraryInfo.registeredModules     // Catch: java.lang.Throwable -> L25
            boolean r1 = r1.add(r3)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = com.google.android.exoplayer2.ExoPlayerLibraryInfo.registeredModulesString     // Catch: java.lang.Throwable -> L25
            r1.append(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch: java.lang.Throwable -> L25
            r1.append(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L25
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registeredModulesString = r3     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r0)
            return
        L25:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static synchronized java.lang.String registeredModules() {
            java.lang.Class<com.google.android.exoplayer2.ExoPlayerLibraryInfo> r0 = com.google.android.exoplayer2.ExoPlayerLibraryInfo.class
            monitor-enter(r0)
            java.lang.String r1 = com.google.android.exoplayer2.ExoPlayerLibraryInfo.registeredModulesString     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
