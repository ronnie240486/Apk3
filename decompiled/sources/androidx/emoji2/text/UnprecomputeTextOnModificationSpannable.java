package androidx.emoji2.text;

/* JADX INFO: loaded from: classes2.dex */
class UnprecomputeTextOnModificationSpannable implements android.text.Spannable {

    @androidx.annotation.NonNull
    private android.text.Spannable mDelegate;
    private boolean mSafeToWrite;

    @androidx.annotation.RequiresApi(24)
    public static class CharSequenceHelper_API24 {
        private CharSequenceHelper_API24() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.util.stream.IntStream chars(java.lang.CharSequence r0) {
                java.util.stream.IntStream r0 = r0.chars()
                return r0
        }

        public static java.util.stream.IntStream codePoints(java.lang.CharSequence r0) {
                java.util.stream.IntStream r0 = r0.codePoints()
                return r0
        }
    }

    public static class PrecomputedTextDetector {
        public PrecomputedTextDetector() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean isPrecomputedText(java.lang.CharSequence r1) {
                r0 = this;
                boolean r1 = r1 instanceof androidx.core.text.PrecomputedTextCompat
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(28)
    public static class PrecomputedTextDetector_28 extends androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector {
        public PrecomputedTextDetector_28() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        public final boolean isPrecomputedText(java.lang.CharSequence r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.text.PrecomputedText
                if (r0 != 0) goto Lb
                boolean r2 = r2 instanceof androidx.core.text.PrecomputedTextCompat
                if (r2 == 0) goto L9
                goto Lb
            L9:
                r2 = 0
                goto Lc
            Lb:
                r2 = 1
            Lc:
                return r2
        }
    }

    public UnprecomputeTextOnModificationSpannable(@androidx.annotation.NonNull android.text.Spannable r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSafeToWrite = r0
            r1.mDelegate = r2
            return
    }

    public UnprecomputeTextOnModificationSpannable(@androidx.annotation.NonNull java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSafeToWrite = r0
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.mDelegate = r0
            return
    }

    private void ensureSafeWrites() {
            r3 = this;
            android.text.Spannable r0 = r3.mDelegate
            boolean r1 = r3.mSafeToWrite
            if (r1 != 0) goto L24
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 >= r2) goto L12
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector r1 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector
            r1.<init>()
            goto L17
        L12:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector_28 r1 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector_28
            r1.<init>()
        L17:
            boolean r1 = r1.isPrecomputedText(r0)
            if (r1 == 0) goto L24
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r3.mDelegate = r1
        L24:
            r0 = 1
            r3.mSafeToWrite = r0
            return
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // java.lang.CharSequence
    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(api = 24)
    public java.util.stream.IntStream chars() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.util.stream.IntStream r0 = androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.chars(r0)
            return r0
    }

    @Override // java.lang.CharSequence
    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(api = 24)
    public java.util.stream.IntStream codePoints() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.util.stream.IntStream r0 = androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.codePoints(r0)
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r2 = r0.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r2 = r0.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r2 = r0.getSpanStart(r2)
            return r2
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r2, int r3, java.lang.Class<T> r4) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.lang.Object[] r2 = r0.getSpans(r2, r3, r4)
            return r2
    }

    public final android.text.Spannable getUnwrappedSpannable() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            return r0
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            int r2 = r0.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r2) {
            r1 = this;
            r1.ensureSafeWrites()
            android.text.Spannable r0 = r1.mDelegate
            r0.removeSpan(r2)
            return
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            r1.ensureSafeWrites()
            android.text.Spannable r0 = r1.mDelegate
            r0.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // java.lang.CharSequence
    @androidx.annotation.NonNull
    public java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.mDelegate
            java.lang.String r0 = r0.toString()
            return r0
    }
}
