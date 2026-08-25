package p000.p001.p002.p003.p004.p005;

/* JADX INFO: renamed from: ⁱﾞﹳـⁱˉ.ˑˊᵎˏⁱי.ˏٴᵢʻᵢﹳ.ٴʽˆˑᵔﹶ.ᵢˈᵎʿˋʼ.ˉⁱˊˑיﾞ.ˑˆٴʽיᵢ, reason: contains not printable characters */
/* JADX INFO: compiled from: StringEncryptionHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C0051 {
    private static final java.lang.String AESTYPE = "AES";
    private static final java.nio.charset.Charset defaultCharset = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p000.p001.p002.p003.p004.p005.C0051.defaultCharset = r0
            return
    }

    public C0051() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String bytesToHex(byte[] r5) {
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r1 = 0
        L6:
            int r3 = r5.length
            if (r1 >= r3) goto L22
            r3 = r5[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r3)
            int r3 = r0.length()
            r4 = 2
            if (r3 >= r4) goto L1c
            r3 = 0
            r2.append(r3)
        L1c:
            r2.append(r0)
            int r1 = r1 + 1
            goto L6
        L22:
            java.lang.String r3 = r2.toString()
            return r3
    }

    private static byte[] decode(byte[] r6, java.lang.String r7) {
            r1 = 0
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = encodePass(r7)     // Catch: java.lang.Exception -> L1f
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> L1f
            java.lang.String r5 = "AES"
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = "AES"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Exception -> L1f
            r4 = 2
            r0.init(r4, r3)     // Catch: java.lang.Exception -> L1f
            byte[] r1 = r0.doFinal(r6)     // Catch: java.lang.Exception -> L1f
        L1e:
            return r1
        L1f:
            r2 = move-exception
            r2.printStackTrace()
            goto L1e
    }

    private static byte[] encode(byte[] r6, java.lang.String r7) {
            r2 = 0
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = encodePass(r7)     // Catch: java.lang.Exception -> L1f
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> L1f
            java.lang.String r5 = "AES"
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = "AES"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Exception -> L1f
            r4 = 1
            r0.init(r4, r3)     // Catch: java.lang.Exception -> L1f
            byte[] r2 = r0.doFinal(r6)     // Catch: java.lang.Exception -> L1f
        L1e:
            return r2
        L1f:
            r1 = move-exception
            r1.printStackTrace()
            goto L1e
    }

    public static java.lang.String encodePass(java.lang.String r1) {
            java.lang.String r0 = encodeToMD516(r1)
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }

    public static java.lang.String encodeStr(java.lang.String r1, java.lang.String r2) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r1.getBytes(r0)
            byte[] r0 = encode(r0, r2)
            java.lang.String r0 = bytesToHex(r0)
            return r0
    }

    public static java.lang.String encodeToMD5(java.lang.String r10) {
            r3 = 0
            java.lang.String r6 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r6)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            byte[] r6 = r10.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L4b
            byte[] r1 = r3.digest(r6)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.lang.String r4 = ""
            int r7 = r1.length     // Catch: java.security.NoSuchAlgorithmException -> L4b
            r6 = 0
        L13:
            if (r6 >= r7) goto L51
            r0 = r1[r6]     // Catch: java.security.NoSuchAlgorithmException -> L4b
            r8 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r5 = java.lang.Integer.toHexString(r8)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            int r8 = r5.length()     // Catch: java.security.NoSuchAlgorithmException -> L4b
            r9 = 1
            if (r8 != r9) goto L37
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L4b
            r8.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.lang.String r9 = "0"
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.lang.StringBuilder r8 = r8.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.lang.String r5 = r8.toString()     // Catch: java.security.NoSuchAlgorithmException -> L4b
        L37:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L4b
            r8.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.lang.StringBuilder r8 = r8.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.lang.StringBuilder r8 = r8.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L4b
            java.lang.String r4 = r8.toString()     // Catch: java.security.NoSuchAlgorithmException -> L4b
            int r6 = r6 + 1
            goto L13
        L4b:
            r2 = move-exception
            r2.printStackTrace()
            java.lang.String r4 = ""
        L51:
            return r4
    }

    public static java.lang.String encodeToMD516(java.lang.String r3) {
            java.lang.String r0 = encodeToMD5(r3)
            r1 = 8
            r2 = 24
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public static byte[] hexToByteArray(java.lang.String r6) {
            int r0 = r6.length()
            int r4 = r0 % 2
            r5 = 1
            if (r4 != r5) goto L3a
            int r0 = r0 + 1
            int r4 = r0 / 2
            byte[] r3 = new byte[r4]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "0"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = r4.toString()
        L22:
            r2 = 0
            r1 = 0
        L24:
            if (r1 >= r0) goto L3f
            int r4 = r1 + 2
            java.lang.String r4 = r6.substring(r1, r4)
            r5 = 16
            int r4 = java.lang.Integer.parseInt(r4, r5)
            byte r4 = (byte) r4
            r3[r2] = r4
            int r2 = r2 + 1
            int r1 = r1 + 2
            goto L24
        L3a:
            int r4 = r0 / 2
            byte[] r3 = new byte[r4]
            goto L22
        L3f:
            return r3
    }

    /* JADX INFO: renamed from: ᵢﹳʻᵢˆᴵʼʿˑﹶᴵˆﾞᵢˉﹳﹳˑˑᵢ, reason: contains not printable characters */
    public static java.lang.String m2039(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "ScKit-"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r0 = new java.lang.String
            byte[] r1 = hexToByteArray(r3)
            byte[] r1 = decode(r1, r4)
            java.nio.charset.Charset r2 = p000.p001.p002.p003.p004.p005.C0051.defaultCharset
            r0.<init>(r1, r2)
            return r0
    }
}
