package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
public final class EmojiTextViewHelper {
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal mHelper;

    /* JADX INFO: loaded from: classes2.dex */
    public static class HelperInternal {
        public HelperInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public android.text.InputFilter[] getFilters(@androidx.annotation.NonNull android.text.InputFilter[] r1) {
                r0 = this;
                return r1
        }

        public boolean isEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void setAllCaps(boolean r1) {
                r0 = this;
                return
        }

        public void setEnabled(boolean r1) {
                r0 = this;
                return
        }

        public void updateTransformationMethod() {
                r0 = this;
                return
        }

        @androidx.annotation.Nullable
        public android.text.method.TransformationMethod wrapTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r1) {
                r0 = this;
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(19)
    public static class HelperInternal19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiInputFilter mEmojiInputFilter;
        private boolean mEnabled;
        private final android.widget.TextView mTextView;

        public HelperInternal19(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                r1.mTextView = r2
                r0 = 1
                r1.mEnabled = r0
                androidx.emoji2.viewsintegration.EmojiInputFilter r0 = new androidx.emoji2.viewsintegration.EmojiInputFilter
                r0.<init>(r2)
                r1.mEmojiInputFilter = r0
                return
        }

        @androidx.annotation.NonNull
        private android.text.InputFilter[] addEmojiInputFilterIfMissing(@androidx.annotation.NonNull android.text.InputFilter[] r6) {
                r5 = this;
                int r0 = r6.length
                r1 = 0
                r2 = 0
            L3:
                if (r2 >= r0) goto Lf
                r3 = r6[r2]
                androidx.emoji2.viewsintegration.EmojiInputFilter r4 = r5.mEmojiInputFilter
                if (r3 != r4) goto Lc
                return r6
            Lc:
                int r2 = r2 + 1
                goto L3
            Lf:
                int r2 = r6.length
                int r2 = r2 + 1
                android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
                java.lang.System.arraycopy(r6, r1, r2, r1, r0)
                androidx.emoji2.viewsintegration.EmojiInputFilter r6 = r5.mEmojiInputFilter
                r2[r0] = r6
                return r2
        }

        private android.util.SparseArray<android.text.InputFilter> getEmojiInputFilterPositionArray(@androidx.annotation.NonNull android.text.InputFilter[] r4) {
                r3 = this;
                android.util.SparseArray r0 = new android.util.SparseArray
                r1 = 1
                r0.<init>(r1)
                r1 = 0
            L7:
                int r2 = r4.length
                if (r1 >= r2) goto L18
                r2 = r4[r1]
                boolean r2 = r2 instanceof androidx.emoji2.viewsintegration.EmojiInputFilter
                if (r2 == 0) goto L15
                r2 = r4[r1]
                r0.put(r1, r2)
            L15:
                int r1 = r1 + 1
                goto L7
            L18:
                return r0
        }

        @androidx.annotation.NonNull
        private android.text.InputFilter[] removeEmojiInputFilterIfPresent(@androidx.annotation.NonNull android.text.InputFilter[] r7) {
                r6 = this;
                android.util.SparseArray r0 = r6.getEmojiInputFilterPositionArray(r7)
                int r1 = r0.size()
                if (r1 != 0) goto Lb
                return r7
            Lb:
                int r1 = r7.length
                int r2 = r7.length
                int r3 = r0.size()
                int r2 = r2 - r3
                android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
                r3 = 0
                r4 = 0
            L16:
                if (r3 >= r1) goto L27
                int r5 = r0.indexOfKey(r3)
                if (r5 >= 0) goto L24
                r5 = r7[r3]
                r2[r4] = r5
                int r4 = r4 + 1
            L24:
                int r3 = r3 + 1
                goto L16
            L27:
                return r2
        }

        @androidx.annotation.Nullable
        private android.text.method.TransformationMethod unwrapForDisabled(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod
                if (r0 == 0) goto La
                androidx.emoji2.viewsintegration.EmojiTransformationMethod r2 = (androidx.emoji2.viewsintegration.EmojiTransformationMethod) r2
                android.text.method.TransformationMethod r2 = r2.getOriginalTransformationMethod()
            La:
                return r2
        }

        private void updateFilters() {
                r2 = this;
                android.widget.TextView r0 = r2.mTextView
                android.text.InputFilter[] r0 = r0.getFilters()
                android.widget.TextView r1 = r2.mTextView
                android.text.InputFilter[] r0 = r2.getFilters(r0)
                r1.setFilters(r0)
                return
        }

        @androidx.annotation.NonNull
        private android.text.method.TransformationMethod wrapForEnabled(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod
                if (r0 == 0) goto L5
                return r2
            L5:
                boolean r0 = r2 instanceof android.text.method.PasswordTransformationMethod
                if (r0 == 0) goto La
                return r2
            La:
                androidx.emoji2.viewsintegration.EmojiTransformationMethod r0 = new androidx.emoji2.viewsintegration.EmojiTransformationMethod
                r0.<init>(r2)
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @androidx.annotation.NonNull
        public final android.text.InputFilter[] getFilters(@androidx.annotation.NonNull android.text.InputFilter[] r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 != 0) goto L9
                android.text.InputFilter[] r2 = r1.removeEmojiInputFilterIfPresent(r2)
                return r2
            L9:
                android.text.InputFilter[] r2 = r1.addEmojiInputFilterIfMissing(r2)
                return r2
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
                r1 = this;
                boolean r0 = r1.mEnabled
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void setAllCaps(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                r0.updateTransformationMethod()
            L5:
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void setEnabled(boolean r1) {
                r0 = this;
                r0.mEnabled = r1
                r0.updateTransformationMethod()
                r0.updateFilters()
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public final void setEnabledUnsafe(boolean r1) {
                r0 = this;
                r0.mEnabled = r1
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void updateTransformationMethod() {
                r2 = this;
                android.widget.TextView r0 = r2.mTextView
                android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
                android.text.method.TransformationMethod r0 = r2.wrapTransformationMethod(r0)
                android.widget.TextView r1 = r2.mTextView
                r1.setTransformationMethod(r0)
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @androidx.annotation.Nullable
        public final android.text.method.TransformationMethod wrapTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L9
                android.text.method.TransformationMethod r2 = r1.wrapForEnabled(r2)
                return r2
            L9:
                android.text.method.TransformationMethod r2 = r1.unwrapForDisabled(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(19)
    public static class SkippingHelper19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19 mHelperDelegate;

        public SkippingHelper19(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19
                r0.<init>(r2)
                r1.mHelperDelegate = r0
                return
        }

        private boolean skipBecauseEmojiCompatNotInitialized() {
                r1 = this;
                boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()
                r0 = r0 ^ 1
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @androidx.annotation.NonNull
        public final android.text.InputFilter[] getFilters(@androidx.annotation.NonNull android.text.InputFilter[] r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return r2
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                android.text.InputFilter[] r2 = r0.getFilters(r2)
                return r2
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
                r1 = this;
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                boolean r0 = r0.isEnabled()
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void setAllCaps(boolean r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                java.util.Objects.requireNonNull(r0)
                if (r2 == 0) goto L11
                r0.updateTransformationMethod()
            L11:
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void setEnabled(boolean r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto Lc
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.setEnabledUnsafe(r2)
                goto L11
            Lc:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.setEnabled(r2)
            L11:
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void updateTransformationMethod() {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.updateTransformationMethod()
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @androidx.annotation.Nullable
        public final android.text.method.TransformationMethod wrapTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return r2
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                android.text.method.TransformationMethod r2 = r0.wrapTransformationMethod(r2)
                return r2
        }
    }

    public EmojiTextViewHelper(@androidx.annotation.NonNull android.widget.TextView r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public EmojiTextViewHelper(@androidx.annotation.NonNull android.widget.TextView r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "textView cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            if (r3 != 0) goto L13
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$SkippingHelper19 r3 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper$SkippingHelper19
            r3.<init>(r2)
            r1.mHelper = r3
            goto L1a
        L13:
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r3 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19
            r3.<init>(r2)
            r1.mHelper = r3
        L1a:
            return
    }

    @androidx.annotation.NonNull
    public android.text.InputFilter[] getFilters(@androidx.annotation.NonNull android.text.InputFilter[] r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            android.text.InputFilter[] r2 = r0.getFilters(r2)
            return r2
    }

    public boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    public void setAllCaps(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            r0.setAllCaps(r2)
            return
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            r0.setEnabled(r2)
            return
    }

    public void updateTransformationMethod() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            r0.updateTransformationMethod()
            return
    }

    @androidx.annotation.Nullable
    public android.text.method.TransformationMethod wrapTransformationMethod(@androidx.annotation.Nullable android.text.method.TransformationMethod r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            android.text.method.TransformationMethod r2 = r0.wrapTransformationMethod(r2)
            return r2
    }
}
