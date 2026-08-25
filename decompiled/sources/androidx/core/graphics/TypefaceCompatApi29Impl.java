package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(29)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceCompatApi29Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    public TypefaceCompatApi29Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private android.graphics.fonts.Font findBaseFont(@androidx.annotation.NonNull android.graphics.fonts.FontFamily r6, int r7) {
            r5 = this;
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r7 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r7 = r7 & 2
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L13
            r7 = 1
            goto L14
        L13:
            r7 = 0
        L14:
            r0.<init>(r1, r7)
            android.graphics.fonts.Font r7 = r6.getFont(r2)
            android.graphics.fonts.FontStyle r1 = r7.getStyle()
            int r1 = getMatchScore(r0, r1)
        L23:
            int r2 = r6.getSize()
            if (r3 >= r2) goto L3c
            android.graphics.fonts.Font r2 = r6.getFont(r3)
            android.graphics.fonts.FontStyle r4 = r2.getStyle()
            int r4 = getMatchScore(r0, r4)
            if (r4 >= r1) goto L39
            r7 = r2
            r1 = r4
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r7
    }

    private static int getMatchScore(@androidx.annotation.NonNull android.graphics.fonts.FontStyle r2, @androidx.annotation.NonNull android.graphics.fonts.FontStyle r3) {
            int r0 = r2.getWeight()
            int r1 = r3.getWeight()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 / 100
            int r2 = r2.getSlant()
            int r3 = r3.getSlant()
            if (r2 != r3) goto L1b
            r2 = 0
            goto L1c
        L1b:
            r2 = 2
        L1c:
            int r0 = r0 + r2
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.Nullable
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r8, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r9, android.content.res.Resources r10, int r11) {
            r7 = this;
            r8 = 0
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r9 = r9.getEntries()     // Catch: java.lang.Exception -> L6a
            int r0 = r9.length     // Catch: java.lang.Exception -> L6a
            r1 = 0
            r3 = r8
            r2 = 0
        L9:
            if (r2 >= r0) goto L4e
            r4 = r9[r2]     // Catch: java.lang.Exception -> L6a
            android.graphics.fonts.Font$Builder r5 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            int r6 = r4.getResourceId()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            r5.<init>(r10, r6)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            int r6 = r4.getWeight()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            android.graphics.fonts.Font$Builder r5 = r5.setWeight(r6)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            boolean r6 = r4.isItalic()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            if (r6 == 0) goto L26
            r6 = 1
            goto L27
        L26:
            r6 = 0
        L27:
            android.graphics.fonts.Font$Builder r5 = r5.setSlant(r6)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            int r6 = r4.getTtcIndex()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            java.lang.String r4 = r4.getVariationSettings()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            android.graphics.fonts.Font$Builder r4 = r5.setFontVariationSettings(r4)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            if (r3 != 0) goto L48
            android.graphics.fonts.FontFamily$Builder r5 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            r5.<init>(r4)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
            r3 = r5
            goto L4b
        L48:
            r3.addFont(r4)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L6a
        L4b:
            int r2 = r2 + 1
            goto L9
        L4e:
            if (r3 != 0) goto L51
            return r8
        L51:
            android.graphics.fonts.FontFamily r9 = r3.build()     // Catch: java.lang.Exception -> L6a
            android.graphics.Typeface$CustomFallbackBuilder r10 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L6a
            r10.<init>(r9)     // Catch: java.lang.Exception -> L6a
            android.graphics.fonts.Font r9 = r7.findBaseFont(r9, r11)     // Catch: java.lang.Exception -> L6a
            android.graphics.fonts.FontStyle r9 = r9.getStyle()     // Catch: java.lang.Exception -> L6a
            android.graphics.Typeface$CustomFallbackBuilder r9 = r10.setStyle(r9)     // Catch: java.lang.Exception -> L6a
            android.graphics.Typeface r8 = r9.build()     // Catch: java.lang.Exception -> L6a
        L6a:
            return r8
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.Nullable
    public android.graphics.Typeface createFromFontInfo(android.content.Context r10, @androidx.annotation.Nullable android.os.CancellationSignal r11, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo[] r12, int r13) {
            r9 = this;
            android.content.ContentResolver r10 = r10.getContentResolver()
            r0 = 0
            int r1 = r12.length     // Catch: java.lang.Exception -> L7d
            r2 = 0
            r4 = r0
            r3 = 0
        L9:
            if (r3 >= r1) goto L60
            r5 = r12[r3]     // Catch: java.lang.Exception -> L7d
            android.net.Uri r6 = r5.getUri()     // Catch: java.io.IOException -> L5d java.lang.Exception -> L7d
            java.lang.String r7 = "r"
            android.os.ParcelFileDescriptor r6 = r10.openFileDescriptor(r6, r7, r11)     // Catch: java.io.IOException -> L5d java.lang.Exception -> L7d
            if (r6 != 0) goto L20
            if (r6 == 0) goto L5d
        L1c:
            r6.close()     // Catch: java.io.IOException -> L5d java.lang.Exception -> L7d
            goto L5d
        L20:
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L53
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L53
            int r8 = r5.getWeight()     // Catch: java.lang.Throwable -> L53
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch: java.lang.Throwable -> L53
            boolean r8 = r5.isItalic()     // Catch: java.lang.Throwable -> L53
            if (r8 == 0) goto L35
            r8 = 1
            goto L36
        L35:
            r8 = 0
        L36:
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch: java.lang.Throwable -> L53
            int r5 = r5.getTtcIndex()     // Catch: java.lang.Throwable -> L53
            android.graphics.fonts.Font$Builder r5 = r7.setTtcIndex(r5)     // Catch: java.lang.Throwable -> L53
            android.graphics.fonts.Font r5 = r5.build()     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L4f
            android.graphics.fonts.FontFamily$Builder r7 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L53
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L53
            r4 = r7
            goto L1c
        L4f:
            r4.addFont(r5)     // Catch: java.lang.Throwable -> L53
            goto L1c
        L53:
            r5 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.io.IOException -> L5d java.lang.Exception -> L7d
        L5c:
            throw r5     // Catch: java.io.IOException -> L5d java.lang.Exception -> L7d
        L5d:
            int r3 = r3 + 1
            goto L9
        L60:
            if (r4 != 0) goto L63
            return r0
        L63:
            android.graphics.fonts.FontFamily r10 = r4.build()     // Catch: java.lang.Exception -> L7d
            android.graphics.Typeface$CustomFallbackBuilder r11 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L7d
            r11.<init>(r10)     // Catch: java.lang.Exception -> L7d
            android.graphics.fonts.Font r10 = r9.findBaseFont(r10, r13)     // Catch: java.lang.Exception -> L7d
            android.graphics.fonts.FontStyle r10 = r10.getStyle()     // Catch: java.lang.Exception -> L7d
            android.graphics.Typeface$CustomFallbackBuilder r10 = r11.setStyle(r10)     // Catch: java.lang.Exception -> L7d
            android.graphics.Typeface r10 = r10.build()     // Catch: java.lang.Exception -> L7d
            return r10
        L7d:
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public final android.graphics.Typeface createFromInputStream(android.content.Context r1, java.io.InputStream r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not use this function in API 29 or later."
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.Nullable
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            android.graphics.fonts.Font$Builder r1 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L24
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.Font r1 = r1.build()     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily$Builder r2 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L24
            r2.<init>(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily r2 = r2.build()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L24
            r3.<init>(r2)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontStyle r1 = r1.getStyle()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r1 = r3.setStyle(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface r1 = r1.build()     // Catch: java.lang.Exception -> L24
            return r1
        L24:
            r1 = 0
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.NonNull
    public final android.graphics.Typeface createWeightStyle(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.graphics.Typeface r2, int r3, boolean r4) {
            r0 = this;
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r3, r4)
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public final androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] r1, int r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not use this function in API 29 or later."
            r1.<init>(r2)
            throw r1
    }
}
