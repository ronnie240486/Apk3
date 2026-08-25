package androidx.emoji2.text;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class TypefaceEmojiSpan extends androidx.emoji2.text.EmojiSpan {

    @androidx.annotation.Nullable
    private static android.graphics.Paint sDebugPaint;

    public TypefaceEmojiSpan(@androidx.annotation.NonNull androidx.emoji2.text.EmojiMetadata r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.NonNull
    private static android.graphics.Paint getDebugPaint() {
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            if (r0 != 0) goto L1d
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint = r0
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.get()
            int r1 = r1.getEmojiSpanIndicatorColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
        L1d:
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            return r0
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r7, @android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r8, @androidx.annotation.IntRange(from = 0) int r9, @androidx.annotation.IntRange(from = 0) int r10, float r11, int r12, int r13, int r14, @androidx.annotation.NonNull android.graphics.Paint r15) {
            r6 = this;
            androidx.emoji2.text.EmojiCompat r8 = androidx.emoji2.text.EmojiCompat.get()
            boolean r8 = r8.isEmojiSpanIndicatorEnabled()
            if (r8 == 0) goto L1c
            float r2 = (float) r12
            int r8 = r6.getWidth()
            float r8 = (float) r8
            float r3 = r11 + r8
            float r4 = (float) r14
            android.graphics.Paint r5 = getDebugPaint()
            r0 = r7
            r1 = r11
            r0.drawRect(r1, r2, r3, r4, r5)
        L1c:
            androidx.emoji2.text.EmojiMetadata r8 = r6.getMetadata()
            float r9 = (float) r13
            r8.draw(r7, r11, r9, r15)
            return
    }
}
