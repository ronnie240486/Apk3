package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.RatingCompat> CREATOR = null;
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final java.lang.String TAG = "Rating";
    private java.lang.Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;


    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static float getPercentRating(android.media.Rating r0) {
                float r0 = r0.getPercentRating()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getRatingStyle(android.media.Rating r0) {
                int r0 = r0.getRatingStyle()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static float getStarRating(android.media.Rating r0) {
                float r0 = r0.getStarRating()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasHeart(android.media.Rating r0) {
                boolean r0 = r0.hasHeart()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isRated(android.media.Rating r0) {
                boolean r0 = r0.isRated()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isThumbUp(android.media.Rating r0) {
                boolean r0 = r0.isThumbUp()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.media.Rating newHeartRating(boolean r0) {
                android.media.Rating r0 = android.media.Rating.newHeartRating(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.media.Rating newPercentageRating(float r0) {
                android.media.Rating r0 = android.media.Rating.newPercentageRating(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.media.Rating newStarRating(int r0, float r1) {
                android.media.Rating r0 = android.media.Rating.newStarRating(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.media.Rating newThumbRating(boolean r0) {
                android.media.Rating r0 = android.media.Rating.newThumbRating(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.media.Rating newUnratedRating(int r0) {
                android.media.Rating r0 = android.media.Rating.newUnratedRating(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface StarStyle {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Style {
    }

    static {
            android.support.v4.media.RatingCompat$1 r0 = new android.support.v4.media.RatingCompat$1
            r0.<init>()
            android.support.v4.media.RatingCompat.CREATOR = r0
            return
    }

    public RatingCompat(int r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.mRatingStyle = r1
            r0.mRatingValue = r2
            return
    }

    public static android.support.v4.media.RatingCompat fromRating(java.lang.Object r4) {
            r0 = 0
            if (r4 == 0) goto L3e
            r1 = r4
            android.media.Rating r1 = (android.media.Rating) r1
            int r2 = android.support.v4.media.RatingCompat.Api19Impl.getRatingStyle(r1)
            boolean r3 = android.support.v4.media.RatingCompat.Api19Impl.isRated(r1)
            if (r3 == 0) goto L38
            switch(r2) {
                case 1: goto L2f;
                case 2: goto L26;
                case 3: goto L1d;
                case 4: goto L1d;
                case 5: goto L1d;
                case 6: goto L14;
                default: goto L13;
            }
        L13:
            return r0
        L14:
            float r0 = android.support.v4.media.RatingCompat.Api19Impl.getPercentRating(r1)
            android.support.v4.media.RatingCompat r0 = newPercentageRating(r0)
            goto L3c
        L1d:
            float r0 = android.support.v4.media.RatingCompat.Api19Impl.getStarRating(r1)
            android.support.v4.media.RatingCompat r0 = newStarRating(r2, r0)
            goto L3c
        L26:
            boolean r0 = android.support.v4.media.RatingCompat.Api19Impl.isThumbUp(r1)
            android.support.v4.media.RatingCompat r0 = newThumbRating(r0)
            goto L3c
        L2f:
            boolean r0 = android.support.v4.media.RatingCompat.Api19Impl.hasHeart(r1)
            android.support.v4.media.RatingCompat r0 = newHeartRating(r0)
            goto L3c
        L38:
            android.support.v4.media.RatingCompat r0 = newUnratedRating(r2)
        L3c:
            r0.mRatingObj = r4
        L3e:
            return r0
    }

    public static android.support.v4.media.RatingCompat newHeartRating(boolean r2) {
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            if (r2 == 0) goto L7
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L8
        L7:
            r2 = 0
        L8:
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    public static android.support.v4.media.RatingCompat newPercentageRating(float r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L13
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lc
            goto L13
        Lc:
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            r1 = 6
            r0.<init>(r1, r2)
            return r0
        L13:
            java.lang.String r2 = "Rating"
            java.lang.String r0 = "Invalid percentage-based rating value"
            android.util.Log.e(r2, r0)
            r2 = 0
            return r2
    }

    public static android.support.v4.media.RatingCompat newStarRating(int r4, float r5) {
            r0 = 3
            r1 = 0
            java.lang.String r2 = "Rating"
            if (r4 == r0) goto L2c
            r0 = 4
            if (r4 == r0) goto L29
            r0 = 5
            if (r4 == r0) goto L26
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Invalid rating style ("
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = ") for a star rating"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.e(r2, r4)
            return r1
        L26:
            r0 = 1084227584(0x40a00000, float:5.0)
            goto L2e
        L29:
            r0 = 1082130432(0x40800000, float:4.0)
            goto L2e
        L2c:
            r0 = 1077936128(0x40400000, float:3.0)
        L2e:
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L3e
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L38
            goto L3e
        L38:
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            r0.<init>(r4, r5)
            return r0
        L3e:
            java.lang.String r4 = "Trying to set out of range star-based rating"
            android.util.Log.e(r2, r4)
            return r1
    }

    public static android.support.v4.media.RatingCompat newThumbRating(boolean r2) {
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            if (r2 == 0) goto L7
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L8
        L7:
            r2 = 0
        L8:
            r1 = 2
            r0.<init>(r1, r2)
            return r0
    }

    public static android.support.v4.media.RatingCompat newUnratedRating(int r2) {
            switch(r2) {
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            int r0 = r1.mRatingStyle
            return r0
    }

    public float getPercentRating() {
            r2 = this;
            int r0 = r2.mRatingStyle
            r1 = 6
            if (r0 != r1) goto Lf
            boolean r0 = r2.isRated()
            if (r0 != 0) goto Lc
            goto Lf
        Lc:
            float r0 = r2.mRatingValue
            return r0
        Lf:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    public java.lang.Object getRating() {
            r2 = this;
            java.lang.Object r0 = r2.mRatingObj
            if (r0 != 0) goto L45
            boolean r0 = r2.isRated()
            if (r0 == 0) goto L3d
            int r0 = r2.mRatingStyle
            switch(r0) {
                case 1: goto L32;
                case 2: goto L27;
                case 3: goto L1c;
                case 4: goto L1c;
                case 5: goto L1c;
                case 6: goto L11;
                default: goto Lf;
            }
        Lf:
            r0 = 0
            return r0
        L11:
            float r0 = r2.getPercentRating()
            android.media.Rating r0 = android.support.v4.media.RatingCompat.Api19Impl.newPercentageRating(r0)
            r2.mRatingObj = r0
            goto L45
        L1c:
            float r1 = r2.getStarRating()
            android.media.Rating r0 = android.support.v4.media.RatingCompat.Api19Impl.newStarRating(r0, r1)
            r2.mRatingObj = r0
            goto L45
        L27:
            boolean r0 = r2.isThumbUp()
            android.media.Rating r0 = android.support.v4.media.RatingCompat.Api19Impl.newThumbRating(r0)
            r2.mRatingObj = r0
            goto L45
        L32:
            boolean r0 = r2.hasHeart()
            android.media.Rating r0 = android.support.v4.media.RatingCompat.Api19Impl.newHeartRating(r0)
            r2.mRatingObj = r0
            goto L45
        L3d:
            int r0 = r2.mRatingStyle
            android.media.Rating r0 = android.support.v4.media.RatingCompat.Api19Impl.newUnratedRating(r0)
            r2.mRatingObj = r0
        L45:
            java.lang.Object r0 = r2.mRatingObj
            return r0
    }

    public int getRatingStyle() {
            r1 = this;
            int r0 = r1.mRatingStyle
            return r0
    }

    public float getStarRating() {
            r2 = this;
            int r0 = r2.mRatingStyle
            r1 = 3
            if (r0 == r1) goto Lc
            r1 = 4
            if (r0 == r1) goto Lc
            r1 = 5
            if (r0 == r1) goto Lc
            goto L15
        Lc:
            boolean r0 = r2.isRated()
            if (r0 == 0) goto L15
            float r0 = r2.mRatingValue
            return r0
        L15:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    public boolean hasHeart() {
            r4 = this;
            int r0 = r4.mRatingStyle
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L7
            return r1
        L7:
            float r0 = r4.mRatingValue
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L10
            r1 = 1
        L10:
            return r1
    }

    public boolean isRated() {
            r2 = this;
            float r0 = r2.mRatingValue
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isThumbUp() {
            r3 = this;
            int r0 = r3.mRatingStyle
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L7
            return r1
        L7:
            float r0 = r3.mRatingValue
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L10
            r1 = 1
        L10:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Rating:style="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.mRatingStyle
            r0.append(r1)
            java.lang.String r1 = " rating="
            r0.append(r1)
            float r1 = r3.mRatingValue
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1b
            java.lang.String r1 = "unrated"
            goto L1f
        L1b:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.mRatingStyle
            r1.writeInt(r2)
            float r2 = r0.mRatingValue
            r1.writeFloat(r2)
            return
    }
}
