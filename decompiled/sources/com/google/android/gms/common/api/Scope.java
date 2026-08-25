package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ScopeCreator")
public final class Scope extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getScopeUri", id = 2)
    private final java.lang.String zzb;

    static {
            com.google.android.gms.common.api.zza r0 = new com.google.android.gms.common.api.zza
            r0.<init>()
            com.google.android.gms.common.api.Scope.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public Scope(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "scopeUri must not be null or empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3, r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    public Scope(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "scopeUri must not be null or empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r0 = 1
            r1.zza = r0
            r1.zzb = r2
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.api.Scope
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.zzb
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            java.lang.String r2 = r2.zzb
            boolean r2 = r0.equals(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getScopeUri() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.lang.String r0 = r3.getScopeUri()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
