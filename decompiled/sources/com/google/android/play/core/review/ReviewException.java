package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class ReviewException extends com.google.android.play.core.tasks.zzj {
    private final int zza;

    public ReviewException(int r5) {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = com.google.android.play.core.review.model.zza.zza(r5)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "Review Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r4.<init>(r0)
            r4.zza = r5
            return
    }

    @Override // com.google.android.play.core.tasks.zzj
    public int getErrorCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }
}
