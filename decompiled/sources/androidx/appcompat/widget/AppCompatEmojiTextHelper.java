package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
class AppCompatEmojiTextHelper {

    @androidx.annotation.NonNull
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper mEmojiTextViewHelper;

    @androidx.annotation.NonNull
    private final android.widget.TextView mView;

    public AppCompatEmojiTextHelper(@androidx.annotation.NonNull android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r2.mView = r3
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper
            r1 = 0
            r0.<init>(r3, r1)
            r2.mEmojiTextViewHelper = r0
            return
    }

    @androidx.annotation.NonNull
    public final android.text.InputFilter[] getFilters(@androidx.annotation.NonNull android.text.InputFilter[] r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            android.text.InputFilter[] r2 = r0.getFilters(r2)
            return r2
    }

    public boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    public final void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.TextView r0 = r3.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled     // Catch: java.lang.Throwable -> L21
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L21
            r1 = 1
            if (r0 == 0) goto L1a
            boolean r1 = r4.getBoolean(r5, r1)     // Catch: java.lang.Throwable -> L21
        L1a:
            r4.recycle()
            r3.setEnabled(r1)
            return
        L21:
            r5 = move-exception
            r4.recycle()
            throw r5
    }

    public final void setAllCaps(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            r0.setAllCaps(r2)
            return
    }

    public final void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            r0.setEnabled(r2)
            return
    }

    @androidx.annotation.Nullable
    public android.text.method.TransformationMethod wrapTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            android.text.method.TransformationMethod r2 = r0.wrapTransformationMethod(r2)
            return r2
    }
}
