package androidx.documentfile.provider;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DocumentFile {

    @androidx.annotation.Nullable
    private final androidx.documentfile.provider.DocumentFile mParent;

    public DocumentFile(@androidx.annotation.Nullable androidx.documentfile.provider.DocumentFile r1) {
            r0 = this;
            r0.<init>()
            r0.mParent = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.documentfile.provider.DocumentFile fromFile(@androidx.annotation.NonNull java.io.File r2) {
            androidx.documentfile.provider.RawDocumentFile r0 = new androidx.documentfile.provider.RawDocumentFile
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.documentfile.provider.DocumentFile fromSingleUri(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.net.Uri r2) {
            androidx.documentfile.provider.SingleDocumentFile r0 = new androidx.documentfile.provider.SingleDocumentFile
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.documentfile.provider.DocumentFile fromTreeUri(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.net.Uri r4) {
            androidx.documentfile.provider.TreeDocumentFile r0 = new androidx.documentfile.provider.TreeDocumentFile
            r1 = 0
            java.lang.String r2 = android.provider.DocumentsContract.getTreeDocumentId(r4)
            android.net.Uri r4 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r4, r2)
            r0.<init>(r1, r3, r4)
            return r0
    }

    public static boolean isDocumentUri(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.Nullable android.net.Uri r1) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r1)
            return r0
    }

    public abstract boolean canRead();

    public abstract boolean canWrite();

    @androidx.annotation.Nullable
    public abstract androidx.documentfile.provider.DocumentFile createDirectory(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.Nullable
    public abstract androidx.documentfile.provider.DocumentFile createFile(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2);

    public abstract boolean delete();

    public abstract boolean exists();

    @androidx.annotation.Nullable
    public androidx.documentfile.provider.DocumentFile findFile(@androidx.annotation.NonNull java.lang.String r6) {
            r5 = this;
            androidx.documentfile.provider.DocumentFile[] r0 = r5.listFiles()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L15
            return r3
        L15:
            int r2 = r2 + 1
            goto L6
        L18:
            r6 = 0
            return r6
    }

    @androidx.annotation.Nullable
    public abstract java.lang.String getName();

    @androidx.annotation.Nullable
    public androidx.documentfile.provider.DocumentFile getParentFile() {
            r1 = this;
            androidx.documentfile.provider.DocumentFile r0 = r1.mParent
            return r0
    }

    @androidx.annotation.Nullable
    public abstract java.lang.String getType();

    @androidx.annotation.NonNull
    public abstract android.net.Uri getUri();

    public abstract boolean isDirectory();

    public abstract boolean isFile();

    public abstract boolean isVirtual();

    public abstract long lastModified();

    public abstract long length();

    @androidx.annotation.NonNull
    public abstract androidx.documentfile.provider.DocumentFile[] listFiles();

    public abstract boolean renameTo(@androidx.annotation.NonNull java.lang.String r1);
}
