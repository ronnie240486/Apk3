package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface TintableImageSourceView {
    @androidx.annotation.Nullable
    android.content.res.ColorStateList getSupportImageTintList();

    @androidx.annotation.Nullable
    android.graphics.PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1);

    void setSupportImageTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1);
}
