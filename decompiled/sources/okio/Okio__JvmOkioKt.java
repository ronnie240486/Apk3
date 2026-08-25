package okio;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010\u001a\u001a\u00020\u001b*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0012\u0010\u001a\u001a\u00020\u001b*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0016\u0010\u001c\u001a\u00020\u000b*\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u0006H\u0007\u001a\n\u0010\u001c\u001a\u00020\u000b*\u00020\u001e\u001a\n\u0010\u001c\u001a\u00020\u000b*\u00020\u001f\u001a%\u0010\u001c\u001a\u00020\u000b*\u00020 2\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\"\"\u00020#H\u0007¢\u0006\u0002\u0010$\u001a\n\u0010%\u001a\u00020\u0013*\u00020\f\u001a\n\u0010%\u001a\u00020\u0013*\u00020&\u001a\n\u0010%\u001a\u00020\u0013*\u00020\u001f\u001a%\u0010%\u001a\u00020\u0013*\u00020 2\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\"\"\u00020#H\u0007¢\u0006\u0002\u0010'\"\u001c\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0005\u001a\u00020\u0006*\u00060\u0007j\u0002`\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006("}, d2 = {"logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "getLogger$Okio__JvmOkioKt", "()Ljava/util/logging/Logger;", "isAndroidGetsocknameError", "", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "(Ljava/lang/AssertionError;)Z", "appendingSink", "Lokio/Sink;", "Ljava/io/File;", "cipherSink", "Lokio/CipherSink;", "cipher", "Ljavax/crypto/Cipher;", "cipherSource", "Lokio/CipherSource;", "Lokio/Source;", "hashingSink", "Lokio/HashingSink;", "digest", "Ljava/security/MessageDigest;", "mac", "Ljavax/crypto/Mac;", "hashingSource", "Lokio/HashingSource;", "sink", "append", "Ljava/io/OutputStream;", "Ljava/net/Socket;", "Ljava/nio/file/Path;", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "source", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "okio"}, k = 5, mv = {1, 4, 1}, xs = "okio/Okio")
final /* synthetic */ class Okio__JvmOkioKt {
    private static final java.util.logging.Logger logger = null;

    static {
            java.lang.String r0 = "okio.Okio"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okio.Okio__JvmOkioKt.logger = r0
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$p() {
            java.util.logging.Logger r0 = okio.Okio__JvmOkioKt.logger
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink appendingSink(@org.jetbrains.annotations.NotNull java.io.File r2) throws java.io.FileNotFoundException {
            java.lang.String r0 = "$this$appendingSink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            okio.Sink r2 = okio.Okio.sink(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.CipherSink cipherSink(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r2) {
            java.lang.String r0 = "$this$cipherSink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "cipher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.CipherSink r0 = new okio.CipherSink
            okio.BufferedSink r1 = okio.Okio.buffer(r1)
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.CipherSource cipherSource(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r2) {
            java.lang.String r0 = "$this$cipherSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "cipher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.CipherSource r0 = new okio.CipherSource
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.util.logging.Logger getLogger$Okio__JvmOkioKt() {
            java.util.logging.Logger r0 = okio.Okio__JvmOkioKt.logger
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hashingSink(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull java.security.MessageDigest r2) {
            java.lang.String r0 = "$this$hashingSink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "digest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.HashingSink r0 = new okio.HashingSink
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hashingSink(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull javax.crypto.Mac r2) {
            java.lang.String r0 = "$this$hashingSink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "mac"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.HashingSink r0 = new okio.HashingSink
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hashingSource(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull java.security.MessageDigest r2) {
            java.lang.String r0 = "$this$hashingSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "digest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.HashingSource r0 = new okio.HashingSource
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hashingSource(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull javax.crypto.Mac r2) {
            java.lang.String r0 = "$this$hashingSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "mac"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.HashingSource r0 = new okio.HashingSource
            r0.<init>(r1, r2)
            return r0
    }

    public static final boolean isAndroidGetsocknameError(@org.jetbrains.annotations.NotNull java.lang.AssertionError r2) {
            java.lang.String r0 = "$this$isAndroidGetsocknameError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Throwable r0 = r2.getCause()
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L19
            java.lang.String r0 = "getsockname failed"
            boolean r2 = kotlin.text.StringsKt.contains$default(r2, r0)
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.File r3) throws java.io.FileNotFoundException {
            r0 = 0
            r1 = 1
            r2 = 0
            okio.Sink r3 = okio.Okio.sink$default(r3, r0, r1, r2)
            return r3
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.File r1, boolean r2) throws java.io.FileNotFoundException {
            java.lang.String r0 = "$this$sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1, r2)
            okio.Sink r1 = okio.Okio.sink(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.OutputStream r2) {
            java.lang.String r0 = "$this$sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.OutputStreamSink r0 = new okio.OutputStreamSink
            okio.Timeout r1 = new okio.Timeout
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.net.Socket r3) throws java.io.IOException {
            java.lang.String r0 = "$this$sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.SocketAsyncTimeout r0 = new okio.SocketAsyncTimeout
            r0.<init>(r3)
            okio.OutputStreamSink r1 = new okio.OutputStreamSink
            java.io.OutputStream r3 = r3.getOutputStream()
            java.lang.String r2 = "getOutputStream()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            r1.<init>(r3, r0)
            okio.Sink r3 = r0.sink(r1)
            return r3
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r2) throws java.io.IOException {
            java.lang.String r0 = "$this$sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r2)
            java.lang.String r2 = "Files.newOutputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            okio.Sink r1 = okio.Okio.sink(r1)
            return r1
    }

    public static /* synthetic */ okio.Sink sink$default(java.io.File r0, boolean r1, int r2, java.lang.Object r3) throws java.io.FileNotFoundException {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            okio.Sink r0 = okio.Okio.sink(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.io.File r1) throws java.io.FileNotFoundException {
            java.lang.String r0 = "$this$source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            okio.Source r1 = okio.Okio.source(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.io.InputStream r2) {
            java.lang.String r0 = "$this$source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.InputStreamSource r0 = new okio.InputStreamSource
            okio.Timeout r1 = new okio.Timeout
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.net.Socket r3) throws java.io.IOException {
            java.lang.String r0 = "$this$source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.SocketAsyncTimeout r0 = new okio.SocketAsyncTimeout
            r0.<init>(r3)
            okio.InputStreamSource r1 = new okio.InputStreamSource
            java.io.InputStream r3 = r3.getInputStream()
            java.lang.String r2 = "getInputStream()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            r1.<init>(r3, r0)
            okio.Source r3 = r0.source(r1)
            return r3
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r2) throws java.io.IOException {
            java.lang.String r0 = "$this$source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r1, r2)
            java.lang.String r2 = "Files.newInputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            okio.Source r1 = okio.Okio.source(r1)
            return r1
    }
}
