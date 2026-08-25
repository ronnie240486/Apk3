package com.getkeepsafe.relinker;

/* JADX INFO: loaded from: classes2.dex */
public class ReLinker {

    public interface LibraryInstaller {
        void installLibrary(android.content.Context r1, java.lang.String[] r2, java.lang.String r3, java.io.File r4, com.getkeepsafe.relinker.ReLinkerInstance r5);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface LibraryLoader {
        void loadLibrary(java.lang.String r1);

        void loadPath(java.lang.String r1);

        java.lang.String mapLibraryName(java.lang.String r1);

        java.lang.String[] supportedAbis();

        java.lang.String unmapLibraryName(java.lang.String r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface LoadListener {
        void failure(java.lang.Throwable r1);

        void success();
    }

    public interface Logger {
        void log(java.lang.String r1);
    }

    private ReLinker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.getkeepsafe.relinker.ReLinkerInstance force() {
            com.getkeepsafe.relinker.ReLinkerInstance r0 = new com.getkeepsafe.relinker.ReLinkerInstance
            r0.<init>()
            com.getkeepsafe.relinker.ReLinkerInstance r0 = r0.force()
            return r0
    }

    public static void loadLibrary(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            loadLibrary(r1, r2, r0, r0)
            return
    }

    public static void loadLibrary(android.content.Context r1, java.lang.String r2, com.getkeepsafe.relinker.ReLinker.LoadListener r3) {
            r0 = 0
            loadLibrary(r1, r2, r0, r3)
            return
    }

    public static void loadLibrary(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            loadLibrary(r1, r2, r3, r0)
            return
    }

    public static void loadLibrary(android.content.Context r1, java.lang.String r2, java.lang.String r3, com.getkeepsafe.relinker.ReLinker.LoadListener r4) {
            com.getkeepsafe.relinker.ReLinkerInstance r0 = new com.getkeepsafe.relinker.ReLinkerInstance
            r0.<init>()
            r0.loadLibrary(r1, r2, r3, r4)
            return
    }

    public static com.getkeepsafe.relinker.ReLinkerInstance log(com.getkeepsafe.relinker.ReLinker.Logger r1) {
            com.getkeepsafe.relinker.ReLinkerInstance r0 = new com.getkeepsafe.relinker.ReLinkerInstance
            r0.<init>()
            com.getkeepsafe.relinker.ReLinkerInstance r1 = r0.log(r1)
            return r1
    }

    public static com.getkeepsafe.relinker.ReLinkerInstance recursively() {
            com.getkeepsafe.relinker.ReLinkerInstance r0 = new com.getkeepsafe.relinker.ReLinkerInstance
            r0.<init>()
            com.getkeepsafe.relinker.ReLinkerInstance r0 = r0.recursively()
            return r0
    }
}
