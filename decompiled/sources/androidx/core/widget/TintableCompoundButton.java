package androidx.core.widget;

/* JADX INFO: loaded from: classes2.dex */
public interface TintableCompoundButton {
    @androidx.annotation.Nullable
    android.content.res.ColorStateList getSupportButtonTintList();

    @androidx.annotation.Nullable
    android.graphics.PorterDuff.Mode getSupportButtonTintMode();

    void setSupportButtonTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1);

    void setSupportButtonTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1);
}
