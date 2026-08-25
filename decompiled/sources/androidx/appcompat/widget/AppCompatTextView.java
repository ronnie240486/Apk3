package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class AppCompatTextView extends android.widget.TextView implements androidx.core.view.TintableBackgroundView, androidx.core.widget.TintableCompoundDrawablesView, androidx.core.widget.AutoSizeableTextView, androidx.appcompat.widget.EmojiCompatConfigurationView {
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;

    @androidx.annotation.NonNull
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @androidx.annotation.Nullable
    private java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> mPrecomputedTextFuture;

    @androidx.annotation.Nullable
    private androidx.appcompat.widget.AppCompatTextView.SuperCaller mSuperCaller;
    private final androidx.appcompat.widget.AppCompatTextClassifierHelper mTextClassifierHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public interface SuperCaller {
        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        android.view.textclassifier.TextClassifier getTextClassifier();

        void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] r1, int r2);

        void setAutoSizeTextTypeWithDefaults(int r1);

        void setFirstBaselineToTopHeight(@androidx.annotation.Px int r1);

        void setLastBaselineToBottomHeight(@androidx.annotation.Px int r1);

        void setTextClassifier(@androidx.annotation.Nullable android.view.textclassifier.TextClassifier r1);
    }

    @androidx.annotation.RequiresApi(api = 26)
    public class SuperCallerApi26 implements androidx.appcompat.widget.AppCompatTextView.SuperCaller {
        public final /* synthetic */ androidx.appcompat.widget.AppCompatTextView this$0;

        public SuperCallerApi26(androidx.appcompat.widget.AppCompatTextView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeMaxTextSize() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int r0 = androidx.appcompat.widget.AppCompatTextView.access$001(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeMinTextSize() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int r0 = androidx.appcompat.widget.AppCompatTextView.access$101(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeStepGranularity() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int r0 = androidx.appcompat.widget.AppCompatTextView.access$201(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int[] getAutoSizeTextAvailableSizes() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int[] r0 = androidx.appcompat.widget.AppCompatTextView.access$301(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeTextType() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int r0 = androidx.appcompat.widget.AppCompatTextView.access$401(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public android.view.textclassifier.TextClassifier getTextClassifier() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                android.view.textclassifier.TextClassifier r0 = androidx.appcompat.widget.AppCompatTextView.access$501(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$601(r0, r2, r3, r4, r5)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$701(r0, r2, r3)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeWithDefaults(int r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$801(r0, r2)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setFirstBaselineToTopHeight(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLastBaselineToBottomHeight(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setTextClassifier(@androidx.annotation.Nullable android.view.textclassifier.TextClassifier r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$901(r0, r2)
                return
        }
    }

    @androidx.annotation.RequiresApi(api = 28)
    public class SuperCallerApi28 extends androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26 {
        public final /* synthetic */ androidx.appcompat.widget.AppCompatTextView this$0;

        public SuperCallerApi28(androidx.appcompat.widget.AppCompatTextView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setFirstBaselineToTopHeight(@androidx.annotation.Px int r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$1001(r0, r2)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLastBaselineToBottomHeight(@androidx.annotation.Px int r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$1101(r0, r2)
                return
        }
    }

    public AppCompatTextView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatTextView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatTextView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = androidx.appcompat.widget.TintContextWrapper.wrap(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mIsSetTypefaceProcessing = r1
            r1 = 0
            r0.mSuperCaller = r1
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r0, r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r1 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r1.<init>(r0)
            r0.mBackgroundTintHelper = r1
            r1.loadFromAttributes(r2, r3)
            androidx.appcompat.widget.AppCompatTextHelper r1 = new androidx.appcompat.widget.AppCompatTextHelper
            r1.<init>(r0)
            r0.mTextHelper = r1
            r1.loadFromAttributes(r2, r3)
            r1.applyCompoundDrawablesTints()
            androidx.appcompat.widget.AppCompatTextClassifierHelper r1 = new androidx.appcompat.widget.AppCompatTextClassifierHelper
            r1.<init>(r0)
            r0.mTextClassifierHelper = r1
            androidx.appcompat.widget.AppCompatEmojiTextHelper r1 = r0.getEmojiTextViewHelper()
            r1.loadFromAttributes(r2, r3)
            return
    }

    public static /* synthetic */ int access$001(androidx.appcompat.widget.AppCompatTextView r0) {
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
    }

    public static /* synthetic */ void access$1001(androidx.appcompat.widget.AppCompatTextView r0, int r1) {
            super.setFirstBaselineToTopHeight(r1)
            return
    }

    public static /* synthetic */ int access$101(androidx.appcompat.widget.AppCompatTextView r0) {
            int r0 = super.getAutoSizeMinTextSize()
            return r0
    }

    public static /* synthetic */ void access$1101(androidx.appcompat.widget.AppCompatTextView r0, int r1) {
            super.setLastBaselineToBottomHeight(r1)
            return
    }

    public static /* synthetic */ int access$201(androidx.appcompat.widget.AppCompatTextView r0) {
            int r0 = super.getAutoSizeStepGranularity()
            return r0
    }

    public static /* synthetic */ int[] access$301(androidx.appcompat.widget.AppCompatTextView r0) {
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
    }

    public static /* synthetic */ int access$401(androidx.appcompat.widget.AppCompatTextView r0) {
            int r0 = super.getAutoSizeTextType()
            return r0
    }

    public static /* synthetic */ android.view.textclassifier.TextClassifier access$501(androidx.appcompat.widget.AppCompatTextView r0) {
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public static /* synthetic */ void access$601(androidx.appcompat.widget.AppCompatTextView r0, int r1, int r2, int r3, int r4) {
            super.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void access$701(androidx.appcompat.widget.AppCompatTextView r0, int[] r1, int r2) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
            return
    }

    public static /* synthetic */ void access$801(androidx.appcompat.widget.AppCompatTextView r0, int r1) {
            super.setAutoSizeTextTypeWithDefaults(r1)
            return
    }

    public static /* synthetic */ void access$901(androidx.appcompat.widget.AppCompatTextView r0, android.view.textclassifier.TextClassifier r1) {
            super.setTextClassifier(r1)
            return
    }

    private void consumeTextFutureAndSetBlocking() {
            r2 = this;
            java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> r0 = r2.mPrecomputedTextFuture
            if (r0 == 0) goto L10
            r1 = 0
            r2.mPrecomputedTextFuture = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L10
            androidx.core.text.PrecomputedTextCompat r0 = (androidx.core.text.PrecomputedTextCompat) r0     // Catch: java.lang.Throwable -> L10
            androidx.core.widget.TextViewCompat.setPrecomputedText(r2, r0)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    @androidx.annotation.NonNull
    private androidx.appcompat.widget.AppCompatEmojiTextHelper getEmojiTextViewHelper() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mEmojiTextViewHelper
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = new androidx.appcompat.widget.AppCompatEmojiTextHelper
            r0.<init>(r1)
            r1.mEmojiTextViewHelper = r0
        Lb:
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mEmojiTextViewHelper
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.applySupportBackgroundTint()
        La:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L11
            r0.applyCompoundDrawablesTints()
        L11:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
        Ld:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L16
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
        Ld:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L16
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
        Ld:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L16
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
        Ld:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L16
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
        L16:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @android.annotation.SuppressLint({"WrongConstant"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
            r3 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            r1 = 0
            if (r0 == 0) goto L12
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r3.getSuperCaller()
            int r0 = r0.getAutoSizeTextType()
            r2 = 1
            if (r0 != r2) goto L11
            r1 = 1
        L11:
            return r1
        L12:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r3.mTextHelper
            if (r0 == 0) goto L1b
            int r0 = r0.getAutoSizeTextType()
            return r0
        L1b:
            return r1
    }

    @Override // android.widget.TextView
    @androidx.annotation.Nullable
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = androidx.core.widget.TextViewCompat.unwrapCustomSelectionActionModeCallback(r0)
            return r0
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r1 = this;
            int r0 = androidx.core.widget.TextViewCompat.getFirstBaselineToTopHeight(r1)
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r1 = this;
            int r0 = androidx.core.widget.TextViewCompat.getLastBaselineToBottomHeight(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(api = 26)
    @androidx.annotation.UiThread
    public androidx.appcompat.widget.AppCompatTextView.SuperCaller getSuperCaller() {
            r2 = this;
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.mSuperCaller
            if (r0 != 0) goto L1d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L12
            androidx.appcompat.widget.AppCompatTextView$SuperCallerApi28 r0 = new androidx.appcompat.widget.AppCompatTextView$SuperCallerApi28
            r0.<init>(r2)
            r2.mSuperCaller = r0
            goto L1d
        L12:
            r1 = 26
            if (r0 < r1) goto L1d
            androidx.appcompat.widget.AppCompatTextView$SuperCallerApi26 r0 = new androidx.appcompat.widget.AppCompatTextView$SuperCallerApi26
            r0.<init>(r2)
            r2.mSuperCaller = r0
        L1d:
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.mSuperCaller
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            android.content.res.ColorStateList r0 = r0.getCompoundDrawableTintList()
            return r0
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            android.graphics.PorterDuff$Mode r0 = r0.getCompoundDrawableTintMode()
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r1 = this;
            r1.consumeTextFutureAndSetBlocking()
            java.lang.CharSequence r0 = super.getText()
            return r0
    }

    @Override // android.widget.TextView
    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(api = 26)
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L10
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = r2.mTextClassifierHelper
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
            return r0
        L10:
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.text.PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
            r1 = this;
            androidx.core.text.PrecomputedTextCompat$Params r0 = androidx.core.widget.TextViewCompat.getTextMetricsParams(r1)
            return r0
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r4) {
            r3 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r3.mTextHelper
            java.util.Objects.requireNonNull(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L18
            if (r0 == 0) goto L18
            java.lang.CharSequence r1 = r3.getText()
            androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(r4, r1)
        L18:
            androidx.appcompat.widget.AppCompatHintHelper.onCreateInputConnection(r0, r4, r3)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto L11
            java.util.Objects.requireNonNull(r1)
            boolean r2 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r2 != 0) goto L11
            r1.autoSizeText()
        L11:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            r0.consumeTextFutureAndSetBlocking()
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto L13
            boolean r2 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r2 != 0) goto L13
            boolean r1 = r1.isAutoSizeEnabled()
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            if (r1 == 0) goto L1b
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            r1.autoSizeText()
        L1b:
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.setAllCaps(r2)
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L13
        Lc:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L13
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
        L13:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.NonNull int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            goto L13
        Lc:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L13
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
        L13:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            r0.setAutoSizeTextTypeWithDefaults(r2)
            goto L13
        Lc:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L13
            r0.setAutoSizeTextTypeWithDefaults(r2)
        L13:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r1 = r0.mBackgroundTintHelper
            if (r1 == 0) goto La
            r1.onSetBackgroundDrawable()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.onSetBackgroundResource(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.applyCompoundDrawablesTints()
        La:
            return
    }

    @Override // android.widget.TextView
    @androidx.annotation.RequiresApi(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.applyCompoundDrawablesTints()
        La:
            return
    }

    @Override // android.widget.TextView
    @androidx.annotation.RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            androidx.appcompat.widget.AppCompatTextHelper r3 = r2.mTextHelper
            if (r3 == 0) goto L2d
            r3.applyCompoundDrawablesTints()
        L2d:
            return
    }

    @Override // android.widget.TextView
    @androidx.annotation.RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.applyCompoundDrawablesTints()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            androidx.appcompat.widget.AppCompatTextHelper r3 = r2.mTextHelper
            if (r3 == 0) goto L2d
            r3.applyCompoundDrawablesTints()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.graphics.drawable.Drawable r3, @androidx.annotation.Nullable android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.applyCompoundDrawablesTints()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.Nullable android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.setEnabled(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.NonNull android.text.InputFilter[] r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.getFilters(r2)
            super.setFilters(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Px int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            r0.setFirstBaselineToTopHeight(r3)
            goto L11
        Le:
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r2, r3)
        L11:
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Px int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            r0.setLastBaselineToBottomHeight(r3)
            goto L11
        Le:
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r2, r3)
        L11:
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Px int r1) {
            r0 = this;
            androidx.core.widget.TextViewCompat.setLineHeight(r0, r1)
            return
    }

    public void setPrecomputedText(@androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat r1) {
            r0 = this;
            androidx.core.widget.TextViewCompat.setPrecomputedText(r0, r1)
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintList(r2)
        L7:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintMode(r2)
        L7:
            return
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setCompoundDrawableTintList(r2)
            androidx.appcompat.widget.AppCompatTextHelper r2 = r1.mTextHelper
            r2.applyCompoundDrawablesTints()
            return
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setCompoundDrawableTintMode(r2)
            androidx.appcompat.widget.AppCompatTextHelper r2 = r1.mTextHelper
            r2.applyCompoundDrawablesTints()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto La
            r0.onSetTextAppearance(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    @androidx.annotation.RequiresApi(api = 26)
    public void setTextClassifier(@androidx.annotation.Nullable android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Lf
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = r2.mTextClassifierHelper
            if (r0 != 0) goto Lb
            goto Lf
        Lb:
            r0.setTextClassifier(r3)
            return
        Lf:
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            r0.setTextClassifier(r3)
            return
    }

    public void setTextFuture(@androidx.annotation.Nullable java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> r1) {
            r0 = this;
            r0.mPrecomputedTextFuture = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(@androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r1) {
            r0 = this;
            androidx.core.widget.TextViewCompat.setTextMetricsParams(r0, r1)
            return
    }

    @Override // android.widget.TextView
    public void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L8
            super.setTextSize(r2, r3)
            goto Lf
        L8:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto Lf
            r0.setTextSize(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public void setTypeface(@androidx.annotation.Nullable android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.mIsSetTypefaceProcessing
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            if (r3 == 0) goto L12
            if (r4 <= 0) goto L12
            android.content.Context r0 = r2.getContext()
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.create(r0, r3, r4)
        L12:
            r1 = 1
            r2.mIsSetTypefaceProcessing = r1
            if (r0 == 0) goto L18
            r3 = r0
        L18:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L1f
            r2.mIsSetTypefaceProcessing = r0
            return
        L1f:
            r3 = move-exception
            r2.mIsSetTypefaceProcessing = r0
            throw r3
    }
}
