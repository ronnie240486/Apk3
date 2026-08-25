package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class AppCompatDrawableManager {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final boolean DEBUG = false;
    private static final android.graphics.PorterDuff.Mode DEFAULT_MODE = null;
    private static androidx.appcompat.widget.AppCompatDrawableManager INSTANCE = null;
    private static final java.lang.String TAG = "AppCompatDrawableManag";
    private androidx.appcompat.widget.ResourceManagerInternal mResourceManager;


    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.appcompat.widget.AppCompatDrawableManager.DEFAULT_MODE = r0
            return
    }

    public AppCompatDrawableManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ android.graphics.PorterDuff.Mode access$000() {
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.DEFAULT_MODE
            return r0
    }

    public static synchronized androidx.appcompat.widget.AppCompatDrawableManager get() {
            java.lang.Class<androidx.appcompat.widget.AppCompatDrawableManager> r0 = androidx.appcompat.widget.AppCompatDrawableManager.class
            monitor-enter(r0)
            androidx.appcompat.widget.AppCompatDrawableManager r1 = androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto La
            preload()     // Catch: java.lang.Throwable -> Le
        La:
            androidx.appcompat.widget.AppCompatDrawableManager r1 = androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static synchronized android.graphics.PorterDuffColorFilter getPorterDuffColorFilter(int r1, android.graphics.PorterDuff.Mode r2) {
            java.lang.Class<androidx.appcompat.widget.AppCompatDrawableManager> r0 = androidx.appcompat.widget.AppCompatDrawableManager.class
            monitor-enter(r0)
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.ResourceManagerInternal.getPorterDuffColorFilter(r1, r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static synchronized void preload() {
            java.lang.Class<androidx.appcompat.widget.AppCompatDrawableManager> r0 = androidx.appcompat.widget.AppCompatDrawableManager.class
            monitor-enter(r0)
            androidx.appcompat.widget.AppCompatDrawableManager r1 = androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L20
            androidx.appcompat.widget.AppCompatDrawableManager r1 = new androidx.appcompat.widget.AppCompatDrawableManager     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE = r1     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.ResourceManagerInternal r2 = androidx.appcompat.widget.ResourceManagerInternal.get()     // Catch: java.lang.Throwable -> L22
            r1.mResourceManager = r2     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.AppCompatDrawableManager r1 = androidx.appcompat.widget.AppCompatDrawableManager.INSTANCE     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.ResourceManagerInternal r1 = r1.mResourceManager     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.AppCompatDrawableManager$1 r2 = new androidx.appcompat.widget.AppCompatDrawableManager$1     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            r1.setHooks(r2)     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r0)
            return
        L22:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.ResourceManagerInternal r0 = r1.mResourceManager     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized android.graphics.drawable.Drawable getDrawable$1(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.DrawableRes int r4) {
            r2 = this;
            monitor-enter(r2)
            androidx.appcompat.widget.ResourceManagerInternal r0 = r2.mResourceManager     // Catch: java.lang.Throwable -> La
            r1 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3, r4, r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return r3
        La:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized android.content.res.ColorStateList getTintList(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.DrawableRes int r3) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.ResourceManagerInternal r0 = r1.mResourceManager     // Catch: java.lang.Throwable -> L9
            android.content.res.ColorStateList r2 = r0.getTintList(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void onConfigurationChanged(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.ResourceManagerInternal r0 = r1.mResourceManager     // Catch: java.lang.Throwable -> L8
            r0.onConfigurationChanged(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
