package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzb implements android.os.Parcelable.Creator {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r3) {
            r2 = this;
            java.lang.Class<com.google.android.play.core.review.ReviewInfo> r0 = com.google.android.play.core.review.ReviewInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            int r3 = r3.readInt()
            if (r3 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            com.google.android.play.core.review.zza r1 = new com.google.android.play.core.review.zza
            r1.<init>(r0, r3)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.play.core.review.ReviewInfo[] r1 = new com.google.android.play.core.review.ReviewInfo[r1]
            return r1
    }
}
