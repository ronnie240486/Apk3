package okio;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, k = 4, mv = {1, 4, 1})
public final class Okio {
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink appendingSink(@org.jetbrains.annotations.NotNull java.io.File r0) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.appendingSink(r0)
            return r0
    }

    @kotlin.jvm.JvmName(name = "blackhole")
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink blackhole() {
            okio.Sink r0 = okio.Okio__OkioKt.blackhole()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink buffer(@org.jetbrains.annotations.NotNull okio.Sink r0) {
            okio.BufferedSink r0 = okio.Okio__OkioKt.buffer(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSource buffer(@org.jetbrains.annotations.NotNull okio.Source r0) {
            okio.BufferedSource r0 = okio.Okio__OkioKt.buffer(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.CipherSink cipherSink(@org.jetbrains.annotations.NotNull okio.Sink r0, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r1) {
            okio.CipherSink r0 = okio.Okio__JvmOkioKt.cipherSink(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.CipherSource cipherSource(@org.jetbrains.annotations.NotNull okio.Source r0, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r1) {
            okio.CipherSource r0 = okio.Okio__JvmOkioKt.cipherSource(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hashingSink(@org.jetbrains.annotations.NotNull okio.Sink r0, @org.jetbrains.annotations.NotNull java.security.MessageDigest r1) {
            okio.HashingSink r0 = okio.Okio__JvmOkioKt.hashingSink(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hashingSink(@org.jetbrains.annotations.NotNull okio.Sink r0, @org.jetbrains.annotations.NotNull javax.crypto.Mac r1) {
            okio.HashingSink r0 = okio.Okio__JvmOkioKt.hashingSink(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hashingSource(@org.jetbrains.annotations.NotNull okio.Source r0, @org.jetbrains.annotations.NotNull java.security.MessageDigest r1) {
            okio.HashingSource r0 = okio.Okio__JvmOkioKt.hashingSource(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hashingSource(@org.jetbrains.annotations.NotNull okio.Source r0, @org.jetbrains.annotations.NotNull javax.crypto.Mac r1) {
            okio.HashingSource r0 = okio.Okio__JvmOkioKt.hashingSource(r0, r1)
            return r0
    }

    public static final boolean isAndroidGetsocknameError(@org.jetbrains.annotations.NotNull java.lang.AssertionError r0) {
            boolean r0 = okio.Okio__JvmOkioKt.isAndroidGetsocknameError(r0)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.File r3) throws java.io.FileNotFoundException {
            r0 = 0
            r1 = 1
            r2 = 0
            okio.Sink r3 = sink$default(r3, r0, r1, r2)
            return r3
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.File r0, boolean r1) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.io.OutputStream r0) {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.net.Socket r0) throws java.io.IOException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0)
            return r0
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink sink(@org.jetbrains.annotations.NotNull java.nio.file.Path r0, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r1) throws java.io.IOException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r0, r1)
            return r0
    }

    public static /* synthetic */ okio.Sink sink$default(java.io.File r0, boolean r1, int r2, java.lang.Object r3) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink$default(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.io.File r0) throws java.io.FileNotFoundException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.io.InputStream r0) {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.net.Socket r0) throws java.io.IOException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0)
            return r0
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    @org.jetbrains.annotations.NotNull
    public static final okio.Source source(@org.jetbrains.annotations.NotNull java.nio.file.Path r0, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r1) throws java.io.IOException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r0, r1)
            return r0
    }

    public static final <T extends java.io.Closeable, R> R use(T r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r1) {
            java.lang.Object r0 = okio.Okio__OkioKt.use(r0, r1)
            return r0
    }
}
