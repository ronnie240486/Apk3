package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"RestrictedApi"})
public abstract class ReviewInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.play.core.review.ReviewInfo> CREATOR = null;

    static {
            com.google.android.play.core.review.zzb r0 = new com.google.android.play.core.review.zzb
            r0.<init>()
            com.google.android.play.core.review.ReviewInfo.CREATOR = r0
            return
    }

    public ReviewInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.review.ReviewInfo zzc(android.app.PendingIntent r1, boolean r2) {
            com.google.android.play.core.review.zza r2 = new com.google.android.play.core.review.zza
            r0 = 0
            r2.<init>(r1, r0)
            return r2
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.app.PendingIntent r3 = r1.zza()
            r0 = 0
            r2.writeParcelable(r3, r0)
            boolean r3 = r1.zzb()
            r2.writeInt(r3)
            return
    }

    public abstract android.app.PendingIntent zza();

    public abstract boolean zzb();
}
