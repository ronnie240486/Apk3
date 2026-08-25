package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class RealmCore {
    private static final java.lang.String BINARIES_PATH = null;
    private static final java.lang.String FILE_SEP = null;
    private static final java.lang.String JAVA_LIBRARY_PATH = "java.library.path";
    private static final java.lang.String PATH_SEP = null;
    private static boolean libraryIsLoaded;

    static {
            java.lang.String r0 = java.io.File.separator
            io.realm.internal.RealmCore.FILE_SEP = r0
            java.lang.String r1 = java.io.File.pathSeparator
            io.realm.internal.RealmCore.PATH_SEP = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "lib"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ".."
            r2.append(r1)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            io.realm.internal.RealmCore.BINARIES_PATH = r0
            r0 = 0
            io.realm.internal.RealmCore.libraryIsLoaded = r0
            return
    }

    public RealmCore() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addNativeLibraryPath(java.lang.String r3) {
            java.lang.String r0 = "java.library.path"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L21
            r1.<init>()     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> L21
            r1.append(r2)     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = io.realm.internal.RealmCore.PATH_SEP     // Catch: java.lang.Exception -> L21
            r1.append(r2)     // Catch: java.lang.Exception -> L21
            r1.append(r3)     // Catch: java.lang.Exception -> L21
            r1.append(r2)     // Catch: java.lang.Exception -> L21
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L21
            java.lang.System.setProperty(r0, r3)     // Catch: java.lang.Exception -> L21
            return
        L21:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot set the library path!"
            r0.<init>(r1, r3)
            throw r0
    }

    private static java.lang.String loadCorrectLibrary(java.lang.String... r3) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Ld
            r2 = r3[r1]
            java.lang.System.loadLibrary(r2)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            int r1 = r1 + 1
            goto L2
        Ld:
            r3 = 0
            return r3
    }

    public static synchronized void loadLibrary(android.content.Context r3) {
            java.lang.Class<io.realm.internal.RealmCore> r0 = io.realm.internal.RealmCore.class
            monitor-enter(r0)
            boolean r1 = io.realm.internal.RealmCore.libraryIsLoaded     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            java.lang.String r1 = "realm-jni"
            java.lang.String r2 = "10.10.1"
            com.getkeepsafe.relinker.ReLinker.loadLibrary(r3, r1, r2)     // Catch: java.lang.Throwable -> L15
            r3 = 1
            io.realm.internal.RealmCore.libraryIsLoaded = r3     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    private static java.lang.String loadLibraryWindows() {
            java.lang.String r0 = io.realm.internal.RealmCore.BINARIES_PATH     // Catch: java.lang.Throwable -> L9
            addNativeLibraryPath(r0)     // Catch: java.lang.Throwable -> L9
            resetLibraryPath()     // Catch: java.lang.Throwable -> L9
            goto La
        L9:
        La:
            java.lang.String r0 = "realm_jni32d"
            java.lang.String r1 = "realm_jni64d"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = loadCorrectLibrary(r0)
            if (r0 == 0) goto L20
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "!!! Realm debug version loaded. !!!\n"
            r1.println(r2)
            goto L2e
        L20:
            java.lang.String r0 = "realm_jni32"
            java.lang.String r1 = "realm_jni64"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = loadCorrectLibrary(r0)
            if (r0 == 0) goto L2f
        L2e:
            return r0
        L2f:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Searched java.library.path="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = "java.library.path"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Couldn't load the Realm JNI library 'realm_jni32.dll or realm_jni64.dll'. Please include the directory to the library in java.library.path."
            r0.<init>(r1)
            throw r0
    }

    public static boolean osIsWindows() {
            java.lang.String r0 = "os.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "win"
            boolean r0 = r0.contains(r1)
            return r0
    }

    private static void resetLibraryPath() {
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.String r1 = "sys_paths"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L12
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L12
            r1 = 0
            r0.set(r1, r1)     // Catch: java.lang.Exception -> L12
            return
        L12:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot reset the library path!"
            r1.<init>(r2, r0)
            throw r1
    }
}
