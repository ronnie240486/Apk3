package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbRating extends com.google.android.exoplayer2.Rating {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.ThumbRating> CREATOR = null;
    private static final java.lang.String FIELD_IS_THUMBS_UP = null;
    private static final java.lang.String FIELD_RATED = null;
    private static final int TYPE = 3;
    private final boolean isThumbsUp;
    private final boolean rated;

    public static /* synthetic */ com.google.android.exoplayer2.ThumbRating $r8$lambda$AKC_JpI1ZPlm6EFzvYW84DJrS_k(android.os.Bundle r0) {
            com.google.android.exoplayer2.ThumbRating r0 = fromBundle(r0)
            return r0
    }

    static {
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.ThumbRating.FIELD_RATED = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.ThumbRating.FIELD_IS_THUMBS_UP = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$21
            com.google.android.exoplayer2.ThumbRating.CREATOR = r0
            return
    }

    public ThumbRating() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.rated = r0
            r1.isThumbsUp = r0
            return
    }

    public ThumbRating(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.rated = r0
            r1.isThumbsUp = r2
            return
    }

    private static com.google.android.exoplayer2.ThumbRating fromBundle(android.os.Bundle r3) {
            java.lang.String r0 = com.google.android.exoplayer2.Rating.FIELD_RATING_TYPE
            r1 = -1
            int r0 = r3.getInt(r0, r1)
            r1 = 0
            r2 = 3
            if (r0 != r2) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.lang.String r0 = com.google.android.exoplayer2.ThumbRating.FIELD_RATED
            boolean r0 = r3.getBoolean(r0, r1)
            if (r0 == 0) goto L25
            com.google.android.exoplayer2.ThumbRating r0 = new com.google.android.exoplayer2.ThumbRating
            java.lang.String r2 = com.google.android.exoplayer2.ThumbRating.FIELD_IS_THUMBS_UP
            boolean r3 = r3.getBoolean(r2, r1)
            r0.<init>(r3)
            goto L2a
        L25:
            com.google.android.exoplayer2.ThumbRating r0 = new com.google.android.exoplayer2.ThumbRating
            r0.<init>()
        L2a:
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.exoplayer2.ThumbRating
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.exoplayer2.ThumbRating r4 = (com.google.android.exoplayer2.ThumbRating) r4
            boolean r0 = r3.isThumbsUp
            boolean r2 = r4.isThumbsUp
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
            boolean r1 = r3.isThumbsUp
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
            r1 = this;
            boolean r0 = r1.rated
            return r0
    }

    public boolean isThumbsUp() {
            r1 = this;
            boolean r0 = r1.isThumbsUp
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.Rating.FIELD_RATING_TYPE
            r2 = 3
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.ThumbRating.FIELD_RATED
            boolean r2 = r3.rated
            r0.putBoolean(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.ThumbRating.FIELD_IS_THUMBS_UP
            boolean r2 = r3.isThumbsUp
            r0.putBoolean(r1, r2)
            return r0
    }
}
