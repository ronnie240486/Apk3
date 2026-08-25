package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class StarRating extends com.google.android.exoplayer2.Rating {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.StarRating> CREATOR = null;
    private static final java.lang.String FIELD_MAX_STARS = null;
    private static final java.lang.String FIELD_STAR_RATING = null;
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;

    @androidx.annotation.IntRange(from = 1)
    private final int maxStars;
    private final float starRating;

    public static /* synthetic */ com.google.android.exoplayer2.StarRating $r8$lambda$PFFEnOFJiYnmZMUGPr8Imzm26I8(android.os.Bundle r0) {
            com.google.android.exoplayer2.StarRating r0 = fromBundle(r0)
            return r0
    }

    static {
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.StarRating.FIELD_MAX_STARS = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.StarRating.FIELD_STAR_RATING = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$20
            com.google.android.exoplayer2.StarRating.CREATOR = r0
            return
    }

    public StarRating(@androidx.annotation.IntRange(from = 1) int r3) {
            r2 = this;
            r2.<init>()
            if (r3 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "maxStars must be a positive integer"
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
            r2.maxStars = r3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.starRating = r3
            return
    }

    public StarRating(@androidx.annotation.IntRange(from = 1) int r5, @androidx.annotation.FloatRange(from = 0.0d) float r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "maxStars must be a positive integer"
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2, r3)
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L1a
            float r2 = (float) r5
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 > 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.String r1 = "starRating is out of range [0, maxStars]"
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
            r4.maxStars = r5
            r4.starRating = r6
            return
    }

    private static com.google.android.exoplayer2.StarRating fromBundle(android.os.Bundle r3) {
            java.lang.String r0 = com.google.android.exoplayer2.Rating.FIELD_RATING_TYPE
            r1 = -1
            int r0 = r3.getInt(r0, r1)
            r1 = 2
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.lang.String r0 = com.google.android.exoplayer2.StarRating.FIELD_MAX_STARS
            r1 = 5
            int r0 = r3.getInt(r0, r1)
            java.lang.String r1 = com.google.android.exoplayer2.StarRating.FIELD_STAR_RATING
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3.getFloat(r1, r2)
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 != 0) goto L29
            com.google.android.exoplayer2.StarRating r3 = new com.google.android.exoplayer2.StarRating
            r3.<init>(r0)
            goto L2f
        L29:
            com.google.android.exoplayer2.StarRating r1 = new com.google.android.exoplayer2.StarRating
            r1.<init>(r0, r3)
            r3 = r1
        L2f:
            return r3
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.exoplayer2.StarRating
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.exoplayer2.StarRating r4 = (com.google.android.exoplayer2.StarRating) r4
            int r0 = r3.maxStars
            int r2 = r4.maxStars
            if (r0 != r2) goto L17
            float r0 = r3.starRating
            float r4 = r4.starRating
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L17
            r1 = 1
        L17:
            return r1
    }

    @androidx.annotation.IntRange(from = 1)
    public int getMaxStars() {
            r1 = this;
            int r0 = r1.maxStars
            return r0
    }

    public float getStarRating() {
            r1 = this;
            float r0 = r1.starRating
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.maxStars
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r3.starRating
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
            r2 = this;
            float r0 = r2.starRating
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
            r2 = 2
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.StarRating.FIELD_MAX_STARS
            int r2 = r3.maxStars
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.StarRating.FIELD_STAR_RATING
            float r2 = r3.starRating
            r0.putFloat(r1, r2)
            return r0
    }
}
