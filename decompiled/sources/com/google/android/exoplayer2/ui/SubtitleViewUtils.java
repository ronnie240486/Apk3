package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
final class SubtitleViewUtils {
    public static /* synthetic */ boolean $r8$lambda$LbedgCfvSqXwio51KdlA1lAn7hw(java.lang.Object r0) {
            boolean r0 = lambda$removeAllEmbeddedStyling$0(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$UlObj1m5t-7ZSHAelfFzlpAicyU, reason: not valid java name */
    public static /* synthetic */ boolean m269$r8$lambda$UlObj1m5t7ZSHAelfFzlpAicyU(java.lang.Object r0) {
            boolean r0 = lambda$removeEmbeddedFontSizes$1(r0)
            return r0
    }

    private SubtitleViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ boolean lambda$removeAllEmbeddedStyling$0(java.lang.Object r0) {
            boolean r0 = r0 instanceof com.google.android.exoplayer2.text.span.LanguageFeatureSpan
            r0 = r0 ^ 1
            return r0
    }

    private static /* synthetic */ boolean lambda$removeEmbeddedFontSizes$1(java.lang.Object r1) {
            boolean r0 = r1 instanceof android.text.style.AbsoluteSizeSpan
            if (r0 != 0) goto Lb
            boolean r1 = r1 instanceof android.text.style.RelativeSizeSpan
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    public static void removeAllEmbeddedStyling(com.google.android.exoplayer2.text.Cue.Builder r2) {
            r2.clearWindowColor()
            java.lang.CharSequence r0 = r2.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L2d
            java.lang.CharSequence r0 = r2.getText()
            boolean r0 = r0 instanceof android.text.Spannable
            if (r0 != 0) goto L1e
            java.lang.CharSequence r0 = r2.getText()
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            r2.setText(r0)
        L1e:
            java.lang.CharSequence r0 = r2.getText()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.text.Spannable r0 = (android.text.Spannable) r0
            com.google.android.exoplayer2.ui.SubtitleViewUtils$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.ui.SubtitleViewUtils$$ExternalSyntheticLambda0.INSTANCE$1
            removeSpansIf(r0, r1)
        L2d:
            removeEmbeddedFontSizes(r2)
            return
    }

    public static void removeEmbeddedFontSizes(com.google.android.exoplayer2.text.Cue.Builder r2) {
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.setTextSize(r0, r1)
            java.lang.CharSequence r0 = r2.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L32
            java.lang.CharSequence r0 = r2.getText()
            boolean r0 = r0 instanceof android.text.Spannable
            if (r0 != 0) goto L23
            java.lang.CharSequence r0 = r2.getText()
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            r2.setText(r0)
        L23:
            java.lang.CharSequence r2 = r2.getText()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            android.text.Spannable r2 = (android.text.Spannable) r2
            com.google.android.exoplayer2.ui.SubtitleViewUtils$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.ui.SubtitleViewUtils$$ExternalSyntheticLambda0.INSTANCE
            removeSpansIf(r2, r0)
        L32:
            return
    }

    private static void removeSpansIf(android.text.Spannable r5, com.google.common.base.Predicate<java.lang.Object> r6) {
            int r0 = r5.length()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            java.lang.Object[] r0 = r5.getSpans(r2, r0, r1)
            int r1 = r0.length
        Lc:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            boolean r4 = r6.apply(r3)
            if (r4 == 0) goto L19
            r5.removeSpan(r3)
        L19:
            int r2 = r2 + 1
            goto Lc
        L1c:
            return
    }

    public static float resolveTextSize(int r2, float r3, int r4, int r5) {
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L8
            return r0
        L8:
            if (r2 == 0) goto L16
            r5 = 1
            if (r2 == r5) goto L12
            r4 = 2
            if (r2 == r4) goto L11
            return r0
        L11:
            return r3
        L12:
            float r2 = (float) r4
        L13:
            float r3 = r3 * r2
            return r3
        L16:
            float r2 = (float) r5
            goto L13
    }
}
