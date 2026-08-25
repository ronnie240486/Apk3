package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes2.dex */
public interface ContentMetadata {
    public static final java.lang.String KEY_CONTENT_LENGTH = "exo_len";
    public static final java.lang.String KEY_CUSTOM_PREFIX = "custom_";
    public static final java.lang.String KEY_REDIRECTED_URI = "exo_redir";

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.ContentMetadata$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long getContentLength(com.google.android.exoplayer2.upstream.cache.ContentMetadata r3) {
                java.lang.String r0 = "exo_len"
                r1 = -1
                long r0 = r3.get(r0, r1)
                return r0
        }

        @androidx.annotation.Nullable
        public static android.net.Uri getRedirectedUri(com.google.android.exoplayer2.upstream.cache.ContentMetadata r2) {
                java.lang.String r0 = "exo_redir"
                r1 = 0
                java.lang.String r2 = r2.get(r0, r1)
                if (r2 != 0) goto La
                goto Le
            La:
                android.net.Uri r1 = android.net.Uri.parse(r2)
            Le:
                return r1
        }
    }

    boolean contains(java.lang.String r1);

    long get(java.lang.String r1, long r2);

    @androidx.annotation.Nullable
    java.lang.String get(java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2);

    @androidx.annotation.Nullable
    byte[] get(java.lang.String r1, @androidx.annotation.Nullable byte[] r2);
}
