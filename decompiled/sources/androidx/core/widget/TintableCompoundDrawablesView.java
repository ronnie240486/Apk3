package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public interface TintableCompoundDrawablesView {
    @androidx.annotation.Nullable
    android.content.res.ColorStateList getSupportCompoundDrawablesTintList();

    @androidx.annotation.Nullable
    android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1);

    void setSupportCompoundDrawablesTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1);
}
