package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
public final class zag extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.signin.internal.zag> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGrantedScopes", id = 1)
    private final java.util.List<java.lang.String> zaa;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getToken", id = 2)
    private final java.lang.String zab;

    static {
            com.google.android.gms.signin.internal.zah r0 = new com.google.android.gms.signin.internal.zah
            r0.<init>()
            com.google.android.gms.signin.internal.zag.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zag(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.util.List<java.lang.String> r1, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            java.lang.String r0 = r1.zab
            if (r0 == 0) goto L7
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            return r0
        L7:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_CANCELED
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List<java.lang.String> r0 = r3.zaa
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r0, r2)
            java.lang.String r0 = r3.zab
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
