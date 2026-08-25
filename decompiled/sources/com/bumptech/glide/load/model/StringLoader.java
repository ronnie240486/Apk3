package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public class StringLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<java.lang.String, Data> {
    private final com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> uriLoader;

    /* JADX INFO: loaded from: classes.dex */
    public static final class AssetFileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.String, android.content.res.AssetFileDescriptor> {
        public AssetFileDescriptorFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<java.lang.String, android.content.res.AssetFileDescriptor> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r4) {
                r3 = this;
                com.bumptech.glide.load.model.StringLoader r0 = new com.bumptech.glide.load.model.StringLoader
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Class<android.content.res.AssetFileDescriptor> r2 = android.content.res.AssetFileDescriptor.class
                com.bumptech.glide.load.model.ModelLoader r4 = r4.build(r1, r2)
                r0.<init>(r4)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class FileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.String, android.os.ParcelFileDescriptor> {
        public FileDescriptorFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<java.lang.String, android.os.ParcelFileDescriptor> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r4) {
                r3 = this;
                com.bumptech.glide.load.model.StringLoader r0 = new com.bumptech.glide.load.model.StringLoader
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Class<android.os.ParcelFileDescriptor> r2 = android.os.ParcelFileDescriptor.class
                com.bumptech.glide.load.model.ModelLoader r4 = r4.build(r1, r2)
                r0.<init>(r4)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.String, java.io.InputStream> {
        public StreamFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<java.lang.String, java.io.InputStream> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r4) {
                r3 = this;
                com.bumptech.glide.load.model.StringLoader r0 = new com.bumptech.glide.load.model.StringLoader
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
                com.bumptech.glide.load.model.ModelLoader r4 = r4.build(r1, r2)
                r0.<init>(r4)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public StringLoader(com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> r1) {
            r0 = this;
            r0.<init>()
            r0.uriLoader = r1
            return
    }

    @androidx.annotation.Nullable
    private static android.net.Uri parseUri(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            r0 = 0
            char r0 = r2.charAt(r0)
            r1 = 47
            if (r0 != r1) goto L16
            android.net.Uri r2 = toFileUri(r2)
            goto L26
        L16:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            java.lang.String r1 = r0.getScheme()
            if (r1 != 0) goto L25
            android.net.Uri r2 = toFileUri(r2)
            goto L26
        L25:
            r2 = r0
        L26:
            return r2
    }

    private static android.net.Uri toFileUri(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            return r1
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(@androidx.annotation.NonNull java.lang.String r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData2(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) {
            r1 = this;
            android.net.Uri r2 = parseUri(r2)
            if (r2 == 0) goto L16
            com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> r0 = r1.uriLoader
            boolean r0 = r0.handles(r2)
            if (r0 != 0) goto Lf
            goto L16
        Lf:
            com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> r0 = r1.uriLoader
            com.bumptech.glide.load.model.ModelLoader$LoadData r2 = r0.buildLoadData(r2, r3, r4, r5)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
