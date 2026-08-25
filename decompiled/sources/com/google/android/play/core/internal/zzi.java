package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzi {
    public static java.security.cert.X509Certificate[][] zza(java.lang.String r17) throws com.google.android.play.core.internal.zzf, java.lang.SecurityException, java.io.IOException {
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r0 = "r"
            r2 = r17
            r1.<init>(r2, r0)
            android.util.Pair r0 = com.google.android.play.core.internal.zzj.zzc(r1)     // Catch: java.lang.Throwable -> L300
            if (r0 == 0) goto L2de
            java.lang.Object r2 = r0.first     // Catch: java.lang.Throwable -> L300
            r11 = r2
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11     // Catch: java.lang.Throwable -> L300
            java.lang.Object r0 = r0.second     // Catch: java.lang.Throwable -> L300
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L300
            long r9 = r0.longValue()     // Catch: java.lang.Throwable -> L300
            r2 = -20
            long r2 = r2 + r9
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L26
            goto L32
        L26:
            r1.seek(r2)     // Catch: java.lang.Throwable -> L300
            int r0 = r1.readInt()     // Catch: java.lang.Throwable -> L300
            r2 = 1347094023(0x504b0607, float:1.3624679E10)
            if (r0 == r2) goto L2d6
        L32:
            long r7 = com.google.android.play.core.internal.zzj.zza(r11)     // Catch: java.lang.Throwable -> L300
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L2b5
            long r2 = com.google.android.play.core.internal.zzj.zzb(r11)     // Catch: java.lang.Throwable -> L300
            long r2 = r2 + r7
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L2ad
            r2 = 32
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L294
            r0 = 24
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> L300
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L300
            r0.order(r2)     // Catch: java.lang.Throwable -> L300
            int r3 = r0.capacity()     // Catch: java.lang.Throwable -> L300
            long r12 = (long) r3     // Catch: java.lang.Throwable -> L300
            long r12 = r7 - r12
            r1.seek(r12)     // Catch: java.lang.Throwable -> L300
            byte[] r3 = r0.array()     // Catch: java.lang.Throwable -> L300
            int r6 = r0.arrayOffset()     // Catch: java.lang.Throwable -> L300
            int r12 = r0.capacity()     // Catch: java.lang.Throwable -> L300
            r1.readFully(r3, r6, r12)     // Catch: java.lang.Throwable -> L300
            r3 = 8
            long r12 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L300
            r14 = 2334950737559900225(0x20676953204b5041, double:1.3968830566012645E-152)
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L28c
            r6 = 16
            long r12 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L300
            r14 = 3617552046287187010(0x3234206b636f6c42, double:7.465385175170059E-67)
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L28c
            r6 = 0
            long r12 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L300
            int r0 = r0.capacity()     // Catch: java.lang.Throwable -> L300
            long r14 = (long) r0     // Catch: java.lang.Throwable -> L300
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 < 0) goto L273
            r14 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 > 0) goto L273
            r14 = 8
            long r14 = r14 + r12
            int r0 = (int) r14     // Catch: java.lang.Throwable -> L300
            long r14 = (long) r0     // Catch: java.lang.Throwable -> L300
            long r14 = r7 - r14
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 < 0) goto L25a
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> L300
            r0.order(r2)     // Catch: java.lang.Throwable -> L300
            r1.seek(r14)     // Catch: java.lang.Throwable -> L300
            byte[] r4 = r0.array()     // Catch: java.lang.Throwable -> L300
            int r5 = r0.arrayOffset()     // Catch: java.lang.Throwable -> L300
            int r3 = r0.capacity()     // Catch: java.lang.Throwable -> L300
            r1.readFully(r4, r5, r3)     // Catch: java.lang.Throwable -> L300
            long r3 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L300
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 != 0) goto L239
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L300
            android.util.Pair r0 = android.util.Pair.create(r0, r3)     // Catch: java.lang.Throwable -> L300
            java.lang.Object r3 = r0.first     // Catch: java.lang.Throwable -> L300
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch: java.lang.Throwable -> L300
            java.lang.Object r0 = r0.second     // Catch: java.lang.Throwable -> L300
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L300
            long r12 = r0.longValue()     // Catch: java.lang.Throwable -> L300
            java.nio.ByteOrder r0 = r3.order()     // Catch: java.lang.Throwable -> L300
            if (r0 != r2) goto L231
            int r0 = r3.capacity()     // Catch: java.lang.Throwable -> L300
            int r0 = r0 + (-24)
            r2 = 8
            if (r0 < r2) goto L20e
            int r2 = r3.capacity()     // Catch: java.lang.Throwable -> L300
            int r4 = r3.capacity()     // Catch: java.lang.Throwable -> L300
            if (r0 > r4) goto L1ed
            int r2 = r3.limit()     // Catch: java.lang.Throwable -> L300
            int r4 = r3.position()     // Catch: java.lang.Throwable -> L300
            r3.position(r6)     // Catch: java.lang.Throwable -> L1e2
            r3.limit(r0)     // Catch: java.lang.Throwable -> L1e2
            r0 = 8
            r3.position(r0)     // Catch: java.lang.Throwable -> L1e2
            java.nio.ByteBuffer r0 = r3.slice()     // Catch: java.lang.Throwable -> L1e2
            java.nio.ByteOrder r5 = r3.order()     // Catch: java.lang.Throwable -> L1e2
            r0.order(r5)     // Catch: java.lang.Throwable -> L1e2
            r3.position(r6)     // Catch: java.lang.Throwable -> L300
            r3.limit(r2)     // Catch: java.lang.Throwable -> L300
            r3.position(r4)     // Catch: java.lang.Throwable -> L300
        L121:
            boolean r2 = r0.hasRemaining()     // Catch: java.lang.Throwable -> L300
            if (r2 == 0) goto L1da
            int r6 = r6 + 1
            int r2 = r0.remaining()     // Catch: java.lang.Throwable -> L300
            r3 = 8
            if (r2 < r3) goto L1c1
            long r2 = r0.getLong()     // Catch: java.lang.Throwable -> L300
            r4 = 4
            java.lang.String r14 = " size out of range: "
            java.lang.String r15 = "APK Signing Block entry #"
            int r16 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r16 < 0) goto L1a4
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r16 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r16 > 0) goto L1a4
            int r3 = (int) r2
            int r2 = r0.position()     // Catch: java.lang.Throwable -> L300
            int r2 = r2 + r3
            int r4 = r0.remaining()     // Catch: java.lang.Throwable -> L300
            if (r3 > r4) goto L17b
            int r4 = r0.getInt()     // Catch: java.lang.Throwable -> L300
            r5 = 1896449818(0x7109871a, float:6.810044E29)
            if (r4 != r5) goto L177
            int r3 = r3 + (-4)
            java.nio.ByteBuffer r4 = zze(r0, r3)     // Catch: java.lang.Throwable -> L300
            com.google.android.play.core.internal.zze r0 = new com.google.android.play.core.internal.zze     // Catch: java.lang.Throwable -> L300
            r3 = r0
            r5 = r12
            r3.<init>(r4, r5, r7, r9, r11)     // Catch: java.lang.Throwable -> L300
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> L300
            java.security.cert.X509Certificate[][] r0 = zzl(r2, r0)     // Catch: java.lang.Throwable -> L300
            r1.close()     // Catch: java.lang.Throwable -> L300
            r1.close()     // Catch: java.io.IOException -> L176
        L176:
            return r0
        L177:
            r0.position(r2)     // Catch: java.lang.Throwable -> L300
            goto L121
        L17b:
            com.google.android.play.core.internal.zzf r2 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r5 = 91
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L300
            r4.append(r15)     // Catch: java.lang.Throwable -> L300
            r4.append(r6)     // Catch: java.lang.Throwable -> L300
            r4.append(r14)     // Catch: java.lang.Throwable -> L300
            r4.append(r3)     // Catch: java.lang.Throwable -> L300
            java.lang.String r3 = ", available: "
            r4.append(r3)     // Catch: java.lang.Throwable -> L300
            r4.append(r0)     // Catch: java.lang.Throwable -> L300
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L300
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L300
            throw r2     // Catch: java.lang.Throwable -> L300
        L1a4:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r5 = 76
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L300
            r4.append(r15)     // Catch: java.lang.Throwable -> L300
            r4.append(r6)     // Catch: java.lang.Throwable -> L300
            r4.append(r14)     // Catch: java.lang.Throwable -> L300
            r4.append(r2)     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L300
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L1c1:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r3 = 70
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L300
            java.lang.String r3 = "Insufficient data to read size of APK Signing Block entry #"
            r2.append(r3)     // Catch: java.lang.Throwable -> L300
            r2.append(r6)     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L300
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L1da:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = "No APK Signature Scheme v2 block in APK Signing Block"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L1e2:
            r0 = move-exception
            r3.position(r6)     // Catch: java.lang.Throwable -> L300
            r3.limit(r2)     // Catch: java.lang.Throwable -> L300
            r3.position(r4)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L1ed:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r5 = 41
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L300
            java.lang.String r5 = "end > capacity: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L300
            r4.append(r0)     // Catch: java.lang.Throwable -> L300
            java.lang.String r0 = " > "
            r4.append(r0)     // Catch: java.lang.Throwable -> L300
            r4.append(r2)     // Catch: java.lang.Throwable -> L300
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L300
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L300
            throw r3     // Catch: java.lang.Throwable -> L300
        L20e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r4 = 38
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L300
            java.lang.String r4 = "end < start: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L300
            r3.append(r0)     // Catch: java.lang.Throwable -> L300
            java.lang.String r0 = " < "
            r3.append(r0)     // Catch: java.lang.Throwable -> L300
            r0 = 8
            r3.append(r0)     // Catch: java.lang.Throwable -> L300
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L300
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L300
            throw r2     // Catch: java.lang.Throwable -> L300
        L231:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = "ByteBuffer byte order must be little endian"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L239:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r5 = 103(0x67, float:1.44E-43)
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L300
            java.lang.String r5 = "APK Signing Block sizes in header and footer do not match: "
            r2.append(r5)     // Catch: java.lang.Throwable -> L300
            r2.append(r3)     // Catch: java.lang.Throwable -> L300
            java.lang.String r3 = " vs "
            r2.append(r3)     // Catch: java.lang.Throwable -> L300
            r2.append(r12)     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L300
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L25a:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r3 = 59
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L300
            java.lang.String r3 = "APK Signing Block offset out of range: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L300
            r2.append(r14)     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L300
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L273:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r3 = 57
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L300
            java.lang.String r3 = "APK Signing Block size out of range: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L300
            r2.append(r12)     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L300
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L28c:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = "No APK Signing Block before ZIP Central Directory"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L294:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r3 = 87
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L300
            java.lang.String r3 = "APK too small for APK Signing Block. ZIP Central Directory offset: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L300
            r2.append(r7)     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L300
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L2ad:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = "ZIP Central Directory is not immediately followed by End of Central Directory"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L2b5:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r3 = 122(0x7a, float:1.71E-43)
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L300
            java.lang.String r3 = "ZIP Central Directory offset out of range: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L300
            r2.append(r7)     // Catch: java.lang.Throwable -> L300
            java.lang.String r3 = ". ZIP End of Central Directory offset: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L300
            r2.append(r9)     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L300
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L2d6:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = "ZIP64 APK not supported"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L2de:
            com.google.android.play.core.internal.zzf r0 = new com.google.android.play.core.internal.zzf     // Catch: java.lang.Throwable -> L300
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L300
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L300
            r5 = 102(0x66, float:1.43E-43)
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L300
            java.lang.String r5 = "Not an APK file: ZIP End of Central Directory record not found in file with "
            r4.append(r5)     // Catch: java.lang.Throwable -> L300
            r4.append(r2)     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = " bytes"
            r4.append(r2)     // Catch: java.lang.Throwable -> L300
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L300
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L300
            throw r0     // Catch: java.lang.Throwable -> L300
        L300:
            r0 = move-exception
            r1.close()     // Catch: java.io.IOException -> L304
        L304:
            throw r0
    }

    private static int zzb(int r3) {
            r0 = 1
            if (r3 == r0) goto L17
            r0 = 2
            if (r3 != r0) goto L9
            r3 = 64
            return r3
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 44
            java.lang.String r2 = "Unknown content digest algorthm: "
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r0.<init>(r3)
            throw r0
        L17:
            r3 = 32
            return r3
    }

    private static int zzc(int r3) {
            r0 = 513(0x201, float:7.19E-43)
            if (r3 == r0) goto L32
            r0 = 514(0x202, float:7.2E-43)
            if (r3 == r0) goto L30
            r0 = 769(0x301, float:1.078E-42)
            if (r3 == r0) goto L32
            switch(r3) {
                case 257: goto L32;
                case 258: goto L30;
                case 259: goto L32;
                case 260: goto L30;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r1 = (long) r3
            java.lang.String r3 = java.lang.Long.toHexString(r1)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Unknown signature algorithm: 0x"
            int r2 = r3.length()
            if (r2 == 0) goto L27
            java.lang.String r3 = r1.concat(r3)
            goto L2c
        L27:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L2c:
            r0.<init>(r3)
            throw r0
        L30:
            r3 = 2
            return r3
        L32:
            r3 = 1
            return r3
    }

    private static java.lang.String zzd(int r3) {
            r0 = 1
            if (r3 == r0) goto L17
            r0 = 2
            if (r3 != r0) goto L9
            java.lang.String r3 = "SHA-512"
            return r3
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 44
            java.lang.String r2 = "Unknown content digest algorthm: "
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r0.<init>(r3)
            throw r0
        L17:
            java.lang.String r3 = "SHA-256"
            return r3
    }

    private static java.nio.ByteBuffer zze(java.nio.ByteBuffer r3, int r4) throws java.nio.BufferUnderflowException {
            int r0 = r3.limit()
            int r1 = r3.position()
            int r4 = r4 + r1
            if (r4 < r1) goto L27
            if (r4 > r0) goto L27
            r3.limit(r4)
            java.nio.ByteBuffer r1 = r3.slice()     // Catch: java.lang.Throwable -> L22
            java.nio.ByteOrder r2 = r3.order()     // Catch: java.lang.Throwable -> L22
            r1.order(r2)     // Catch: java.lang.Throwable -> L22
            r3.position(r4)     // Catch: java.lang.Throwable -> L22
            r3.limit(r0)
            return r1
        L22:
            r4 = move-exception
            r3.limit(r0)
            throw r4
        L27:
            java.nio.BufferUnderflowException r3 = new java.nio.BufferUnderflowException
            r3.<init>()
            throw r3
    }

    private static java.nio.ByteBuffer zzf(java.nio.ByteBuffer r4) throws java.io.IOException {
            int r0 = r4.remaining()
            r1 = 4
            if (r0 < r1) goto L45
            int r0 = r4.getInt()
            if (r0 < 0) goto L3d
            int r1 = r4.remaining()
            if (r0 > r1) goto L18
            java.nio.ByteBuffer r4 = zze(r4, r0)
            return r4
        L18:
            java.io.IOException r1 = new java.io.IOException
            int r4 = r4.remaining()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 101(0x65, float:1.42E-43)
            r2.<init>(r3)
            java.lang.String r3 = "Length-prefixed field longer than remaining buffer. Field length: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", remaining: "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L3d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Negative length"
            r4.<init>(r0)
            throw r4
        L45:
            java.io.IOException r0 = new java.io.IOException
            int r4 = r4.remaining()
            r1 = 93
            java.lang.String r2 = "Remaining buffer too short to contain length of length-prefixed field. Remaining: "
            java.lang.String r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r4)
            r0.<init>(r4)
            throw r0
    }

    private static void zzg(int r1, byte[] r2, int r3) {
            r3 = r1 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0 = 1
            r2[r0] = r3
            int r3 = r1 >>> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0 = 2
            r2[r0] = r3
            int r3 = r1 >>> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0 = 3
            r2[r0] = r3
            int r1 = r1 >> 24
            byte r1 = (byte) r1
            r3 = 4
            r2[r3] = r1
            return
    }

    private static void zzh(java.util.Map r11, java.nio.channels.FileChannel r12, long r13, long r15, long r17, java.nio.ByteBuffer r19) throws java.lang.SecurityException {
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L93
            com.google.android.play.core.internal.zzd r0 = new com.google.android.play.core.internal.zzd
            r3 = 0
            r1 = r0
            r2 = r12
            r5 = r13
            r1.<init>(r2, r3, r5)
            com.google.android.play.core.internal.zzd r1 = new com.google.android.play.core.internal.zzd
            long r9 = r17 - r15
            r5 = r1
            r6 = r12
            r7 = r15
            r5.<init>(r6, r7, r9)
            java.nio.ByteBuffer r2 = r19.duplicate()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r3)
            r3 = r13
            com.google.android.play.core.internal.zzj.zzd(r2, r13)
            com.google.android.play.core.internal.zzb r3 = new com.google.android.play.core.internal.zzb
            r3.<init>(r2)
            int r2 = r11.size()
            int[] r4 = new int[r2]
            java.util.Set r5 = r11.keySet()
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
            r7 = 0
        L3c:
            boolean r8 = r5.hasNext()
            r9 = 1
            if (r8 == 0) goto L51
            java.lang.Object r8 = r5.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4[r7] = r8
            int r7 = r7 + r9
            goto L3c
        L51:
            r5 = 3
            com.google.android.play.core.internal.zzc[] r5 = new com.google.android.play.core.internal.zzc[r5]     // Catch: java.security.DigestException -> L8a
            r5[r6] = r0     // Catch: java.security.DigestException -> L8a
            r5[r9] = r1     // Catch: java.security.DigestException -> L8a
            r0 = 2
            r5[r0] = r3     // Catch: java.security.DigestException -> L8a
            byte[][] r0 = zzk(r4, r5)     // Catch: java.security.DigestException -> L8a
        L5f:
            if (r6 >= r2) goto L89
            r1 = r4[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5 = r11
            java.lang.Object r3 = r11.get(r3)
            byte[] r3 = (byte[]) r3
            r7 = r0[r6]
            boolean r3 = java.security.MessageDigest.isEqual(r3, r7)
            if (r3 == 0) goto L79
            int r6 = r6 + 1
            goto L5f
        L79:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = zzd(r1)
            java.lang.String r2 = " digest of contents did not verify"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L89:
            return
        L8a:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "Failed to compute digest(s) of contents"
            r1.<init>(r2, r0)
            throw r1
        L93:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No digests provided"
            r0.<init>(r1)
            throw r0
    }

    private static byte[] zzi(java.nio.ByteBuffer r4) throws java.io.IOException {
            int r0 = r4.getInt()
            if (r0 < 0) goto L37
            int r1 = r4.remaining()
            if (r0 > r1) goto L12
            byte[] r0 = new byte[r0]
            r4.get(r0)
            return r0
        L12:
            java.io.IOException r1 = new java.io.IOException
            int r4 = r4.remaining()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 90
            r2.<init>(r3)
            java.lang.String r3 = "Underflow while reading length-prefixed value. Length: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", available: "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L37:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Negative length"
            r4.<init>(r0)
            throw r4
    }

    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r21, java.util.Map r22, java.security.cert.CertificateFactory r23) throws java.lang.SecurityException, java.io.IOException {
            java.nio.ByteBuffer r0 = zzf(r21)
            java.nio.ByteBuffer r1 = zzf(r21)
            byte[] r2 = zzi(r21)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = -1
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = r5
        L16:
            boolean r9 = r1.hasRemaining()
            r10 = 8
            r11 = 769(0x301, float:1.078E-42)
            r12 = 514(0x202, float:7.2E-43)
            r13 = 513(0x201, float:7.19E-43)
            r14 = 1
            if (r9 == 0) goto L74
            int r7 = r7 + 1
            java.nio.ByteBuffer r9 = zzf(r1)     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            int r15 = r9.remaining()     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            if (r15 < r10) goto L5b
            int r10 = r9.getInt()     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            r3.add(r15)     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            if (r10 == r13) goto L46
            if (r10 == r12) goto L46
            if (r10 == r11) goto L46
            switch(r10) {
                case 257: goto L46;
                case 258: goto L46;
                case 259: goto L46;
                case 260: goto L46;
                default: goto L45;
            }     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
        L45:
            goto L16
        L46:
            if (r6 == r4) goto L55
            int r11 = zzc(r10)     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            int r12 = zzc(r6)     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            if (r11 == r14) goto L16
            if (r12 == r14) goto L55
            goto L16
        L55:
            byte[] r8 = zzi(r9)     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            r6 = r10
            goto L16
        L5b:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            java.lang.String r1 = "Signature record too short"
            r0.<init>(r1)     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
            throw r0     // Catch: java.nio.BufferUnderflowException -> L63 java.io.IOException -> L65
        L63:
            r0 = move-exception
            goto L66
        L65:
            r0 = move-exception
        L66:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r2 = 45
            java.lang.String r3 = "Failed to parse signature record #"
            java.lang.String r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r7)
            r1.<init>(r2, r0)
            throw r1
        L74:
            if (r6 != r4) goto L88
            if (r7 != 0) goto L80
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No signatures found"
            r0.<init>(r1)
            throw r0
        L80:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No supported signatures found"
            r0.<init>(r1)
            throw r0
        L88:
            java.lang.String r1 = "Unknown signature algorithm: 0x"
            if (r6 == r13) goto Lb9
            if (r6 == r12) goto Lb9
            if (r6 == r11) goto Lb6
            switch(r6) {
                case 257: goto La9;
                case 258: goto La9;
                case 259: goto La9;
                case 260: goto La9;
                default: goto L93;
            }
        L93:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r6
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto Lac
            java.lang.String r1 = r1.concat(r2)
            goto Lb2
        La9:
            java.lang.String r4 = "RSA"
            goto Lbb
        Lac:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        Lb2:
            r0.<init>(r1)
            throw r0
        Lb6:
            java.lang.String r4 = "DSA"
            goto Lbb
        Lb9:
            java.lang.String r4 = "EC"
        Lbb:
            if (r6 == r13) goto L12e
            if (r6 == r12) goto L127
            if (r6 == r11) goto L120
            switch(r6) {
                case 257: goto Lff;
                case 258: goto Le8;
                case 259: goto Le1;
                case 260: goto Lda;
                default: goto Lc4;
            }
        Lc4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r6
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L116
            java.lang.String r1 = r1.concat(r2)
            goto L11c
        Lda:
            java.lang.String r1 = "SHA512withRSA"
            android.util.Pair r1 = android.util.Pair.create(r1, r5)
            goto L134
        Le1:
            java.lang.String r1 = "SHA256withRSA"
            android.util.Pair r1 = android.util.Pair.create(r1, r5)
            goto L134
        Le8:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r18 = java.security.spec.MGF1ParameterSpec.SHA512
            r19 = 64
            r20 = 1
            java.lang.String r16 = "SHA-512"
            java.lang.String r17 = "MGF1"
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.String r7 = "SHA512withRSA/PSS"
            android.util.Pair r1 = android.util.Pair.create(r7, r1)
            goto L134
        Lff:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r18 = java.security.spec.MGF1ParameterSpec.SHA256
            r19 = 32
            r20 = 1
            java.lang.String r16 = "SHA-256"
            java.lang.String r17 = "MGF1"
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.String r7 = "SHA256withRSA/PSS"
            android.util.Pair r1 = android.util.Pair.create(r7, r1)
            goto L134
        L116:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L11c:
            r0.<init>(r1)
            throw r0
        L120:
            java.lang.String r1 = "SHA256withDSA"
            android.util.Pair r1 = android.util.Pair.create(r1, r5)
            goto L134
        L127:
            java.lang.String r1 = "SHA512withECDSA"
            android.util.Pair r1 = android.util.Pair.create(r1, r5)
            goto L134
        L12e:
            java.lang.String r1 = "SHA256withECDSA"
            android.util.Pair r1 = android.util.Pair.create(r1, r5)
        L134:
            java.lang.Object r7 = r1.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r1.second
            java.security.spec.AlgorithmParameterSpec r1 = (java.security.spec.AlgorithmParameterSpec) r1
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch: java.security.SignatureException -> L260 java.security.InvalidAlgorithmParameterException -> L262 java.security.InvalidKeyException -> L264 java.security.spec.InvalidKeySpecException -> L266 java.security.NoSuchAlgorithmException -> L268
            java.security.spec.X509EncodedKeySpec r9 = new java.security.spec.X509EncodedKeySpec     // Catch: java.security.SignatureException -> L260 java.security.InvalidAlgorithmParameterException -> L262 java.security.InvalidKeyException -> L264 java.security.spec.InvalidKeySpecException -> L266 java.security.NoSuchAlgorithmException -> L268
            r9.<init>(r2)     // Catch: java.security.SignatureException -> L260 java.security.InvalidAlgorithmParameterException -> L262 java.security.InvalidKeyException -> L264 java.security.spec.InvalidKeySpecException -> L266 java.security.NoSuchAlgorithmException -> L268
            java.security.PublicKey r4 = r4.generatePublic(r9)     // Catch: java.security.SignatureException -> L260 java.security.InvalidAlgorithmParameterException -> L262 java.security.InvalidKeyException -> L264 java.security.spec.InvalidKeySpecException -> L266 java.security.NoSuchAlgorithmException -> L268
            java.security.Signature r9 = java.security.Signature.getInstance(r7)     // Catch: java.security.SignatureException -> L260 java.security.InvalidAlgorithmParameterException -> L262 java.security.InvalidKeyException -> L264 java.security.spec.InvalidKeySpecException -> L266 java.security.NoSuchAlgorithmException -> L268
            r9.initVerify(r4)     // Catch: java.security.SignatureException -> L260 java.security.InvalidAlgorithmParameterException -> L262 java.security.InvalidKeyException -> L264 java.security.spec.InvalidKeySpecException -> L266 java.security.NoSuchAlgorithmException -> L268
            if (r1 == 0) goto L155
            r9.setParameter(r1)     // Catch: java.security.SignatureException -> L260 java.security.InvalidAlgorithmParameterException -> L262 java.security.InvalidKeyException -> L264 java.security.spec.InvalidKeySpecException -> L266 java.security.NoSuchAlgorithmException -> L268
        L155:
            r9.update(r0)     // Catch: java.security.SignatureException -> L260 java.security.InvalidAlgorithmParameterException -> L262 java.security.InvalidKeyException -> L264 java.security.spec.InvalidKeySpecException -> L266 java.security.NoSuchAlgorithmException -> L268
            boolean r1 = r9.verify(r8)     // Catch: java.security.SignatureException -> L260 java.security.InvalidAlgorithmParameterException -> L262 java.security.InvalidKeyException -> L264 java.security.spec.InvalidKeySpecException -> L266 java.security.NoSuchAlgorithmException -> L268
            if (r1 == 0) goto L250
            r0.clear()
            java.nio.ByteBuffer r1 = zzf(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = 0
        L16b:
            boolean r8 = r1.hasRemaining()
            if (r8 == 0) goto L1a7
            int r7 = r7 + r14
            java.nio.ByteBuffer r8 = zzf(r1)     // Catch: java.nio.BufferUnderflowException -> L196 java.io.IOException -> L198
            int r9 = r8.remaining()     // Catch: java.nio.BufferUnderflowException -> L196 java.io.IOException -> L198
            if (r9 < r10) goto L18e
            int r9 = r8.getInt()     // Catch: java.nio.BufferUnderflowException -> L196 java.io.IOException -> L198
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch: java.nio.BufferUnderflowException -> L196 java.io.IOException -> L198
            r4.add(r11)     // Catch: java.nio.BufferUnderflowException -> L196 java.io.IOException -> L198
            if (r9 != r6) goto L16b
            byte[] r5 = zzi(r8)     // Catch: java.nio.BufferUnderflowException -> L196 java.io.IOException -> L198
            goto L16b
        L18e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.nio.BufferUnderflowException -> L196 java.io.IOException -> L198
            java.lang.String r1 = "Record too short"
            r0.<init>(r1)     // Catch: java.nio.BufferUnderflowException -> L196 java.io.IOException -> L198
            throw r0     // Catch: java.nio.BufferUnderflowException -> L196 java.io.IOException -> L198
        L196:
            r0 = move-exception
            goto L199
        L198:
            r0 = move-exception
        L199:
            java.io.IOException r1 = new java.io.IOException
            r2 = 42
            java.lang.String r3 = "Failed to parse digest record #"
            java.lang.String r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r7)
            r1.<init>(r2, r0)
            throw r1
        L1a7:
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L248
            int r1 = zzc(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r22
            java.lang.Object r3 = r4.put(r3, r5)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L1d6
            boolean r3 = java.security.MessageDigest.isEqual(r3, r5)
            if (r3 == 0) goto L1c6
            goto L1d6
        L1c6:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = zzd(r1)
            java.lang.String r2 = " contents digest does not match the digest specified by a preceding signer"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L1d6:
            java.nio.ByteBuffer r0 = zzf(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L1e0:
            boolean r4 = r0.hasRemaining()
            if (r4 == 0) goto L210
            int r3 = r3 + r14
            byte[] r4 = zzi(r0)
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L201
            r5.<init>(r4)     // Catch: java.security.cert.CertificateException -> L201
            r6 = r23
            java.security.cert.Certificate r5 = r6.generateCertificate(r5)     // Catch: java.security.cert.CertificateException -> L201
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch: java.security.cert.CertificateException -> L201
            com.google.android.play.core.internal.zzg r7 = new com.google.android.play.core.internal.zzg
            r7.<init>(r5, r4)
            r1.add(r7)
            goto L1e0
        L201:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r2 = 41
            java.lang.String r4 = "Failed to decode certificate #"
            java.lang.String r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r4, r3)
            r1.<init>(r2, r0)
            throw r1
        L210:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L240
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.security.PublicKey r0 = r0.getPublicKey()
            byte[] r0 = r0.getEncoded()
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L238
            int r0 = r1.size()
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0
            return r0
        L238:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Public key mismatch between certificate and signature record"
            r0.<init>(r1)
            throw r0
        L240:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No certificates listed"
            r0.<init>(r1)
            throw r0
        L248:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Signature algorithms don't match between digests and signatures records"
            r0.<init>(r1)
            throw r0
        L250:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r2 = " signature did not verify"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L260:
            r0 = move-exception
            goto L269
        L262:
            r0 = move-exception
            goto L269
        L264:
            r0 = move-exception
            goto L269
        L266:
            r0 = move-exception
            goto L269
        L268:
            r0 = move-exception
        L269:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 27
            r3.<init>(r2)
            java.lang.String r2 = "Failed to verify "
            java.lang.String r4 = " signature"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2, r7, r4)
            r1.<init>(r2, r0)
            throw r1
    }

    private static byte[][] zzk(int[] r25, com.google.android.play.core.internal.zzc[] r26) throws java.security.DigestException {
            r0 = r25
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = 0
        L7:
            r7 = 1048576(0x100000, double:5.180654E-318)
            r9 = 3
            if (r4 >= r9) goto L1c
            r9 = r26[r4]
            long r9 = r9.zza()
            r11 = 1048575(0xfffff, double:5.18065E-318)
            long r9 = r9 + r11
            long r9 = r9 / r7
            long r5 = r5 + r9
            int r4 = r4 + 1
            goto L7
        L1c:
            r10 = 2097151(0x1fffff, double:1.0361303E-317)
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 >= 0) goto L16f
            int r4 = (int) r5
            int r5 = r0.length
            byte[][] r5 = new byte[r5][]
            r6 = 0
        L28:
            int r10 = r0.length
            r11 = 5
            r12 = 1
            if (r6 >= r10) goto L44
            r10 = r0[r6]
            int r10 = zzb(r10)
            int r10 = r10 * r4
            int r10 = r10 + r11
            byte[] r10 = new byte[r10]
            r11 = 90
            r10[r3] = r11
            zzg(r4, r10, r12)
            r5[r6] = r10
            int r6 = r6 + 1
            goto L28
        L44:
            byte[] r4 = new byte[r11]
            r6 = -91
            r4[r3] = r6
            java.security.MessageDigest[] r6 = new java.security.MessageDigest[r10]
            r13 = 0
        L4d:
            int r14 = r0.length
            java.lang.String r15 = " digest not supported"
            if (r13 >= r14) goto L6c
            r14 = r0[r13]
            java.lang.String r14 = zzd(r14)
            java.security.MessageDigest r16 = java.security.MessageDigest.getInstance(r14)     // Catch: java.security.NoSuchAlgorithmException -> L61
            r6[r13] = r16     // Catch: java.security.NoSuchAlgorithmException -> L61
            int r13 = r13 + 1
            goto L4d
        L61:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = r14.concat(r15)
            r1.<init>(r2, r0)
            throw r1
        L6c:
            r13 = 0
            r14 = 0
        L6e:
            if (r13 >= r9) goto L146
            r9 = r26[r13]
            long r17 = r9.zza()
            r19 = r1
            r11 = r17
        L7a:
            int r21 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r21 <= 0) goto L130
            long r1 = java.lang.Math.min(r11, r7)
            int r2 = (int) r1
            r1 = 1
            zzg(r2, r4, r1)
            r1 = 0
        L88:
            if (r1 >= r10) goto L95
            r7 = r6[r1]
            r7.update(r4)
            int r1 = r1 + 1
            r7 = 1048576(0x100000, double:5.180654E-318)
            goto L88
        L95:
            r7 = r19
            r9.zzb(r6, r7, r2)     // Catch: java.io.IOException -> L10d
            r19 = r4
            r1 = 0
        L9d:
            int r4 = r0.length
            if (r1 >= r4) goto Lf2
            r4 = r0[r1]
            r20 = r9
            r9 = r5[r1]
            int r4 = zzb(r4)
            r22 = r10
            r10 = r6[r1]
            int r23 = r14 * r4
            r24 = r6
            r17 = 5
            int r6 = r23 + 5
            int r6 = r10.digest(r9, r6, r4)
            if (r6 != r4) goto Lc5
            int r1 = r1 + 1
            r9 = r20
            r10 = r22
            r6 = r24
            goto L9d
        Lc5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = r10.getAlgorithm()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 46
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected output size of "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " digest: "
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        Lf2:
            r24 = r6
            r20 = r9
            r22 = r10
            r17 = 5
            long r1 = (long) r2
            long r6 = r7 + r1
            long r11 = r11 - r1
            int r14 = r14 + 1
            r4 = r19
            r1 = 0
            r19 = r6
            r6 = r24
            r7 = 1048576(0x100000, double:5.180654E-318)
            goto L7a
        L10d:
            r0 = move-exception
            r1 = r0
            java.security.DigestException r0 = new java.security.DigestException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 59
            r2.<init>(r4)
            java.lang.String r4 = "Failed to digest chunk #"
            r2.append(r4)
            r2.append(r14)
            java.lang.String r4 = " of section #"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
        L130:
            r19 = r4
            r24 = r6
            r22 = r10
            r17 = 5
            int r3 = r3 + 1
            int r13 = r13 + 1
            r1 = 0
            r7 = 1048576(0x100000, double:5.180654E-318)
            r9 = 3
            r11 = 5
            r12 = 1
            goto L6e
        L146:
            int r1 = r0.length
            byte[][] r1 = new byte[r1][]
            r3 = 0
        L14a:
            int r2 = r0.length
            if (r3 >= r2) goto L16e
            r2 = r0[r3]
            r4 = r5[r3]
            java.lang.String r2 = zzd(r2)
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> L162
            byte[] r2 = r2.digest(r4)
            r1[r3] = r2
            int r3 = r3 + 1
            goto L14a
        L162:
            r0 = move-exception
            r1 = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = r2.concat(r15)
            r0.<init>(r2, r1)
            throw r0
        L16e:
            return r1
        L16f:
            java.security.DigestException r0 = new java.security.DigestException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 37
            r1.<init>(r2)
            java.lang.String r2 = "Too many chunks: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static java.security.cert.X509Certificate[][] zzl(java.nio.channels.FileChannel r10, com.google.android.play.core.internal.zze r11) throws java.lang.SecurityException {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.security.cert.CertificateException -> L92
            java.nio.ByteBuffer r2 = com.google.android.play.core.internal.zze.zzd(r11)     // Catch: java.io.IOException -> L89
            java.nio.ByteBuffer r2 = zzf(r2)     // Catch: java.io.IOException -> L89
            r3 = 0
        L19:
            boolean r4 = r2.hasRemaining()
            if (r4 == 0) goto L50
            int r3 = r3 + 1
            java.nio.ByteBuffer r4 = zzf(r2)     // Catch: java.lang.SecurityException -> L2d java.nio.BufferUnderflowException -> L2f java.io.IOException -> L31
            java.security.cert.X509Certificate[] r4 = zzj(r4, r0, r1)     // Catch: java.lang.SecurityException -> L2d java.nio.BufferUnderflowException -> L2f java.io.IOException -> L31
            r9.add(r4)     // Catch: java.lang.SecurityException -> L2d java.nio.BufferUnderflowException -> L2f java.io.IOException -> L31
            goto L19
        L2d:
            r10 = move-exception
            goto L32
        L2f:
            r10 = move-exception
            goto L32
        L31:
            r10 = move-exception
        L32:
            java.lang.SecurityException r11 = new java.lang.SecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 48
            r0.<init>(r1)
            java.lang.String r1 = "Failed to parse/verify signer #"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " block"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0, r10)
            throw r11
        L50:
            if (r3 <= 0) goto L81
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L79
            long r2 = com.google.android.play.core.internal.zze.zza(r11)
            long r4 = com.google.android.play.core.internal.zze.zzb(r11)
            long r6 = com.google.android.play.core.internal.zze.zzc(r11)
            java.nio.ByteBuffer r8 = com.google.android.play.core.internal.zze.zze(r11)
            r1 = r10
            zzh(r0, r1, r2, r4, r6, r8)
            int r10 = r9.size()
            java.security.cert.X509Certificate[][] r10 = new java.security.cert.X509Certificate[r10][]
            java.lang.Object[] r10 = r9.toArray(r10)
            java.security.cert.X509Certificate[][] r10 = (java.security.cert.X509Certificate[][]) r10
            return r10
        L79:
            java.lang.SecurityException r10 = new java.lang.SecurityException
            java.lang.String r11 = "No content digests found"
            r10.<init>(r11)
            throw r10
        L81:
            java.lang.SecurityException r10 = new java.lang.SecurityException
            java.lang.String r11 = "No signers found"
            r10.<init>(r11)
            throw r10
        L89:
            r10 = move-exception
            java.lang.SecurityException r11 = new java.lang.SecurityException
            java.lang.String r0 = "Failed to read list of signers"
            r11.<init>(r0, r10)
            throw r11
        L92:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Failed to obtain X.509 CertificateFactory"
            r11.<init>(r0, r10)
            throw r11
    }
}
