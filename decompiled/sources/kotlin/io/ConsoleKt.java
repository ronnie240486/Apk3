package kotlin.io;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\t\u0010\r\u001a\u00020\u0001H\u0087\b\u001a\u0013\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\b\u0010\u0010\u001a\u00020\u000fH\u0007\u001a\n\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0012"}, d2 = {"print", "", "message", "", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "readln", "readlnOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "ConsoleKt")
public final class ConsoleKt {
    @kotlin.internal.InlineOnly
    private static final void print(byte r1) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void print(char r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void print(double r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void print(float r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void print(int r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void print(long r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void print(java.lang.Object r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void print(short r1) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void print(boolean r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void print(char[] r1) {
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println() {
            java.io.PrintStream r0 = java.lang.System.out
            r0.println()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(byte r1) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r0.println(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(char r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(double r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(float r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(int r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(long r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(java.lang.Object r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(short r1) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r0.println(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(boolean r1) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void println(char[] r1) {
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String readLine() {
            kotlin.io.LineReader r0 = kotlin.io.LineReader.INSTANCE
            java.io.InputStream r1 = java.lang.System.in
            java.lang.String r2 = "`in`"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r3 = "defaultCharset()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r0 = r0.readLine(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String readln() {
            java.lang.String r0 = readlnOrNull()
            if (r0 == 0) goto L7
            return r0
        L7:
            kotlin.io.ReadAfterEOFException r0 = new kotlin.io.ReadAfterEOFException
            java.lang.String r1 = "EOF has already been reached"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String readlnOrNull() {
            java.lang.String r0 = readLine()
            return r0
    }
}
