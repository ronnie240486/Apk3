package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.AnyThread
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class DefaultGlyphChecker implements androidx.emoji2.text.EmojiCompat.GlyphChecker {
    private static final int PAINT_TEXT_SIZE = 10;
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> sStringBuilder = null;
    private final android.text.TextPaint mTextPaint;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.emoji2.text.DefaultGlyphChecker.sStringBuilder = r0
            return
    }

    public DefaultGlyphChecker() {
            r2 = this;
            r2.<init>()
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r2.mTextPaint = r0
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            return
    }

    private static java.lang.StringBuilder getStringBuilder() {
            java.lang.ThreadLocal<java.lang.StringBuilder> r0 = androidx.emoji2.text.DefaultGlyphChecker.sStringBuilder
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0.set(r1)
        L10:
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            return r0
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(@androidx.annotation.NonNull java.lang.CharSequence r4, int r5, int r6, int r7) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 >= r2) goto La
            if (r7 <= r0) goto La
            return r1
        La:
            java.lang.StringBuilder r7 = getStringBuilder()
            r7.setLength(r1)
        L11:
            if (r5 >= r6) goto L1d
            char r0 = r4.charAt(r5)
            r7.append(r0)
            int r5 = r5 + 1
            goto L11
        L1d:
            android.text.TextPaint r4 = r3.mTextPaint
            java.lang.String r5 = r7.toString()
            boolean r4 = androidx.core.graphics.PaintCompat.hasGlyph(r4, r5)
            return r4
    }
}
