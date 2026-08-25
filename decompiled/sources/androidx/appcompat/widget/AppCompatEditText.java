package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class AppCompatEditText extends android.widget.EditText implements androidx.core.view.TintableBackgroundView, androidx.core.view.OnReceiveContentViewBehavior, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {

    @androidx.annotation.NonNull
    private final androidx.appcompat.widget.AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.core.widget.TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;

    @androidx.annotation.Nullable
    private androidx.appcompat.widget.AppCompatEditText.SuperCaller mSuperCaller;
    private final androidx.appcompat.widget.AppCompatTextClassifierHelper mTextClassifierHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(api = 26)
    public class SuperCaller {
        public final /* synthetic */ androidx.appcompat.widget.AppCompatEditText this$0;

        public SuperCaller(androidx.appcompat.widget.AppCompatEditText r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public android.view.textclassifier.TextClassifier getTextClassifier() {
                r1 = this;
                androidx.appcompat.widget.AppCompatEditText r0 = r1.this$0
                android.view.textclassifier.TextClassifier r0 = androidx.appcompat.widget.AppCompatEditText.access$001(r0)
                return r0
        }

        public void setTextClassifier(android.view.textclassifier.TextClassifier r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatEditText r0 = r1.this$0
                androidx.appcompat.widget.AppCompatEditText.access$101(r0, r2)
                return
        }
    }

    public AppCompatEditText(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatEditText(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.editTextStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatEditText(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5, int r6) {
            r3 = this;
            android.content.Context r4 = androidx.appcompat.widget.TintContextWrapper.wrap(r4)
            r3.<init>(r4, r5, r6)
            android.content.Context r4 = r3.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r3, r4)
            androidx.appcompat.widget.AppCompatBackgroundHelper r4 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r4.<init>(r3)
            r3.mBackgroundTintHelper = r4
            r4.loadFromAttributes(r5, r6)
            androidx.appcompat.widget.AppCompatTextHelper r4 = new androidx.appcompat.widget.AppCompatTextHelper
            r4.<init>(r3)
            r3.mTextHelper = r4
            r4.loadFromAttributes(r5, r6)
            r4.applyCompoundDrawablesTints()
            androidx.appcompat.widget.AppCompatTextClassifierHelper r4 = new androidx.appcompat.widget.AppCompatTextClassifierHelper
            r4.<init>(r3)
            r3.mTextClassifierHelper = r4
            androidx.core.widget.TextViewOnReceiveContentListener r4 = new androidx.core.widget.TextViewOnReceiveContentListener
            r4.<init>()
            r3.mDefaultOnReceiveContentListener = r4
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r4 = new androidx.appcompat.widget.AppCompatEmojiEditTextHelper
            r4.<init>(r3)
            r3.mAppCompatEmojiEditTextHelper = r4
            r4.loadFromAttributes(r5, r6)
            android.text.method.KeyListener r5 = r3.getKeyListener()
            java.util.Objects.requireNonNull(r4)
            boolean r6 = r5 instanceof android.text.method.NumberKeyListener
            r6 = r6 ^ 1
            if (r6 == 0) goto L70
            boolean r6 = super.isFocusable()
            boolean r0 = super.isClickable()
            boolean r1 = super.isLongClickable()
            int r2 = super.getInputType()
            android.text.method.KeyListener r4 = r4.getKeyListener(r5)
            if (r4 != r5) goto L61
            goto L70
        L61:
            super.setKeyListener(r4)
            super.setRawInputType(r2)
            super.setFocusable(r6)
            super.setClickable(r0)
            super.setLongClickable(r1)
        L70:
            return
    }

    public static /* synthetic */ android.view.textclassifier.TextClassifier access$001(androidx.appcompat.widget.AppCompatEditText r0) {
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public static /* synthetic */ void access$101(androidx.appcompat.widget.AppCompatEditText r0, android.view.textclassifier.TextClassifier r1) {
            super.setTextClassifier(r1)
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(26)
    @androidx.annotation.UiThread
    private androidx.appcompat.widget.AppCompatEditText.SuperCaller getSuperCaller() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = r1.mSuperCaller
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = new androidx.appcompat.widget.AppCompatEditText$SuperCaller
            r0.<init>(r1)
            r1.mSuperCaller = r0
        Lb:
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = r1.mSuperCaller
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

    @Override // android.widget.TextView
    @androidx.annotation.Nullable
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = androidx.core.widget.TextViewCompat.unwrapCustomSelectionActionModeCallback(r0)
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

    @Override // android.widget.EditText, android.widget.TextView
    @androidx.annotation.Nullable
    public android.text.Editable getText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.text.Editable r0 = super.getText()
            return r0
        Lb:
            android.text.Editable r0 = super.getEditableText()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
            r1 = this;
            android.text.Editable r0 = r1.getText()
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
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
            return r0
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.Nullable
    public android.view.inputmethod.InputConnection onCreateInputConnection(@androidx.annotation.NonNull android.view.inputmethod.EditorInfo r5) {
            r4 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r5)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r4.mTextHelper
            java.util.Objects.requireNonNull(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L18
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r4.getText()
            androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(r5, r3)
        L18:
            androidx.appcompat.widget.AppCompatHintHelper.onCreateInputConnection(r0, r5, r4)
            if (r0 == 0) goto L2c
            if (r1 > r2) goto L2c
            java.lang.String[] r1 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r4)
            if (r1 == 0) goto L2c
            androidx.core.view.inputmethod.EditorInfoCompat.setContentMimeTypes(r5, r1)
            android.view.inputmethod.InputConnection r0 = androidx.core.view.inputmethod.InputConnectionCompat.createWrapper(r4, r0, r5)
        L2c:
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r1 = r4.mAppCompatEmojiEditTextHelper
            android.view.inputmethod.InputConnection r5 = r1.onCreateInputConnection(r0, r5)
            return r5
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 1
            r3 = 0
            if (r0 >= r1) goto L5b
            r1 = 24
            if (r0 < r1) goto L5b
            java.lang.Object r0 = r6.getLocalState()
            if (r0 != 0) goto L5b
            java.lang.String[] r0 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r5)
            if (r0 != 0) goto L19
            goto L5b
        L19:
            android.content.Context r0 = r5.getContext()
        L1d:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L2f
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L28
            android.app.Activity r0 = (android.app.Activity) r0
            goto L30
        L28:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L1d
        L2f:
            r0 = 0
        L30:
            if (r0 != 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't handle drop: no activity: view="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ReceiveContent"
            android.util.Log.i(r1, r0)
            goto L5b
        L49:
            int r1 = r6.getAction()
            if (r1 != r2) goto L50
            goto L5b
        L50:
            int r1 = r6.getAction()
            r4 = 3
            if (r1 != r4) goto L5b
            boolean r3 = androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.onDropForTextView(r6, r5, r0)
        L5b:
            if (r3 == 0) goto L5e
            return r2
        L5e:
            boolean r6 = super.onDragEvent(r6)
            return r6
    }

    @Override // androidx.core.view.OnReceiveContentViewBehavior
    @androidx.annotation.Nullable
    public androidx.core.view.ContentInfoCompat onReceiveContent(@androidx.annotation.NonNull androidx.core.view.ContentInfoCompat r2) {
            r1 = this;
            androidx.core.widget.TextViewOnReceiveContentListener r0 = r1.mDefaultOnReceiveContentListener
            androidx.core.view.ContentInfoCompat r2 = r0.onReceiveContent(r1, r2)
            return r2
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 31
            r3 = 1
            if (r0 >= r2) goto L4a
            java.lang.String[] r0 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r5)
            if (r0 == 0) goto L4a
            r0 = 16908322(0x1020022, float:2.3877324E-38)
            if (r6 == r0) goto L19
            r2 = 16908337(0x1020031, float:2.3877366E-38)
            if (r6 == r2) goto L19
            goto L4a
        L19:
            android.content.Context r2 = r5.getContext()
            java.lang.String r4 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r4)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            if (r2 != 0) goto L29
            r2 = 0
            goto L2d
        L29:
            android.content.ClipData r2 = r2.getPrimaryClip()
        L2d:
            if (r2 == 0) goto L49
            int r4 = r2.getItemCount()
            if (r4 <= 0) goto L49
            androidx.core.view.ContentInfoCompat$Builder r4 = new androidx.core.view.ContentInfoCompat$Builder
            r4.<init>(r2, r3)
            if (r6 != r0) goto L3d
            goto L3e
        L3d:
            r1 = 1
        L3e:
            androidx.core.view.ContentInfoCompat$Builder r0 = r4.setFlags(r1)
            androidx.core.view.ContentInfoCompat r0 = r0.build()
            androidx.core.view.ViewCompat.performReceiveContent(r5, r0)
        L49:
            r1 = 1
        L4a:
            if (r1 == 0) goto L4d
            return r3
        L4d:
            boolean r6 = super.onTextContextMenuItem(r6)
            return r6
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
    public void setCustomSelectionActionModeCallback(@androidx.annotation.Nullable android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            r0.setEnabled(r2)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(@androidx.annotation.Nullable android.text.method.KeyListener r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            android.text.method.KeyListener r2 = r0.getKeyListener(r2)
            super.setKeyListener(r2)
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
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = r2.getSuperCaller()
            r0.setTextClassifier(r3)
            return
    }
}
