package com.google.android.play.core.review.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class FakeReviewManager implements com.google.android.play.core.review.ReviewManager {
    private final android.content.Context zza;
    private com.google.android.play.core.review.ReviewInfo zzb;

    public FakeReviewManager(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @androidx.annotation.NonNull
    public com.google.android.play.core.tasks.Task<java.lang.Void> launchReviewFlow(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull com.google.android.play.core.review.ReviewInfo r2) {
            r0 = this;
            com.google.android.play.core.review.ReviewInfo r1 = r0.zzb
            if (r2 == r1) goto Lf
            com.google.android.play.core.review.ReviewException r1 = new com.google.android.play.core.review.ReviewException
            r2 = -2
            r1.<init>(r2)
            com.google.android.play.core.tasks.Task r1 = com.google.android.play.core.tasks.Tasks.zza(r1)
            return r1
        Lf:
            r1 = 0
            com.google.android.play.core.tasks.Task r1 = com.google.android.play.core.tasks.Tasks.zzb(r1)
            return r1
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @androidx.annotation.NonNull
    public com.google.android.play.core.tasks.Task<com.google.android.play.core.review.ReviewInfo> requestReviewFlow() {
            r5 = this;
            android.content.Context r0 = r5.zza
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r4 = 23
            if (r2 < r4) goto L11
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L12
        L11:
            r2 = 0
        L12:
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r3, r1, r2)
            com.google.android.play.core.review.ReviewInfo r0 = com.google.android.play.core.review.ReviewInfo.zzc(r0, r3)
            r5.zzb = r0
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zzb(r0)
            return r0
    }
}
