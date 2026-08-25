package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class FontProvider {
    private static final java.util.Comparator<byte[]> sByteArrayComparator = null;

    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.database.Cursor query(android.content.ContentResolver r7, android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12, java.lang.Object r13) {
                r6 = r13
                android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5, r6)
                return r7
        }
    }

    public static /* synthetic */ int $r8$lambda$Wi4h7Y1RxUrqSUowKMegxTqKvJo(byte[] r0, byte[] r1) {
            int r0 = lambda$static$0(r0, r1)
            return r0
    }

    static {
            androidx.core.provider.FontProvider$$ExternalSyntheticLambda0 r0 = androidx.core.provider.FontProvider$$ExternalSyntheticLambda0.INSTANCE
            androidx.core.provider.FontProvider.sByteArrayComparator = r0
            return
    }

    private FontProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r4[r2]
            byte[] r3 = r3.toByteArray()
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    private static boolean equalsByteArrayList(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = 0
        Ld:
            int r1 = r4.size()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r4.get(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            r4 = 1
            return r4
    }

    private static java.util.List<java.util.List<byte[]>> getCertificates(androidx.core.provider.FontRequest r1, android.content.res.Resources r2) {
            java.util.List r0 = r1.getCertificates()
            if (r0 == 0) goto Lb
            java.util.List r1 = r1.getCertificates()
            return r1
        Lb:
            int r1 = r1.getCertificatesArrayResId()
            java.util.List r1 = androidx.core.content.res.FontResourcesParserCompat.readCerts(r2, r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.core.provider.FontsContractCompat.FontFamilyResult getFontFamilyResult(@androidx.annotation.NonNull android.content.Context r20, @androidx.annotation.NonNull androidx.core.provider.FontRequest r21, @androidx.annotation.Nullable android.os.CancellationSignal r22) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r20.getPackageManager()
            android.content.res.Resources r1 = r20.getResources()
            r2 = r21
            android.content.pm.ProviderInfo r0 = getProvider(r0, r2, r1)
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L18
            androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = new androidx.core.provider.FontsContractCompat$FontFamilyResult
            r0.<init>(r3, r1)
            return r0
        L18:
            java.lang.String r0 = r0.authority
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            android.net.Uri$Builder r5 = r5.authority(r0)
            android.net.Uri r5 = r5.build()
            android.net.Uri$Builder r7 = new android.net.Uri$Builder
            r7.<init>()
            android.net.Uri$Builder r6 = r7.scheme(r6)
            android.net.Uri$Builder r0 = r6.authority(r0)
            java.lang.String r6 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r6)
            android.net.Uri r0 = r0.build()
            java.lang.String r6 = "_id"
            java.lang.String r7 = "file_id"
            java.lang.String r8 = "font_ttc_index"
            java.lang.String r9 = "font_variation_settings"
            java.lang.String r10 = "font_weight"
            java.lang.String r11 = "font_italic"
            java.lang.String r12 = "result_code"
            java.lang.String[] r9 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> L10e
            android.content.ContentResolver r7 = r20.getContentResolver()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r10 = "query = ?"
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L10e
            java.lang.String r2 = r21.getQuery()     // Catch: java.lang.Throwable -> L10e
            r6 = 0
            r11[r6] = r2     // Catch: java.lang.Throwable -> L10e
            r12 = 0
            r8 = r5
            r13 = r22
            android.database.Cursor r1 = androidx.core.provider.FontProvider.Api16Impl.query(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L10e
            if (r1 == 0) goto Lfb
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L10e
            if (r2 <= 0) goto Lfb
            java.lang.String r2 = "result_code"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L10e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L10e
            r4.<init>()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r7 = "_id"
            int r7 = r1.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r8 = "file_id"
            int r8 = r1.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r9 = "font_ttc_index"
            int r9 = r1.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r10 = "font_weight"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r11 = "font_italic"
            int r11 = r1.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L10e
        La6:
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> L10e
            if (r12 == 0) goto Lfb
            r12 = -1
            if (r2 == r12) goto Lb6
            int r13 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L10e
            r19 = r13
            goto Lb8
        Lb6:
            r19 = 0
        Lb8:
            if (r9 == r12) goto Lc1
            int r13 = r1.getInt(r9)     // Catch: java.lang.Throwable -> L10e
            r16 = r13
            goto Lc3
        Lc1:
            r16 = 0
        Lc3:
            if (r8 != r12) goto Lce
            long r13 = r1.getLong(r7)     // Catch: java.lang.Throwable -> L10e
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r5, r13)     // Catch: java.lang.Throwable -> L10e
            goto Ld6
        Lce:
            long r13 = r1.getLong(r8)     // Catch: java.lang.Throwable -> L10e
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r0, r13)     // Catch: java.lang.Throwable -> L10e
        Ld6:
            r15 = r13
            if (r10 == r12) goto Le0
            int r13 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L10e
            r17 = r13
            goto Le4
        Le0:
            r13 = 400(0x190, float:5.6E-43)
            r17 = 400(0x190, float:5.6E-43)
        Le4:
            if (r11 == r12) goto Lef
            int r12 = r1.getInt(r11)     // Catch: java.lang.Throwable -> L10e
            if (r12 != r3) goto Lef
            r18 = 1
            goto Lf1
        Lef:
            r18 = 0
        Lf1:
            androidx.core.provider.FontsContractCompat$FontInfo r12 = new androidx.core.provider.FontsContractCompat$FontInfo     // Catch: java.lang.Throwable -> L10e
            r14 = r12
            r14.<init>(r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L10e
            r4.add(r12)     // Catch: java.lang.Throwable -> L10e
            goto La6
        Lfb:
            if (r1 == 0) goto L100
            r1.close()
        L100:
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r6]
            java.lang.Object[] r0 = r4.toArray(r0)
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r1 = new androidx.core.provider.FontsContractCompat$FontFamilyResult
            r1.<init>(r6, r0)
            return r1
        L10e:
            r0 = move-exception
            if (r1 == 0) goto L114
            r1.close()
        L114:
            throw r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    public static android.content.pm.ProviderInfo getProvider(@androidx.annotation.NonNull android.content.pm.PackageManager r5, @androidx.annotation.NonNull androidx.core.provider.FontRequest r6, @androidx.annotation.Nullable android.content.res.Resources r7) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = r6.getProviderAuthority()
            r1 = 0
            android.content.pm.ProviderInfo r2 = r5.resolveContentProvider(r0, r1)
            if (r2 == 0) goto L69
            java.lang.String r3 = r2.packageName
            java.lang.String r4 = r6.getProviderPackage()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L50
            java.lang.String r0 = r2.packageName
            r3 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r3)
            android.content.pm.Signature[] r5 = r5.signatures
            java.util.List r5 = convertToByteArrayList(r5)
            java.util.Comparator<byte[]> r0 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r5, r0)
            java.util.List r6 = getCertificates(r6, r7)
        L2e:
            int r7 = r6.size()
            if (r1 >= r7) goto L4e
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r0 = r6.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            java.util.Comparator<byte[]> r0 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r7, r0)
            boolean r7 = equalsByteArrayList(r5, r7)
            if (r7 == 0) goto L4b
            return r2
        L4b:
            int r1 = r1 + 1
            goto L2e
        L4e:
            r5 = 0
            return r5
        L50:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r7 = "Found content provider "
            java.lang.String r1 = ", but package was not "
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r7, r0, r1)
            java.lang.String r6 = r6.getProviderPackage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L69:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r6 = "No package found for authority: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r0)
            r5.<init>(r6)
            throw r5
    }

    private static /* synthetic */ int lambda$static$0(byte[] r4, byte[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            if (r0 == r1) goto L8
            int r4 = r4.length
            int r5 = r5.length
        L6:
            int r4 = r4 - r5
            return r4
        L8:
            r0 = 0
            r1 = 0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L1b
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L18
            r4 = r4[r1]
            r5 = r5[r1]
            goto L6
        L18:
            int r1 = r1 + 1
            goto La
        L1b:
            return r0
    }
}
