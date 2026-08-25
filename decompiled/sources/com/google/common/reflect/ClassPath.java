package com.google.common.reflect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public final class ClassPath {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final java.lang.String CLASS_FILE_NAME_EXTENSION = ".class";
    private static final com.google.common.base.Splitter CLASS_PATH_ATTRIBUTE_SEPARATOR = null;
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> resources;


    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.Beta
    public static final class ClassInfo extends com.google.common.reflect.ClassPath.ResourceInfo {
        private final java.lang.String className;

        public ClassInfo(java.io.File r1, java.lang.String r2, java.lang.ClassLoader r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                int r1 = com.google.common.reflect.ClassPath.$r8$clinit
                int r1 = r2.length()
                int r1 = r1 + (-6)
                r3 = 0
                java.lang.String r1 = r2.substring(r3, r1)
                r2 = 47
                r3 = 46
                java.lang.String r1 = r1.replace(r2, r3)
                r0.className = r1
                return
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.className
                return r0
        }

        public java.lang.String getPackageName() {
                r1 = this;
                java.lang.String r0 = r1.className
                java.lang.String r0 = com.google.common.reflect.Reflection.getPackageName(r0)
                return r0
        }

        public java.lang.String getSimpleName() {
                r3 = this;
                java.lang.String r0 = r3.className
                r1 = 36
                int r0 = r0.lastIndexOf(r1)
                r1 = -1
                if (r0 == r1) goto L20
                java.lang.String r1 = r3.className
                int r0 = r0 + 1
                java.lang.String r0 = r1.substring(r0)
                r1 = 48
                r2 = 57
                com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.inRange(r1, r2)
                java.lang.String r0 = r1.trimLeadingFrom(r0)
                return r0
            L20:
                java.lang.String r0 = r3.getPackageName()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L2d
                java.lang.String r0 = r3.className
                return r0
            L2d:
                java.lang.String r1 = r3.className
                int r0 = r0.length()
                int r0 = r0 + 1
                java.lang.String r0 = r1.substring(r0)
                return r0
        }

        public boolean isTopLevel() {
                r2 = this;
                java.lang.String r0 = r2.className
                r1 = 36
                int r0 = r0.indexOf(r1)
                r1 = -1
                if (r0 != r1) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }

        public java.lang.Class<?> load() {
                r2 = this;
                java.lang.ClassLoader r0 = r2.loader     // Catch: java.lang.ClassNotFoundException -> L9
                java.lang.String r1 = r2.className     // Catch: java.lang.ClassNotFoundException -> L9
                java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L9
                return r0
            L9:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.className
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class LocationInfo {
        private final java.lang.ClassLoader classloader;
        public final java.io.File home;

        public LocationInfo(java.io.File r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.io.File r1 = (java.io.File) r1
                r0.home = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
                r0.classloader = r1
                return
        }

        private void scan(java.io.File r4, java.util.Set<java.io.File> r5, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> r6) throws java.io.IOException {
                r3 = this;
                boolean r0 = r4.exists()     // Catch: java.lang.SecurityException -> L15
                if (r0 != 0) goto L7
                return
            L7:
                boolean r0 = r4.isDirectory()
                if (r0 == 0) goto L11
                r3.scanDirectory(r4, r6)
                goto L14
            L11:
                r3.scanJar(r4, r5, r6)
            L14:
                return
            L15:
                r5 = move-exception
                java.util.logging.Logger r6 = com.google.common.reflect.ClassPath.access$000()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r5 = java.lang.String.valueOf(r5)
                int r0 = r4.length()
                int r0 = r0 + 16
                int r1 = r5.length()
                int r1 = r1 + r0
                java.lang.String r0 = "Cannot access "
                java.lang.String r2 = ": "
                java.lang.String r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r4, r2, r5)
                r6.warning(r4)
                return
        }

        private void scanDirectory(java.io.File r3, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> r4) throws java.io.IOException {
                r2 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.io.File r1 = r3.getCanonicalFile()
                r0.add(r1)
                java.lang.String r1 = ""
                r2.scanDirectory(r3, r1, r0, r4)
                return
        }

        private void scanDirectory(java.io.File r7, java.lang.String r8, java.util.Set<java.io.File> r9, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> r10) throws java.io.IOException {
                r6 = this;
                java.io.File[] r0 = r7.listFiles()
                if (r0 != 0) goto L29
                java.util.logging.Logger r8 = com.google.common.reflect.ClassPath.access$000()
                java.lang.String r7 = java.lang.String.valueOf(r7)
                int r9 = r7.length()
                int r9 = r9 + 22
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>(r9)
                java.lang.String r9 = "Cannot read directory "
                r10.append(r9)
                r10.append(r7)
                java.lang.String r7 = r10.toString()
                r8.warning(r7)
                return
            L29:
                int r7 = r0.length
                r1 = 0
            L2b:
                if (r1 >= r7) goto L94
                r2 = r0[r1]
                java.lang.String r3 = r2.getName()
                boolean r4 = r2.isDirectory()
                if (r4 == 0) goto L59
                java.io.File r2 = r2.getCanonicalFile()
                boolean r4 = r9.add(r2)
                if (r4 == 0) goto L91
                r4 = 1
                int r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r8, r4)
                int r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r4)
                java.lang.String r5 = "/"
                java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r8, r3, r5)
                r6.scanDirectory(r2, r3, r9, r10)
                r9.remove(r2)
                goto L91
            L59:
                java.lang.String r4 = java.lang.String.valueOf(r8)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r5 = r3.length()
                if (r5 == 0) goto L6c
                java.lang.String r3 = r4.concat(r3)
                goto L71
            L6c:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r4)
            L71:
                java.lang.String r4 = "META-INF/MANIFEST.MF"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L91
                java.lang.ClassLoader r4 = r6.classloader
                java.lang.String r5 = ".class"
                boolean r5 = r3.endsWith(r5)
                if (r5 == 0) goto L89
                com.google.common.reflect.ClassPath$ClassInfo r5 = new com.google.common.reflect.ClassPath$ClassInfo
                r5.<init>(r2, r3, r4)
                goto L8e
            L89:
                com.google.common.reflect.ClassPath$ResourceInfo r5 = new com.google.common.reflect.ClassPath$ResourceInfo
                r5.<init>(r2, r3, r4)
            L8e:
                r10.add(r5)
            L91:
                int r1 = r1 + 1
                goto L2b
            L94:
                return
        }

        private void scanJar(java.io.File r4, java.util.Set<java.io.File> r5, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> r6) throws java.io.IOException {
                r3 = this;
                java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.io.IOException -> L37
                r0.<init>(r4)     // Catch: java.io.IOException -> L37
                java.util.jar.Manifest r1 = r0.getManifest()     // Catch: java.lang.Throwable -> L32
                com.google.common.collect.ImmutableSet r4 = com.google.common.reflect.ClassPath.getClassPathFromManifest(r4, r1)     // Catch: java.lang.Throwable -> L32
                com.google.common.collect.UnmodifiableIterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L32
            L11:
                boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L32
                if (r1 == 0) goto L2b
                java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L32
                java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L32
                java.io.File r2 = r1.getCanonicalFile()     // Catch: java.lang.Throwable -> L32
                boolean r2 = r5.add(r2)     // Catch: java.lang.Throwable -> L32
                if (r2 == 0) goto L11
                r3.scan(r1, r5, r6)     // Catch: java.lang.Throwable -> L32
                goto L11
            L2b:
                r3.scanJarFile(r0, r6)     // Catch: java.lang.Throwable -> L32
                r0.close()     // Catch: java.io.IOException -> L31
            L31:
                return
            L32:
                r4 = move-exception
                r0.close()     // Catch: java.io.IOException -> L36
            L36:
                throw r4
            L37:
                return
        }

        private void scanJarFile(java.util.jar.JarFile r6, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> r7) {
                r5 = this;
                java.util.Enumeration r0 = r6.entries()
            L4:
                boolean r1 = r0.hasMoreElements()
                if (r1 == 0) goto L49
                java.lang.Object r1 = r0.nextElement()
                java.util.jar.JarEntry r1 = (java.util.jar.JarEntry) r1
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L4
                java.lang.String r2 = r1.getName()
                java.lang.String r3 = "META-INF/MANIFEST.MF"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L23
                goto L4
            L23:
                java.io.File r2 = new java.io.File
                java.lang.String r3 = r6.getName()
                r2.<init>(r3)
                java.lang.String r1 = r1.getName()
                java.lang.ClassLoader r3 = r5.classloader
                java.lang.String r4 = ".class"
                boolean r4 = r1.endsWith(r4)
                if (r4 == 0) goto L40
                com.google.common.reflect.ClassPath$ClassInfo r4 = new com.google.common.reflect.ClassPath$ClassInfo
                r4.<init>(r2, r1, r3)
                goto L45
            L40:
                com.google.common.reflect.ClassPath$ResourceInfo r4 = new com.google.common.reflect.ClassPath$ResourceInfo
                r4.<init>(r2, r1, r3)
            L45:
                r7.add(r4)
                goto L4
            L49:
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.reflect.ClassPath.LocationInfo
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.reflect.ClassPath$LocationInfo r4 = (com.google.common.reflect.ClassPath.LocationInfo) r4
                java.io.File r0 = r3.home
                java.io.File r2 = r4.home
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                java.lang.ClassLoader r0 = r3.classloader
                java.lang.ClassLoader r4 = r4.classloader
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        public final java.io.File file() {
                r1 = this;
                java.io.File r0 = r1.home
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.io.File r0 = r1.home
                int r0 = r0.hashCode()
                return r0
        }

        public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> scanResources() throws java.io.IOException {
                r1 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                com.google.common.collect.ImmutableSet r0 = r1.scanResources(r0)
                return r0
        }

        public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> scanResources(java.util.Set<java.io.File> r3) throws java.io.IOException {
                r2 = this;
                com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
                java.io.File r1 = r2.home
                r3.add(r1)
                java.io.File r1 = r2.home
                r2.scan(r1, r3, r0)
                com.google.common.collect.ImmutableSet r3 = r0.build()
                return r3
        }

        public java.lang.String toString() {
                r1 = this;
                java.io.File r0 = r1.home
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.Beta
    public static class ResourceInfo {
        private final java.io.File file;
        public final java.lang.ClassLoader loader;
        private final java.lang.String resourceName;

        public ResourceInfo(java.io.File r1, java.lang.String r2, java.lang.ClassLoader r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.io.File r1 = (java.io.File) r1
                r0.file = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.String r1 = (java.lang.String) r1
                r0.resourceName = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
                r0.loader = r1
                return
        }

        public final com.google.common.io.ByteSource asByteSource() {
                r1 = this;
                java.net.URL r0 = r1.url()
                com.google.common.io.ByteSource r0 = com.google.common.io.Resources.asByteSource(r0)
                return r0
        }

        public final com.google.common.io.CharSource asCharSource(java.nio.charset.Charset r2) {
                r1 = this;
                java.net.URL r0 = r1.url()
                com.google.common.io.CharSource r2 = com.google.common.io.Resources.asCharSource(r0, r2)
                return r2
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.reflect.ClassPath.ResourceInfo
                r1 = 0
                if (r0 == 0) goto L18
                com.google.common.reflect.ClassPath$ResourceInfo r4 = (com.google.common.reflect.ClassPath.ResourceInfo) r4
                java.lang.String r0 = r3.resourceName
                java.lang.String r2 = r4.resourceName
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L18
                java.lang.ClassLoader r0 = r3.loader
                java.lang.ClassLoader r4 = r4.loader
                if (r0 != r4) goto L18
                r1 = 1
            L18:
                return r1
        }

        public final java.lang.String getResourceName() {
                r1 = this;
                java.lang.String r0 = r1.resourceName
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.resourceName
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.resourceName
                return r0
        }

        public final java.net.URL url() {
                r2 = this;
                java.lang.ClassLoader r0 = r2.loader
                java.lang.String r1 = r2.resourceName
                java.net.URL r0 = r0.getResource(r1)
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = r2.resourceName
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            java.lang.Class<com.google.common.reflect.ClassPath> r0 = com.google.common.reflect.ClassPath.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.reflect.ClassPath.logger = r0
            java.lang.String r0 = " "
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.on(r0)
            com.google.common.base.Splitter r0 = r0.omitEmptyStrings()
            com.google.common.reflect.ClassPath.CLASS_PATH_ATTRIBUTE_SEPARATOR = r0
            return
    }

    private ClassPath(com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> r1) {
            r0 = this;
            r0.<init>()
            r0.resources = r1
            return
    }

    public static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.common.reflect.ClassPath.logger
            return r0
    }

    public static com.google.common.reflect.ClassPath from(java.lang.ClassLoader r4) throws java.io.IOException {
            com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
            com.google.common.collect.ImmutableMap r4 = getClassPathEntries(r4)
            com.google.common.collect.ImmutableSet r4 = r4.entrySet()
            com.google.common.collect.UnmodifiableIterator r4 = r4.iterator()
        L10:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.common.reflect.ClassPath$LocationInfo r2 = new com.google.common.reflect.ClassPath$LocationInfo
            java.lang.Object r3 = r1.getKey()
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L10
        L31:
            com.google.common.collect.ImmutableSet r4 = r0.build()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.common.collect.UnmodifiableIterator r1 = r4.iterator()
        L3e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r1.next()
            com.google.common.reflect.ClassPath$LocationInfo r2 = (com.google.common.reflect.ClassPath.LocationInfo) r2
            java.io.File r2 = r2.file()
            r0.add(r2)
            goto L3e
        L52:
            com.google.common.collect.ImmutableSet$Builder r1 = com.google.common.collect.ImmutableSet.builder()
            com.google.common.collect.UnmodifiableIterator r4 = r4.iterator()
        L5a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r4.next()
            com.google.common.reflect.ClassPath$LocationInfo r2 = (com.google.common.reflect.ClassPath.LocationInfo) r2
            com.google.common.collect.ImmutableSet r2 = r2.scanResources(r0)
            r1.addAll(r2)
            goto L5a
        L6e:
            com.google.common.reflect.ClassPath r4 = new com.google.common.reflect.ClassPath
            com.google.common.collect.ImmutableSet r0 = r1.build()
            r4.<init>(r0)
            return r4
    }

    private static com.google.common.collect.ImmutableList<java.net.URL> getClassLoaderUrls(java.lang.ClassLoader r7) {
            boolean r0 = r7 instanceof java.net.URLClassLoader
            if (r0 == 0) goto Lf
            java.net.URLClassLoader r7 = (java.net.URLClassLoader) r7
            java.net.URL[] r7 = r7.getURLs()
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.copyOf(r7)
            return r7
        Lf:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8c
            com.google.common.collect.ImmutableList$Builder r7 = com.google.common.collect.ImmutableList.builder()
            com.google.common.base.StandardSystemProperty r0 = com.google.common.base.StandardSystemProperty.PATH_SEPARATOR
            java.lang.String r0 = r0.value()
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.on(r0)
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_CLASS_PATH
            java.lang.String r1 = r1.value()
            java.lang.Iterable r0 = r0.split(r1)
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r2 = new java.io.File     // Catch: java.net.MalformedURLException -> L52 java.lang.SecurityException -> L54
            r2.<init>(r1)     // Catch: java.net.MalformedURLException -> L52 java.lang.SecurityException -> L54
            java.net.URI r2 = r2.toURI()     // Catch: java.net.MalformedURLException -> L52 java.lang.SecurityException -> L54
            java.net.URL r2 = r2.toURL()     // Catch: java.net.MalformedURLException -> L52 java.lang.SecurityException -> L54
            r7.add(r2)     // Catch: java.net.MalformedURLException -> L52 java.lang.SecurityException -> L54
            goto L35
        L52:
            r2 = move-exception
            goto L69
        L54:
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L52
            java.lang.String r3 = "file"
            r4 = 0
            java.io.File r5 = new java.io.File     // Catch: java.net.MalformedURLException -> L52
            r5.<init>(r1)     // Catch: java.net.MalformedURLException -> L52
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.net.MalformedURLException -> L52
            r2.<init>(r3, r4, r5)     // Catch: java.net.MalformedURLException -> L52
            r7.add(r2)     // Catch: java.net.MalformedURLException -> L52
            goto L35
        L69:
            java.util.logging.Logger r3 = com.google.common.reflect.ClassPath.logger
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r5 = "malformed classpath entry: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r6 = r1.length()
            if (r6 == 0) goto L7e
            java.lang.String r1 = r5.concat(r1)
            goto L83
        L7e:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5)
        L83:
            r3.log(r4, r1, r2)
            goto L35
        L87:
            com.google.common.collect.ImmutableList r7 = r7.build()
            return r7
        L8c:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of()
            return r7
    }

    @com.google.common.annotations.VisibleForTesting
    public static com.google.common.collect.ImmutableMap<java.io.File, java.lang.ClassLoader> getClassPathEntries(java.lang.ClassLoader r5) {
            java.util.LinkedHashMap r0 = com.google.common.collect.Maps.newLinkedHashMap()
            java.lang.ClassLoader r1 = r5.getParent()
            if (r1 == 0) goto L11
            com.google.common.collect.ImmutableMap r1 = getClassPathEntries(r1)
            r0.putAll(r1)
        L11:
            com.google.common.collect.ImmutableList r1 = getClassLoaderUrls(r5)
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.net.URL r2 = (java.net.URL) r2
            java.lang.String r3 = r2.getProtocol()
            java.lang.String r4 = "file"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L19
            java.io.File r2 = toFile(r2)
            boolean r3 = r0.containsKey(r2)
            if (r3 != 0) goto L19
            r0.put(r2, r5)
            goto L19
        L3f:
            com.google.common.collect.ImmutableMap r5 = com.google.common.collect.ImmutableMap.copyOf(r0)
            return r5
    }

    @com.google.common.annotations.VisibleForTesting
    public static com.google.common.collect.ImmutableSet<java.io.File> getClassPathFromManifest(java.io.File r5, @javax.annotation.CheckForNull java.util.jar.Manifest r6) {
            if (r6 != 0) goto L7
            com.google.common.collect.ImmutableSet r5 = com.google.common.collect.ImmutableSet.of()
            return r5
        L7:
            com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
            java.util.jar.Attributes r6 = r6.getMainAttributes()
            java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.CLASS_PATH
            java.lang.String r1 = r1.toString()
            java.lang.String r6 = r6.getValue(r1)
            if (r6 == 0) goto L6e
            com.google.common.base.Splitter r1 = com.google.common.reflect.ClassPath.CLASS_PATH_ATTRIBUTE_SEPARATOR
            java.lang.Iterable r6 = r1.split(r6)
            java.util.Iterator r6 = r6.iterator()
        L25:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L52
            java.net.URI r3 = r5.toURI()     // Catch: java.net.MalformedURLException -> L52
            java.net.URL r3 = r3.toURL()     // Catch: java.net.MalformedURLException -> L52
            r2.<init>(r3, r1)     // Catch: java.net.MalformedURLException -> L52
            java.lang.String r1 = r2.getProtocol()
            java.lang.String r3 = "file"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L25
            java.io.File r1 = toFile(r2)
            r0.add(r1)
            goto L25
        L52:
            java.util.logging.Logger r2 = com.google.common.reflect.ClassPath.logger
            java.lang.String r3 = "Invalid Class-Path entry: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L65
            java.lang.String r1 = r3.concat(r1)
            goto L6a
        L65:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L6a:
            r2.warning(r1)
            goto L25
        L6e:
            com.google.common.collect.ImmutableSet r5 = r0.build()
            return r5
    }

    @com.google.common.annotations.VisibleForTesting
    public static java.io.File toFile(java.net.URL r2) {
            java.lang.String r0 = r2.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            java.io.File r0 = new java.io.File     // Catch: java.net.URISyntaxException -> L17
            java.net.URI r1 = r2.toURI()     // Catch: java.net.URISyntaxException -> L17
            r0.<init>(r1)     // Catch: java.net.URISyntaxException -> L17
            return r0
        L17:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r2.getPath()
            r0.<init>(r2)
            return r0
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getAllClasses() {
            r2 = this;
            com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath$ResourceInfo> r0 = r2.resources
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
            java.lang.Class<com.google.common.reflect.ClassPath$ClassInfo> r1 = com.google.common.reflect.ClassPath.ClassInfo.class
            com.google.common.collect.FluentIterable r0 = r0.filter(r1)
            com.google.common.collect.ImmutableSet r0 = r0.toSet()
            return r0
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> getResources() {
            r1 = this;
            com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath$ResourceInfo> r0 = r1.resources
            return r0
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClasses() {
            r2 = this;
            com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath$ResourceInfo> r0 = r2.resources
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
            java.lang.Class<com.google.common.reflect.ClassPath$ClassInfo> r1 = com.google.common.reflect.ClassPath.ClassInfo.class
            com.google.common.collect.FluentIterable r0 = r0.filter(r1)
            com.google.common.reflect.ClassPath$1 r1 = new com.google.common.reflect.ClassPath$1
            r1.<init>()
            com.google.common.collect.FluentIterable r0 = r0.filter(r1)
            com.google.common.collect.ImmutableSet r0 = r0.toSet()
            return r0
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClasses(java.lang.String r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
            com.google.common.collect.ImmutableSet r1 = r4.getTopLevelClasses()
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            com.google.common.reflect.ClassPath$ClassInfo r2 = (com.google.common.reflect.ClassPath.ClassInfo) r2
            java.lang.String r3 = r2.getPackageName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto Lf
            r0.add(r2)
            goto Lf
        L29:
            com.google.common.collect.ImmutableSet r5 = r0.build()
            return r5
    }

    public com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClassesRecursive(java.lang.String r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            int r0 = r0 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            r5 = 46
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
            com.google.common.collect.ImmutableSet r1 = r4.getTopLevelClasses()
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            com.google.common.reflect.ClassPath$ClassInfo r2 = (com.google.common.reflect.ClassPath.ClassInfo) r2
            java.lang.String r3 = r2.getName()
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L2a
            r0.add(r2)
            goto L2a
        L44:
            com.google.common.collect.ImmutableSet r5 = r0.build()
            return r5
    }
}
