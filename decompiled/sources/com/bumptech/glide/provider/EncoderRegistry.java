package com.bumptech.glide.provider;

/* JADX INFO: loaded from: classes2.dex */
public class EncoderRegistry {
    private final java.util.List<com.bumptech.glide.provider.EncoderRegistry.Entry<?>> encoders;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Entry<T> {
        private final java.lang.Class<T> dataClass;
        public final com.bumptech.glide.load.Encoder<T> encoder;

        public Entry(@androidx.annotation.NonNull java.lang.Class<T> r1, @androidx.annotation.NonNull com.bumptech.glide.load.Encoder<T> r2) {
                r0 = this;
                r0.<init>()
                r0.dataClass = r1
                r0.encoder = r2
                return
        }

        public final boolean handles(@androidx.annotation.NonNull java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<T> r0 = r1.dataClass
                boolean r2 = r0.isAssignableFrom(r2)
                return r2
        }
    }

    public EncoderRegistry() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.encoders = r0
            return
    }

    public synchronized <T> void append(@androidx.annotation.NonNull java.lang.Class<T> r3, @androidx.annotation.NonNull com.bumptech.glide.load.Encoder<T> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.EncoderRegistry$Entry<?>> r0 = r2.encoders     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.provider.EncoderRegistry$Entry r1 = new com.bumptech.glide.provider.EncoderRegistry$Entry     // Catch: java.lang.Throwable -> Ld
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
    public synchronized <T> com.bumptech.glide.load.Encoder<T> getEncoder(@androidx.annotation.NonNull java.lang.Class<T> r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.bumptech.glide.provider.EncoderRegistry$Entry<?>> r0 = r3.encoders     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.provider.EncoderRegistry$Entry r1 = (com.bumptech.glide.provider.EncoderRegistry.Entry) r1     // Catch: java.lang.Throwable -> L20
            boolean r2 = r1.handles(r4)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L7
            com.bumptech.glide.load.Encoder<T> r4 = r1.encoder     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)
            return r4
        L1d:
            r4 = 0
            monitor-exit(r3)
            return r4
        L20:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized <T> void prepend(@androidx.annotation.NonNull java.lang.Class<T> r4, @androidx.annotation.NonNull com.bumptech.glide.load.Encoder<T> r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.bumptech.glide.provider.EncoderRegistry$Entry<?>> r0 = r3.encoders     // Catch: java.lang.Throwable -> Le
            r1 = 0
            com.bumptech.glide.provider.EncoderRegistry$Entry r2 = new com.bumptech.glide.provider.EncoderRegistry$Entry     // Catch: java.lang.Throwable -> Le
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
