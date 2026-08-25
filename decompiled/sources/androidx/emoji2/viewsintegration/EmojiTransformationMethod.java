package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class EmojiTransformationMethod implements android.text.method.TransformationMethod {

    @androidx.annotation.Nullable
    private final android.text.method.TransformationMethod mTransformationMethod;

    public EmojiTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r1) {
            r0 = this;
            r0.<init>()
            r0.mTransformationMethod = r1
            return
    }

    public android.text.method.TransformationMethod getOriginalTransformationMethod() {
            r1 = this;
            android.text.method.TransformationMethod r0 = r1.mTransformationMethod
            return r0
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(@androidx.annotation.Nullable java.lang.CharSequence r2, @androidx.annotation.NonNull android.view.View r3) {
            r1 = this;
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L7
            return r2
        L7:
            android.text.method.TransformationMethod r0 = r1.mTransformationMethod
            if (r0 == 0) goto Lf
            java.lang.CharSequence r2 = r0.getTransformation(r2, r3)
        Lf:
            if (r2 == 0) goto L25
            androidx.emoji2.text.EmojiCompat r3 = androidx.emoji2.text.EmojiCompat.get()
            int r3 = r3.getLoadState()
            r0 = 1
            if (r3 == r0) goto L1d
            goto L25
        L1d:
            androidx.emoji2.text.EmojiCompat r3 = androidx.emoji2.text.EmojiCompat.get()
            java.lang.CharSequence r2 = r3.process(r2)
        L25:
            return r2
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View r7, java.lang.CharSequence r8, boolean r9, int r10, android.graphics.Rect r11) {
            r6 = this;
            android.text.method.TransformationMethod r0 = r6.mTransformationMethod
            if (r0 == 0) goto Lc
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onFocusChanged(r1, r2, r3, r4, r5)
        Lc:
            return
    }
}
