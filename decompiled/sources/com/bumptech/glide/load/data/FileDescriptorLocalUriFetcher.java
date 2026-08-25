package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public class FileDescriptorLocalUriFetcher extends com.bumptech.glide.load.data.LocalUriFetcher<android.os.ParcelFileDescriptor> {
    public FileDescriptorLocalUriFetcher(android.content.ContentResolver r1, android.net.Uri r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
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

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public final android.os.ParcelFileDescriptor loadResource(android.net.Uri r3, android.content.ContentResolver r4) throws java.io.FileNotFoundException {
            r2 = this;
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r4 = r4.openAssetFileDescriptor(r3, r0)
            if (r4 == 0) goto Le
            android.os.ParcelFileDescriptor r3 = r4.getParcelFileDescriptor()
            return r3
        Le:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FileDescriptor is null for: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }
}
