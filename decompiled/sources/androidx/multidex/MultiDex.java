package androidx.multidex;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiDex {
    private static final java.lang.String CODE_CACHE_NAME = "code_cache";
    private static final java.lang.String CODE_CACHE_SECONDARY_FOLDER_NAME = "secondary-dexes";
    private static final boolean IS_VM_MULTIDEX_CAPABLE = false;
    private static final int MAX_SUPPORTED_SDK_VERSION = 20;
    private static final int MIN_SDK_VERSION = 4;
    private static final java.lang.String NO_KEY_PREFIX = "";
    private static final java.lang.String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
    private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
    private static final java.util.Set<java.io.File> installedApk = null;

    /* JADX INFO: loaded from: classes.dex */
    public static final class V14 {
        private static final int EXTRACTED_SUFFIX_LENGTH = 4;
        private final androidx.multidex.MultiDex.V14.ElementConstructor elementConstructor;

        /* JADX INFO: loaded from: classes2.dex */
        public interface ElementConstructor {
            java.lang.Object newInstance(java.io.File r1, dalvik.system.DexFile r2) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.io.IOException;
        }

        public static class ICSElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> elementConstructor;

            public ICSElementConstructor(java.lang.Class<?> r5) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                    r4 = this;
                    r4.<init>()
                    r0 = 3
                    java.lang.Class[] r0 = new java.lang.Class[r0]
                    r1 = 0
                    java.lang.Class<java.io.File> r2 = java.io.File.class
                    r0[r1] = r2
                    java.lang.Class<java.util.zip.ZipFile> r1 = java.util.zip.ZipFile.class
                    r2 = 1
                    r0[r2] = r1
                    r1 = 2
                    java.lang.Class<dalvik.system.DexFile> r3 = dalvik.system.DexFile.class
                    r0[r1] = r3
                    java.lang.reflect.Constructor r5 = r5.getConstructor(r0)
                    r4.elementConstructor = r5
                    r5.setAccessible(r2)
                    return
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public java.lang.Object newInstance(java.io.File r4, dalvik.system.DexFile r5) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.io.IOException {
                    r3 = this;
                    java.lang.reflect.Constructor<?> r0 = r3.elementConstructor
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r4
                    java.util.zip.ZipFile r2 = new java.util.zip.ZipFile
                    r2.<init>(r4)
                    r4 = 1
                    r1[r4] = r2
                    r4 = 2
                    r1[r4] = r5
                    java.lang.Object r4 = r0.newInstance(r1)
                    return r4
            }
        }

        public static class JBMR11ElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> elementConstructor;

            public JBMR11ElementConstructor(java.lang.Class<?> r5) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                    r4 = this;
                    r4.<init>()
                    r0 = 3
                    java.lang.Class[] r0 = new java.lang.Class[r0]
                    r1 = 0
                    java.lang.Class<java.io.File> r2 = java.io.File.class
                    r0[r1] = r2
                    java.lang.Class<java.io.File> r1 = java.io.File.class
                    r2 = 1
                    r0[r2] = r1
                    r1 = 2
                    java.lang.Class<dalvik.system.DexFile> r3 = dalvik.system.DexFile.class
                    r0[r1] = r3
                    java.lang.reflect.Constructor r5 = r5.getConstructor(r0)
                    r4.elementConstructor = r5
                    r5.setAccessible(r2)
                    return
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public java.lang.Object newInstance(java.io.File r4, dalvik.system.DexFile r5) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                    r3 = this;
                    java.lang.reflect.Constructor<?> r0 = r3.elementConstructor
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r4
                    r2 = 1
                    r1[r2] = r4
                    r4 = 2
                    r1[r4] = r5
                    java.lang.Object r4 = r0.newInstance(r1)
                    return r4
            }
        }

        public static class JBMR2ElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> elementConstructor;

            public JBMR2ElementConstructor(java.lang.Class<?> r5) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                    r4 = this;
                    r4.<init>()
                    r0 = 4
                    java.lang.Class[] r0 = new java.lang.Class[r0]
                    r1 = 0
                    java.lang.Class<java.io.File> r2 = java.io.File.class
                    r0[r1] = r2
                    java.lang.Class r1 = java.lang.Boolean.TYPE
                    r2 = 1
                    r0[r2] = r1
                    r1 = 2
                    java.lang.Class<java.io.File> r3 = java.io.File.class
                    r0[r1] = r3
                    r1 = 3
                    java.lang.Class<dalvik.system.DexFile> r3 = dalvik.system.DexFile.class
                    r0[r1] = r3
                    java.lang.reflect.Constructor r5 = r5.getConstructor(r0)
                    r4.elementConstructor = r5
                    r5.setAccessible(r2)
                    return
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public java.lang.Object newInstance(java.io.File r5, dalvik.system.DexFile r6) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                    r4 = this;
                    java.lang.reflect.Constructor<?> r0 = r4.elementConstructor
                    r1 = 4
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r5
                    java.lang.Boolean r2 = java.lang.Boolean.FALSE
                    r3 = 1
                    r1[r3] = r2
                    r2 = 2
                    r1[r2] = r5
                    r5 = 3
                    r1[r5] = r6
                    java.lang.Object r5 = r0.newInstance(r1)
                    return r5
            }
        }

        private V14() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                androidx.multidex.MultiDex$V14$ICSElementConstructor r1 = new androidx.multidex.MultiDex$V14$ICSElementConstructor     // Catch: java.lang.NoSuchMethodException -> Lf
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> Lf
                goto L1a
            Lf:
                androidx.multidex.MultiDex$V14$JBMR11ElementConstructor r1 = new androidx.multidex.MultiDex$V14$JBMR11ElementConstructor     // Catch: java.lang.NoSuchMethodException -> L15
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L15
                goto L1a
            L15:
                androidx.multidex.MultiDex$V14$JBMR2ElementConstructor r1 = new androidx.multidex.MultiDex$V14$JBMR2ElementConstructor
                r1.<init>(r0)
            L1a:
                r2.elementConstructor = r1
                return
        }

        private java.lang.Object[] makeDexElements(java.util.List<? extends java.io.File> r9) throws java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                r8 = this;
                int r0 = r9.size()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r3 = 0
            L8:
                if (r3 >= r0) goto L27
                java.lang.Object r4 = r9.get(r3)
                java.io.File r4 = (java.io.File) r4
                androidx.multidex.MultiDex$V14$ElementConstructor r5 = r8.elementConstructor
                java.lang.String r6 = r4.getPath()
                java.lang.String r7 = optimizedPathFor(r4)
                dalvik.system.DexFile r6 = dalvik.system.DexFile.loadDex(r6, r7, r2)
                java.lang.Object r4 = r5.newInstance(r4, r6)
                r1[r3] = r4
                int r3 = r3 + 1
                goto L8
            L27:
                return r1
        }

        private static java.lang.String optimizedPathFor(java.io.File r4) {
                java.io.File r0 = r4.getParentFile()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r4.length()
                int r3 = androidx.multidex.MultiDex.V14.EXTRACTED_SUFFIX_LENGTH
                int r2 = r2 - r3
                r3 = 0
                java.lang.String r4 = r4.substring(r3, r2)
                r1.append(r4)
                java.lang.String r4 = ".dex"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                java.io.File r1 = new java.io.File
                r1.<init>(r0, r4)
                java.lang.String r4 = r1.getPath()
                return r4
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class V19 {
        private V19() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void install(java.lang.ClassLoader r5, java.util.List<? extends java.io.File> r6, java.io.File r7) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.io.IOException {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = androidx.multidex.MultiDex.access$000(r5, r0)
                java.lang.Object r5 = r0.get(r5)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r6)
                java.lang.Object[] r6 = makeDexElements(r5, r1, r7, r0)
                java.lang.String r7 = "dexElements"
                androidx.multidex.MultiDex.access$100(r5, r7, r6)
                int r6 = r0.size()
                if (r6 <= 0) goto L7f
                java.util.Iterator r6 = r0.iterator()
            L27:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L3b
                java.lang.Object r7 = r6.next()
                java.io.IOException r7 = (java.io.IOException) r7
                java.lang.String r1 = "MultiDex"
                java.lang.String r2 = "Exception in makeDexElement"
                android.util.Log.w(r1, r2, r7)
                goto L27
            L3b:
                java.lang.String r6 = "dexElementsSuppressedExceptions"
                java.lang.reflect.Field r6 = androidx.multidex.MultiDex.access$000(r5, r6)
                java.lang.Object r7 = r6.get(r5)
                java.io.IOException[] r7 = (java.io.IOException[]) r7
                r1 = 0
                if (r7 != 0) goto L57
                int r7 = r0.size()
                java.io.IOException[] r7 = new java.io.IOException[r7]
                java.lang.Object[] r7 = r0.toArray(r7)
                java.io.IOException[] r7 = (java.io.IOException[]) r7
                goto L6b
            L57:
                int r2 = r0.size()
                int r3 = r7.length
                int r2 = r2 + r3
                java.io.IOException[] r2 = new java.io.IOException[r2]
                r0.toArray(r2)
                int r3 = r0.size()
                int r4 = r7.length
                java.lang.System.arraycopy(r7, r1, r2, r3, r4)
                r7 = r2
            L6b:
                r6.set(r5, r7)
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "I/O exception during makeDexElement"
                r5.<init>(r6)
                java.lang.Object r6 = r0.get(r1)
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                r5.initCause(r6)
                throw r5
            L7f:
                return
        }

        private static java.lang.Object[] makeDexElements(java.lang.Object r6, java.util.ArrayList<java.io.File> r7, java.io.File r8, java.util.ArrayList<java.io.IOException> r9) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException {
                r0 = 3
                java.lang.Class[] r1 = new java.lang.Class[r0]
                java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
                r3 = 0
                r1[r3] = r2
                java.lang.Class<java.io.File> r2 = java.io.File.class
                r4 = 1
                r1[r4] = r2
                java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
                r5 = 2
                r1[r5] = r2
                java.lang.reflect.Method r1 = androidx.multidex.MultiDex.access$200(r6, r1)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r3] = r7
                r0[r4] = r8
                r0[r5] = r9
                java.lang.Object r6 = r1.invoke(r6, r0)
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                return r6
        }
    }

    public static final class V4 {
        private V4() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.multidex.MultiDex.installedApk = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L45
            java.util.StringTokenizer r3 = new java.util.StringTokenizer
            java.lang.String r4 = "."
            r3.<init>(r0, r4)
            boolean r4 = r3.hasMoreTokens()
            r5 = 0
            if (r4 == 0) goto L24
            java.lang.String r4 = r3.nextToken()
            goto L25
        L24:
            r4 = r5
        L25:
            boolean r6 = r3.hasMoreTokens()
            if (r6 == 0) goto L2f
            java.lang.String r5 = r3.nextToken()
        L2f:
            if (r4 == 0) goto L45
            if (r5 == 0) goto L45
            int r3 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L44
            int r4 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L44
            r5 = 2
            if (r3 > r5) goto L42
            if (r3 != r5) goto L45
            if (r4 < r2) goto L45
        L42:
            r1 = 1
            goto L45
        L44:
        L45:
            java.lang.String r2 = "VM with version "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r2, r0)
            if (r1 == 0) goto L50
            java.lang.String r2 = " has multidex support"
            goto L52
        L50:
            java.lang.String r2 = " does not have multidex support"
        L52:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MultiDex"
            android.util.Log.i(r2, r0)
            androidx.multidex.MultiDex.IS_VM_MULTIDEX_CAPABLE = r1
            return
    }

    private MultiDex() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.reflect.Field access$000(java.lang.Object r0, java.lang.String r1) throws java.lang.NoSuchFieldException {
            java.lang.reflect.Field r0 = findField(r0, r1)
            return r0
    }

    public static /* synthetic */ void access$100(java.lang.Object r0, java.lang.String r1, java.lang.Object[] r2) throws java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
            expandFieldArray(r0, r1, r2)
            return
    }

    public static /* synthetic */ java.lang.reflect.Method access$200(java.lang.Object r1, java.lang.Class[] r2) throws java.lang.NoSuchMethodException {
            java.lang.String r0 = "makeDexElements"
            java.lang.reflect.Method r1 = findMethod(r1, r0, r2)
            return r1
    }

    private static void clearOldDexDir(android.content.Context r8) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.io.File r8 = r8.getFilesDir()
            java.lang.String r1 = "secondary-dexes"
            r0.<init>(r8, r1)
            boolean r8 = r0.isDirectory()
            if (r8 == 0) goto Ld2
            java.lang.String r8 = "Clearing old secondary dex dir ("
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            java.lang.String r1 = r0.getPath()
            r8.append(r1)
            java.lang.String r1 = ")."
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MultiDex"
            android.util.Log.i(r2, r8)
            java.io.File[] r8 = r0.listFiles()
            if (r8 != 0) goto L4b
            java.lang.String r8 = "Failed to list secondary dex dir content ("
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            java.lang.String r0 = r0.getPath()
            r8.append(r0)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r2, r8)
            return
        L4b:
            int r1 = r8.length
            r3 = 0
        L4d:
            if (r3 >= r1) goto La3
            r4 = r8[r3]
            java.lang.String r5 = "Trying to delete old file "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r6 = r4.getPath()
            r5.append(r6)
            java.lang.String r6 = " of size "
            r5.append(r6)
            long r6 = r4.length()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.i(r2, r5)
            boolean r5 = r4.delete()
            if (r5 != 0) goto L8c
            java.lang.String r5 = "Failed to delete old file "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r4 = r4.getPath()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r2, r4)
            goto La0
        L8c:
            java.lang.String r5 = "Deleted old file "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r4 = r4.getPath()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.i(r2, r4)
        La0:
            int r3 = r3 + 1
            goto L4d
        La3:
            boolean r8 = r0.delete()
            if (r8 != 0) goto Lbe
            java.lang.String r8 = "Failed to delete secondary dex dir "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            java.lang.String r0 = r0.getPath()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r2, r8)
            goto Ld2
        Lbe:
            java.lang.String r8 = "Deleted old secondary dex dir "
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
            java.lang.String r0 = r0.getPath()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.i(r2, r8)
        Ld2:
            return
    }

    private static void doInstallation(android.content.Context r5, java.io.File r6, java.io.File r7, java.lang.String r8, java.lang.String r9, boolean r10) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
            java.util.Set<java.io.File> r0 = androidx.multidex.MultiDex.installedApk
            monitor-enter(r0)
            boolean r1 = r0.contains(r6)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            return
        Lb:
            r0.add(r6)     // Catch: java.lang.Throwable -> L97
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "MultiDex"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = "MultiDex is not guaranteed to work in SDK version "
            r3.append(r4)     // Catch: java.lang.Throwable -> L97
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = ": SDK version higher than "
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
            r1 = 20
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = " should be backed by "
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "runtime with built-in multidex capabilty but it's not the "
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "case here: java.vm.version=\""
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L97
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "\""
            r3.append(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L97
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L97
            java.lang.ClassLoader r1 = getDexClassloader(r5)     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L56
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            return
        L56:
            clearOldDexDir(r5)     // Catch: java.lang.Throwable -> L5a
            goto L62
        L5a:
            r2 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r4 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L97
        L62:
            java.io.File r7 = getDexDir(r5, r7, r8)     // Catch: java.lang.Throwable -> L97
            androidx.multidex.MultiDexExtractor r8 = new androidx.multidex.MultiDexExtractor     // Catch: java.lang.Throwable -> L97
            r8.<init>(r6, r7)     // Catch: java.lang.Throwable -> L97
            r6 = 0
            r2 = 0
            java.util.List r2 = r8.load(r5, r9, r2)     // Catch: java.lang.Throwable -> L92
            installSecondaryDexes(r1, r7, r2)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L92
            goto L87
        L75:
            r2 = move-exception
            if (r10 == 0) goto L91
            java.lang.String r10 = "MultiDex"
            java.lang.String r3 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r10, r3, r2)     // Catch: java.lang.Throwable -> L92
            r10 = 1
            java.util.List r5 = r8.load(r5, r9, r10)     // Catch: java.lang.Throwable -> L92
            installSecondaryDexes(r1, r7, r5)     // Catch: java.lang.Throwable -> L92
        L87:
            r8.close()     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L97
            goto L8c
        L8b:
            r6 = move-exception
        L8c:
            if (r6 != 0) goto L90
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            return
        L90:
            throw r6     // Catch: java.lang.Throwable -> L97
        L91:
            throw r2     // Catch: java.lang.Throwable -> L92
        L92:
            r5 = move-exception
            r8.close()     // Catch: java.io.IOException -> L96 java.lang.Throwable -> L97
        L96:
            throw r5     // Catch: java.lang.Throwable -> L97
        L97:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            throw r5
    }

    private static void expandFieldArray(java.lang.Object r4, java.lang.String r5, java.lang.Object[] r6) throws java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
            java.lang.reflect.Field r5 = findField(r4, r5)
            java.lang.Object r0 = r5.get(r4)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            int r2 = r0.length
            int r3 = r6.length
            int r2 = r2 + r3
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r0.length
            int r2 = r6.length
            java.lang.System.arraycopy(r6, r3, r1, r0, r2)
            r5.set(r4, r1)
            return
    }

    private static java.lang.reflect.Field findField(java.lang.Object r3, java.lang.String r4) throws java.lang.NoSuchFieldException {
            java.lang.Class r0 = r3.getClass()
        L4:
            if (r0 == 0) goto L1a
            java.lang.reflect.Field r1 = r0.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L15
            boolean r2 = r1.isAccessible()     // Catch: java.lang.NoSuchFieldException -> L15
            if (r2 != 0) goto L14
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L15
        L14:
            return r1
        L15:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L1a:
            java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException
            java.lang.String r1 = "Field "
            java.lang.String r2 = " not found in "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r1, r4, r2)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.<init>(r3)
            throw r0
    }

    private static java.lang.reflect.Method findMethod(java.lang.Object r3, java.lang.String r4, java.lang.Class<?>... r5) throws java.lang.NoSuchMethodException {
            java.lang.Class r0 = r3.getClass()
        L4:
            if (r0 == 0) goto L1a
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L15
            boolean r2 = r1.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L15
            if (r2 != 0) goto L14
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L15
        L14:
            return r1
        L15:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L1a:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            java.lang.String r1 = "Method "
            java.lang.String r2 = " with parameters "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r1, r4, r2)
            java.util.List r5 = java.util.Arrays.asList(r5)
            r4.append(r5)
            java.lang.String r5 = " not found in "
            r4.append(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.<init>(r3)
            throw r0
    }

    private static android.content.pm.ApplicationInfo getApplicationInfo(android.content.Context r2) {
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.RuntimeException -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r0 = "MultiDex"
            java.lang.String r1 = "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching."
            android.util.Log.w(r0, r1, r2)
            r2 = 0
            return r2
    }

    private static java.lang.ClassLoader getDexClassloader(android.content.Context r3) {
            java.lang.String r0 = "MultiDex"
            r1 = 0
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.RuntimeException -> L12
            boolean r2 = r3 instanceof dalvik.system.BaseDexClassLoader
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.lang.String r3 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r0, r3)
            return r1
        L12:
            r3 = move-exception
            java.lang.String r2 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r0, r2, r3)
            return r1
    }

    private static java.io.File getDexDir(android.content.Context r2, java.io.File r3, java.lang.String r4) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "code_cache"
            r0.<init>(r3, r1)
            mkdirChecked(r0)     // Catch: java.io.IOException -> Lb
            goto L17
        Lb:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            r0.<init>(r2, r1)
            mkdirChecked(r0)
        L17:
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r4)
            mkdirChecked(r2)
            return r2
    }

    public static void install(android.content.Context r7) {
            java.lang.String r0 = "MultiDex"
            java.lang.String r1 = "Installing application"
            android.util.Log.i(r0, r1)
            boolean r1 = androidx.multidex.MultiDex.IS_VM_MULTIDEX_CAPABLE
            if (r1 == 0) goto L11
            java.lang.String r7 = "VM has multidex support, MultiDex support library is disabled."
            android.util.Log.i(r0, r7)
            return
        L11:
            android.content.pm.ApplicationInfo r1 = getApplicationInfo(r7)     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L1d
            java.lang.String r7 = "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled."
            android.util.Log.i(r0, r7)     // Catch: java.lang.Exception -> L3b
            return
        L1d:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = r1.sourceDir     // Catch: java.lang.Exception -> L3b
            r2.<init>(r3)     // Catch: java.lang.Exception -> L3b
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = r1.dataDir     // Catch: java.lang.Exception -> L3b
            r3.<init>(r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = "secondary-dexes"
            java.lang.String r5 = ""
            r6 = 1
            r1 = r7
            doInstallation(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L3b
            java.lang.String r7 = "install done"
            android.util.Log.i(r0, r7)
            return
        L3b:
            r7 = move-exception
            java.lang.String r1 = "MultiDex installation failure"
            android.util.Log.e(r0, r1, r7)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "MultiDex installation failed ("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = ")."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public static void installInstrumentation(android.content.Context r12, android.content.Context r13) {
            java.lang.String r1 = "MultiDex"
            java.lang.String r0 = "Installing instrumentation"
            android.util.Log.i(r1, r0)
            boolean r0 = androidx.multidex.MultiDex.IS_VM_MULTIDEX_CAPABLE
            if (r0 == 0) goto L11
            java.lang.String r0 = "VM has multidex support, MultiDex support library is disabled."
            android.util.Log.i(r1, r0)
            return
        L11:
            android.content.pm.ApplicationInfo r0 = getApplicationInfo(r12)     // Catch: java.lang.Exception -> L7c
            if (r0 != 0) goto L1d
            java.lang.String r0 = "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled."
            android.util.Log.i(r1, r0)     // Catch: java.lang.Exception -> L7c
            return
        L1d:
            android.content.pm.ApplicationInfo r2 = getApplicationInfo(r13)     // Catch: java.lang.Exception -> L7c
            if (r2 != 0) goto L29
            java.lang.String r0 = "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled."
            android.util.Log.i(r1, r0)     // Catch: java.lang.Exception -> L7c
            return
        L29:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7c
            r3.<init>()     // Catch: java.lang.Exception -> L7c
            java.lang.String r4 = r12.getPackageName()     // Catch: java.lang.Exception -> L7c
            r3.append(r4)     // Catch: java.lang.Exception -> L7c
            java.lang.String r4 = "."
            r3.append(r4)     // Catch: java.lang.Exception -> L7c
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Exception -> L7c
            java.io.File r11 = new java.io.File     // Catch: java.lang.Exception -> L7c
            java.lang.String r3 = r2.dataDir     // Catch: java.lang.Exception -> L7c
            r11.<init>(r3)     // Catch: java.lang.Exception -> L7c
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L7c
            java.lang.String r0 = r0.sourceDir     // Catch: java.lang.Exception -> L7c
            r6.<init>(r0)     // Catch: java.lang.Exception -> L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7c
            r0.<init>()     // Catch: java.lang.Exception -> L7c
            r0.append(r9)     // Catch: java.lang.Exception -> L7c
            java.lang.String r3 = "secondary-dexes"
            r0.append(r3)     // Catch: java.lang.Exception -> L7c
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L7c
            r10 = 0
            r5 = r13
            r7 = r11
            doInstallation(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L7c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L7c
            java.lang.String r0 = r2.sourceDir     // Catch: java.lang.Exception -> L7c
            r4.<init>(r0)     // Catch: java.lang.Exception -> L7c
            java.lang.String r6 = "secondary-dexes"
            java.lang.String r7 = ""
            r8 = 0
            r3 = r13
            r5 = r11
            doInstallation(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L7c
            java.lang.String r0 = "Installation done"
            android.util.Log.i(r1, r0)
            return
        L7c:
            r0 = move-exception
            java.lang.String r2 = "MultiDex installation failure"
            android.util.Log.e(r1, r2, r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "MultiDex installation failed ("
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = ")."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    private static void installSecondaryDexes(java.lang.ClassLoader r1, java.io.File r2, java.util.List<? extends java.io.File> r3) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.io.IOException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L9
            androidx.multidex.MultiDex.V19.install(r1, r3, r2)
        L9:
            return
    }

    private static void mkdirChecked(java.io.File r4) throws java.io.IOException {
            r4.mkdir()
            boolean r0 = r4.isDirectory()
            if (r0 != 0) goto L90
            java.io.File r0 = r4.getParentFile()
            java.lang.String r1 = "Failed to create dir "
            java.lang.String r2 = "MultiDex"
            if (r0 != 0) goto L2b
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r1 = r4.getPath()
            r0.append(r1)
            java.lang.String r1 = ". Parent file is null."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0)
            goto L79
        L2b:
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r4.getPath()
            r1.append(r3)
            java.lang.String r3 = ". parent file is a dir "
            r1.append(r3)
            boolean r3 = r0.isDirectory()
            r1.append(r3)
            java.lang.String r3 = ", a file "
            r1.append(r3)
            boolean r3 = r0.isFile()
            r1.append(r3)
            java.lang.String r3 = ", exists "
            r1.append(r3)
            boolean r3 = r0.exists()
            r1.append(r3)
            java.lang.String r3 = ", readable "
            r1.append(r3)
            boolean r3 = r0.canRead()
            r1.append(r3)
            java.lang.String r3 = ", writable "
            r1.append(r3)
            boolean r0 = r0.canWrite()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r2, r0)
        L79:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to create directory "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r4 = r4.getPath()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L90:
            return
    }
}
