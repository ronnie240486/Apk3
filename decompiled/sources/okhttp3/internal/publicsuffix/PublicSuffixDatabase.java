package okhttp3.internal.publicsuffix;

/* JADX INFO: compiled from: PublicSuffixDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "()V", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", "", "publicSuffixListBytes", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "findMatchingRule", "", "", "domainLabels", "getEffectiveTldPlusOne", "domain", "readTheList", "", "readTheListUninterruptibly", "setListBytes", "splitDomain", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class PublicSuffixDatabase {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion Companion = null;
    private static final char EXCEPTION_MARKER = '!';
    private static final java.util.List<java.lang.String> PREVAILING_RULE = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = null;
    private static final okhttp3.internal.publicsuffix.PublicSuffixDatabase instance = null;
    private final java.util.concurrent.atomic.AtomicBoolean listRead;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final java.util.concurrent.CountDownLatch readCompleteLatch;

    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        public static final /* synthetic */ java.lang.String access$binarySearch(okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion r0, byte[] r1, byte[][] r2, int r3) {
                java.lang.String r0 = r0.binarySearch(r1, r2, r3)
                return r0
        }

        private final java.lang.String binarySearch(byte[] r19, byte[][] r20, int r21) {
                r18 = this;
                r0 = r19
                r1 = r20
                int r2 = r0.length
                r4 = 0
            L6:
                if (r4 >= r2) goto L96
                int r5 = r4 + r2
                int r5 = r5 / 2
            Lc:
                r6 = 10
                r7 = -1
                if (r5 <= r7) goto L19
                r8 = r0[r5]
                byte r9 = (byte) r6
                if (r8 == r9) goto L19
                int r5 = r5 + (-1)
                goto Lc
            L19:
                int r5 = r5 + 1
                r8 = 1
                r9 = 1
            L1d:
                int r10 = r5 + r9
                r11 = r0[r10]
                byte r12 = (byte) r6
                if (r11 == r12) goto L27
                int r9 = r9 + 1
                goto L1d
            L27:
                int r6 = r10 - r5
                r11 = r21
                r9 = 0
                r12 = 0
                r13 = 0
            L2e:
                r14 = 255(0xff, float:3.57E-43)
                if (r9 == 0) goto L36
                r9 = 46
                r15 = 0
                goto L43
            L36:
                r15 = r1[r11]
                r15 = r15[r12]
                int r15 = okhttp3.internal.Util.and(r15, r14)
                r17 = r15
                r15 = r9
                r9 = r17
            L43:
                int r16 = r5 + r13
                r3 = r0[r16]
                int r3 = okhttp3.internal.Util.and(r3, r14)
                int r9 = r9 - r3
                if (r9 == 0) goto L4f
                goto L5f
            L4f:
                int r13 = r13 + 1
                int r12 = r12 + 1
                if (r13 != r6) goto L56
                goto L5f
            L56:
                r3 = r1[r11]
                int r3 = r3.length
                if (r3 != r12) goto L94
                int r3 = r1.length
                int r3 = r3 - r8
                if (r11 != r3) goto L8f
            L5f:
                if (r9 >= 0) goto L65
            L61:
                int r5 = r5 + (-1)
                r2 = r5
                goto L6
            L65:
                if (r9 <= 0) goto L6a
            L67:
                int r4 = r10 + 1
                goto L6
            L6a:
                int r3 = r6 - r13
                r7 = r1[r11]
                int r7 = r7.length
                int r7 = r7 - r12
                int r11 = r11 + 1
                int r8 = r1.length
            L73:
                if (r11 >= r8) goto L7c
                r9 = r1[r11]
                int r9 = r9.length
                int r7 = r7 + r9
                int r11 = r11 + 1
                goto L73
            L7c:
                if (r7 >= r3) goto L7f
                goto L61
            L7f:
                if (r7 <= r3) goto L82
                goto L67
            L82:
                java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
                java.lang.String r2 = "UTF_8"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.String r2 = new java.lang.String
                r2.<init>(r0, r5, r6, r1)
                goto L97
            L8f:
                int r11 = r11 + 1
                r9 = 1
                r12 = -1
                goto L2e
            L94:
                r9 = r15
                goto L2e
            L96:
                r2 = 0
            L97:
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.publicsuffix.PublicSuffixDatabase get() {
                r1 = this;
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.access$getInstance$cp()
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$findMatchingRule$1, reason: invalid class name */
    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
        @org.jetbrains.annotations.Nullable
        public java.lang.Object get() {
                r1 = this;
                java.lang.Object r0 = r1.receiver
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = (okhttp3.internal.publicsuffix.PublicSuffixDatabase) r0
                byte[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.access$getPublicSuffixListBytes$p(r0)
                return r0
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
        public void set(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                java.lang.Object r0 = r1.receiver
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = (okhttp3.internal.publicsuffix.PublicSuffixDatabase) r0
                byte[] r2 = (byte[]) r2
                okhttp3.internal.publicsuffix.PublicSuffixDatabase.access$setPublicSuffixListBytes$p(r0, r2)
                return
        }
    }

    static {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 42
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL = r0
            java.lang.String r0 = "*"
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE = r0
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase
            r0.<init>()
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance = r0
            return
    }

    public PublicSuffixDatabase() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.listRead = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.readCompleteLatch = r0
            return
    }

    public static final /* synthetic */ okhttp3.internal.publicsuffix.PublicSuffixDatabase access$getInstance$cp() {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance
            return r0
    }

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(okhttp3.internal.publicsuffix.PublicSuffixDatabase r1) {
            byte[] r1 = r1.publicSuffixListBytes
            if (r1 != 0) goto L9
            java.lang.String r0 = "publicSuffixListBytes"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L9:
            return r1
    }

    public static final /* synthetic */ void access$setPublicSuffixListBytes$p(okhttp3.internal.publicsuffix.PublicSuffixDatabase r0, byte[] r1) {
            r0.publicSuffixListBytes = r1
            return
    }

    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r12) {
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.listRead
            boolean r0 = r0.get()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.listRead
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L16
            r11.readTheListUninterruptibly()
            goto L23
        L16:
            java.util.concurrent.CountDownLatch r0 = r11.readCompleteLatch     // Catch: java.lang.InterruptedException -> L1c
            r0.await()     // Catch: java.lang.InterruptedException -> L1c
            goto L23
        L1c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L23:
            byte[] r0 = r11.publicSuffixListBytes
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L104
            int r0 = r12.size()
            byte[][] r3 = new byte[r0][]
            r4 = 0
        L33:
            if (r4 >= r0) goto L55
            java.lang.Object r5 = r12.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r7 = "UTF_8"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r7)
            byte[] r5 = r5.getBytes(r6)
            java.lang.String r6 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L33
        L55:
            r12 = 0
        L56:
            java.lang.String r4 = "publicSuffixListBytes"
            r5 = 0
            if (r12 >= r0) goto L6e
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r7 = r11.publicSuffixListBytes
            if (r7 != 0) goto L64
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L64:
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r6, r7, r3, r12)
            if (r6 == 0) goto L6b
            goto L6f
        L6b:
            int r12 = r12 + 1
            goto L56
        L6e:
            r6 = r5
        L6f:
            if (r0 <= r1) goto L93
            java.lang.Object r12 = r3.clone()
            byte[][] r12 = (byte[][]) r12
            int r7 = r12.length
            int r7 = r7 - r1
            r8 = 0
        L7a:
            if (r8 >= r7) goto L93
            byte[] r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL
            r12[r8] = r9
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r10 = r11.publicSuffixListBytes
            if (r10 != 0) goto L89
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L89:
            java.lang.String r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r9, r10, r12, r8)
            if (r9 == 0) goto L90
            goto L94
        L90:
            int r8 = r8 + 1
            goto L7a
        L93:
            r9 = r5
        L94:
            if (r9 == 0) goto Lb0
            int r0 = r0 - r1
            r12 = 0
        L98:
            if (r12 >= r0) goto Lb0
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r4 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r7 = r11.publicSuffixExceptionListBytes
            if (r7 != 0) goto La5
            java.lang.String r8 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        La5:
            java.lang.String r4 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r4, r7, r3, r12)
            if (r4 == 0) goto Lad
            r5 = r4
            goto Lb0
        Lad:
            int r12 = r12 + 1
            goto L98
        Lb0:
            r12 = 46
            if (r5 == 0) goto Lce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = 33
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            char[] r1 = new char[r1]
            r1[r2] = r12
            java.util.List r12 = kotlin.text.StringsKt.split$default(r0, r1)
            return r12
        Lce:
            if (r6 != 0) goto Ld5
            if (r9 != 0) goto Ld5
            java.util.List<java.lang.String> r12 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE
            return r12
        Ld5:
            if (r6 == 0) goto Le2
            char[] r0 = new char[r1]
            r0[r2] = r12
            java.util.List r0 = kotlin.text.StringsKt.split$default(r6, r0)
            if (r0 == 0) goto Le2
            goto Le6
        Le2:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        Le6:
            if (r9 == 0) goto Lf3
            char[] r1 = new char[r1]
            r1[r2] = r12
            java.util.List r12 = kotlin.text.StringsKt.split$default(r9, r1)
            if (r12 == 0) goto Lf3
            goto Lf7
        Lf3:
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
        Lf7:
            int r1 = r0.size()
            int r2 = r12.size()
            if (r1 <= r2) goto L102
            goto L103
        L102:
            r0 = r12
        L103:
            return r0
        L104:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
    }

    private final void readTheList() throws java.io.IOException {
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L4b
            okio.GzipSource r1 = new okio.GzipSource
            okio.Source r0 = okio.Okio.source(r0)
            r1.<init>(r0)
            okio.BufferedSource r0 = okio.Okio.buffer(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L44
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L44
            byte[] r2 = r0.readByteArray(r2)     // Catch: java.lang.Throwable -> L44
            int r3 = r0.readInt()     // Catch: java.lang.Throwable -> L44
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L44
            byte[] r3 = r0.readByteArray(r3)     // Catch: java.lang.Throwable -> L44
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L44
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            monitor-enter(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L41
            r5.publicSuffixListBytes = r2     // Catch: java.lang.Throwable -> L41
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L41
            r5.publicSuffixExceptionListBytes = r3     // Catch: java.lang.Throwable -> L41
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.readCompleteLatch
            r0.countDown()
            return
        L41:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L44:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L46
        L46:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        L4b:
            return
    }

    private final void readTheListUninterruptibly() {
            r5 = this;
            r0 = 0
        L1:
            r5.readTheList()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10 java.io.InterruptedIOException -> L27
            if (r0 == 0) goto Ld
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            goto L2c
        L10:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> Le
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.log(r3, r4, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L26
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L26:
            return
        L27:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Le
            r0 = 1
            goto L1
        L2c:
            if (r0 == 0) goto L35
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L35:
            throw r1
    }

    private final java.util.List<java.lang.String> splitDomain(java.lang.String r4) {
            r3 = this;
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 46
            r0[r1] = r2
            java.util.List r4 = kotlin.text.StringsKt.split$default(r4, r0)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L1e
            java.util.List r4 = kotlin.collections.CollectionsKt.dropLast(r4)
        L1e:
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEffectiveTldPlusOne(@org.jetbrains.annotations.NotNull java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "domain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = java.net.IDN.toUnicode(r7)
            java.lang.String r1 = "unicodeDomain"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = r6.splitDomain(r0)
            java.util.List r1 = r6.findMatchingRule(r0)
            int r2 = r0.size()
            int r3 = r1.size()
            r4 = 33
            r5 = 0
            if (r2 != r3) goto L32
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r5)
            if (r2 == r4) goto L32
            r7 = 0
            return r7
        L32:
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r5)
            if (r2 != r4) goto L47
            int r0 = r0.size()
            int r1 = r1.size()
            goto L51
        L47:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + 1
        L51:
            int r0 = r0 - r1
            java.util.List r7 = r6.splitDomain(r7)
            kotlin.sequences.Sequence r7 = kotlin.collections.CollectionsKt.asSequence(r7)
            kotlin.sequences.Sequence r7 = kotlin.sequences.SequencesKt.drop(r7, r0)
            java.lang.String r0 = "."
            java.lang.String r7 = kotlin.sequences.SequencesKt.joinToString$default(r7, r0)
            return r7
    }

    public final void setListBytes(@org.jetbrains.annotations.NotNull byte[] r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            r1 = this;
            java.lang.String r0 = "publicSuffixListBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.publicSuffixListBytes = r2
            r1.publicSuffixExceptionListBytes = r3
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.listRead
            r3 = 1
            r2.set(r3)
            java.util.concurrent.CountDownLatch r2 = r1.readCompleteLatch
            r2.countDown()
            return
    }
}
