package com.bumptech.glide.load.data.mediastore;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaStoreUtil {
    private static final int MINI_THUMB_HEIGHT = 384;
    private static final int MINI_THUMB_WIDTH = 512;

    private MediaStoreUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isMediaStoreImageUri(android.net.Uri r1) {
            boolean r0 = isMediaStoreUri(r1)
            if (r0 == 0) goto Le
            boolean r1 = isVideoUri(r1)
            if (r1 != 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static boolean isMediaStoreUri(android.net.Uri r2) {
            if (r2 == 0) goto L1c
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            java.lang.String r2 = r2.getAuthority()
            java.lang.String r0 = "media"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    public static boolean isMediaStoreVideoUri(android.net.Uri r1) {
            boolean r0 = isMediaStoreUri(r1)
            if (r0 == 0) goto Le
            boolean r1 = isVideoUri(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static boolean isThumbnailSize(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L10
            if (r2 == r0) goto L10
            r0 = 512(0x200, float:7.17E-43)
            if (r1 > r0) goto L10
            r1 = 384(0x180, float:5.38E-43)
            if (r2 > r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    private static boolean isVideoUri(android.net.Uri r1) {
            java.util.List r1 = r1.getPathSegments()
            java.lang.String r0 = "video"
            boolean r1 = r1.contains(r0)
            return r1
    }
}
