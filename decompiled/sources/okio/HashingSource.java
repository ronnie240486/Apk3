package okio;

/* JADX INFO: compiled from: HashingSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "source", "digest", "Ljava/security/MessageDigest;", "(Lokio/Source;Ljava/security/MessageDigest;)V", "algorithm", "", "(Lokio/Source;Ljava/lang/String;)V", "mac", "Ljavax/crypto/Mac;", "(Lokio/Source;Ljavax/crypto/Mac;)V", "key", "Lokio/ByteString;", "(Lokio/Source;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "messageDigest", "-deprecated_hash", "read", "", "sink", "Lokio/Buffer;", "byteCount", "Companion", "okio"}, k = 1, mv = {1, 4, 1})
public final class HashingSource extends okio.ForwardingSource {

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource.Companion Companion = null;
    private final javax.crypto.Mac mac;
    private final java.security.MessageDigest messageDigest;

    /* JADX INFO: compiled from: HashingSource.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lokio/HashingSource$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSource;", "source", "Lokio/Source;", "key", "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "okio"}, k = 1, mv = {1, 4, 1})
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
        public final okio.HashingSource hmacSha1(@org.jetbrains.annotations.NotNull okio.Source r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "HmacSHA1"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource hmacSha256(@org.jetbrains.annotations.NotNull okio.Source r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "HmacSHA256"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource hmacSha512(@org.jetbrains.annotations.NotNull okio.Source r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "HmacSHA512"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource md5(@org.jetbrains.annotations.NotNull okio.Source r3) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "MD5"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource sha1(@org.jetbrains.annotations.NotNull okio.Source r3) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "SHA-1"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource sha256(@org.jetbrains.annotations.NotNull okio.Source r3) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "SHA-256"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource sha512(@org.jetbrains.annotations.NotNull okio.Source r3) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "SHA-512"
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            okio.HashingSource$Companion r0 = new okio.HashingSource$Companion
            r1 = 0
            r0.<init>(r1)
            okio.HashingSource.Companion = r0
            return
    }

    public HashingSource(@org.jetbrains.annotations.NotNull okio.Source r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "MessageDigest.getInstance(algorithm)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    public HashingSource(@org.jetbrains.annotations.NotNull okio.Source r2, @org.jetbrains.annotations.NotNull java.security.MessageDigest r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "digest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.messageDigest = r3
            r2 = 0
            r1.mac = r2
            return
    }

    public HashingSource(@org.jetbrains.annotations.NotNull okio.Source r2, @org.jetbrains.annotations.NotNull javax.crypto.Mac r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "mac"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.mac = r3
            r2 = 0
            r1.messageDigest = r2
            return
    }

    public HashingSource(@org.jetbrains.annotations.NotNull okio.Source r3, @org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "source"
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
    public static final okio.HashingSource hmacSha1(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.hmacSha1(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hmacSha256(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.hmacSha256(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hmacSha512(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.hmacSha512(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource md5(@org.jetbrains.annotations.NotNull okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.md5(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource sha1(@org.jetbrains.annotations.NotNull okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.sha1(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource sha256(@org.jetbrains.annotations.NotNull okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.sha256(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource sha512(@org.jetbrains.annotations.NotNull okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.sha512(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hash", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_hash")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final okio.ByteString m2032deprecated_hash() {
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

    @Override // okio.ForwardingSource, okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r10 = super.read(r9, r10)
            r0 = -1
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L65
            long r0 = r9.size()
            long r0 = r0 - r10
            long r2 = r9.size()
            okio.Segment r4 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
        L1e:
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L2f
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r2 = r2 - r5
            goto L1e
        L2f:
            long r5 = r9.size()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L65
            int r5 = r4.pos
            long r5 = (long) r5
            long r5 = r5 + r0
            long r5 = r5 - r2
            int r0 = (int) r5
            java.security.MessageDigest r1 = r8.messageDigest
            if (r1 == 0) goto L4a
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r6 = r6 - r0
            r1.update(r5, r0, r6)
            goto L57
        L4a:
            javax.crypto.Mac r1 = r8.mac
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r6 = r6 - r0
            r1.update(r5, r0, r6)
        L57:
            int r0 = r4.limit
            int r1 = r4.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 + r0
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0 = r2
            goto L2f
        L65:
            return r10
    }
}
