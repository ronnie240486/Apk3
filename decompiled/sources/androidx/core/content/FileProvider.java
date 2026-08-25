package androidx.core.content;

/* JADX INFO: loaded from: classes2.dex */
public class FileProvider extends android.content.ContentProvider {
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_PATH = "path";
    private static final java.lang.String[] COLUMNS = null;
    private static final java.io.File DEVICE_ROOT = null;
    private static final java.lang.String DISPLAYNAME_FIELD = "displayName";
    private static final java.lang.String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final java.lang.String TAG_CACHE_PATH = "cache-path";
    private static final java.lang.String TAG_EXTERNAL = "external-path";
    private static final java.lang.String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final java.lang.String TAG_EXTERNAL_FILES = "external-files-path";
    private static final java.lang.String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final java.lang.String TAG_FILES_PATH = "files-path";
    private static final java.lang.String TAG_ROOT_PATH = "root-path";

    @androidx.annotation.GuardedBy("sCache")
    private static final java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.PathStrategy> sCache = null;
    private int mResourceId;
    private androidx.core.content.FileProvider.PathStrategy mStrategy;

    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.io.File[] getExternalMediaDirs(android.content.Context r0) {
                java.io.File[] r0 = r0.getExternalMediaDirs()
                return r0
        }
    }

    public interface PathStrategy {
        java.io.File getFileForUri(android.net.Uri r1);

        android.net.Uri getUriForFile(java.io.File r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SimplePathStrategy implements androidx.core.content.FileProvider.PathStrategy {
        private final java.lang.String mAuthority;
        private final java.util.HashMap<java.lang.String, java.io.File> mRoots;

        public SimplePathStrategy(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mRoots = r0
                r1.mAuthority = r2
                return
        }

        public final void addRoot(java.lang.String r4, java.io.File r5) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L28
                java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L10
                java.util.HashMap<java.lang.String, java.io.File> r0 = r3.mRoots
                r0.put(r4, r5)
                return
            L10:
                r4 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5, r4)
                throw r0
            L28:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Name must not be empty"
                r4.<init>(r5)
                throw r4
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public java.io.File getFileForUri(android.net.Uri r5) {
                r4 = this;
                java.lang.String r0 = r5.getEncodedPath()
                r1 = 47
                r2 = 1
                int r1 = r0.indexOf(r1, r2)
                java.lang.String r3 = r0.substring(r2, r1)
                java.lang.String r3 = android.net.Uri.decode(r3)
                int r1 = r1 + r2
                java.lang.String r0 = r0.substring(r1)
                java.lang.String r0 = android.net.Uri.decode(r0)
                java.util.HashMap<java.lang.String, java.io.File> r1 = r4.mRoots
                java.lang.Object r1 = r1.get(r3)
                java.io.File r1 = (java.io.File) r1
                if (r1 == 0) goto L5d
                java.io.File r5 = new java.io.File
                r5.<init>(r1, r0)
                java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L46
                java.lang.String r0 = r5.getPath()
                java.lang.String r1 = r1.getPath()
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L3e
                return r5
            L3e:
                java.lang.SecurityException r5 = new java.lang.SecurityException
                java.lang.String r0 = "Resolved path jumped beyond configured root"
                r5.<init>(r0)
                throw r5
            L46:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L5d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unable to find configured root for "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public android.net.Uri getUriForFile(java.io.File r6) {
                r5 = this;
                java.lang.String r6 = r6.getCanonicalPath()     // Catch: java.io.IOException -> Lb2
                r0 = 0
                java.util.HashMap<java.lang.String, java.io.File> r1 = r5.mRoots
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            Lf:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L43
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                java.io.File r3 = (java.io.File) r3
                java.lang.String r3 = r3.getPath()
                boolean r4 = r6.startsWith(r3)
                if (r4 == 0) goto Lf
                if (r0 == 0) goto L41
                int r3 = r3.length()
                java.lang.Object r4 = r0.getValue()
                java.io.File r4 = (java.io.File) r4
                java.lang.String r4 = r4.getPath()
                int r4 = r4.length()
                if (r3 <= r4) goto Lf
            L41:
                r0 = r2
                goto Lf
            L43:
                if (r0 == 0) goto La6
                java.lang.Object r1 = r0.getValue()
                java.io.File r1 = (java.io.File) r1
                java.lang.String r1 = r1.getPath()
                java.lang.String r2 = "/"
                boolean r3 = r1.endsWith(r2)
                if (r3 == 0) goto L60
                int r1 = r1.length()
                java.lang.String r6 = r6.substring(r1)
                goto L6a
            L60:
                int r1 = r1.length()
                int r1 = r1 + 1
                java.lang.String r6 = r6.substring(r1)
            L6a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Object r0 = r0.getKey()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = android.net.Uri.encode(r0)
                r1.append(r0)
                r0 = 47
                r1.append(r0)
                java.lang.String r6 = android.net.Uri.encode(r6, r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                android.net.Uri$Builder r0 = new android.net.Uri$Builder
                r0.<init>()
                java.lang.String r1 = "content"
                android.net.Uri$Builder r0 = r0.scheme(r1)
                java.lang.String r1 = r5.mAuthority
                android.net.Uri$Builder r0 = r0.authority(r1)
                android.net.Uri$Builder r6 = r0.encodedPath(r6)
                android.net.Uri r6 = r6.build()
                return r6
            La6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Failed to find configured root that contains "
                java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6)
                r0.<init>(r6)
                throw r0
            Lb2:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }
    }

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.core.content.FileProvider.COLUMNS = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            androidx.core.content.FileProvider.DEVICE_ROOT = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.core.content.FileProvider.sCache = r0
            return
    }

    public FileProvider() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mResourceId = r0
            return
    }

    private static java.io.File buildPath(java.io.File r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L11
            r2 = r5[r1]
            if (r2 == 0) goto Le
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r2)
            r4 = r3
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            return r4
    }

    private static java.lang.Object[] copyOf(java.lang.Object[] r2, int r3) {
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static java.lang.String[] copyOf(java.lang.String[] r2, int r3) {
            java.lang.String[] r0 = new java.lang.String[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static androidx.core.content.FileProvider.PathStrategy getPathStrategy(android.content.Context r2, java.lang.String r3, int r4) {
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r0 = androidx.core.content.FileProvider.sCache
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L27
            androidx.core.content.FileProvider$PathStrategy r1 = (androidx.core.content.FileProvider.PathStrategy) r1     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L25
            androidx.core.content.FileProvider$PathStrategy r1 = parsePathStrategy(r2, r3, r4)     // Catch: org.xmlpull.v1.XmlPullParserException -> L13 java.io.IOException -> L1c java.lang.Throwable -> L27
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L27
            goto L25
        L13:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L27
            throw r3     // Catch: java.lang.Throwable -> L27
        L1c:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L27
            throw r3     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return r1
        L27:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r2
    }

    public static android.net.Uri getUriForFile(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.io.File r3) {
            r0 = 0
            androidx.core.content.FileProvider$PathStrategy r1 = getPathStrategy(r1, r2, r0)
            android.net.Uri r1 = r1.getUriForFile(r3)
            return r1
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"StreamFiles"})
    public static android.net.Uri getUriForFile(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull java.lang.String r3) {
            android.net.Uri r0 = getUriForFile(r0, r1, r2)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "displayName"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r3)
            android.net.Uri r0 = r0.build()
            return r0
    }

    private static int modeToMode(java.lang.String r2) {
            java.lang.String r0 = "r"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lc
            r2 = 268435456(0x10000000, float:2.524355E-29)
            goto L51
        Lc:
            java.lang.String r0 = "w"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4f
            java.lang.String r0 = "wt"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1f
            goto L4f
        L1f:
            java.lang.String r0 = "wa"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2b
            r2 = 704643072(0x2a000000, float:1.1368684E-13)
            goto L51
        L2b:
            java.lang.String r0 = "rw"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L37
            r2 = 939524096(0x38000000, float:3.0517578E-5)
            goto L51
        L37:
            java.lang.String r0 = "rwt"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L43
            r2 = 1006632960(0x3c000000, float:0.0078125)
            goto L51
        L43:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid mode: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.<init>(r2)
            throw r0
        L4f:
            r2 = 738197504(0x2c000000, float:1.8189894E-12)
        L51:
            return r2
    }

    private static androidx.core.content.FileProvider.PathStrategy parsePathStrategy(android.content.Context r7, java.lang.String r8, int r9) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            androidx.core.content.FileProvider$SimplePathStrategy r0 = new androidx.core.content.FileProvider$SimplePathStrategy
            r0.<init>(r8)
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r8, r2)
            if (r1 == 0) goto Lc9
            android.os.Bundle r8 = r1.metaData
            java.lang.String r2 = "android.support.FILE_PROVIDER_PATHS"
            r3 = 1
            if (r8 != 0) goto L24
            if (r9 == 0) goto L24
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r3)
            r1.metaData = r8
            r8.putInt(r2, r9)
        L24:
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            android.content.res.XmlResourceParser r8 = r1.loadXmlMetaData(r8, r2)
            if (r8 == 0) goto Lc1
        L2e:
            int r9 = r8.next()
            if (r9 == r3) goto Lc0
            r1 = 2
            if (r9 != r1) goto L2e
            java.lang.String r9 = r8.getName()
            r1 = 0
            java.lang.String r2 = "name"
            java.lang.String r2 = r8.getAttributeValue(r1, r2)
            java.lang.String r4 = "path"
            java.lang.String r4 = r8.getAttributeValue(r1, r4)
            java.lang.String r5 = "root-path"
            boolean r5 = r5.equals(r9)
            r6 = 0
            if (r5 == 0) goto L55
            java.io.File r1 = androidx.core.content.FileProvider.DEVICE_ROOT
            goto Lb1
        L55:
            java.lang.String r5 = "files-path"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L62
            java.io.File r1 = r7.getFilesDir()
            goto Lb1
        L62:
            java.lang.String r5 = "cache-path"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L6f
            java.io.File r1 = r7.getCacheDir()
            goto Lb1
        L6f:
            java.lang.String r5 = "external-path"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L7c
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            goto Lb1
        L7c:
            java.lang.String r5 = "external-files-path"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L8e
            java.io.File[] r9 = androidx.core.content.ContextCompat.getExternalFilesDirs(r7, r1)
            int r5 = r9.length
            if (r5 <= 0) goto Lb1
            r1 = r9[r6]
            goto Lb1
        L8e:
            java.lang.String r5 = "external-cache-path"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto La0
            java.io.File[] r9 = androidx.core.content.ContextCompat.getExternalCacheDirs(r7)
            int r5 = r9.length
            if (r5 <= 0) goto Lb1
            r1 = r9[r6]
            goto Lb1
        La0:
            java.lang.String r5 = "external-media-path"
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto Lb1
            java.io.File[] r9 = androidx.core.content.FileProvider.Api21Impl.getExternalMediaDirs(r7)
            int r5 = r9.length
            if (r5 <= 0) goto Lb1
            r1 = r9[r6]
        Lb1:
            if (r1 == 0) goto L2e
            java.lang.String[] r9 = new java.lang.String[r3]
            r9[r6] = r4
            java.io.File r9 = buildPath(r1, r9)
            r0.addRoot(r2, r9)
            goto L2e
        Lc0:
            return r0
        Lc1:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r7.<init>(r8)
            throw r7
        Lc9:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Couldn't find meta-data for provider with authority "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r8)
            r7.<init>(r8)
            throw r7
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.content.pm.ProviderInfo r3) {
            r1 = this;
            super.attachInfo(r2, r3)
            boolean r0 = r3.exported
            if (r0 != 0) goto L31
            boolean r0 = r3.grantUriPermissions
            if (r0 == 0) goto L29
            java.lang.String r3 = r3.authority
            java.lang.String r0 = ";"
            java.lang.String[] r3 = r3.split(r0)
            r0 = 0
            r3 = r3[r0]
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r0 = androidx.core.content.FileProvider.sCache
            monitor-enter(r0)
            r0.remove(r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            int r0 = r1.mResourceId
            androidx.core.content.FileProvider$PathStrategy r2 = getPathStrategy(r2, r3, r0)
            r1.mStrategy = r2
            return
        L26:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r2
        L29:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r3 = "Provider must grant uri permissions"
            r2.<init>(r3)
            throw r2
        L31:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r3 = "Provider must not be exported"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.content.ContentProvider
    public int delete(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String[] r3) {
            r0 = this;
            androidx.core.content.FileProvider$PathStrategy r2 = r0.mStrategy
            java.io.File r1 = r2.getFileForUri(r1)
            boolean r1 = r1.delete()
            return r1
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public java.lang.String getType(@androidx.annotation.NonNull android.net.Uri r3) {
            r2 = this;
            androidx.core.content.FileProvider$PathStrategy r0 = r2.mStrategy
            java.io.File r3 = r0.getFileForUri(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L27
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L27
            return r3
        L27:
            java.lang.String r3 = "application/octet-stream"
            return r3
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull android.content.ContentValues r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external inserts"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.os.ParcelFileDescriptor openFile(@androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.NonNull java.lang.String r3) throws java.io.FileNotFoundException {
            r1 = this;
            androidx.core.content.FileProvider$PathStrategy r0 = r1.mStrategy
            java.io.File r2 = r0.getFileForUri(r2)
            int r3 = modeToMode(r3)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r3)
            return r2
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.NonNull
    public android.database.Cursor query(@androidx.annotation.NonNull android.net.Uri r7, @androidx.annotation.Nullable java.lang.String[] r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable java.lang.String[] r10, @androidx.annotation.Nullable java.lang.String r11) {
            r6 = this;
            androidx.core.content.FileProvider$PathStrategy r9 = r6.mStrategy
            java.io.File r9 = r9.getFileForUri(r7)
            java.lang.String r10 = "displayName"
            java.lang.String r7 = r7.getQueryParameter(r10)
            if (r8 != 0) goto L10
            java.lang.String[] r8 = androidx.core.content.FileProvider.COLUMNS
        L10:
            int r10 = r8.length
            java.lang.String[] r10 = new java.lang.String[r10]
            int r11 = r8.length
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L19:
            if (r1 >= r0) goto L4e
            r3 = r8[r1]
            java.lang.String r4 = "_display_name"
            boolean r5 = r4.equals(r3)
            if (r5 == 0) goto L34
            r10[r2] = r4
            int r3 = r2 + 1
            if (r7 != 0) goto L30
            java.lang.String r4 = r9.getName()
            goto L31
        L30:
            r4 = r7
        L31:
            r11[r2] = r4
            goto L4a
        L34:
            java.lang.String r4 = "_size"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L4b
            r10[r2] = r4
            int r3 = r2 + 1
            long r4 = r9.length()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r11[r2] = r4
        L4a:
            r2 = r3
        L4b:
            int r1 = r1 + 1
            goto L19
        L4e:
            java.lang.String[] r7 = copyOf(r10, r2)
            java.lang.Object[] r8 = copyOf(r11, r2)
            android.database.MatrixCursor r9 = new android.database.MatrixCursor
            r10 = 1
            r9.<init>(r7, r10)
            r9.addRow(r8)
            return r9
    }

    @Override // android.content.ContentProvider
    public int update(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull android.content.ContentValues r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external updates"
            r1.<init>(r2)
            throw r1
    }
}
