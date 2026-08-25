package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes2.dex */
public class FileDescriptorAssetPathFetcher extends com.bumptech.glide.load.data.AssetPathFetcher<android.os.ParcelFileDescriptor> {
    public FileDescriptorAssetPathFetcher(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public final void close(android.os.ParcelFileDescriptor r1) throws java.io.IOException {
            r0 = this;
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            r1.close()
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @androidx.annotation.NonNull
    public java.lang.Class<android.os.ParcelFileDescriptor> getDataClass() {
            r1 = this;
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public final android.os.ParcelFileDescriptor loadResource(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
            android.os.ParcelFileDescriptor r1 = r1.getParcelFileDescriptor()
            return r1
    }
}
