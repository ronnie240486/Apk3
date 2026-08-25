package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbt {
    @androidx.annotation.Nullable
    public static com.google.android.play.core.assetpacks.AssetLocation zza(java.lang.String r21, java.lang.String r22) throws java.io.IOException {
            r1 = r21
            r0 = r22
            r2 = 1
            r3 = 0
            if (r1 == 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            java.lang.String r5 = "Attempted to get file location from a null apk path."
            com.google.android.play.core.internal.zzci.zzb(r4, r5)
            if (r0 == 0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r1
            java.lang.String r6 = "Attempted to get file location in apk %s with a null file path."
            java.lang.String r5 = java.lang.String.format(r6, r5)
            com.google.android.play.core.internal.zzci.zzb(r4, r5)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.lang.String r5 = "r"
            r4.<init>(r1, r5)
            r5 = 22
            byte[] r6 = new byte[r5]
            long r7 = r4.length()
            r9 = -22
            long r7 = r7 + r9
            r4.seek(r7)
            r4.readFully(r6)
            int r7 = com.google.android.play.core.assetpacks.zzbr.zzb(r6, r3)
            r8 = 1347093766(0x504b0506, float:1.3624416E10)
            if (r7 != r8) goto L48
            com.google.android.play.core.assetpacks.zzbs r6 = zzb(r6)
            goto L49
        L48:
            r6 = 0
        L49:
            r7 = 5
            r13 = 2
            r14 = 6
            if (r6 == 0) goto L4f
            goto Lb3
        L4f:
            long r15 = r4.length()
            long r15 = r15 + r9
            r9 = -65536(0xffffffffffff0000, double:NaN)
            long r9 = r9 + r15
            r17 = 0
            int r6 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r6 >= 0) goto L60
            r9 = r17
        L60:
            r11 = 1024(0x400, double:5.06E-321)
            long r2 = r4.length()
            long r2 = java.lang.Math.min(r11, r2)
            int r3 = (int) r2
            byte[] r2 = new byte[r3]
            byte[] r5 = new byte[r5]
        L6f:
            long r11 = (long) r3
            long r15 = r15 - r11
            r11 = 3
            long r11 = r11 + r15
            long r11 = java.lang.Math.max(r11, r9)
            r4.seek(r11)
            r4.readFully(r2)
            int r15 = r3 + (-4)
        L80:
            if (r15 < 0) goto L18a
            r6 = r2[r15]
            if (r6 == r7) goto L98
            if (r6 == r14) goto L96
            r7 = 75
            if (r6 == r7) goto L94
            r7 = 80
            if (r6 == r7) goto L92
            r6 = -1
            goto L99
        L92:
            r6 = 0
            goto L99
        L94:
            r6 = 1
            goto L99
        L96:
            r6 = 3
            goto L99
        L98:
            r6 = 2
        L99:
            if (r6 < 0) goto L182
            if (r15 < r6) goto L182
            int r7 = r15 - r6
            int r7 = com.google.android.play.core.assetpacks.zzbr.zzb(r2, r7)
            if (r7 != r8) goto L182
            long r2 = (long) r15
            long r11 = r11 + r2
            long r2 = (long) r6
            long r11 = r11 - r2
            r4.seek(r11)
            r4.readFully(r5)
            com.google.android.play.core.assetpacks.zzbs r6 = zzb(r5)
        Lb3:
            long r2 = r6.zza
            java.lang.String r5 = "UTF-8"
            byte[] r5 = r0.getBytes(r5)
            r7 = 46
            byte[] r7 = new byte[r7]
            int r8 = r22.length()
            byte[] r8 = new byte[r8]
            r9 = 0
        Lc6:
            int r10 = r6.zzb
            if (r9 >= r10) goto L14d
            r4.seek(r2)
            r4.readFully(r7)
            r10 = 0
            int r12 = com.google.android.play.core.assetpacks.zzbr.zzb(r7, r10)
            r10 = 1347092738(0x504b0102, float:1.3623364E10)
            if (r12 != r10) goto L11c
            r19 = 28
            long r11 = r2 + r19
            r4.seek(r11)
            r10 = 28
            int r10 = com.google.android.play.core.assetpacks.zzbr.zza(r7, r10)
            int r11 = r22.length()
            if (r10 != r11) goto L107
            r11 = 46
            long r11 = r11 + r2
            r4.seek(r11)
            r4.read(r8)
            boolean r11 = java.util.Arrays.equals(r8, r5)
            if (r11 == 0) goto L107
            r0 = 42
            long r2 = com.google.android.play.core.assetpacks.zzbr.zzc(r7, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L14e
        L107:
            int r10 = r10 + 46
            r11 = 30
            int r11 = com.google.android.play.core.assetpacks.zzbr.zza(r7, r11)
            int r10 = r10 + r11
            r11 = 32
            int r11 = com.google.android.play.core.assetpacks.zzbr.zza(r7, r11)
            int r10 = r10 + r11
            long r10 = (long) r10
            long r2 = r2 + r10
            int r9 = r9 + 1
            goto Lc6
        L11c:
            java.util.zip.ZipException r2 = new java.util.zip.ZipException
            java.lang.Object[] r3 = new java.lang.Object[r14]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3[r13] = r0
            int r0 = r6.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 3
            r3[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1 = 4
            r3[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r7 = 5
            r3[r7] = r0
            java.lang.String r0 = "Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d."
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r2.<init>(r0)
            throw r2
        L14d:
            r0 = 0
        L14e:
            if (r0 != 0) goto L153
            r16 = 0
            return r16
        L153:
            long r2 = r0.longValue()
            r0 = 8
            byte[] r0 = new byte[r0]
            r5 = 22
            long r5 = r5 + r2
            r4.seek(r5)
            r4.readFully(r0)
            r4 = 0
            long r4 = com.google.android.play.core.assetpacks.zzbr.zzc(r0, r4)
            r6 = 4
            int r6 = com.google.android.play.core.assetpacks.zzbr.zza(r0, r6)
            int r0 = com.google.android.play.core.assetpacks.zzbr.zza(r0, r14)
            com.google.android.play.core.assetpacks.zzbl r7 = new com.google.android.play.core.assetpacks.zzbl
            r8 = 30
            long r2 = r2 + r8
            long r8 = (long) r6
            long r2 = r2 + r8
            long r8 = (long) r0
            long r2 = r2 + r8
            r0 = r7
            r1 = r21
            r0.<init>(r1, r2, r4)
            return r7
        L182:
            r6 = 3
            r7 = 5
            r16 = 0
            int r15 = r15 + (-4)
            goto L80
        L18a:
            r6 = 3
            r16 = 0
            int r15 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r15 == 0) goto L194
            r15 = r11
            goto L6f
        L194:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "End Of Central Directory signature not found in APK %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    private static com.google.android.play.core.assetpacks.zzbs zzb(byte[] r3) {
            r0 = 10
            int r0 = com.google.android.play.core.assetpacks.zzbr.zza(r3, r0)
            r1 = 12
            com.google.android.play.core.assetpacks.zzbr.zzc(r3, r1)
            r1 = 16
            long r1 = com.google.android.play.core.assetpacks.zzbr.zzc(r3, r1)
            com.google.android.play.core.assetpacks.zzbs r3 = new com.google.android.play.core.assetpacks.zzbs
            r3.<init>(r1, r0)
            return r3
    }
}
