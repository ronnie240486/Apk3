package okhttp3.internal.graal;

/* JADX INFO: compiled from: svm.kt */
/* JADX INFO: loaded from: classes.dex */
@com.oracle.svm.core.annotate.TargetClass(okhttp3.internal.platform.Platform.Companion.class)
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/graal/TargetPlatform;", "", "()V", "findPlatform", "Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class TargetPlatform {
    public TargetPlatform() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.oracle.svm.core.annotate.Substitute
    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.platform.Platform findPlatform() {
            r1 = this;
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = okhttp3.internal.platform.Jdk9Platform.Companion
            okhttp3.internal.platform.Jdk9Platform r0 = r0.buildIfSupported()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }
}
