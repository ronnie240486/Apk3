package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackParameters implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.PlaybackParameters> CREATOR = null;
    public static final com.google.android.exoplayer2.PlaybackParameters DEFAULT = null;
    private static final java.lang.String FIELD_PITCH = null;
    private static final java.lang.String FIELD_SPEED = null;
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;

    public static /* synthetic */ com.google.android.exoplayer2.PlaybackParameters $r8$lambda$RwG_RMdOxdeY67Xihvdaau5AZEE(android.os.Bundle r0) {
            com.google.android.exoplayer2.PlaybackParameters r0 = lambda$static$0(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.PlaybackParameters r0 = new com.google.android.exoplayer2.PlaybackParameters
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1)
            com.google.android.exoplayer2.PlaybackParameters.DEFAULT = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.PlaybackParameters.FIELD_SPEED = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.PlaybackParameters.FIELD_PITCH = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$14
            com.google.android.exoplayer2.PlaybackParameters.CREATOR = r0
            return
    }

    public PlaybackParameters(float r2) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r0)
            return
    }

    public PlaybackParameters(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r5, @androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 <= 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r4.speed = r5
            r4.pitch = r6
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            r4.scaledUsPerMs = r5
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.PlaybackParameters lambda$static$0(android.os.Bundle r3) {
            java.lang.String r0 = com.google.android.exoplayer2.PlaybackParameters.FIELD_SPEED
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3.getFloat(r0, r1)
            java.lang.String r2 = com.google.android.exoplayer2.PlaybackParameters.FIELD_PITCH
            float r3 = r3.getFloat(r2, r1)
            com.google.android.exoplayer2.PlaybackParameters r1 = new com.google.android.exoplayer2.PlaybackParameters
            r1.<init>(r0, r3)
            return r1
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<com.google.android.exoplayer2.PlaybackParameters> r2 = com.google.android.exoplayer2.PlaybackParameters.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            com.google.android.exoplayer2.PlaybackParameters r5 = (com.google.android.exoplayer2.PlaybackParameters) r5
            float r2 = r4.speed
            float r3 = r5.speed
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L23
            float r2 = r4.pitch
            float r5 = r5.pitch
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public long getMediaTimeUsForPlayoutTimeMs(long r3) {
            r2 = this;
            int r0 = r2.scaledUsPerMs
            long r0 = (long) r0
            long r3 = r3 * r0
            return r3
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.speed
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            int r0 = r0 + 527
            int r0 = r0 * 31
            float r1 = r2.pitch
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.PlaybackParameters.FIELD_SPEED
            float r2 = r3.speed
            r0.putFloat(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.PlaybackParameters.FIELD_PITCH
            float r2 = r3.pitch
            r0.putFloat(r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r3.speed
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r3.pitch
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "PlaybackParameters(speed=%.2f, pitch=%.2f)"
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r1, r0)
            return r0
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.PlaybackParameters withSpeed(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r3) {
            r2 = this;
            com.google.android.exoplayer2.PlaybackParameters r0 = new com.google.android.exoplayer2.PlaybackParameters
            float r1 = r2.pitch
            r0.<init>(r3, r1)
            return r0
    }
}
