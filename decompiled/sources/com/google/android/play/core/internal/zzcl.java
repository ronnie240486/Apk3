package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcl {
    public static long zza(com.google.android.play.core.internal.zzcm r13, java.io.InputStream r14, java.io.OutputStream r15, long r16) throws java.io.IOException {
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = r14
            r1.<init>(r14, r2)
            java.io.DataInputStream r9 = new java.io.DataInputStream
            r9.<init>(r1)
            int r1 = r9.readInt()
            r2 = -771763713(0xffffffffd1ffd1ff, float:-1.3734248E11)
            if (r1 == r2) goto L46
            com.google.android.play.core.internal.zzck r0 = new com.google.android.play.core.internal.zzck
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r3] = r1
            java.lang.String r1 = "%x"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unexpected magic="
            int r3 = r1.length()
            if (r3 == 0) goto L3d
            java.lang.String r1 = r2.concat(r1)
            goto L42
        L3d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L42:
            r0.<init>(r1)
            throw r0
        L46:
            int r1 = r9.read()
            r2 = 4
            if (r1 != r2) goto L124
            r1 = 0
            r10 = r1
        L50:
            long r7 = r16 - r10
            int r12 = r9.read()     // Catch: java.lang.Throwable -> L11f
            r1 = -1
            if (r12 == r1) goto L117
            if (r12 == 0) goto L113
            java.lang.String r2 = "Unexpected end of patch"
            switch(r12) {
                case 247: goto Lfa;
                case 248: goto Led;
                case 249: goto Ld4;
                case 250: goto Lc3;
                case 251: goto Lb1;
                case 252: goto L97;
                case 253: goto L85;
                case 254: goto L73;
                case 255: goto L62;
                default: goto L60;
            }
        L60:
            goto L107
        L62:
            long r4 = r9.readLong()     // Catch: java.lang.Throwable -> L11f
            int r12 = r9.readInt()     // Catch: java.lang.Throwable -> L11f
            r1 = r0
            r2 = r13
            r3 = r15
            r6 = r12
            zzb(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L11f
            goto L10f
        L73:
            int r1 = r9.readInt()     // Catch: java.lang.Throwable -> L11f
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L11f
            int r12 = r9.readInt()     // Catch: java.lang.Throwable -> L11f
            r1 = r0
            r2 = r13
            r3 = r15
            r6 = r12
            zzb(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L11f
            goto L10f
        L85:
            int r1 = r9.readInt()     // Catch: java.lang.Throwable -> L11f
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L11f
            int r12 = r9.readUnsignedShort()     // Catch: java.lang.Throwable -> L11f
            r1 = r0
            r2 = r13
            r3 = r15
            r6 = r12
            zzb(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L11f
            goto L10f
        L97:
            int r3 = r9.readInt()     // Catch: java.lang.Throwable -> L11f
            long r4 = (long) r3     // Catch: java.lang.Throwable -> L11f
            int r12 = r9.read()     // Catch: java.lang.Throwable -> L11f
            if (r12 == r1) goto Lab
            r1 = r0
            r2 = r13
            r3 = r15
            r6 = r12
            zzb(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L11f
            goto L10f
        Lab:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L11f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L11f
            throw r0     // Catch: java.lang.Throwable -> L11f
        Lb1:
            int r1 = r9.readUnsignedShort()     // Catch: java.lang.Throwable -> L11f
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L11f
            int r12 = r9.readInt()     // Catch: java.lang.Throwable -> L11f
            r1 = r0
            r2 = r13
            r3 = r15
            r6 = r12
            zzb(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L11f
            goto L10f
        Lc3:
            int r1 = r9.readUnsignedShort()     // Catch: java.lang.Throwable -> L11f
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L11f
            int r12 = r9.readUnsignedShort()     // Catch: java.lang.Throwable -> L11f
            r1 = r0
            r2 = r13
            r3 = r15
            r6 = r12
            zzb(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L11f
            goto L10f
        Ld4:
            int r3 = r9.readUnsignedShort()     // Catch: java.lang.Throwable -> L11f
            long r4 = (long) r3     // Catch: java.lang.Throwable -> L11f
            int r12 = r9.read()     // Catch: java.lang.Throwable -> L11f
            if (r12 == r1) goto Le7
            r1 = r0
            r2 = r13
            r3 = r15
            r6 = r12
            zzb(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L11f
            goto L10f
        Le7:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L11f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L11f
            throw r0     // Catch: java.lang.Throwable -> L11f
        Led:
            int r12 = r9.readInt()     // Catch: java.lang.Throwable -> L11f
            r1 = r0
            r2 = r9
            r3 = r15
            r4 = r12
            r5 = r7
            zzc(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L11f
            goto L10f
        Lfa:
            int r12 = r9.readUnsignedShort()     // Catch: java.lang.Throwable -> L11f
            r1 = r0
            r2 = r9
            r3 = r15
            r4 = r12
            r5 = r7
            zzc(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L11f
            goto L10f
        L107:
            r1 = r0
            r2 = r9
            r3 = r15
            r4 = r12
            r5 = r7
            zzc(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L11f
        L10f:
            long r1 = (long) r12
            long r10 = r10 + r1
            goto L50
        L113:
            r15.flush()
            return r10
        L117:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L11f
            java.lang.String r1 = "Patch file overrun"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11f
            throw r0     // Catch: java.lang.Throwable -> L11f
        L11f:
            r0 = move-exception
            r15.flush()
            throw r0
        L124:
            com.google.android.play.core.internal.zzck r0 = new com.google.android.play.core.internal.zzck
            r2 = 30
            java.lang.String r3 = "Unexpected version="
            java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r1)
            r0.<init>(r1)
            throw r0
    }

    private static void zzb(byte[] r10, com.google.android.play.core.internal.zzcm r11, java.io.OutputStream r12, long r13, int r15, long r16) throws java.io.IOException {
            r0 = r10
            r1 = r15
            if (r1 < 0) goto L63
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 < 0) goto L5b
            long r8 = (long) r1
            int r2 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r2 > 0) goto L53
            com.google.android.play.core.internal.zzcn r2 = new com.google.android.play.core.internal.zzcn     // Catch: java.io.EOFException -> L4a
            r4 = r2
            r5 = r11
            r6 = r13
            r4.<init>(r5, r6, r8)     // Catch: java.io.EOFException -> L4a
            java.io.InputStream r2 = r2.zzc()     // Catch: java.io.EOFException -> L4a
        L1b:
            if (r1 <= 0) goto L46
            r3 = 16384(0x4000, float:2.2959E-41)
            int r3 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> L41
            r4 = 0
            r5 = 0
        L25:
            if (r5 >= r3) goto L3b
            int r6 = r3 - r5
            int r6 = r2.read(r10, r5, r6)     // Catch: java.lang.Throwable -> L41
            r7 = -1
            if (r6 == r7) goto L32
            int r5 = r5 + r6
            goto L25
        L32:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "truncated input stream"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L41
        L3b:
            r5 = r12
            r12.write(r10, r4, r3)     // Catch: java.lang.Throwable -> L41
            int r1 = r1 - r3
            goto L1b
        L41:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L45
        L45:
            throw r0     // Catch: java.io.EOFException -> L4a
        L46:
            r2.close()     // Catch: java.io.EOFException -> L4a
            return
        L4a:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "patch underrun"
            r1.<init>(r2, r0)
            throw r1
        L53:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Output length overrun"
            r0.<init>(r1)
            throw r0
        L5b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "inputOffset negative"
            r0.<init>(r1)
            throw r0
        L63:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "copyLength negative"
            r0.<init>(r1)
            throw r0
    }

    private static void zzc(byte[] r3, java.io.DataInputStream r4, java.io.OutputStream r5, int r6, long r7) throws java.io.IOException {
            if (r6 < 0) goto L29
            long r0 = (long) r6
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L21
        L7:
            if (r6 <= 0) goto L20
            r7 = 16384(0x4000, float:2.2959E-41)
            int r7 = java.lang.Math.min(r6, r7)     // Catch: java.io.EOFException -> L18
            r8 = 0
            r4.readFully(r3, r8, r7)     // Catch: java.io.EOFException -> L18
            r5.write(r3, r8, r7)     // Catch: java.io.EOFException -> L18
            int r6 = r6 - r7
            goto L7
        L18:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "patch underrun"
            r3.<init>(r4)
            throw r3
        L20:
            return
        L21:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Output length overrun"
            r3.<init>(r4)
            throw r3
        L29:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "copyLength negative"
            r3.<init>(r4)
            throw r3
    }
}
