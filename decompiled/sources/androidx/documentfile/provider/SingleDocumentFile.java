package androidx.documentfile.provider;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
class SingleDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private android.content.Context mContext;
    private android.net.Uri mUri;

    public SingleDocumentFile(android.content.Context r2, android.net.Uri r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.mContext = r2
            r1.mUri = r3
            return
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.canRead(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.canWrite(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
            r2 = this;
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Exception -> Ld
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> Ld
            android.net.Uri r1 = r2.mUri     // Catch: java.lang.Exception -> Ld
            boolean r0 = android.provider.DocumentsContract.deleteDocument(r0, r1)     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.exists(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @androidx.annotation.Nullable
    public java.lang.String getName() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            java.lang.String r0 = androidx.documentfile.provider.DocumentsContractApi19.getName(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @androidx.annotation.Nullable
    public java.lang.String getType() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            java.lang.String r0 = androidx.documentfile.provider.DocumentsContractApi19.getType(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.mUri
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isDirectory(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isFile(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            boolean r0 = androidx.documentfile.provider.DocumentsContractApi19.isVirtual(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            long r0 = androidx.documentfile.provider.DocumentsContractApi19.lastModified(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.net.Uri r1 = r2.mUri
            long r0 = androidx.documentfile.provider.DocumentsContractApi19.length(r0, r1)
            return r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
