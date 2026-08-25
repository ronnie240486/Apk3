package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Utf8Safe extends androidx.emoji2.text.flatbuffer.Utf8 {

    /* JADX INFO: loaded from: classes.dex */
    public static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        public UnpairedSurrogateException(int r3, int r4) {
                r2 = this;
                java.lang.String r0 = "Unpaired surrogate at index "
                java.lang.String r1 = " of "
                java.lang.String r3 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r0, r3, r1, r4)
                r2.<init>(r3)
                return
        }
    }

    public Utf8Safe() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int computeEncodedLength(java.lang.CharSequence r5) {
            int r0 = r5.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            char r2 = r5.charAt(r1)
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L12
            int r1 = r1 + 1
            goto L5
        L12:
            r2 = r0
        L13:
            if (r1 >= r0) goto L2a
            char r3 = r5.charAt(r1)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L25
            int r3 = 127 - r3
            int r3 = r3 >>> 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L13
        L25:
            int r5 = encodedLengthGeneral(r5, r1)
            int r2 = r2 + r5
        L2a:
            if (r2 < r0) goto L2d
            return r2
        L2d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "UTF-8 length does not fit in int: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = (long) r2
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public static java.lang.String decodeUtf8Array(byte[] r11, int r12, int r13) {
            r0 = r12 | r13
            int r1 = r11.length
            int r1 = r1 - r12
            int r1 = r1 - r13
            r0 = r0 | r1
            r1 = 0
            r2 = 1
            if (r0 < 0) goto Lbc
            int r0 = r12 + r13
            char[] r13 = new char[r13]
            r3 = 0
        Lf:
            if (r12 >= r0) goto L24
            r4 = r11[r12]
            if (r4 < 0) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = 0
        L18:
            if (r5 != 0) goto L1b
            goto L24
        L1b:
            int r12 = r12 + 1
            int r5 = r3 + 1
            char r4 = (char) r4
            r13[r3] = r4
            r3 = r5
            goto Lf
        L24:
            r8 = r3
        L25:
            if (r12 >= r0) goto Lb6
            int r3 = r12 + 1
            r12 = r11[r12]
            if (r12 < 0) goto L2f
            r4 = 1
            goto L30
        L2f:
            r4 = 0
        L30:
            if (r4 == 0) goto L4f
            int r4 = r8 + 1
            char r12 = (char) r12
            r13[r8] = r12
        L37:
            if (r3 >= r0) goto L4c
            r12 = r11[r3]
            if (r12 < 0) goto L3f
            r5 = 1
            goto L40
        L3f:
            r5 = 0
        L40:
            if (r5 != 0) goto L43
            goto L4c
        L43:
            int r3 = r3 + 1
            int r5 = r4 + 1
            char r12 = (char) r12
            r13[r4] = r12
            r4 = r5
            goto L37
        L4c:
            r12 = r3
            r8 = r4
            goto L25
        L4f:
            r4 = -32
            if (r12 >= r4) goto L55
            r4 = 1
            goto L56
        L55:
            r4 = 0
        L56:
            java.lang.String r5 = "Invalid UTF-8"
            if (r4 == 0) goto L6e
            if (r3 >= r0) goto L68
            int r4 = r3 + 1
            r3 = r11[r3]
            int r5 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleTwoBytes(r12, r3, r13, r8)
            r12 = r4
            r8 = r5
            goto L25
        L68:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        L6e:
            r4 = -16
            if (r12 >= r4) goto L74
            r4 = 1
            goto L75
        L74:
            r4 = 0
        L75:
            if (r4 == 0) goto L91
            int r4 = r0 + (-1)
            if (r3 >= r4) goto L8b
            int r4 = r3 + 1
            r3 = r11[r3]
            int r5 = r4 + 1
            r4 = r11[r4]
            int r6 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleThreeBytes(r12, r3, r4, r13, r8)
            r12 = r5
            r8 = r6
            goto L25
        L8b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        L91:
            int r4 = r0 + (-2)
            if (r3 >= r4) goto Lb0
            int r4 = r3 + 1
            r5 = r11[r3]
            int r3 = r4 + 1
            r6 = r11[r4]
            int r9 = r3 + 1
            r7 = r11[r3]
            int r10 = r8 + 1
            r3 = r12
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r13
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleFourBytes(r3, r4, r5, r6, r7, r8)
            int r10 = r10 + r2
            r12 = r9
            r8 = r10
            goto L25
        Lb0:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        Lb6:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r13, r1, r8)
            return r11
        Lbc:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r11 = r11.length
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3[r1] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r3[r2] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r12 = 2
            r3[r12] = r11
            java.lang.String r11 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r11 = java.lang.String.format(r11, r3)
            r0.<init>(r11)
            throw r0
    }

    public static java.lang.String decodeUtf8Buffer(java.nio.ByteBuffer r11, int r12, int r13) {
            r0 = r12 | r13
            int r1 = r11.limit()
            int r1 = r1 - r12
            int r1 = r1 - r13
            r0 = r0 | r1
            r1 = 0
            r2 = 1
            if (r0 < 0) goto Ld1
            int r0 = r12 + r13
            char[] r13 = new char[r13]
            r3 = 0
        L12:
            if (r12 >= r0) goto L29
            byte r4 = r11.get(r12)
            if (r4 < 0) goto L1c
            r5 = 1
            goto L1d
        L1c:
            r5 = 0
        L1d:
            if (r5 != 0) goto L20
            goto L29
        L20:
            int r12 = r12 + 1
            int r5 = r3 + 1
            char r4 = (char) r4
            r13[r3] = r4
            r3 = r5
            goto L12
        L29:
            r8 = r3
        L2a:
            if (r12 >= r0) goto Lcb
            int r3 = r12 + 1
            byte r12 = r11.get(r12)
            if (r12 < 0) goto L36
            r4 = 1
            goto L37
        L36:
            r4 = 0
        L37:
            if (r4 == 0) goto L58
            int r4 = r8 + 1
            char r12 = (char) r12
            r13[r8] = r12
        L3e:
            if (r3 >= r0) goto L55
            byte r12 = r11.get(r3)
            if (r12 < 0) goto L48
            r5 = 1
            goto L49
        L48:
            r5 = 0
        L49:
            if (r5 != 0) goto L4c
            goto L55
        L4c:
            int r3 = r3 + 1
            int r5 = r4 + 1
            char r12 = (char) r12
            r13[r4] = r12
            r4 = r5
            goto L3e
        L55:
            r12 = r3
            r8 = r4
            goto L2a
        L58:
            r4 = -32
            if (r12 >= r4) goto L5e
            r4 = 1
            goto L5f
        L5e:
            r4 = 0
        L5f:
            java.lang.String r5 = "Invalid UTF-8"
            if (r4 == 0) goto L79
            if (r3 >= r0) goto L73
            int r4 = r3 + 1
            byte r3 = r11.get(r3)
            int r5 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleTwoBytes(r12, r3, r13, r8)
            r12 = r4
            r8 = r5
            goto L2a
        L73:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        L79:
            r4 = -16
            if (r12 >= r4) goto L7f
            r4 = 1
            goto L80
        L7f:
            r4 = 0
        L80:
            if (r4 == 0) goto La0
            int r4 = r0 + (-1)
            if (r3 >= r4) goto L9a
            int r4 = r3 + 1
            byte r3 = r11.get(r3)
            int r5 = r4 + 1
            byte r4 = r11.get(r4)
            int r6 = r8 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleThreeBytes(r12, r3, r4, r13, r8)
            r12 = r5
            r8 = r6
            goto L2a
        L9a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        La0:
            int r4 = r0 + (-2)
            if (r3 >= r4) goto Lc5
            int r4 = r3 + 1
            byte r5 = r11.get(r3)
            int r3 = r4 + 1
            byte r6 = r11.get(r4)
            int r9 = r3 + 1
            byte r7 = r11.get(r3)
            int r10 = r8 + 1
            r3 = r12
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r13
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleFourBytes(r3, r4, r5, r6, r7, r8)
            int r10 = r10 + r2
            r12 = r9
            r8 = r10
            goto L2a
        Lc5:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        Lcb:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r13, r1, r8)
            return r11
        Ld1:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r11 = r11.limit()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3[r1] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r3[r2] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r12 = 2
            r3[r12] = r11
            java.lang.String r11 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.String r11 = java.lang.String.format(r11, r3)
            r0.<init>(r11)
            throw r0
    }

    private static int encodeUtf8Array(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
            int r0 = r7.length()
            int r10 = r10 + r9
            r1 = 0
        L6:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L1a
            int r3 = r1 + r9
            if (r3 >= r10) goto L1a
            char r4 = r7.charAt(r1)
            if (r4 >= r2) goto L1a
            byte r2 = (byte) r4
            r8[r3] = r2
            int r1 = r1 + 1
            goto L6
        L1a:
            if (r1 != r0) goto L1e
            int r9 = r9 + r0
            return r9
        L1e:
            int r9 = r9 + r1
        L1f:
            if (r1 >= r0) goto Lfd
            char r3 = r7.charAt(r1)
            if (r3 >= r2) goto L31
            if (r9 >= r10) goto L31
            int r4 = r9 + 1
            byte r3 = (byte) r3
            r8[r9] = r3
        L2e:
            r9 = r4
            goto Lb5
        L31:
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L4b
            int r4 = r10 + (-2)
            if (r9 > r4) goto L4b
            int r4 = r9 + 1
            int r5 = r3 >>> 6
            r5 = r5 | 960(0x3c0, float:1.345E-42)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r4 + 1
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r8[r4] = r3
            goto Lb5
        L4b:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L55
            if (r4 >= r3) goto L75
        L55:
            int r6 = r10 + (-3)
            if (r9 > r6) goto L75
            int r4 = r9 + 1
            int r5 = r3 >>> 12
            r5 = r5 | 480(0x1e0, float:6.73E-43)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r4 + 1
            int r5 = r3 >>> 6
            r5 = r5 & 63
            r5 = r5 | r2
            byte r5 = (byte) r5
            r8[r4] = r5
            int r4 = r9 + 1
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r8[r9] = r3
            goto L2e
        L75:
            int r6 = r10 + (-4)
            if (r9 > r6) goto Lc2
            int r4 = r1 + 1
            int r5 = r7.length()
            if (r4 == r5) goto Lba
            char r1 = r7.charAt(r4)
            boolean r5 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r5 == 0) goto Lb9
            int r1 = java.lang.Character.toCodePoint(r3, r1)
            int r3 = r9 + 1
            int r5 = r1 >>> 18
            r5 = r5 | 240(0xf0, float:3.36E-43)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r3 + 1
            int r5 = r1 >>> 12
            r5 = r5 & 63
            r5 = r5 | r2
            byte r5 = (byte) r5
            r8[r3] = r5
            int r3 = r9 + 1
            int r5 = r1 >>> 6
            r5 = r5 & 63
            r5 = r5 | r2
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r3 + 1
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r8[r3] = r1
            r1 = r4
        Lb5:
            int r1 = r1 + 1
            goto L1f
        Lb9:
            r1 = r4
        Lba:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r7 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException
            int r1 = r1 + (-1)
            r7.<init>(r1, r0)
            throw r7
        Lc2:
            if (r5 > r3) goto Lde
            if (r3 > r4) goto Lde
            int r8 = r1 + 1
            int r10 = r7.length()
            if (r8 == r10) goto Ld8
            char r7 = r7.charAt(r8)
            boolean r7 = java.lang.Character.isSurrogatePair(r3, r7)
            if (r7 != 0) goto Lde
        Ld8:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r7 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException
            r7.<init>(r1, r0)
            throw r7
        Lde:
            java.lang.ArrayIndexOutOfBoundsException r7 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Failed writing "
            r8.append(r10)
            r8.append(r3)
            java.lang.String r10 = " at index "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Lfd:
            return r9
    }

    private static void encodeUtf8Buffer(java.lang.CharSequence r7, java.nio.ByteBuffer r8) {
            int r0 = r7.length()
            int r1 = r8.position()
            r2 = 0
        L9:
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r0) goto L1c
            char r4 = r7.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            if (r4 >= r3) goto L1c
            int r3 = r1 + r2
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            r8.put(r3, r4)     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            int r2 = r2 + 1
            goto L9
        L1c:
            if (r2 != r0) goto L24
            int r0 = r1 + r2
            r8.position(r0)     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            return
        L24:
            int r1 = r1 + r2
        L25:
            if (r2 >= r0) goto Lc3
            char r4 = r7.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            if (r4 >= r3) goto L33
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            r8.put(r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            goto Lbd
        L33:
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L4e
            int r5 = r1 + 1
            int r6 = r4 >>> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r8.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
            r1 = r4 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1     // Catch: java.lang.IndexOutOfBoundsException -> L4b
            r8.put(r5, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
            r1 = r5
            goto Lbd
        L4b:
            r1 = r5
            goto Lc7
        L4e:
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto La1
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r5 >= r4) goto L59
            goto La1
        L59:
            int r5 = r2 + 1
            if (r5 == r0) goto L9b
            char r2 = r7.charAt(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L99
            boolean r6 = java.lang.Character.isSurrogatePair(r4, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L99
            if (r6 == 0) goto L97
            int r2 = java.lang.Character.toCodePoint(r4, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L99
            int r4 = r1 + 1
            int r6 = r2 >>> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r8.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L95
            int r1 = r4 + 1
            int r6 = r2 >>> 12
            r6 = r6 & 63
            r6 = r6 | r3
            byte r6 = (byte) r6
            r8.put(r4, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L99
            int r4 = r1 + 1
            int r6 = r2 >>> 6
            r6 = r6 & 63
            r6 = r6 | r3
            byte r6 = (byte) r6
            r8.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L95
            r1 = r2 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1     // Catch: java.lang.IndexOutOfBoundsException -> L95
            r8.put(r4, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L95
            r1 = r4
            r2 = r5
            goto Lbd
        L95:
            r1 = r4
            goto L99
        L97:
            r2 = r5
            goto L9b
        L99:
            r2 = r5
            goto Lc7
        L9b:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r3 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            r3.<init>(r2, r0)     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            throw r3     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
        La1:
            int r5 = r1 + 1
            int r6 = r4 >>> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r8.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
            int r1 = r5 + 1
            int r6 = r4 >>> 6
            r6 = r6 & 63
            r6 = r6 | r3
            byte r6 = (byte) r6
            r8.put(r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            r4 = r4 & 63
            r4 = r4 | r3
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            r8.put(r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
        Lbd:
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L25
        Lc3:
            r8.position(r1)     // Catch: java.lang.IndexOutOfBoundsException -> Lc7
            return
        Lc7:
            int r0 = r8.position()
            int r8 = r8.position()
            int r1 = r1 - r8
            int r1 = r1 + 1
            int r8 = java.lang.Math.max(r2, r1)
            int r8 = r8 + r0
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = "Failed writing "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            char r7 = r7.charAt(r2)
            r1.append(r7)
            java.lang.String r7 = " at index "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    private static int encodedLengthGeneral(java.lang.CharSequence r4, int r5) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r5 >= r0) goto L35
            char r2 = r4.charAt(r5)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L15
            int r2 = 127 - r2
            int r2 = r2 >>> 31
            int r1 = r1 + r2
            goto L32
        L15:
            int r1 = r1 + 2
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 > r2) goto L32
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 > r3) goto L32
            int r2 = java.lang.Character.codePointAt(r4, r5)
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 < r3) goto L2c
            int r5 = r5 + 1
            goto L32
        L2c:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r4 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException
            r4.<init>(r5, r0)
            throw r4
        L32:
            int r5 = r5 + 1
            goto L5
        L35:
            return r1
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public java.lang.String decodeUtf8(java.nio.ByteBuffer r2, int r3, int r4) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto L14
            byte[] r0 = r2.array()
            int r2 = r2.arrayOffset()
            int r2 = r2 + r3
            java.lang.String r2 = decodeUtf8Array(r0, r2, r4)
            return r2
        L14:
            java.lang.String r2 = decodeUtf8Buffer(r2, r3, r4)
            return r2
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(java.lang.CharSequence r5, java.nio.ByteBuffer r6) {
            r4 = this;
            boolean r0 = r6.hasArray()
            if (r0 == 0) goto L20
            int r0 = r6.arrayOffset()
            byte[] r1 = r6.array()
            int r2 = r6.position()
            int r2 = r2 + r0
            int r3 = r6.remaining()
            int r5 = encodeUtf8Array(r5, r1, r2, r3)
            int r5 = r5 - r0
            r6.position(r5)
            goto L23
        L20:
            encodeUtf8Buffer(r5, r6)
        L23:
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(java.lang.CharSequence r1) {
            r0 = this;
            int r1 = computeEncodedLength(r1)
            return r1
    }
}
