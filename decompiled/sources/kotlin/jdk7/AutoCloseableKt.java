package kotlin.jdk7;

/* JADX INFO: compiled from: AutoCloseable.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001aH\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0002\"\u0004\b\u0001\u0010\u0006*\u0002H\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"closeFinally", "", "Ljava/lang/AutoCloseable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 7, 1}, pn = "kotlin", xi = 48)
@kotlin.jvm.JvmName(name = "AutoCloseableKt")
public final class AutoCloseableKt {
    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.PublishedApi
    public static final void closeFinally(@org.jetbrains.annotations.Nullable java.lang.AutoCloseable r0, @org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            goto L10
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            goto L10
        Lc:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r1, r0)
        L10:
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final <T extends java.lang.AutoCloseable, R> R use(T r2, kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1 = 0
            closeFinally(r2, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r3
        L15:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            closeFinally(r2, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
    }
}
