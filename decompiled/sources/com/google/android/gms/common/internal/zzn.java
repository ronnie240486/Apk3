package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzn {
    private static final android.net.Uri zza = null;

    @androidx.annotation.Nullable
    private final java.lang.String zzb;

    @androidx.annotation.Nullable
    private final java.lang.String zzc;

    @androidx.annotation.Nullable
    private final android.content.ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    static {
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri r0 = r0.build()
            com.google.android.gms.common.internal.zzn.zza = r0
            return
    }

    public zzn(android.content.ComponentName r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            r1.zzc = r0
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r1.zzd = r2
            r1.zze = r3
            r2 = 0
            r1.zzf = r2
            return
    }

    public zzn(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            java.lang.String r4 = "com.google.android.gms"
            r0 = 0
            r1.<init>(r2, r4, r3, r0)
            return
    }

    public zzn(java.lang.String r1, java.lang.String r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r0.zzb = r1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzc = r2
            r1 = 0
            r0.zzd = r1
            r0.zze = r3
            r0.zzf = r4
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.internal.zzn
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.internal.zzn r5 = (com.google.android.gms.common.internal.zzn) r5
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L37
            java.lang.String r1 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L37
            android.content.ComponentName r1 = r4.zzd
            android.content.ComponentName r3 = r5.zzd
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L37
            int r1 = r4.zze
            int r3 = r5.zze
            if (r1 != r3) goto L37
            boolean r1 = r4.zzf
            boolean r5 = r5.zzf
            if (r1 != r5) goto L37
            return r0
        L37:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zzb
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzc
            r2 = 1
            r0[r2] = r1
            android.content.ComponentName r1 = r3.zzd
            r2 = 2
            r0[r2] = r1
            int r1 = r3.zze
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            boolean r1 = r3.zzf
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            if (r0 != 0) goto Lf
            android.content.ComponentName r0 = r1.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.ComponentName r0 = r1.zzd
            java.lang.String r0 = r0.flattenToString()
        Lf:
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.ComponentName zzb() {
            r1 = this;
            android.content.ComponentName r0 = r1.zzd
            return r0
    }

    public final android.content.Intent zzc(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.zzb
            if (r1 == 0) goto L70
            boolean r1 = r5.zzf
            r2 = 0
            if (r1 == 0) goto L5f
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.zzb
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L26
            android.net.Uri r3 = com.google.android.gms.common.internal.zzn.zza     // Catch: java.lang.IllegalArgumentException -> L26
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r6 = r6.call(r3, r4, r2, r1)     // Catch: java.lang.IllegalArgumentException -> L26
            goto L35
        L26:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
            r6 = r2
        L35:
            if (r6 != 0) goto L38
            goto L42
        L38:
            java.lang.String r1 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r6.getParcelable(r1)
            android.content.Intent r6 = (android.content.Intent) r6
            r2 = r6
        L42:
            if (r2 != 0) goto L5f
            java.lang.String r6 = r5.zzb
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            int r3 = r6.length()
            if (r3 == 0) goto L57
            java.lang.String r6 = r1.concat(r6)
            goto L5c
        L57:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
        L5c:
            android.util.Log.w(r0, r6)
        L5f:
            if (r2 == 0) goto L62
            goto L7b
        L62:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = r5.zzb
            r6.<init>(r0)
            java.lang.String r0 = r5.zzc
            android.content.Intent r6 = r6.setPackage(r0)
            return r6
        L70:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.zzd
            android.content.Intent r2 = r6.setComponent(r0)
        L7b:
            return r2
    }

    @androidx.annotation.Nullable
    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }
}
