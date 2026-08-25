package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public interface TintableBackgroundView {
    @androidx.annotation.Nullable
    android.content.res.ColorStateList getSupportBackgroundTintList();

    @androidx.annotation.Nullable
    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1);

    void setSupportBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1);
}
