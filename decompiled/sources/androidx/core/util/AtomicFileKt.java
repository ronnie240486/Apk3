package androidx.core.util;

/* JADX INFO: compiled from: AtomicFile.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a3\u0010\u0007\u001a\u00020\b*\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000\u001a\u0014\u0010\u000f\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0011\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"readBytes", "", "Landroid/util/AtomicFile;", "readText", "", "charset", "Ljava/nio/charset/Charset;", "tryWrite", "", "block", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", "name", "out", "writeBytes", "array", "writeText", "text", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@android.annotation.SuppressLint({"ClassVerificationFailure"})
public final class AtomicFileKt {
    @androidx.annotation.RequiresApi(17)
    @org.jetbrains.annotations.NotNull
    public static final byte[] readBytes(@org.jetbrains.annotations.NotNull android.util.AtomicFile r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.readFully()
            java.lang.String r0 = "readFully()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(17)
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String readText(@org.jetbrains.annotations.NotNull android.util.AtomicFile r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r1 = r1.readFully()
            java.lang.String r0 = "readFully()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String readText$default(android.util.AtomicFile r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r0 = readText(r0, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(17)
    public static final void tryWrite(@org.jetbrains.annotations.NotNull android.util.AtomicFile r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.FileOutputStream, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.FileOutputStream r0 = r3.startWrite()
            r1 = 1
            java.lang.String r2 = "stream"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Throwable -> L22
            r4.invoke(r0)     // Catch: java.lang.Throwable -> L22
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r3.finishWrite(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return
        L22:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r3.failWrite(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r4
    }

    @androidx.annotation.RequiresApi(17)
    public static final void writeBytes(@org.jetbrains.annotations.NotNull android.util.AtomicFile r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.FileOutputStream r0 = r2.startWrite()
            java.lang.String r1 = "stream"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L1b
            r0.write(r3)     // Catch: java.lang.Throwable -> L1b
            r2.finishWrite(r0)
            return
        L1b:
            r3 = move-exception
            r2.failWrite(r0)
            throw r3
    }

    @androidx.annotation.RequiresApi(17)
    public static final void writeText(@org.jetbrains.annotations.NotNull android.util.AtomicFile r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            writeBytes(r1, r2)
            return
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            writeText(r0, r1, r2)
            return
    }
}
