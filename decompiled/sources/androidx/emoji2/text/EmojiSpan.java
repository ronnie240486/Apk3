package androidx.emoji2.text;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
public abstract class EmojiSpan extends android.text.style.ReplacementSpan {
    private short mHeight;

    @androidx.annotation.NonNull
    private final androidx.emoji2.text.EmojiMetadata mMetadata;
    private float mRatio;
    private final android.graphics.Paint.FontMetricsInt mTmpFontMetrics;
    private short mWidth;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public EmojiSpan(@androidx.annotation.NonNull androidx.emoji2.text.EmojiMetadata r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint$FontMetricsInt r0 = new android.graphics.Paint$FontMetricsInt
            r0.<init>()
            r1.mTmpFontMetrics = r0
            r0 = -1
            r1.mWidth = r0
            r1.mHeight = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mRatio = r0
            java.lang.String r0 = "metadata cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            r1.mMetadata = r2
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
    public final int getHeight() {
            r1 = this;
            short r0 = r1.mHeight
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
    public final int getId() {
            r1 = this;
            androidx.emoji2.text.EmojiMetadata r0 = r1.getMetadata()
            int r0 = r0.getId()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final androidx.emoji2.text.EmojiMetadata getMetadata() {
            r1 = this;
            androidx.emoji2.text.EmojiMetadata r0 = r1.mMetadata
            return r0
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@androidx.annotation.NonNull android.graphics.Paint r1, @android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r2, int r3, int r4, @androidx.annotation.Nullable android.graphics.Paint.FontMetricsInt r5) {
            r0 = this;
            android.graphics.Paint$FontMetricsInt r2 = r0.mTmpFontMetrics
            r1.getFontMetricsInt(r2)
            android.graphics.Paint$FontMetricsInt r1 = r0.mTmpFontMetrics
            int r2 = r1.descent
            int r1 = r1.ascent
            int r2 = r2 - r1
            int r1 = java.lang.Math.abs(r2)
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r2
            androidx.emoji2.text.EmojiMetadata r2 = r0.mMetadata
            short r2 = r2.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r0.mRatio = r1
            androidx.emoji2.text.EmojiMetadata r1 = r0.mMetadata
            short r1 = r1.getHeight()
            float r1 = (float) r1
            float r2 = r0.mRatio
            float r1 = r1 * r2
            int r1 = (int) r1
            short r1 = (short) r1
            r0.mHeight = r1
            androidx.emoji2.text.EmojiMetadata r1 = r0.mMetadata
            short r1 = r1.getWidth()
            float r1 = (float) r1
            float r2 = r0.mRatio
            float r1 = r1 * r2
            int r1 = (int) r1
            short r1 = (short) r1
            r0.mWidth = r1
            if (r5 == 0) goto L51
            android.graphics.Paint$FontMetricsInt r2 = r0.mTmpFontMetrics
            int r3 = r2.ascent
            r5.ascent = r3
            int r3 = r2.descent
            r5.descent = r3
            int r3 = r2.top
            r5.top = r3
            int r2 = r2.bottom
            r5.bottom = r2
        L51:
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public final int getWidth() {
            r1 = this;
            short r0 = r1.mWidth
            return r0
    }
}
