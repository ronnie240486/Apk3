package okio;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 Z2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001ZB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0000J\u0013\u0010!\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b&J\u0015\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0007¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\tH\u0010¢\u0006\u0002\b)J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\u001d\u0010+\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0000H\u0010¢\u0006\u0002\b-J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\r\u00103\u001a\u00020\u0004H\u0010¢\u0006\u0002\b4J\u0015\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\tH\u0010¢\u0006\u0002\b7J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\u0006\u00109\u001a\u00020\u0000J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0006\u0010B\u001a\u00020\u0000J\u0006\u0010C\u001a\u00020\u0000J\u0006\u0010D\u001a\u00020\u0000J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bEJ\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0004J\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0000J\u0010\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020JH\u0016J\u001c\u0010K\u001a\u00020\u00002\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\tH\u0017J\b\u0010N\u001a\u00020\u0000H\u0016J\b\u0010O\u001a\u00020\u0000H\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\b\u0010Q\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010R\u001a\u00020?2\u0006\u0010S\u001a\u00020TH\u0016J%\u0010R\u001a\u00020?2\u0006\u0010U\u001a\u00020V2\u0006\u0010;\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0010¢\u0006\u0002\bWJ\u0010\u0010X\u001a\u00020?2\u0006\u0010S\u001a\u00020YH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006["}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "data", "", "([B)V", "getData$okio", "()[B", "hashCode", "", "getHashCode$okio", "()I", "setHashCode$okio", "(I)V", "size", "utf8", "", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "digest", "algorithm", "digest$okio", "endsWith", "", "suffix", "equals", "", "get", "", "index", "getByte", "-deprecated_getByte", "getSize", "getSize$okio", "hex", "hmac", "key", "hmac$okio", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "pos", "internalGet$okio", "lastIndexOf", "md5", "rangeEquals", "offset", "otherOffset", "byteCount", "readObject", "", "in", "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", "prefix", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "okio"}, k = 1, mv = {1, 4, 1})
public class ByteString implements java.io.Serializable, java.lang.Comparable<okio.ByteString> {

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString EMPTY = null;
    private static final long serialVersionUID = 1;

    @org.jetbrains.annotations.NotNull
    private final byte[] data;
    private transient int hashCode;

    @org.jetbrains.annotations.Nullable
    private transient java.lang.String utf8;

    /* JADX INFO: compiled from: ByteString.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", "string", "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", "offset", "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, k = 1, mv = {1, 4, 1})
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

        public static /* synthetic */ okio.ByteString encodeString$default(okio.ByteString.Companion r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L6
                java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            L6:
                okio.ByteString r0 = r0.encodeString(r1, r2)
                return r0
        }

        public static /* synthetic */ okio.ByteString of$default(okio.ByteString.Companion r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L5
                r2 = 0
            L5:
                r4 = r4 & 2
                if (r4 == 0) goto La
                int r3 = r1.length
            La:
                okio.ByteString r0 = r0.of(r1, r2, r3)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @kotlin.jvm.JvmName(name = "-deprecated_decodeBase64")
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final okio.ByteString m2020deprecated_decodeBase64(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r2 = r1.decodeBase64(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @kotlin.jvm.JvmName(name = "-deprecated_decodeHex")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final okio.ByteString m2021deprecated_decodeHex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r2 = r1.decodeHex(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @kotlin.jvm.JvmName(name = "-deprecated_encodeString")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final okio.ByteString m2022deprecated_encodeString(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "charset"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.ByteString r2 = r1.encodeString(r2, r3)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @kotlin.jvm.JvmName(name = "-deprecated_encodeUtf8")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final okio.ByteString m2023deprecated_encodeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "string"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r2 = r1.encodeUtf8(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @kotlin.jvm.JvmName(name = "-deprecated_of")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m2024deprecated_of(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "buffer"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r2 = r1.of(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @kotlin.jvm.JvmName(name = "-deprecated_of")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m2025deprecated_of(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r2 = r1.of(r2, r3, r4)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @kotlin.jvm.JvmName(name = "-deprecated_read")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final okio.ByteString m2026deprecated_read(@org.jetbrains.annotations.NotNull java.io.InputStream r2, int r3) {
                r1 = this;
                java.lang.String r0 = "inputstream"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString r2 = r1.read(r2, r3)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public final okio.ByteString decodeBase64(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "$this$decodeBase64"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                byte[] r2 = okio.Base64.decodeBase64ToArray(r2)
                if (r2 == 0) goto L11
                okio.ByteString r0 = new okio.ByteString
                r0.<init>(r2)
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString decodeHex(@org.jetbrains.annotations.NotNull java.lang.String r6) {
                r5 = this;
                java.lang.String r0 = "$this$decodeHex"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r6.length()
                int r0 = r0 % 2
                r1 = 0
                if (r0 != 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                if (r0 == 0) goto L40
                int r0 = r6.length()
                int r0 = r0 / 2
                byte[] r2 = new byte[r0]
            L1b:
                if (r1 >= r0) goto L3a
                int r3 = r1 * 2
                char r4 = r6.charAt(r3)
                int r4 = okio.internal.ByteStringKt.access$decodeHexDigit(r4)
                int r4 = r4 << 4
                int r3 = r3 + 1
                char r3 = r6.charAt(r3)
                int r3 = okio.internal.ByteStringKt.access$decodeHexDigit(r3)
                int r3 = r3 + r4
                byte r3 = (byte) r3
                r2[r1] = r3
                int r1 = r1 + 1
                goto L1b
            L3a:
                okio.ByteString r6 = new okio.ByteString
                r6.<init>(r2)
                return r6
            L40:
                java.lang.String r0 = "Unexpected hex string: "
                java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r6)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "encodeString")
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString encodeString(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
                r1 = this;
                java.lang.String r0 = "$this$encode"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "charset"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.ByteString r0 = new okio.ByteString
                byte[] r2 = r2.getBytes(r3)
                java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r0.<init>(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString encodeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "$this$encodeUtf8"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.ByteString r0 = new okio.ByteString
                byte[] r1 = okio.Platform.asUtf8ToByteArray(r3)
                r0.<init>(r1)
                r0.setUtf8$okio(r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "of")
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString of(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r2) {
                r1 = this;
                java.lang.String r0 = "$this$toByteString"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.remaining()
                byte[] r0 = new byte[r0]
                r2.get(r0)
                okio.ByteString r2 = new okio.ByteString
                r2.<init>(r0)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString of(@org.jetbrains.annotations.NotNull byte... r3) {
                r2 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.ByteString r0 = new okio.ByteString
                int r1 = r3.length
                byte[] r3 = java.util.Arrays.copyOf(r3, r1)
                java.lang.String r1 = "java.util.Arrays.copyOf(this, size)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
                r0.<init>(r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "of")
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString of(@org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
                r7 = this;
                java.lang.String r0 = "$this$toByteString"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r0 = r8.length
                long r1 = (long) r0
                long r3 = (long) r9
                long r5 = (long) r10
                okio.Util.checkOffsetAndCount(r1, r3, r5)
                okio.ByteString r0 = new okio.ByteString
                int r10 = r10 + r9
                byte[] r8 = kotlin.collections.ArraysKt.copyOfRange(r8, r9, r10)
                r0.<init>(r8)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "read")
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString read(@org.jetbrains.annotations.NotNull java.io.InputStream r5, int r6) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "$this$readByteString"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 0
                if (r6 < 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                if (r1 == 0) goto L28
                byte[] r1 = new byte[r6]
            Lf:
                if (r0 >= r6) goto L22
                int r2 = r6 - r0
                int r2 = r5.read(r1, r0, r2)
                r3 = -1
                if (r2 == r3) goto L1c
                int r0 = r0 + r2
                goto Lf
            L1c:
                java.io.EOFException r5 = new java.io.EOFException
                r5.<init>()
                throw r5
            L22:
                okio.ByteString r5 = new okio.ByteString
                r5.<init>(r1)
                return r5
            L28:
                java.lang.String r5 = "byteCount < 0: "
                java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r6)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r6.<init>(r5)
                throw r6
        }
    }

    static {
            okio.ByteString$Companion r0 = new okio.ByteString$Companion
            r1 = 0
            r0.<init>(r1)
            okio.ByteString.Companion = r0
            okio.ByteString r0 = new okio.ByteString
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            okio.ByteString.EMPTY = r0
            return
    }

    public ByteString(@org.jetbrains.annotations.NotNull byte[] r2) {
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.data = r2
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    public static final okio.ByteString decodeBase64(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.decodeBase64(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString decodeHex(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.decodeHex(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "encodeString")
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString encodeString(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.encodeString(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString encodeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.encodeUtf8(r1)
            return r1
    }

    public static /* synthetic */ int indexOf$default(okio.ByteString r0, okio.ByteString r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            int r0 = r0.indexOf(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: indexOf"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ int indexOf$default(okio.ByteString r0, byte[] r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            int r0 = r0.indexOf(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: indexOf"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ int lastIndexOf$default(okio.ByteString r0, okio.ByteString r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lf
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.size()
        La:
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
        Lf:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: lastIndexOf"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ int lastIndexOf$default(okio.ByteString r0, byte[] r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lf
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.size()
        La:
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
        Lf:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: lastIndexOf"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "of")
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString of(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.of(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString of(@org.jetbrains.annotations.NotNull byte... r1) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.of(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "of")
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString of(@org.jetbrains.annotations.NotNull byte[] r1, int r2, int r3) {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.of(r1, r2, r3)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "read")
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString read(@org.jetbrains.annotations.NotNull java.io.InputStream r1, int r2) throws java.io.IOException {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r1 = r0.read(r1, r2)
            return r1
    }

    private final void readObject(java.io.ObjectInputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.readInt()
            okio.ByteString$Companion r1 = okio.ByteString.Companion
            okio.ByteString r3 = r1.read(r3, r0)
            java.lang.Class<okio.ByteString> r0 = okio.ByteString.class
            java.lang.String r1 = "data"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            java.lang.String r1 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 1
            r0.setAccessible(r1)
            byte[] r3 = r3.data
            r0.set(r2, r3)
            return
    }

    public static /* synthetic */ okio.ByteString substring$default(okio.ByteString r0, int r1, int r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto L14
            r4 = r3 & 1
            if (r4 == 0) goto L7
            r1 = 0
        L7:
            r3 = r3 & 2
            if (r3 == 0) goto Lf
            int r2 = r0.size()
        Lf:
            okio.ByteString r0 = r0.substring(r1, r2)
            return r0
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: substring"
            r0.<init>(r1)
            throw r0
    }

    private final void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            r2.writeInt(r0)
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_getByte")
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m2018deprecated_getByte(int r1) {
            r0 = this;
            byte r1 = r0.getByte(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m2019deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.nio.ByteBuffer asByteBuffer() {
            r2 = this;
            byte[] r0 = r2.data
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            java.lang.String r1 = "ByteBuffer.wrap(data).asReadOnlyBuffer()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String base64() {
            r3 = this;
            byte[] r0 = r3.getData$okio()
            r1 = 0
            r2 = 1
            java.lang.String r0 = okio.Base64.encodeBase64$default(r0, r1, r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String base64Url() {
            r2 = this;
            byte[] r0 = r2.getData$okio()
            byte[] r1 = okio.Base64.getBASE64_URL_SAFE()
            java.lang.String r0 = okio.Base64.encodeBase64(r0, r1)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(okio.ByteString r1) {
            r0 = this;
            okio.ByteString r1 = (okio.ByteString) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@org.jetbrains.annotations.NotNull okio.ByteString r10) {
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString digest$okio(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)
            byte[] r0 = r3.data
            int r1 = r3.size()
            r2 = 0
            r4.update(r0, r2, r1)
            byte[] r4 = r4.digest()
            okio.ByteString r0 = new okio.ByteString
            java.lang.String r1 = "digestBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r0.<init>(r4)
            return r0
    }

    public final boolean endsWith(@org.jetbrains.annotations.NotNull okio.ByteString r4) {
            r3 = this;
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            int r1 = r4.size()
            int r0 = r0 - r1
            int r1 = r4.size()
            r2 = 0
            boolean r4 = r3.rangeEquals(r0, r4, r2, r1)
            return r4
    }

    public final boolean endsWith(@org.jetbrains.annotations.NotNull byte[] r4) {
            r3 = this;
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            int r1 = r4.length
            int r0 = r0 - r1
            int r1 = r4.length
            r2 = 0
            boolean r4 = r3.rangeEquals(r0, r4, r2, r1)
            return r4
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != r4) goto L5
            goto L27
        L5:
            boolean r2 = r5 instanceof okio.ByteString
            if (r2 == 0) goto L26
            okio.ByteString r5 = (okio.ByteString) r5
            int r2 = r5.size()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            if (r2 != r3) goto L26
            byte[] r2 = r4.getData$okio()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            boolean r5 = r5.rangeEquals(r1, r2, r1, r3)
            if (r5 == 0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
    }

    @kotlin.jvm.JvmName(name = "getByte")
    public final byte getByte(int r1) {
            r0 = this;
            byte r1 = r0.internalGet$okio(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] getData$okio() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    public final int getHashCode$okio() {
            r1 = this;
            int r0 = r1.hashCode
            return r0
    }

    public int getSize$okio() {
            r1 = this;
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUtf8$okio() {
            r1 = this;
            java.lang.String r0 = r1.utf8
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.getHashCode$okio()
            if (r0 == 0) goto L7
            goto L12
        L7:
            byte[] r0 = r1.getData$okio()
            int r0 = java.util.Arrays.hashCode(r0)
            r1.setHashCode$okio(r0)
        L12:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String hex() {
            r9 = this;
            byte[] r0 = r9.getData$okio()
            int r0 = r0.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            byte[] r1 = r9.getData$okio()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r2) goto L31
            r5 = r1[r3]
            int r6 = r4 + 1
            char[] r7 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            int r8 = r5 >> 4
            r8 = r8 & 15
            char r7 = r7[r8]
            r0[r4] = r7
            int r4 = r6 + 1
            char[] r7 = okio.internal.ByteStringKt.getHEX_DIGIT_CHARS()
            r5 = r5 & 15
            char r5 = r7[r5]
            r0[r6] = r5
            int r3 = r3 + 1
            goto L10
        L31:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmac$okio(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
            r2 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r3)     // Catch: java.security.InvalidKeyException -> L2b
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L2b
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L2b
            r1.<init>(r4, r3)     // Catch: java.security.InvalidKeyException -> L2b
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L2b
            okio.ByteString r3 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L2b
            byte[] r4 = r2.data     // Catch: java.security.InvalidKeyException -> L2b
            byte[] r4 = r0.doFinal(r4)     // Catch: java.security.InvalidKeyException -> L2b
            java.lang.String r0 = "mac.doFinal(data)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch: java.security.InvalidKeyException -> L2b
            r3.<init>(r4)     // Catch: java.security.InvalidKeyException -> L2b
            return r3
        L2b:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmacSha1(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA1"
            okio.ByteString r2 = r1.hmac$okio(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmacSha256(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA256"
            okio.ByteString r2 = r1.hmac$okio(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmacSha512(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA512"
            okio.ByteString r2 = r1.hmac$okio(r0, r2)
            return r2
    }

    @kotlin.jvm.JvmOverloads
    public final int indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            int r4 = indexOf$default(r3, r4, r0, r1, r2)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    public final int indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r2 = r2.internalArray$okio()
            int r2 = r1.indexOf(r2, r3)
            return r2
    }

    @kotlin.jvm.JvmOverloads
    public final int indexOf(@org.jetbrains.annotations.NotNull byte[] r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            int r4 = indexOf$default(r3, r4, r0, r1, r2)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    public int indexOf(@org.jetbrains.annotations.NotNull byte[] r5, int r6) {
            r4 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            byte[] r0 = r4.getData$okio()
            int r0 = r0.length
            int r1 = r5.length
            int r0 = r0 - r1
            r1 = 0
            int r6 = java.lang.Math.max(r6, r1)
            if (r6 > r0) goto L24
        L13:
            byte[] r2 = r4.getData$okio()
            int r3 = r5.length
            boolean r2 = okio.Util.arrayRangeEquals(r2, r6, r5, r1, r3)
            if (r2 == 0) goto L1f
            goto L25
        L1f:
            if (r6 == r0) goto L24
            int r6 = r6 + 1
            goto L13
        L24:
            r6 = -1
        L25:
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public byte[] internalArray$okio() {
            r1 = this;
            byte[] r0 = r1.getData$okio()
            return r0
    }

    public byte internalGet$okio(int r2) {
            r1 = this;
            byte[] r0 = r1.getData$okio()
            r2 = r0[r2]
            return r2
    }

    @kotlin.jvm.JvmOverloads
    public final int lastIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            int r4 = lastIndexOf$default(r3, r4, r0, r1, r2)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    public final int lastIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r2 = r2.internalArray$okio()
            int r2 = r1.lastIndexOf(r2, r3)
            return r2
    }

    @kotlin.jvm.JvmOverloads
    public final int lastIndexOf(@org.jetbrains.annotations.NotNull byte[] r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            int r4 = lastIndexOf$default(r3, r4, r0, r1, r2)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    public int lastIndexOf(@org.jetbrains.annotations.NotNull byte[] r4, int r5) {
            r3 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            byte[] r0 = r3.getData$okio()
            int r0 = r0.length
            int r1 = r4.length
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
        L10:
            if (r5 < 0) goto L22
            byte[] r0 = r3.getData$okio()
            r1 = 0
            int r2 = r4.length
            boolean r0 = okio.Util.arrayRangeEquals(r0, r5, r4, r1, r2)
            if (r0 == 0) goto L1f
            goto L23
        L1f:
            int r5 = r5 + (-1)
            goto L10
        L22:
            r5 = -1
        L23:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString md5() {
            r1 = this;
            java.lang.String r0 = "MD5"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    public boolean rangeEquals(int r2, @org.jetbrains.annotations.NotNull okio.ByteString r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = r1.getData$okio()
            boolean r2 = r3.rangeEquals(r4, r0, r2, r5)
            return r2
    }

    public boolean rangeEquals(int r2, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 < 0) goto L21
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            int r0 = r0 - r5
            if (r2 > r0) goto L21
            if (r4 < 0) goto L21
            int r0 = r3.length
            int r0 = r0 - r5
            if (r4 > r0) goto L21
            byte[] r0 = r1.getData$okio()
            boolean r2 = okio.Util.arrayRangeEquals(r0, r2, r3, r4, r5)
            if (r2 == 0) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = 0
        L22:
            return r2
    }

    public final void setHashCode$okio(int r1) {
            r0 = this;
            r0.hashCode = r1
            return
    }

    public final void setUtf8$okio(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.utf8 = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha1() {
            r1 = this;
            java.lang.String r0 = "SHA-1"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha256() {
            r1 = this;
            java.lang.String r0 = "SHA-256"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha512() {
            r1 = this;
            java.lang.String r0 = "SHA-512"
            okio.ByteString r0 = r1.digest$okio(r0)
            return r0
    }

    @kotlin.jvm.JvmName(name = "size")
    public final int size() {
            r1 = this;
            int r0 = r1.getSize$okio()
            return r0
    }

    public final boolean startsWith(@org.jetbrains.annotations.NotNull okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.size()
            r1 = 0
            boolean r3 = r2.rangeEquals(r1, r3, r1, r0)
            return r3
    }

    public final boolean startsWith(@org.jetbrains.annotations.NotNull byte[] r3) {
            r2 = this;
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            r1 = 0
            boolean r3 = r2.rangeEquals(r1, r3, r1, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String string(@org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = r2.data
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0, r3)
            return r1
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.ByteString substring() {
            r3 = this;
            r0 = 0
            r1 = 3
            r2 = 0
            okio.ByteString r0 = substring$default(r3, r0, r0, r1, r2)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.ByteString substring(int r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            okio.ByteString r4 = substring$default(r3, r4, r0, r1, r2)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public okio.ByteString substring(int r3, int r4) {
            r2 = this;
            r0 = 1
            if (r3 < 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 == 0) goto L5c
            byte[] r1 = r2.getData$okio()
            int r1 = r1.length
            if (r4 > r1) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L41
            int r1 = r4 - r3
            if (r1 < 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L35
            if (r3 != 0) goto L27
            byte[] r0 = r2.getData$okio()
            int r0 = r0.length
            if (r4 != r0) goto L27
            r0 = r2
            goto L34
        L27:
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r2.getData$okio()
            byte[] r3 = kotlin.collections.ArraysKt.copyOfRange(r1, r3, r4)
            r0.<init>(r3)
        L34:
            return r0
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "endIndex < beginIndex"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L41:
            java.lang.String r3 = "endIndex > length("
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            byte[] r4 = r2.getData$okio()
            int r4 = r4.length
            r0 = 41
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r4, r0)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L5c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "beginIndex < 0"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString toAsciiLowercase() {
            r6 = this;
            r0 = 0
        L1:
            byte[] r1 = r6.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L49
            byte[] r1 = r6.getData$okio()
            r1 = r1[r0]
            r2 = 65
            byte r2 = (byte) r2
            if (r1 < r2) goto L46
            r3 = 90
            byte r3 = (byte) r3
            if (r1 <= r3) goto L19
            goto L46
        L19:
            byte[] r4 = r6.getData$okio()
            int r5 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r5 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            int r5 = r0 + 1
            int r1 = r1 + 32
            byte r1 = (byte) r1
            r4[r0] = r1
        L2e:
            int r0 = r4.length
            if (r5 >= r0) goto L40
            r0 = r4[r5]
            if (r0 < r2) goto L3d
            if (r0 <= r3) goto L38
            goto L3d
        L38:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r4[r5] = r0
        L3d:
            int r5 = r5 + 1
            goto L2e
        L40:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r4)
            goto L4a
        L46:
            int r0 = r0 + 1
            goto L1
        L49:
            r0 = r6
        L4a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okio.ByteString toAsciiUppercase() {
            r6 = this;
            r0 = 0
        L1:
            byte[] r1 = r6.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L49
            byte[] r1 = r6.getData$okio()
            r1 = r1[r0]
            r2 = 97
            byte r2 = (byte) r2
            if (r1 < r2) goto L46
            r3 = 122(0x7a, float:1.71E-43)
            byte r3 = (byte) r3
            if (r1 <= r3) goto L19
            goto L46
        L19:
            byte[] r4 = r6.getData$okio()
            int r5 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r5 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            int r5 = r0 + 1
            int r1 = r1 + (-32)
            byte r1 = (byte) r1
            r4[r0] = r1
        L2e:
            int r0 = r4.length
            if (r5 >= r0) goto L40
            r0 = r4[r5]
            if (r0 < r2) goto L3d
            if (r0 <= r3) goto L38
            goto L3d
        L38:
            int r0 = r0 + (-32)
            byte r0 = (byte) r0
            r4[r5] = r0
        L3d:
            int r5 = r5 + 1
            goto L2e
        L40:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r4)
            goto L4a
        L46:
            int r0 = r0 + 1
            goto L1
        L49:
            r0 = r6
        L4a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public byte[] toByteArray() {
            r2 = this;
            byte[] r0 = r2.getData$okio()
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r8 = this;
            byte[] r0 = r8.getData$okio()
            int r0 = r0.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L12
            java.lang.String r0 = "[size=0]"
            goto L100
        L12:
            byte[] r0 = r8.getData$okio()
            r3 = 64
            int r0 = okio.internal.ByteStringKt.access$codePointIndexToCharIndex(r0, r3)
            r4 = -1
            java.lang.String r5 = "…]"
            r6 = 93
            java.lang.String r7 = "[size="
            if (r0 != r4) goto La0
            byte[] r0 = r8.getData$okio()
            int r0 = r0.length
            if (r0 > r3) goto L43
            java.lang.String r0 = "[hex="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r8.hex()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L100
        L43:
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            byte[] r4 = r8.getData$okio()
            int r4 = r4.length
            r0.append(r4)
            java.lang.String r4 = " hex="
            r0.append(r4)
            byte[] r4 = r8.getData$okio()
            int r4 = r4.length
            if (r3 > r4) goto L5c
            goto L5d
        L5c:
            r1 = 0
        L5d:
            if (r1 == 0) goto L85
            byte[] r1 = r8.getData$okio()
            int r1 = r1.length
            if (r3 != r1) goto L68
            r1 = r8
            goto L75
        L68:
            okio.ByteString r1 = new okio.ByteString
            byte[] r4 = r8.getData$okio()
            byte[] r2 = kotlin.collections.ArraysKt.copyOfRange(r4, r2, r3)
            r1.<init>(r2)
        L75:
            java.lang.String r1 = r1.hex()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            goto L100
        L85:
            java.lang.String r0 = "endIndex > length("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            byte[] r1 = r8.getData$okio()
            int r1 = r1.length
            r2 = 41
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        La0:
            java.lang.String r1 = r8.utf8()
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r2 = r1.substring(r2, r0)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = "\\"
            java.lang.String r4 = "\\\\"
            java.lang.String r2 = kotlin.text.StringsKt.replace$default(r2, r3, r4)
            java.lang.String r3 = "\n"
            java.lang.String r4 = "\\n"
            java.lang.String r2 = kotlin.text.StringsKt.replace$default(r2, r3, r4)
            java.lang.String r3 = "\r"
            java.lang.String r4 = "\\r"
            java.lang.String r2 = kotlin.text.StringsKt.replace$default(r2, r3, r4)
            int r1 = r1.length()
            if (r0 >= r1) goto Lec
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            byte[] r1 = r8.getData$okio()
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " text="
            r0.append(r1)
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            goto L100
        Lec:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[text="
            r0.append(r1)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
        L100:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String utf8() {
            r1 = this;
            java.lang.String r0 = r1.getUtf8$okio()
            if (r0 != 0) goto L11
            byte[] r0 = r1.internalArray$okio()
            java.lang.String r0 = okio.Platform.toUtf8String(r0)
            r1.setUtf8$okio(r0)
        L11:
            return r0
    }

    public void write(@org.jetbrains.annotations.NotNull java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }

    public void write$okio(@org.jetbrains.annotations.NotNull okio.Buffer r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.internal.ByteStringKt.commonWrite(r1, r2, r3, r4)
            return
    }
}
