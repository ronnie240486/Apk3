package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class ReviewManagerFactory {
    private ReviewManagerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.play.core.review.ReviewManager create(@androidx.annotation.NonNull android.content.Context r2) {
            android.content.Context r2 = com.google.android.play.core.internal.zzce.zza(r2)
            com.google.android.play.core.review.zzd r0 = new com.google.android.play.core.review.zzd
            com.google.android.play.core.review.zzi r1 = new com.google.android.play.core.review.zzi
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }
}
