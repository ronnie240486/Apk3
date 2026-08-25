package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"RestrictedApi"})
public final class zzd implements com.google.android.play.core.review.ReviewManager {
    private final com.google.android.play.core.review.zzi zza;
    private final android.os.Handler zzb;

    public zzd(com.google.android.play.core.review.zzi r3) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zzb = r0
            r2.zza = r3
            return
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @androidx.annotation.NonNull
    public final com.google.android.play.core.tasks.Task<java.lang.Void> launchReviewFlow(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.NonNull com.google.android.play.core.review.ReviewInfo r5) {
            r3 = this;
            boolean r0 = r5.zzb()
            if (r0 == 0) goto Lc
            r4 = 0
            com.google.android.play.core.tasks.Task r4 = com.google.android.play.core.tasks.Tasks.zzb(r4)
            return r4
        Lc:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.google.android.play.core.common.PlayCoreDialogWrapperActivity> r1 = com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class
            r0.<init>(r4, r1)
            android.app.PendingIntent r5 = r5.zza()
            java.lang.String r1 = "confirmation_intent"
            r0.putExtra(r1, r5)
            android.view.Window r5 = r4.getWindow()
            android.view.View r5 = r5.getDecorView()
            int r5 = r5.getWindowSystemUiVisibility()
            java.lang.String r1 = "window_flags"
            r0.putExtra(r1, r5)
            com.google.android.play.core.tasks.zzi r5 = new com.google.android.play.core.tasks.zzi
            r5.<init>()
            com.google.android.play.core.review.zzc r1 = new com.google.android.play.core.review.zzc
            android.os.Handler r2 = r3.zzb
            r1.<init>(r2, r5)
            java.lang.String r2 = "result_receiver"
            r0.putExtra(r2, r1)
            r4.startActivity(r0)
            com.google.android.play.core.tasks.Task r4 = r5.zza()
            return r4
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @androidx.annotation.NonNull
    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.review.ReviewInfo> requestReviewFlow() {
            r1 = this;
            com.google.android.play.core.review.zzi r0 = r1.zza
            com.google.android.play.core.tasks.Task r0 = r0.zzb()
            return r0
    }
}
