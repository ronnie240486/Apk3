package pl.droidsonroids.relinker;

/* JADX INFO: loaded from: classes3.dex */
public class ReLinkerInstance {
    private static final java.lang.String LIB_DIR = "lib";
    public boolean force;
    public final pl.droidsonroids.relinker.ReLinker.LibraryInstaller libraryInstaller;
    public final pl.droidsonroids.relinker.ReLinker.LibraryLoader libraryLoader;
    public final java.util.Set<java.lang.String> loadedLibraries;
    public pl.droidsonroids.relinker.ReLinker.Logger logger;
    public boolean recursive;



    public ReLinkerInstance() {
            r3 = this;
            pl.droidsonroids.relinker.SystemLibraryLoader r0 = new pl.droidsonroids.relinker.SystemLibraryLoader
            r0.<init>()
            pl.droidsonroids.relinker.ApkLibraryInstaller r1 = new pl.droidsonroids.relinker.ApkLibraryInstaller
            r1.<init>()
            r3.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3.loadedLibraries = r2
            r3.libraryLoader = r0
            r3.libraryInstaller = r1
            return
    }

    public static /* synthetic */ void access$000(pl.droidsonroids.relinker.ReLinkerInstance r0, android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0.loadLibraryInternal(r1, r2, r3)
            return
    }

    private void loadLibraryInternal(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            java.util.Set<java.lang.String> r0 = r11.loadedLibraries
            boolean r0 = r0.contains(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L18
            boolean r0 = r11.force
            if (r0 != 0) goto L18
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r13
            java.lang.String r13 = "%s already loaded previously!"
            r11.log(r13, r12)
            return
        L18:
            r0 = 2
            pl.droidsonroids.relinker.ReLinker$LibraryLoader r3 = r11.libraryLoader     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r3.loadLibrary(r13)     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            java.util.Set<java.lang.String> r3 = r11.loadedLibraries     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r3.add(r13)     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            java.lang.String r3 = "%s (%s) was loaded normally!"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r4[r2] = r13     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r4[r1] = r14     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            r11.log(r3, r4)     // Catch: java.lang.UnsatisfiedLinkError -> L2f
            return
        L2f:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            r4[r2] = r3
            java.lang.String r3 = "Loading the library normally failed: %s"
            r11.log(r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r13
            r3[r1] = r14
            java.lang.String r4 = "%s (%s) was not loaded normally, re-linking..."
            r11.log(r4, r3)
            java.io.File r3 = r11.getWorkaroundLibFile(r12, r13, r14)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L56
            boolean r4 = r11.force
            if (r4 == 0) goto Lb3
        L56:
            boolean r4 = r11.force
            if (r4 == 0) goto L65
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r13
            r4[r1] = r14
            java.lang.String r5 = "Forcing a re-link of %s (%s)..."
            r11.log(r5, r4)
        L65:
            java.lang.String r4 = "lib"
            java.io.File r4 = r12.getDir(r4, r2)
            java.io.File r5 = r11.getWorkaroundLibFile(r12, r13, r14)
            pl.droidsonroids.relinker.ReLinker$LibraryLoader r6 = r11.libraryLoader
            java.lang.String r6 = r6.mapLibraryName(r13)
            pl.droidsonroids.relinker.ReLinkerInstance$2 r7 = new pl.droidsonroids.relinker.ReLinkerInstance$2
            r7.<init>(r6)
            java.io.File[] r4 = r4.listFiles(r7)
            if (r4 != 0) goto L81
            goto L9f
        L81:
            int r6 = r4.length
            r7 = 0
        L83:
            if (r7 >= r6) goto L9f
            r8 = r4[r7]
            boolean r9 = r11.force
            if (r9 != 0) goto L99
            java.lang.String r9 = r8.getAbsolutePath()
            java.lang.String r10 = r5.getAbsolutePath()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L9c
        L99:
            r8.delete()
        L9c:
            int r7 = r7 + 1
            goto L83
        L9f:
            pl.droidsonroids.relinker.ReLinker$LibraryInstaller r5 = r11.libraryInstaller
            pl.droidsonroids.relinker.ReLinker$LibraryLoader r4 = r11.libraryLoader
            java.lang.String[] r7 = r4.supportedAbis()
            pl.droidsonroids.relinker.ReLinker$LibraryLoader r4 = r11.libraryLoader
            java.lang.String r8 = r4.mapLibraryName(r13)
            r6 = r12
            r9 = r3
            r10 = r11
            r5.installLibrary(r6, r7, r8, r9, r10)
        Lb3:
            boolean r4 = r11.recursive     // Catch: java.io.IOException -> Le6
            if (r4 == 0) goto Le6
            r4 = 0
            pl.droidsonroids.relinker.elf.ElfParser r5 = new pl.droidsonroids.relinker.elf.ElfParser     // Catch: java.lang.Throwable -> Le1
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Le1
            java.util.List r4 = r5.parseNeededDependencies()     // Catch: java.lang.Throwable -> Lde
            r5.close()     // Catch: java.io.IOException -> Le6
            java.util.Iterator r4 = r4.iterator()     // Catch: java.io.IOException -> Le6
        Lc8:
            boolean r5 = r4.hasNext()     // Catch: java.io.IOException -> Le6
            if (r5 == 0) goto Le6
            java.lang.Object r5 = r4.next()     // Catch: java.io.IOException -> Le6
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.io.IOException -> Le6
            pl.droidsonroids.relinker.ReLinker$LibraryLoader r6 = r11.libraryLoader     // Catch: java.io.IOException -> Le6
            java.lang.String r5 = r6.unmapLibraryName(r5)     // Catch: java.io.IOException -> Le6
            r11.loadLibrary(r12, r5)     // Catch: java.io.IOException -> Le6
            goto Lc8
        Lde:
            r12 = move-exception
            r4 = r5
            goto Le2
        Le1:
            r12 = move-exception
        Le2:
            r4.close()     // Catch: java.io.IOException -> Le6
            throw r12     // Catch: java.io.IOException -> Le6
        Le6:
            pl.droidsonroids.relinker.ReLinker$LibraryLoader r12 = r11.libraryLoader
            java.lang.String r3 = r3.getAbsolutePath()
            r12.loadPath(r3)
            java.util.Set<java.lang.String> r12 = r11.loadedLibraries
            r12.add(r13)
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r2] = r13
            r12[r1] = r14
            java.lang.String r13 = "%s (%s) was re-linked!"
            r11.log(r13, r12)
            return
    }

    public pl.droidsonroids.relinker.ReLinkerInstance force() {
            r1 = this;
            r0 = 1
            r1.force = r0
            return r1
    }

    public final java.io.File getWorkaroundLibFile(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            pl.droidsonroids.relinker.ReLinker$LibraryLoader r0 = r3.libraryLoader
            java.lang.String r5 = r0.mapLibraryName(r5)
            boolean r0 = pl.droidsonroids.relinker.TextUtils.isEmpty(r6)
            r1 = 0
            java.lang.String r2 = "lib"
            if (r0 == 0) goto L19
            java.io.File r6 = new java.io.File
            java.io.File r4 = r4.getDir(r2, r1)
            r6.<init>(r4, r5)
            return r6
        L19:
            java.io.File r0 = new java.io.File
            java.io.File r4 = r4.getDir(r2, r1)
            java.lang.String r1 = "."
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r1, r6)
            r0.<init>(r4, r5)
            return r0
    }

    public void loadLibrary(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.loadLibrary(r2, r3, r0, r0)
            return
    }

    public void loadLibrary(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.loadLibrary(r2, r3, r4, r0)
            return
    }

    public void loadLibrary(android.content.Context r9, java.lang.String r10, java.lang.String r11, pl.droidsonroids.relinker.ReLinker.LoadListener r12) {
            r8 = this;
            if (r9 == 0) goto L35
            boolean r0 = pl.droidsonroids.relinker.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L2d
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r10
            java.lang.String r1 = "Beginning load of %s..."
            r8.log(r1, r0)
            if (r12 != 0) goto L19
            r8.loadLibraryInternal(r9, r10, r11)
            goto L2c
        L19:
            java.lang.Thread r0 = new java.lang.Thread
            pl.droidsonroids.relinker.ReLinkerInstance$1 r7 = new pl.droidsonroids.relinker.ReLinkerInstance$1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.<init>(r7)
            r0.start()
        L2c:
            return
        L2d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Given library is either null or empty"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Given context is null"
            r9.<init>(r10)
            throw r9
    }

    public void loadLibrary(android.content.Context r2, java.lang.String r3, pl.droidsonroids.relinker.ReLinker.LoadListener r4) {
            r1 = this;
            r0 = 0
            r1.loadLibrary(r2, r3, r0, r4)
            return
    }

    public pl.droidsonroids.relinker.ReLinkerInstance log(pl.droidsonroids.relinker.ReLinker.Logger r1) {
            r0 = this;
            r0.logger = r1
            return r0
    }

    public void log(java.lang.String r2) {
            r1 = this;
            pl.droidsonroids.relinker.ReLinker$Logger r0 = r1.logger
            if (r0 == 0) goto L7
            r0.log(r2)
        L7:
            return
    }

    public void log(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            r1.log(r2)
            return
    }

    public pl.droidsonroids.relinker.ReLinkerInstance recursively() {
            r1 = this;
            r0 = 1
            r1.recursive = r0
            return r1
    }
}
