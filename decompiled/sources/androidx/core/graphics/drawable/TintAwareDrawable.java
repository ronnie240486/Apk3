package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface TintAwareDrawable {
    void setTint(@androidx.annotation.ColorInt int r1);

    void setTintList(android.content.res.ColorStateList r1);

    void setTintMode(android.graphics.PorterDuff.Mode r1);
}
