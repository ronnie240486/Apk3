package com.bumptech.glide.load.data.mediastore;

/* JADX INFO: loaded from: classes.dex */
class FileService {
    public FileService() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean exists(java.io.File r1) {
            r0 = this;
            boolean r1 = r1.exists()
            return r1
    }

    public java.io.File get(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            return r0
    }

    public long length(java.io.File r3) {
            r2 = this;
            long r0 = r3.length()
            return r0
    }
}
