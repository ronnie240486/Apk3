package com.bumptech.glide.provider;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceEncoderRegistry {
    private final java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry.Entry<?>> encoders;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Entry<T> {
        public final com.bumptech.glide.load.ResourceEncoder<T> encoder;
        private final java.lang.Class<T> resourceClass;

        public Entry(@androidx.annotation.NonNull java.lang.Class<T> r1, @androidx.annotation.NonNull com.bumptech.glide.load.ResourceEncoder<T> r2) {
                r0 = this;
                r0.<init>()
                r0.resourceClass = r1
                r0.encoder = r2
                return
        }

        public final boolean handles(@androidx.annotation.NonNull java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<T> r0 = r1.resourceClass
                boolean r2 = r0.isAssignableFrom(r2)
                return r2
        }
    }

    public ResourceEncoderRegistry() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.encoders = r0
            return
    }

    public synchronized <Z> void append(@androidx.annotation.NonNull java.lang.Class<Z> r3, @androidx.annotation.NonNull com.bumptech.glide.load.ResourceEncoder<Z> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r0 = r2.encoders     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.provider.ResourceEncoderRegistry$Entry r1 = new com.bumptech.glide.provider.ResourceEncoderRegistry$Entry     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Ld
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @androidx.annotation.Nullable
    public synchronized <Z> com.bumptech.glide.load.ResourceEncoder<Z> get(@androidx.annotation.NonNull java.lang.Class<Z> r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r1 = r4.encoders     // Catch: java.lang.Throwable -> L22
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
        L8:
            if (r0 >= r1) goto L1f
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r2 = r4.encoders     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.provider.ResourceEncoderRegistry$Entry r2 = (com.bumptech.glide.provider.ResourceEncoderRegistry.Entry) r2     // Catch: java.lang.Throwable -> L22
            boolean r3 = r2.handles(r5)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L1c
            com.bumptech.glide.load.ResourceEncoder<T> r5 = r2.encoder     // Catch: java.lang.Throwable -> L22
            monitor-exit(r4)
            return r5
        L1c:
            int r0 = r0 + 1
            goto L8
        L1f:
            r5 = 0
            monitor-exit(r4)
            return r5
        L22:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public synchronized <Z> void prepend(@androidx.annotation.NonNull java.lang.Class<Z> r4, @androidx.annotation.NonNull com.bumptech.glide.load.ResourceEncoder<Z> r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r0 = r3.encoders     // Catch: java.lang.Throwable -> Le
            r1 = 0
            com.bumptech.glide.provider.ResourceEncoderRegistry$Entry r2 = new com.bumptech.glide.provider.ResourceEncoderRegistry$Entry     // Catch: java.lang.Throwable -> Le
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> Le
            r0.add(r1, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return
        Le:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
