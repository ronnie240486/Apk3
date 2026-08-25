package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Rating implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Rating> CREATOR = null;
    public static final java.lang.String FIELD_RATING_TYPE = null;

    public static /* synthetic */ com.google.android.exoplayer2.Rating $r8$lambda$S87uZHR0r4DpwOSwqteylD8fJ5w(android.os.Bundle r0) {
            com.google.android.exoplayer2.Rating r0 = fromBundle(r0)
            return r0
    }

    static {
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Rating.FIELD_RATING_TYPE = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$17
            com.google.android.exoplayer2.Rating.CREATOR = r0
            return
    }

    public Rating() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.android.exoplayer2.Rating fromBundle(android.os.Bundle r2) {
            java.lang.String r0 = com.google.android.exoplayer2.Rating.FIELD_RATING_TYPE
            r1 = -1
            int r0 = r2.getInt(r0, r1)
            if (r0 == 0) goto L39
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L27
            r1 = 3
            if (r0 != r1) goto L1b
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.ThumbRating> r0 = com.google.android.exoplayer2.ThumbRating.CREATOR
            com.google.android.exoplayer2.Bundleable r2 = r0.fromBundle(r2)
            com.google.android.exoplayer2.Rating r2 = (com.google.android.exoplayer2.Rating) r2
            return r2
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown RatingType: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
            r2.<init>(r0)
            throw r2
        L27:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.StarRating> r0 = com.google.android.exoplayer2.StarRating.CREATOR
            com.google.android.exoplayer2.Bundleable r2 = r0.fromBundle(r2)
            com.google.android.exoplayer2.Rating r2 = (com.google.android.exoplayer2.Rating) r2
            return r2
        L30:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.PercentageRating> r0 = com.google.android.exoplayer2.PercentageRating.CREATOR
            com.google.android.exoplayer2.Bundleable r2 = r0.fromBundle(r2)
            com.google.android.exoplayer2.Rating r2 = (com.google.android.exoplayer2.Rating) r2
            return r2
        L39:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.HeartRating> r0 = com.google.android.exoplayer2.HeartRating.CREATOR
            com.google.android.exoplayer2.Bundleable r2 = r0.fromBundle(r2)
            com.google.android.exoplayer2.Rating r2 = (com.google.android.exoplayer2.Rating) r2
            return r2
    }

    public abstract boolean isRated();
}
