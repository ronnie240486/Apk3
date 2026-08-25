package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoSize implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.video.VideoSize> CREATOR = null;
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_UNAPPLIED_ROTATION_DEGREES = 0;
    private static final int DEFAULT_WIDTH = 0;
    private static final java.lang.String FIELD_HEIGHT = null;
    private static final java.lang.String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = null;
    private static final java.lang.String FIELD_UNAPPLIED_ROTATION_DEGREES = null;
    private static final java.lang.String FIELD_WIDTH = null;
    public static final com.google.android.exoplayer2.video.VideoSize UNKNOWN = null;

    @androidx.annotation.IntRange(from = 0)
    public final int height;

    @androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false)
    public final float pixelWidthHeightRatio;

    @androidx.annotation.IntRange(from = 0, to = 359)
    public final int unappliedRotationDegrees;

    @androidx.annotation.IntRange(from = 0)
    public final int width;

    public static /* synthetic */ com.google.android.exoplayer2.video.VideoSize $r8$lambda$1ExUEZYOGg5lLjSnAHRAg3BoMH4(android.os.Bundle r0) {
            com.google.android.exoplayer2.video.VideoSize r0 = lambda$static$0(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.video.VideoSize r0 = new com.google.android.exoplayer2.video.VideoSize
            r1 = 0
            r0.<init>(r1, r1)
            com.google.android.exoplayer2.video.VideoSize.UNKNOWN = r0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r1)
            com.google.android.exoplayer2.video.VideoSize.FIELD_WIDTH = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.video.VideoSize.FIELD_HEIGHT = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.video.VideoSize.FIELD_UNAPPLIED_ROTATION_DEGREES = r0
            r0 = 3
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.video.VideoSize.FIELD_PIXEL_WIDTH_HEIGHT_RATIO = r0
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$26
            com.google.android.exoplayer2.video.VideoSize.CREATOR = r0
            return
    }

    public VideoSize(@androidx.annotation.IntRange(from = 0) int r3, @androidx.annotation.IntRange(from = 0) int r4) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public VideoSize(@androidx.annotation.IntRange(from = 0) int r1, @androidx.annotation.IntRange(from = 0) int r2, @androidx.annotation.IntRange(from = 0, to = 359) int r3, @androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r4) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            r0.unappliedRotationDegrees = r3
            r0.pixelWidthHeightRatio = r4
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.video.VideoSize lambda$static$0(android.os.Bundle r5) {
            java.lang.String r0 = com.google.android.exoplayer2.video.VideoSize.FIELD_WIDTH
            r1 = 0
            int r0 = r5.getInt(r0, r1)
            java.lang.String r2 = com.google.android.exoplayer2.video.VideoSize.FIELD_HEIGHT
            int r2 = r5.getInt(r2, r1)
            java.lang.String r3 = com.google.android.exoplayer2.video.VideoSize.FIELD_UNAPPLIED_ROTATION_DEGREES
            int r1 = r5.getInt(r3, r1)
            java.lang.String r3 = com.google.android.exoplayer2.video.VideoSize.FIELD_PIXEL_WIDTH_HEIGHT_RATIO
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5.getFloat(r3, r4)
            com.google.android.exoplayer2.video.VideoSize r3 = new com.google.android.exoplayer2.video.VideoSize
            r3.<init>(r0, r2, r1, r5)
            return r3
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.exoplayer2.video.VideoSize
            r2 = 0
            if (r1 == 0) goto L28
            com.google.android.exoplayer2.video.VideoSize r5 = (com.google.android.exoplayer2.video.VideoSize) r5
            int r1 = r4.width
            int r3 = r5.width
            if (r1 != r3) goto L26
            int r1 = r4.height
            int r3 = r5.height
            if (r1 != r3) goto L26
            int r1 = r4.unappliedRotationDegrees
            int r3 = r5.unappliedRotationDegrees
            if (r1 != r3) goto L26
            float r1 = r4.pixelWidthHeightRatio
            float r5 = r5.pixelWidthHeightRatio
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        L28:
            return r2
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.width
            r1 = 217(0xd9, float:3.04E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.height
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.unappliedRotationDegrees
            int r1 = r1 + r0
            int r1 = r1 * 31
            float r0 = r2.pixelWidthHeightRatio
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.video.VideoSize.FIELD_WIDTH
            int r2 = r3.width
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.video.VideoSize.FIELD_HEIGHT
            int r2 = r3.height
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.video.VideoSize.FIELD_UNAPPLIED_ROTATION_DEGREES
            int r2 = r3.unappliedRotationDegrees
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.video.VideoSize.FIELD_PIXEL_WIDTH_HEIGHT_RATIO
            float r2 = r3.pixelWidthHeightRatio
            r0.putFloat(r1, r2)
            return r0
    }
}
