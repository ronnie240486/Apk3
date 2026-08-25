package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public final class PackageInfoCompat {

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static android.content.pm.Signature[] getApkContentsSigners(@androidx.annotation.NonNull android.content.pm.SigningInfo r0) {
                android.content.pm.Signature[] r0 = r0.getApkContentsSigners()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static long getLongVersionCode(android.content.pm.PackageInfo r2) {
                long r0 = r2.getLongVersionCode()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static android.content.pm.Signature[] getSigningCertificateHistory(@androidx.annotation.NonNull android.content.pm.SigningInfo r0) {
                android.content.pm.Signature[] r0 = r0.getSigningCertificateHistory()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasMultipleSigners(@androidx.annotation.NonNull android.content.pm.SigningInfo r0) {
                boolean r0 = r0.hasMultipleSigners()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasSigningCertificate(@androidx.annotation.NonNull android.content.pm.PackageManager r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull byte[] r2, int r3) {
                boolean r0 = r0.hasSigningCertificate(r1, r2, r3)
                return r0
        }
    }

    private PackageInfoCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean byteArrayContains(@androidx.annotation.NonNull byte[][] r4, @androidx.annotation.NonNull byte[] r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L12
            r3 = r4[r2]
            boolean r3 = java.util.Arrays.equals(r5, r3)
            if (r3 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    private static byte[] computeSHA256Digest(byte[] r2) {
            java.lang.String r0 = "SHA256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            byte[] r2 = r0.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Device doesn't support SHA256 cert checking"
            r0.<init>(r1, r2)
            throw r0
    }

    public static long getLongVersionCode(@androidx.annotation.NonNull android.content.pm.PackageInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            long r0 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getLongVersionCode(r2)
            return r0
        Lb:
            int r2 = r2.versionCode
            long r0 = (long) r2
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<android.content.pm.Signature> getSignatures(@androidx.annotation.NonNull android.content.pm.PackageManager r2, @androidx.annotation.NonNull java.lang.String r3) throws android.content.pm.PackageManager.NameNotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1e
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            android.content.pm.SigningInfo r2 = r2.signingInfo
            boolean r3 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.hasMultipleSigners(r2)
            if (r3 == 0) goto L19
            android.content.pm.Signature[] r2 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getApkContentsSigners(r2)
            goto L26
        L19:
            android.content.pm.Signature[] r2 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getSigningCertificateHistory(r2)
            goto L26
        L1e:
            r0 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            android.content.pm.Signature[] r2 = r2.signatures
        L26:
            if (r2 != 0) goto L2d
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
        L2d:
            java.util.List r2 = java.util.Arrays.asList(r2)
            return r2
    }

    public static boolean hasSignatures(@androidx.annotation.NonNull android.content.pm.PackageManager r7, @androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull @androidx.annotation.Size(min = 1) java.util.Map<byte[], java.lang.Integer> r9, boolean r10) throws android.content.pm.PackageManager.NameNotFoundException {
            boolean r0 = r9.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Set r0 = r9.keySet()
            java.util.Iterator r2 = r0.iterator()
        L10:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "Unsupported certificate type "
            r5 = 1
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r9.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L4f
            int r6 = r3.intValue()
            if (r6 == 0) goto L10
            if (r6 != r5) goto L32
            goto L10
        L32:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r3)
            java.lang.String r10 = " when verifying "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L4f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Type must be specified for cert when verifying "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r8)
            r7.<init>(r8)
            throw r7
        L5b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Cert byte array cannot be null when verifying "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r8)
            r7.<init>(r8)
            throw r7
        L67:
            java.util.List r2 = getSignatures(r7, r8)
            if (r10 != 0) goto L95
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r3 < r6) goto L95
            java.util.Iterator r10 = r0.iterator()
        L77:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r10.next()
            byte[] r0 = (byte[]) r0
            java.lang.Object r2 = r9.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r0 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.hasSigningCertificate(r7, r8, r0, r2)
            if (r0 != 0) goto L77
            return r1
        L94:
            return r5
        L95:
            int r7 = r2.size()
            if (r7 == 0) goto L124
            int r7 = r9.size()
            int r8 = r2.size()
            if (r7 > r8) goto L124
            if (r10 == 0) goto Lb2
            int r7 = r9.size()
            int r8 = r2.size()
            if (r7 == r8) goto Lb2
            goto L124
        Lb2:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r7 = r9.containsValue(r7)
            r8 = 0
            if (r7 == 0) goto Ldd
            int r7 = r2.size()
            byte[][] r8 = new byte[r7][]
            r7 = 0
        Lc4:
            int r10 = r2.size()
            if (r7 >= r10) goto Ldd
            java.lang.Object r10 = r2.get(r7)
            android.content.pm.Signature r10 = (android.content.pm.Signature) r10
            byte[] r10 = r10.toByteArray()
            byte[] r10 = computeSHA256Digest(r10)
            r8[r7] = r10
            int r7 = r7 + 1
            goto Lc4
        Ldd:
            java.util.Iterator r7 = r0.iterator()
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L124
            java.lang.Object r7 = r7.next()
            byte[] r7 = (byte[]) r7
            java.lang.Object r9 = r9.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r10 = r9.intValue()
            if (r10 == 0) goto L117
            if (r10 != r5) goto L102
            boolean r7 = byteArrayContains(r8, r7)
            if (r7 != 0) goto L123
            return r1
        L102:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L117:
            android.content.pm.Signature r8 = new android.content.pm.Signature
            r8.<init>(r7)
            boolean r7 = r2.contains(r8)
            if (r7 != 0) goto L123
            return r1
        L123:
            return r5
        L124:
            return r1
    }
}
