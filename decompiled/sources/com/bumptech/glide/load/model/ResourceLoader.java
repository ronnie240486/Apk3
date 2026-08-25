package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, Data> {
    private static final java.lang.String TAG = "ResourceLoader";
    private final android.content.res.Resources resources;
    private final com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> uriLoader;

    public static final class AssetFileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.content.res.AssetFileDescriptor> {
        private final android.content.res.Resources resources;

        public AssetFileDescriptorFactory(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.resources = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, android.content.res.AssetFileDescriptor> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r5) {
                r4 = this;
                com.bumptech.glide.load.model.ResourceLoader r0 = new com.bumptech.glide.load.model.ResourceLoader
                android.content.res.Resources r1 = r4.resources
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                java.lang.Class<android.content.res.AssetFileDescriptor> r3 = android.content.res.AssetFileDescriptor.class
                com.bumptech.glide.load.model.ModelLoader r5 = r5.build(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class FileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.os.ParcelFileDescriptor> {
        private final android.content.res.Resources resources;

        public FileDescriptorFactory(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.resources = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, android.os.ParcelFileDescriptor> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r5) {
                r4 = this;
                com.bumptech.glide.load.model.ResourceLoader r0 = new com.bumptech.glide.load.model.ResourceLoader
                android.content.res.Resources r1 = r4.resources
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
                com.bumptech.glide.load.model.ModelLoader r5 = r5.build(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, java.io.InputStream> {
        private final android.content.res.Resources resources;

        public StreamFactory(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.resources = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r5) {
                r4 = this;
                com.bumptech.glide.load.model.ResourceLoader r0 = new com.bumptech.glide.load.model.ResourceLoader
                android.content.res.Resources r1 = r4.resources
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
                com.bumptech.glide.load.model.ModelLoader r5 = r5.build(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class UriFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.net.Uri> {
        private final android.content.res.Resources resources;

        public UriFactory(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.resources = r1
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, android.net.Uri> build(com.bumptech.glide.load.model.MultiModelLoaderFactory r3) {
                r2 = this;
                com.bumptech.glide.load.model.ResourceLoader r3 = new com.bumptech.glide.load.model.ResourceLoader
                android.content.res.Resources r0 = r2.resources
                com.bumptech.glide.load.model.UnitModelLoader r1 = com.bumptech.glide.load.model.UnitModelLoader.getInstance()
                r3.<init>(r0, r1)
                return r3
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
                r0 = this;
                return
        }
    }

    public ResourceLoader(android.content.res.Resources r1, com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> r2) {
            r0 = this;
            r0.<init>()
            r0.resources = r1
            r0.uriLoader = r2
            return
    }

    @androidx.annotation.Nullable
    private android.net.Uri getResourceUri(java.lang.Integer r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r1 = "android.resource://"
            r0.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L42
            android.content.res.Resources r1 = r4.resources     // Catch: android.content.res.Resources.NotFoundException -> L42
            int r2 = r5.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r1 = r1.getResourcePackageName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r1 = 47
            r0.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L42
            android.content.res.Resources r2 = r4.resources     // Catch: android.content.res.Resources.NotFoundException -> L42
            int r3 = r5.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r2 = r2.getResourceTypeName(r3)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L42
            android.content.res.Resources r1 = r4.resources     // Catch: android.content.res.Resources.NotFoundException -> L42
            int r2 = r5.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r1 = r1.getResourceEntryName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r0 = r0.toString()     // Catch: android.content.res.Resources.NotFoundException -> L42
            android.net.Uri r5 = android.net.Uri.parse(r0)     // Catch: android.content.res.Resources.NotFoundException -> L42
            return r5
        L42:
            r0 = move-exception
            r1 = 5
            java.lang.String r2 = "ResourceLoader"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Received invalid resource id: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.util.Log.w(r2, r5, r0)
        L60:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: buildLoadData, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData2(@androidx.annotation.NonNull java.lang.Integer r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) {
            r1 = this;
            android.net.Uri r2 = r1.getResourceUri(r2)
            if (r2 != 0) goto L8
            r2 = 0
            goto Le
        L8:
            com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> r0 = r1.uriLoader
            com.bumptech.glide.load.model.ModelLoader$LoadData r2 = r0.buildLoadData(r2, r3, r4, r5)
        Le:
            return r2
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(@androidx.annotation.NonNull java.lang.Integer r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r0.buildLoadData2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull java.lang.Integer r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull java.lang.Integer r1) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            boolean r1 = r0.handles2(r1)
            return r1
    }
}
