package androidx.core.provider;

/* JADX INFO: loaded from: classes2.dex */
public final class DocumentsContractCompat {
    private static final java.lang.String PATH_TREE = "tree";

    /* JADX INFO: loaded from: classes.dex */
    public static final class DocumentCompat {
        public static final int FLAG_VIRTUAL_DOCUMENT = 512;

        private DocumentCompat() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    @androidx.annotation.RequiresApi(19)
    public static class DocumentsContractApi19Impl {
        private DocumentsContractApi19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.net.Uri buildDocumentUri(java.lang.String r0, java.lang.String r1) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUri(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean deleteDocument(android.content.ContentResolver r0, android.net.Uri r1) throws java.io.FileNotFoundException {
                boolean r0 = android.provider.DocumentsContract.deleteDocument(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getDocumentId(android.net.Uri r0) {
                java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isDocumentUri(android.content.Context r0, @androidx.annotation.Nullable android.net.Uri r1) {
                boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class DocumentsContractApi21Impl {
        private DocumentsContractApi21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.net.Uri buildChildDocumentsUri(java.lang.String r0, java.lang.String r1) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildChildDocumentsUri(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.net.Uri buildChildDocumentsUriUsingTree(android.net.Uri r0, java.lang.String r1) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.net.Uri buildDocumentUriUsingTree(android.net.Uri r0, java.lang.String r1) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.net.Uri buildTreeDocumentUri(java.lang.String r0, java.lang.String r1) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildTreeDocumentUri(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.net.Uri createDocument(android.content.ContentResolver r0, android.net.Uri r1, java.lang.String r2, java.lang.String r3) throws java.io.FileNotFoundException {
                android.net.Uri r0 = android.provider.DocumentsContract.createDocument(r0, r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getTreeDocumentId(android.net.Uri r0) {
                java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.net.Uri renameDocument(@androidx.annotation.NonNull android.content.ContentResolver r0, @androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull java.lang.String r2) throws java.io.FileNotFoundException {
                android.net.Uri r0 = android.provider.DocumentsContract.renameDocument(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(24)
    public static class DocumentsContractApi24Impl {
        private DocumentsContractApi24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isTreeUri(@androidx.annotation.NonNull android.net.Uri r0) {
                boolean r0 = android.provider.DocumentsContract.isTreeUri(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean removeDocument(android.content.ContentResolver r0, android.net.Uri r1, android.net.Uri r2) throws java.io.FileNotFoundException {
                boolean r0 = android.provider.DocumentsContract.removeDocument(r0, r1, r2)
                return r0
        }
    }

    private DocumentsContractCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.net.Uri buildChildDocumentsUri(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.Nullable java.lang.String r1) {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildChildDocumentsUri(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.net.Uri buildChildDocumentsUriUsingTree(@androidx.annotation.NonNull android.net.Uri r0, @androidx.annotation.NonNull java.lang.String r1) {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildChildDocumentsUriUsingTree(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.net.Uri buildDocumentUri(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1) {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi19Impl.buildDocumentUri(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.net.Uri buildDocumentUriUsingTree(@androidx.annotation.NonNull android.net.Uri r0, @androidx.annotation.NonNull java.lang.String r1) {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildDocumentUriUsingTree(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.net.Uri buildTreeDocumentUri(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1) {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.buildTreeDocumentUri(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.net.Uri createDocument(@androidx.annotation.NonNull android.content.ContentResolver r0, @androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) throws java.io.FileNotFoundException {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.createDocument(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String getDocumentId(@androidx.annotation.NonNull android.net.Uri r0) {
            java.lang.String r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi19Impl.getDocumentId(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String getTreeDocumentId(@androidx.annotation.NonNull android.net.Uri r0) {
            java.lang.String r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.getTreeDocumentId(r0)
            return r0
    }

    public static boolean isDocumentUri(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.Nullable android.net.Uri r1) {
            boolean r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi19Impl.isDocumentUri(r0, r1)
            return r0
    }

    public static boolean isTreeUri(@androidx.annotation.NonNull android.net.Uri r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L21
            java.util.List r3 = r3.getPathSegments()
            int r0 = r3.size()
            r1 = 2
            r2 = 0
            if (r0 < r1) goto L20
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r0 = "tree"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L20
            r2 = 1
        L20:
            return r2
        L21:
            boolean r3 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl.isTreeUri(r3)
            return r3
    }

    public static boolean removeDocument(@androidx.annotation.NonNull android.content.ContentResolver r2, @androidx.annotation.NonNull android.net.Uri r3, @androidx.annotation.NonNull android.net.Uri r4) throws java.io.FileNotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl.removeDocument(r2, r3, r4)
            return r2
        Lb:
            boolean r2 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi19Impl.deleteDocument(r2, r3)
            return r2
    }

    @androidx.annotation.Nullable
    public static android.net.Uri renameDocument(@androidx.annotation.NonNull android.content.ContentResolver r0, @androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull java.lang.String r2) throws java.io.FileNotFoundException {
            android.net.Uri r0 = androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl.renameDocument(r0, r1, r2)
            return r0
    }
}
