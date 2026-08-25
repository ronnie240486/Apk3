package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public final class HeartRating extends com.google.android.exoplayer2.Rating {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.HeartRating> CREATOR = null;
    private static final java.lang.String FIELD_IS_HEART = null;
    private static final java.lang.String FIELD_RATED = null;
    private static final int TYPE = 0;
    private final boolean isHeart;
    private final boolean rated;

    public static /* synthetic */ com.google.android.exoplayer2.HeartRating $r8$lambda$vPIJW6ssYQujpVr4cEbnIbolVQo(android.os.Bundle r0) {
            com.google.android.exoplayer2.HeartRating r0 = fromBundle(r0)
            return r0
    }

    static {
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.HeartRating.FIELD_RATED = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.HeartRating.FIELD_IS_HEART = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$6
            com.google.android.exoplayer2.HeartRating.CREATOR = r0
            return
    }

    public HeartRating() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.rated = r0
            r1.isHeart = r0
            return
    }

    public HeartRating(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.rated = r0
            r1.isHeart = r2
            return
    }

    private static com.google.android.exoplayer2.HeartRating fromBundle(android.os.Bundle r3) {
            java.lang.String r0 = com.google.android.exoplayer2.Rating.FIELD_RATING_TYPE
            r1 = -1
            int r0 = r3.getInt(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.lang.String r0 = com.google.android.exoplayer2.HeartRating.FIELD_RATED
            boolean r0 = r3.getBoolean(r0, r1)
            if (r0 == 0) goto L24
            com.google.android.exoplayer2.HeartRating r0 = new com.google.android.exoplayer2.HeartRating
            java.lang.String r2 = com.google.android.exoplayer2.HeartRating.FIELD_IS_HEART
            boolean r3 = r3.getBoolean(r2, r1)
            r0.<init>(r3)
            goto L29
        L24:
            com.google.android.exoplayer2.HeartRating r0 = new com.google.android.exoplayer2.HeartRating
            r0.<init>()
        L29:
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.exoplayer2.HeartRating
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.exoplayer2.HeartRating r4 = (com.google.android.exoplayer2.HeartRating) r4
            boolean r0 = r3.isHeart
            boolean r2 = r4.isHeart
            if (r0 != r2) goto L15
            boolean r0 = r3.rated
            boolean r4 = r4.rated
            if (r0 != r4) goto L15
            r1 = 1
        L15:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r3.rated
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            boolean r1 = r3.isHeart
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    public boolean isHeart() {
            r1 = this;
            boolean r0 = r1.isHeart
            return r0
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
            r1 = this;
            boolean r0 = r1.rated
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.Rating.FIELD_RATING_TYPE
            r2 = 0
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.HeartRating.FIELD_RATED
            boolean r2 = r3.rated
            r0.putBoolean(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.HeartRating.FIELD_IS_HEART
            boolean r2 = r3.isHeart
            r0.putBoolean(r1, r2)
            return r0
    }
}
