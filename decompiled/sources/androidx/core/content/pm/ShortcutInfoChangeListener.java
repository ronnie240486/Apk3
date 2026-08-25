package androidx.core.content.pm;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class ShortcutInfoChangeListener {
    public ShortcutInfoChangeListener() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.AnyThread
    public void onAllShortcutsRemoved() {
            r0 = this;
            return
    }

    @androidx.annotation.AnyThread
    public void onShortcutAdded(@androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r1) {
            r0 = this;
            return
    }

    @androidx.annotation.AnyThread
    public void onShortcutRemoved(@androidx.annotation.NonNull java.util.List<java.lang.String> r1) {
            r0 = this;
            return
    }

    @androidx.annotation.AnyThread
    public void onShortcutUpdated(@androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r1) {
            r0 = this;
            return
    }

    @androidx.annotation.AnyThread
    public void onShortcutUsageReported(@androidx.annotation.NonNull java.util.List<java.lang.String> r1) {
            r0 = this;
            return
    }
}
