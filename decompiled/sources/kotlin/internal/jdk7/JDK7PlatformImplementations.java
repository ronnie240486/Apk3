package kotlin.internal.jdk7;

/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", "exception", "getSuppressed", "", "sdkIsNullOrAtLeast", "", "version", "", "ReflectSdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class JDK7PlatformImplementations extends kotlin.internal.PlatformImplementations {

    /* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", "", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ReflectSdkVersion {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion INSTANCE = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public static final java.lang.Integer sdkVersion = null;

        static {
                kotlin.internal.jdk7.JDK7PlatformImplementations$ReflectSdkVersion r0 = new kotlin.internal.jdk7.JDK7PlatformImplementations$ReflectSdkVersion
                r0.<init>()
                kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.INSTANCE = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion = r0
                return
        }

        private ReflectSdkVersion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public JDK7PlatformImplementations() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean sdkIsNullOrAtLeast(int r2) {
            r1 = this;
            java.lang.Integer r0 = kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion
            if (r0 == 0) goto Ld
            int r0 = r0.intValue()
            if (r0 < r2) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    @Override // kotlin.internal.PlatformImplementations
    public void addSuppressed(@org.jetbrains.annotations.NotNull java.lang.Throwable r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 19
            boolean r0 = r1.sdkIsNullOrAtLeast(r0)
            if (r0 == 0) goto L16
            r2.addSuppressed(r3)
            goto L19
        L16:
            super.addSuppressed(r2, r3)
        L19:
            return
    }

    @Override // kotlin.internal.PlatformImplementations
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Throwable> getSuppressed(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 19
            boolean r0 = r1.sdkIsNullOrAtLeast(r0)
            if (r0 == 0) goto L1b
            java.lang.Throwable[] r2 = r2.getSuppressed()
            java.lang.String r0 = "exception.suppressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.util.List r2 = kotlin.collections.ArraysKt.asList(r2)
            goto L1f
        L1b:
            java.util.List r2 = super.getSuppressed(r2)
        L1f:
            return r2
    }
}
