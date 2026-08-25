package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzay {
    private final com.google.android.play.core.splitcompat.zze zza;
    private final com.google.android.play.core.internal.zzau zzb;
    private final android.content.Context zzc;
    private final com.google.android.play.core.internal.zzax zzd;

    @androidx.annotation.Nullable
    private android.content.pm.PackageInfo zze;

    public zzay(android.content.Context r3, com.google.android.play.core.splitcompat.zze r4, com.google.android.play.core.internal.zzau r5) {
            r2 = this;
            com.google.android.play.core.internal.zzax r0 = new com.google.android.play.core.internal.zzax
            com.google.android.play.core.splitcompat.zza r1 = new com.google.android.play.core.splitcompat.zza
            r1.<init>(r4)
            r0.<init>(r1)
            r2.<init>()
            r2.zza = r4
            r2.zzb = r5
            r2.zzc = r3
            r2.zzd = r0
            return
    }

    @androidx.annotation.Nullable
    private final android.content.pm.PackageInfo zzd() {
            r3 = this;
            android.content.pm.PackageInfo r0 = r3.zze
            if (r0 != 0) goto L1b
            android.content.Context r0 = r3.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            android.content.Context r1 = r3.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            r2 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            r3.zze = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            android.content.pm.PackageInfo r0 = r3.zze
            return r0
    }

    @androidx.annotation.Nullable
    private static java.security.cert.X509Certificate zze(android.content.pm.Signature r2) {
            java.lang.String r0 = "X509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch: java.security.cert.CertificateException -> L16
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L16
            byte[] r2 = r2.toByteArray()     // Catch: java.security.cert.CertificateException -> L16
            r1.<init>(r2)     // Catch: java.security.cert.CertificateException -> L16
            java.security.cert.Certificate r2 = r0.generateCertificate(r1)     // Catch: java.security.cert.CertificateException -> L16
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch: java.security.cert.CertificateException -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.String r0 = "SplitCompat"
            java.lang.String r1 = "Cannot decode certificate."
            android.util.Log.e(r0, r1, r2)
            r2 = 0
            return r2
    }

    public final boolean zza(java.io.File[] r8) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r7 = this;
            android.content.pm.PackageInfo r0 = r7.zzd()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            long r0 = r0.getLongVersionCode()
            goto L12
        Lf:
            int r0 = r0.versionCode
            long r0 = (long) r0
        L12:
            java.lang.Class<android.content.res.AssetManager> r2 = android.content.res.AssetManager.class
            java.lang.Object r2 = com.google.android.play.core.internal.zzbw.zzc(r2)
            android.content.res.AssetManager r2 = (android.content.res.AssetManager) r2
            int r3 = r8.length
        L1b:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L32
            com.google.android.play.core.internal.zzax r4 = r7.zzd
            r5 = r8[r3]
            r4.zzb(r2, r5)
            com.google.android.play.core.internal.zzax r4 = r7.zzd
            long r4 = r4.zza()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L1b
            r8 = 0
            return r8
        L32:
            r8 = 1
            return r8
    }

    public final boolean zzb(java.util.List r3) throws java.io.IOException {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.String r1 = "split_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            com.google.android.play.core.splitcompat.zze r1 = r2.zza
            java.io.File r0 = r1.zzg(r0)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L4
            r3 = 0
            return r3
        L25:
            r3 = 1
            return r3
    }

    public final boolean zzc(java.io.File[] r13) {
            r12 = this;
            java.lang.String r0 = " is not signed."
            java.lang.String r1 = "Downloaded split "
            android.content.pm.PackageInfo r2 = r12.zzd()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L2a
            android.content.pm.Signature[] r5 = r2.signatures
            if (r5 != 0) goto L11
            goto L2a
        L11:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.pm.Signature[] r2 = r2.signatures
            int r5 = r2.length
            r6 = 0
        L1a:
            if (r6 >= r5) goto L2a
            r7 = r2[r6]
            java.security.cert.X509Certificate r7 = zze(r7)
            if (r7 == 0) goto L27
            r3.add(r7)
        L27:
            int r6 = r6 + 1
            goto L1a
        L2a:
            java.lang.String r2 = "SplitCompat"
            if (r3 == 0) goto Ld2
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L36
            goto Ld2
        L36:
            int r5 = r13.length
        L37:
            int r5 = r5 + (-1)
            if (r5 < 0) goto Ld0
            r6 = r13[r5]
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Exception -> Lc9
            java.security.cert.X509Certificate[][] r7 = com.google.android.play.core.internal.zzi.zza(r6)     // Catch: java.lang.Exception -> La3
            if (r7 == 0) goto L83
            int r8 = r7.length     // Catch: java.lang.Exception -> Lc9
            if (r8 == 0) goto L83
            r8 = r7[r4]     // Catch: java.lang.Exception -> Lc9
            int r8 = r8.length     // Catch: java.lang.Exception -> Lc9
            if (r8 != 0) goto L50
            goto L83
        L50:
            boolean r6 = r3.isEmpty()     // Catch: java.lang.Exception -> Lc9
            if (r6 == 0) goto L5c
            java.lang.String r13 = "No certificates found for app."
            android.util.Log.e(r2, r13)     // Catch: java.lang.Exception -> Lc9
            goto Lc3
        L5c:
            java.util.Iterator r6 = r3.iterator()     // Catch: java.lang.Exception -> Lc9
        L60:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Exception -> Lc9
            if (r8 == 0) goto L37
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Exception -> Lc9
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch: java.lang.Exception -> Lc9
            int r9 = r7.length     // Catch: java.lang.Exception -> Lc9
            r10 = 0
        L6e:
            if (r10 >= r9) goto L7d
            r11 = r7[r10]     // Catch: java.lang.Exception -> Lc9
            r11 = r11[r4]     // Catch: java.lang.Exception -> Lc9
            boolean r11 = r11.equals(r8)     // Catch: java.lang.Exception -> Lc9
            if (r11 != 0) goto L60
            int r10 = r10 + 1
            goto L6e
        L7d:
            java.lang.String r13 = "There's an app certificate that doesn't sign the split."
            android.util.Log.i(r2, r13)     // Catch: java.lang.Exception -> Lc9
            goto Lc3
        L83:
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> Lc9
            int r13 = r13.length()     // Catch: java.lang.Exception -> Lc9
            int r13 = r13 + 32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc9
            r3.<init>(r13)     // Catch: java.lang.Exception -> Lc9
            r3.append(r1)     // Catch: java.lang.Exception -> Lc9
            r3.append(r6)     // Catch: java.lang.Exception -> Lc9
            r3.append(r0)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r13 = r3.toString()     // Catch: java.lang.Exception -> Lc9
            android.util.Log.e(r2, r13)     // Catch: java.lang.Exception -> Lc9
            goto Lc3
        La3:
            r13 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> Lc9
            int r3 = r3.length()     // Catch: java.lang.Exception -> Lc9
            int r3 = r3 + 32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc9
            r5.<init>(r3)     // Catch: java.lang.Exception -> Lc9
            r5.append(r1)     // Catch: java.lang.Exception -> Lc9
            r5.append(r6)     // Catch: java.lang.Exception -> Lc9
            r5.append(r0)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> Lc9
            android.util.Log.e(r2, r0, r13)     // Catch: java.lang.Exception -> Lc9
        Lc3:
            java.lang.String r13 = "Split verification failure."
            android.util.Log.e(r2, r13)     // Catch: java.lang.Exception -> Lc9
            return r4
        Lc9:
            r13 = move-exception
            java.lang.String r0 = "Split verification error."
            android.util.Log.e(r2, r0, r13)
            return r4
        Ld0:
            r13 = 1
            return r13
        Ld2:
            java.lang.String r13 = "No app certificates found."
            android.util.Log.e(r2, r13)
            return r4
    }
}
