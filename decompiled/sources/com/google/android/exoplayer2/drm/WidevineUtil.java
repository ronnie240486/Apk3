package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes3.dex */
public final class WidevineUtil {
    public static final java.lang.String PROPERTY_LICENSE_DURATION_REMAINING = "LicenseDurationRemaining";
    public static final java.lang.String PROPERTY_PLAYBACK_DURATION_REMAINING = "PlaybackDurationRemaining";

    private WidevineUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static long getDurationRemainingSec(java.util.Map<java.lang.String, java.lang.String> r0, java.lang.String r1) {
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> Lf
            if (r0 == 0) goto Lf
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> Lf
            return r0
        Lf:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.util.Pair<java.lang.Long, java.lang.Long> getLicenseDurationRemainingSec(com.google.android.exoplayer2.drm.DrmSession r4) {
            java.util.Map r4 = r4.queryKeyStatus()
            if (r4 != 0) goto L8
            r4 = 0
            return r4
        L8:
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r1 = "LicenseDurationRemaining"
            long r1 = getDurationRemainingSec(r4, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "PlaybackDurationRemaining"
            long r2 = getDurationRemainingSec(r4, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0.<init>(r1, r4)
            return r0
    }
}
