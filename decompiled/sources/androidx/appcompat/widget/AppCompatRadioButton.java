package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class AppCompatRadioButton extends android.widget.RadioButton implements androidx.core.widget.TintableCompoundButton, androidx.core.view.TintableBackgroundView, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.appcompat.widget.AppCompatCompoundButtonHelper mCompoundButtonHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public AppCompatRadioButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatRadioButton(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.radioButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatRadioButton(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = androidx.appcompat.widget.TintContextWrapper.wrap(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r0, r1)
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r1 = new androidx.appcompat.widget.AppCompatCompoundButtonHelper
            r1.<init>(r0)
            r0.mCompoundButtonHelper = r1
            r1.loadFromAttributes(r2, r3)
            androidx.appcompat.widget.AppCompatBackgroundHelper r1 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r1.<init>(r0)
            r0.mBackgroundTintHelper = r1
            r1.loadFromAttributes(r2, r3)
            androidx.appcompat.widget.AppCompatTextHelper r1 = new androidx.appcompat.widget.AppCompatTextHelper
            r1.<init>(r0)
            r0.mTextHelper = r1
            r1.loadFromAttributes(r2, r3)
            androidx.appcompat.widget.AppCompatEmojiTextHelper r1 = r0.getEmojiTextViewHelper()
            r1.loadFromAttributes(r2, r3)
            return
    }

    @androidx.annotation.NonNull
    private androidx.appcompat.widget.AppCompatEmojiTextHelper getEmojiTextViewHelper() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mAppCompatEmojiTextHelper
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = new androidx.appcompat.widget.AppCompatEmojiTextHelper
            r0.<init>(r1)
            r1.mAppCompatEmojiTextHelper = r0
        Lb:
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mAppCompatEmojiTextHelper
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r2 = this;
            int r0 = super.getCompoundPaddingLeft()
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r1 = r2.mCompoundButtonHelper
            if (r1 == 0) goto Lb
            java.util.Objects.requireNonNull(r1)
        Lb:
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

    @Override // androidx.core.widget.TintableCompoundButton
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.content.res.ColorStateList getSupportButtonTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getSupportButtonTintList()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.getSupportButtonTintMode()
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

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.setAllCaps(r2)
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setButtonDrawable(r1)
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r1 = r0.mCompoundButtonHelper
            if (r1 == 0) goto La
            r1.onSetButtonDrawable()
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

    @Override // androidx.core.widget.TintableCompoundButton
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L7
            r0.setSupportButtonTintList(r2)
        L7:
            return
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L7
            r0.setSupportButtonTintMode(r2)
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
}
