package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class LibraryLoader {
    private static final java.lang.String TAG = "LibraryLoader";
    private boolean isAvailable;
    private boolean loadAttempted;
    private java.lang.String[] nativeLibraries;

    public LibraryLoader(java.lang.String... r1) {
            r0 = this;
            r0.<init>()
            r0.nativeLibraries = r1
            return
    }

    public synchronized boolean isAvailable() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.loadAttempted     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L9
            boolean r0 = r5.isAvailable     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return r0
        L9:
            r0 = 1
            r5.loadAttempted = r0     // Catch: java.lang.Throwable -> L3d
            java.lang.String[] r1 = r5.nativeLibraries     // Catch: java.lang.UnsatisfiedLinkError -> L1d java.lang.Throwable -> L3d
            int r2 = r1.length     // Catch: java.lang.UnsatisfiedLinkError -> L1d java.lang.Throwable -> L3d
            r3 = 0
        L10:
            if (r3 >= r2) goto L1a
            r4 = r1[r3]     // Catch: java.lang.UnsatisfiedLinkError -> L1d java.lang.Throwable -> L3d
            r5.loadLibrary(r4)     // Catch: java.lang.UnsatisfiedLinkError -> L1d java.lang.Throwable -> L3d
            int r3 = r3 + 1
            goto L10
        L1a:
            r5.isAvailable = r0     // Catch: java.lang.UnsatisfiedLinkError -> L1d java.lang.Throwable -> L3d
            goto L39
        L1d:
            java.lang.String r0 = "LibraryLoader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r1.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "Failed to load "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String[] r2 = r5.nativeLibraries     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = java.util.Arrays.toString(r2)     // Catch: java.lang.Throwable -> L3d
            r1.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3d
            com.google.android.exoplayer2.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L3d
        L39:
            boolean r0 = r5.isAvailable     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return r0
        L3d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public abstract void loadLibrary(java.lang.String r1);

    public synchronized void setLibraries(java.lang.String... r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.loadAttempted     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "Cannot set libraries after loading"
            com.google.android.exoplayer2.util.Assertions.checkState(r0, r1)     // Catch: java.lang.Throwable -> L11
            r2.nativeLibraries = r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return
        L11:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
