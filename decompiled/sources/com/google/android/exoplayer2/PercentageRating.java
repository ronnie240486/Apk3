package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class PercentageRating extends com.google.android.exoplayer2.Rating {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.PercentageRating> CREATOR = null;
    private static final java.lang.String FIELD_PERCENT = null;
    private static final int TYPE = 1;
    private final float percent;

    public static /* synthetic */ com.google.android.exoplayer2.PercentageRating $r8$lambda$gV1VuOc0syRaJALh6cdfjMjuj2Y(android.os.Bundle r0) {
            com.google.android.exoplayer2.PercentageRating r0 = fromBundle(r0)
            return r0
    }

    static {
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.PercentageRating.FIELD_PERCENT = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$12
            com.google.android.exoplayer2.PercentageRating.CREATOR = r0
            return
    }

    public PercentageRating() {
            r1 = this;
            r1.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.percent = r0
            return
    }

    public PercentageRating(@androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r1 = "percent must be in the range of [0, 100]"
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
            r2.percent = r3
            return
    }

    private static com.google.android.exoplayer2.PercentageRating fromBundle(android.os.Bundle r2) {
            java.lang.String r0 = com.google.android.exoplayer2.Rating.FIELD_RATING_TYPE
            r1 = -1
            int r0 = r2.getInt(r0, r1)
            r1 = 1
            if (r0 != r1) goto Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            java.lang.String r0 = com.google.android.exoplayer2.PercentageRating.FIELD_PERCENT
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2.getFloat(r0, r1)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
            com.google.android.exoplayer2.PercentageRating r2 = new com.google.android.exoplayer2.PercentageRating
            r2.<init>()
            goto L27
        L21:
            com.google.android.exoplayer2.PercentageRating r0 = new com.google.android.exoplayer2.PercentageRating
            r0.<init>(r2)
            r2 = r0
        L27:
            return r2
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.exoplayer2.PercentageRating
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            float r0 = r2.percent
            com.google.android.exoplayer2.PercentageRating r3 = (com.google.android.exoplayer2.PercentageRating) r3
            float r3 = r3.percent
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L11
            r1 = 1
        L11:
            return r1
    }

    public float getPercent() {
            r1 = this;
            float r0 = r1.percent
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r3.percent
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
            r2 = this;
            float r0 = r2.percent
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.Rating.FIELD_RATING_TYPE
            r2 = 1
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.PercentageRating.FIELD_PERCENT
            float r2 = r3.percent
            r0.putFloat(r1, r2)
            return r0
    }
}
