package com.bumptech.glide.load.resource.transcode;

/* JADX INFO: loaded from: classes2.dex */
public class TranscoderRegistry {
    private final java.util.List<com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry<?, ?>> transcoders;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Entry<Z, R> {
        private final java.lang.Class<Z> fromClass;
        private final java.lang.Class<R> toClass;
        public final com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> transcoder;

        public Entry(@androidx.annotation.NonNull java.lang.Class<Z> r1, @androidx.annotation.NonNull java.lang.Class<R> r2, @androidx.annotation.NonNull com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> r3) {
                r0 = this;
                r0.<init>()
                r0.fromClass = r1
                r0.toClass = r2
                r0.transcoder = r3
                return
        }

        public boolean handles(@androidx.annotation.NonNull java.lang.Class<?> r2, @androidx.annotation.NonNull java.lang.Class<?> r3) {
                r1 = this;
                java.lang.Class<Z> r0 = r1.fromClass
                boolean r2 = r0.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                java.lang.Class<R> r2 = r1.toClass
                boolean r2 = r3.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }
    }

    public TranscoderRegistry() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.transcoders = r0
            return
    }

    @androidx.annotation.NonNull
    public synchronized <Z, R> com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> get(@androidx.annotation.NonNull java.lang.Class<Z> r4, @androidx.annotation.NonNull java.lang.Class<R> r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto Ld
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder r4 = com.bumptech.glide.load.resource.transcode.UnitTranscoder.get()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r3)
            return r4
        Ld:
            java.util.List<com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry<?, ?>> r0 = r3.transcoders     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L48
        L13:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L48
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry r1 = (com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry) r1     // Catch: java.lang.Throwable -> L48
            boolean r2 = r1.handles(r4, r5)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L13
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> r4 = r1.transcoder     // Catch: java.lang.Throwable -> L48
            monitor-exit(r3)
            return r4
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "No transcoder registered to transcode from "
            r1.append(r2)     // Catch: java.lang.Throwable -> L48
            r1.append(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = " to "
            r1.append(r4)     // Catch: java.lang.Throwable -> L48
            r1.append(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L48
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L48
        L48:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @androidx.annotation.NonNull
    public synchronized <Z, R> java.util.List<java.lang.Class<R>> getTranscodeClasses(@androidx.annotation.NonNull java.lang.Class<Z> r4, @androidx.annotation.NonNull java.lang.Class<R> r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L11
            r0.add(r5)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            return r0
        L11:
            java.util.List<com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry<?, ?>> r1 = r3.transcoders     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2f
        L17:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry r2 = (com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry) r2     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.handles(r4, r5)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L17
            r0.add(r5)     // Catch: java.lang.Throwable -> L2f
            goto L17
        L2d:
            monitor-exit(r3)
            return r0
        L2f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized <Z, R> void register(@androidx.annotation.NonNull java.lang.Class<Z> r3, @androidx.annotation.NonNull java.lang.Class<R> r4, @androidx.annotation.NonNull com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> r5) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry<?, ?>> r0 = r2.transcoders     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry r1 = new com.bumptech.glide.load.resource.transcode.TranscoderRegistry$Entry     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> Ld
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
