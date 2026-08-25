package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes2.dex */
public interface CacheKeyFactory {
    public static final com.google.android.exoplayer2.upstream.cache.CacheKeyFactory DEFAULT = null;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.CacheKeyFactory$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        static {
                com.google.android.exoplayer2.upstream.cache.CacheKeyFactory r0 = com.google.android.exoplayer2.upstream.cache.CacheKeyFactory.DEFAULT
                return
        }

        public static /* synthetic */ java.lang.String lambda$static$0(com.google.android.exoplayer2.upstream.DataSpec r1) {
                java.lang.String r0 = r1.key
                if (r0 == 0) goto L5
                goto Lb
            L5:
                android.net.Uri r1 = r1.uri
                java.lang.String r0 = r1.toString()
            Lb:
                return r0
        }
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$23
            com.google.android.exoplayer2.upstream.cache.CacheKeyFactory.DEFAULT = r0
            return
    }

    java.lang.String buildCacheKey(com.google.android.exoplayer2.upstream.DataSpec r1);
}
