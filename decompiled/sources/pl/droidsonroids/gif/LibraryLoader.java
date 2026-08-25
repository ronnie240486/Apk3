package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
public class LibraryLoader {
    private static final java.lang.String BASE_LIBRARY_NAME = "pl_droidsonroids_gif";

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static android.content.Context sAppContext;

    private LibraryLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.Context getContext() {
            android.content.Context r0 = pl.droidsonroids.gif.LibraryLoader.sAppContext
            if (r0 != 0) goto L28
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "currentApplication"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L1f
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1f
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Exception -> L1f
            pl.droidsonroids.gif.LibraryLoader.sAppContext = r0     // Catch: java.lang.Exception -> L1f
            goto L28
        L1f:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes."
            r1.<init>(r2, r0)
            throw r1
        L28:
            android.content.Context r0 = pl.droidsonroids.gif.LibraryLoader.sAppContext
            return r0
    }

    public static void initialize(@androidx.annotation.NonNull android.content.Context r0) {
            android.content.Context r0 = r0.getApplicationContext()
            pl.droidsonroids.gif.LibraryLoader.sAppContext = r0
            return
    }

    public static void loadLibrary() {
            java.lang.String r0 = "pl_droidsonroids_gif"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L6
            goto Ld
        L6:
            android.content.Context r1 = getContext()
            pl.droidsonroids.relinker.ReLinker.loadLibrary(r1, r0)
        Ld:
            return
    }
}
