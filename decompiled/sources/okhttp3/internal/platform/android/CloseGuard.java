package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: CloseGuard.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard;", "", "getMethod", "Ljava/lang/reflect/Method;", "openMethod", "warnIfOpenMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "createAndOpen", "closer", "", "warnIfOpen", "", "closeGuardInstance", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class CloseGuard {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.CloseGuard.Companion Companion = null;
    private final java.lang.reflect.Method getMethod;
    private final java.lang.reflect.Method openMethod;
    private final java.lang.reflect.Method warnIfOpenMethod;

    /* JADX INFO: compiled from: CloseGuard.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard$Companion;", "", "()V", "get", "Lokhttp3/internal/platform/android/CloseGuard;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.platform.android.CloseGuard get() {
                r7 = this;
                r0 = 0
                java.lang.String r1 = "dalvik.system.CloseGuard"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L29
                java.lang.String r2 = "get"
                r3 = 0
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L29
                java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L29
                java.lang.String r4 = "open"
                r5 = 1
                java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L29
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r5[r3] = r6     // Catch: java.lang.Exception -> L29
                java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.Exception -> L29
                java.lang.String r5 = "warnIfOpen"
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L29
                java.lang.reflect.Method r0 = r1.getMethod(r5, r3)     // Catch: java.lang.Exception -> L29
                r1 = r0
                r0 = r2
                goto L2b
            L29:
                r1 = r0
                r4 = r1
            L2b:
                okhttp3.internal.platform.android.CloseGuard r2 = new okhttp3.internal.platform.android.CloseGuard
                r2.<init>(r0, r4, r1)
                return r2
        }
    }

    static {
            okhttp3.internal.platform.android.CloseGuard$Companion r0 = new okhttp3.internal.platform.android.CloseGuard$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.CloseGuard.Companion = r0
            return
    }

    public CloseGuard(@org.jetbrains.annotations.Nullable java.lang.reflect.Method r1, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r2, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r3) {
            r0 = this;
            r0.<init>()
            r0.getMethod = r1
            r0.openMethod = r2
            r0.warnIfOpenMethod = r3
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object createAndOpen(@org.jetbrains.annotations.NotNull java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "closer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.reflect.Method r0 = r5.getMethod
            r1 = 0
            if (r0 == 0) goto L1f
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r3 = r5.openMethod     // Catch: java.lang.Exception -> L1f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Exception -> L1f
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L1f
            r4[r2] = r6     // Catch: java.lang.Exception -> L1f
            r3.invoke(r0, r4)     // Catch: java.lang.Exception -> L1f
            return r0
        L1f:
            return r1
    }

    public final boolean warnIfOpen(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto Le
            java.lang.reflect.Method r1 = r3.warnIfOpenMethod     // Catch: java.lang.Exception -> Le
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Exception -> Le
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Le
            r1.invoke(r4, r2)     // Catch: java.lang.Exception -> Le
            r0 = 1
        Le:
            return r0
    }
}
