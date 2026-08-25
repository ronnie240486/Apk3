package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"RestrictedApi"})
public final class zzi {
    private static final com.google.android.play.core.internal.zzag zzb = null;

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    public com.google.android.play.core.internal.zzas zza;
    private final java.lang.String zzc;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "ReviewService"
            r0.<init>(r1)
            com.google.android.play.core.review.zzi.zzb = r0
            return
    }

    public zzi(android.content.Context r10) {
            r9 = this;
            r9.<init>()
            java.lang.String r0 = r10.getPackageName()
            r9.zzc = r0
            boolean r0 = com.google.android.play.core.internal.zzch.zzb(r10)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE"
            r0.<init>(r1)
            java.lang.String r1 = "com.android.vending"
            android.content.Intent r6 = r0.setPackage(r1)
            com.google.android.play.core.internal.zzas r0 = new com.google.android.play.core.internal.zzas
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.review.zzi.zzb
            com.google.android.play.core.review.zze r7 = com.google.android.play.core.review.zze.zza
            r8 = 0
            java.lang.String r5 = "com.google.android.finsky.inappreviewservice.InAppReviewService"
            r2 = r0
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.zza = r0
        L2c:
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.internal.zzag zza() {
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.review.zzi.zzb
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String zzc(com.google.android.play.core.review.zzi r0) {
            java.lang.String r0 = r0.zzc
            return r0
    }

    public final com.google.android.play.core.tasks.Task zzb() {
            r4 = this;
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.review.zzi.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r4.zzc
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "requestInAppReview (%s)"
            r0.zzd(r2, r1)
            com.google.android.play.core.internal.zzas r1 = r4.zza
            if (r1 != 0) goto L25
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Play Store app is either not installed or not the official version"
            r0.zzb(r2, r1)
            com.google.android.play.core.review.ReviewException r0 = new com.google.android.play.core.review.ReviewException
            r1 = -1
            r0.<init>(r1)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zza(r0)
            return r0
        L25:
            com.google.android.play.core.tasks.zzi r0 = new com.google.android.play.core.tasks.zzi
            r0.<init>()
            com.google.android.play.core.internal.zzas r1 = r4.zza
            com.google.android.play.core.review.zzf r2 = new com.google.android.play.core.review.zzf
            r2.<init>(r4, r0, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r0 = r0.zza()
            return r0
    }
}
