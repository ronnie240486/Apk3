package okio;

/* JADX INFO: compiled from: HashingSink.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "sink", "digest", "Ljava/security/MessageDigest;", "(Lokio/Sink;Ljava/security/MessageDigest;)V", "algorithm", "", "(Lokio/Sink;Ljava/lang/String;)V", "mac", "Ljavax/crypto/Mac;", "(Lokio/Sink;Ljavax/crypto/Mac;)V", "key", "Lokio/ByteString;", "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "messageDigest", "-deprecated_hash", "write", "", "source", "Lokio/Buffer;", "byteCount", "", "Companion", "okio"}, k = 1, mv = {1, 4, 1})
public final class HashingSink extends okio.ForwardingSink {

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink.Companion Companion = null;
    private final javax.crypto.Mac mac;
    private final java.security.MessageDigest messageDigest;

    /* JADX INFO: compiled from: HashingSink.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lokio/HashingSink$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSink;", "sink", "Lokio/Sink;", "key", "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "okio"}, k = 1, mv = {1, 4, 1})
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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink hmacSha1(@org.jetbrains.annotations.NotNull okio.Sink r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA1"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink hmacSha256(@org.jetbrains.annotations.NotNull okio.Sink r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA256"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink hmacSha512(@org.jetbrains.annotations.NotNull okio.Sink r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA512"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink md5(@org.jetbrains.annotations.NotNull okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "MD5"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink sha1(@org.jetbrains.annotations.NotNull okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-1"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink sha256(@org.jetbrains.annotations.NotNull okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-256"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink sha512(@org.jetbrains.annotations.NotNull okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-512"
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            okio.HashingSink$Companion r0 = new okio.HashingSink$Companion
            r1 = 0
            r0.<init>(r1)
            okio.HashingSink.Companion = r0
            return
    }

    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "MessageDigest.getInstance(algorithm)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull java.security.MessageDigest r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "digest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.messageDigest = r3
            r2 = 0
            r1.mac = r2
            return
    }

    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull javax.crypto.Mac r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "mac"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.mac = r3
            r2 = 0
            r1.messageDigest = r2
            return
    }

    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r3, @org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L2c
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L2c
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L2c
            r1.<init>(r4, r5)     // Catch: java.security.InvalidKeyException -> L2c
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L2c
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.security.InvalidKeyException -> L2c
            java.lang.String r4 = "try {\n      Mac.getInsta…rgumentException(e)\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r2.<init>(r3, r0)
            return
        L2c:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hmacSha1(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.hmacSha1(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hmacSha256(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.hmacSha256(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hmacSha512(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.hmacSha512(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink md5(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.md5(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink sha1(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.sha1(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink sha256(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.sha256(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink sha512(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.sha512(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hash", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_hash")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final okio.ByteString m2031deprecated_hash() {
            r1 = this;
            okio.ByteString r0 = r1.hash()
            return r0
    }

    @kotlin.jvm.JvmName(name = "hash")
    @org.jetbrains.annotations.NotNull
    public final okio.ByteString hash() {
            r3 = this;
            java.security.MessageDigest r0 = r3.messageDigest
            if (r0 == 0) goto L9
            byte[] r0 = r0.digest()
            goto L12
        L9:
            javax.crypto.Mac r0 = r3.mac
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r0 = r0.doFinal()
        L12:
            okio.ByteString r1 = new okio.ByteString
            java.lang.String r2 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r1.<init>(r0)
            return r1
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r1 = r8.size()
            r3 = 0
            r5 = r9
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = 0
        L17:
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 >= 0) goto L48
            long r3 = r9 - r1
            int r5 = r0.limit
            int r6 = r0.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r3 = java.lang.Math.min(r3, r5)
            int r4 = (int) r3
            java.security.MessageDigest r3 = r7.messageDigest
            if (r3 == 0) goto L34
            byte[] r5 = r0.data
            int r6 = r0.pos
            r3.update(r5, r6, r4)
            goto L40
        L34:
            javax.crypto.Mac r3 = r7.mac
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            byte[] r5 = r0.data
            int r6 = r0.pos
            r3.update(r5, r6, r4)
        L40:
            long r3 = (long) r4
            long r1 = r1 + r3
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            goto L17
        L48:
            super.write(r8, r9)
            return
    }
}
