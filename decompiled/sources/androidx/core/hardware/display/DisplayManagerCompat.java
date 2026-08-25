package androidx.core.hardware.display;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayManagerCompat {
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final java.util.WeakHashMap<android.content.Context, androidx.core.hardware.display.DisplayManagerCompat> sInstances = null;
    private final android.content.Context mContext;

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(17)
    public static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.Display getDisplay(android.hardware.display.DisplayManager r0, int r1) {
                android.view.Display r0 = r0.getDisplay(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.Display[] getDisplays(android.hardware.display.DisplayManager r0) {
                android.view.Display[] r0 = r0.getDisplays()
                return r0
        }
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.hardware.display.DisplayManagerCompat.sInstances = r0
            return
    }

    private DisplayManagerCompat(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(@androidx.annotation.NonNull android.content.Context r2) {
            java.util.WeakHashMap<android.content.Context, androidx.core.hardware.display.DisplayManagerCompat> r0 = androidx.core.hardware.display.DisplayManagerCompat.sInstances
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            androidx.core.hardware.display.DisplayManagerCompat r1 = (androidx.core.hardware.display.DisplayManagerCompat) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L13
            androidx.core.hardware.display.DisplayManagerCompat r1 = new androidx.core.hardware.display.DisplayManagerCompat     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    @androidx.annotation.Nullable
    public android.view.Display getDisplay(int r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display r3 = androidx.core.hardware.display.DisplayManagerCompat.Api17Impl.getDisplay(r0, r3)
            return r3
    }

    @androidx.annotation.NonNull
    public android.view.Display[] getDisplays() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r0 = androidx.core.hardware.display.DisplayManagerCompat.Api17Impl.getDisplays(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.Display[] getDisplays(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            android.content.Context r2 = r1.mContext
            java.lang.String r0 = "display"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            android.view.Display[] r2 = androidx.core.hardware.display.DisplayManagerCompat.Api17Impl.getDisplays(r2)
            return r2
    }
}
