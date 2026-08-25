package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface TintableCheckedTextView {
    @androidx.annotation.Nullable
    android.content.res.ColorStateList getSupportCheckMarkTintList();

    @androidx.annotation.Nullable
    android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1);

    void setSupportCheckMarkTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1);
}
