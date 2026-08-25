package com.bumptech.glide.provider;

/* JADX INFO: loaded from: classes.dex */
public final class ImageHeaderParserRegistry {
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;

    public ImageHeaderParserRegistry() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.parsers = r0
            return
    }

    public synchronized void add(@androidx.annotation.NonNull com.bumptech.glide.load.ImageHeaderParser r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r1.parsers     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @androidx.annotation.NonNull
    public synchronized java.util.List<com.bumptech.glide.load.ImageHeaderParser> getParsers() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r1.parsers     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
