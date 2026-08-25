package okhttp3;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class CacheControl {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl FORCE_CACHE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl FORCE_NETWORK = null;
    private java.lang.String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* JADX INFO: compiled from: CacheControl.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds;
        private int maxStaleSeconds;
        private int minFreshSeconds;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.maxAgeSeconds = r0
                r1.maxStaleSeconds = r0
                r1.minFreshSeconds = r0
                return
        }

        private final int clampToInt(long r5) {
                r4 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                long r1 = (long) r0
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 <= 0) goto L9
                goto La
            L9:
                int r0 = (int) r5
            La:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl build() {
                r17 = this;
                r0 = r17
                okhttp3.CacheControl r16 = new okhttp3.CacheControl
                boolean r2 = r0.noCache
                boolean r3 = r0.noStore
                int r4 = r0.maxAgeSeconds
                int r9 = r0.maxStaleSeconds
                int r10 = r0.minFreshSeconds
                boolean r11 = r0.onlyIfCached
                boolean r12 = r0.noTransform
                boolean r13 = r0.immutable
                r5 = -1
                r6 = 0
                r7 = 0
                r8 = 0
                r14 = 0
                r15 = 0
                r1 = r16
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r16
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder immutable() {
                r1 = this;
                r0 = 1
                r1.immutable = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder maxAge(int r3, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r2 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                if (r3 < 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L19
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = r2.clampToInt(r3)
                r2.maxAgeSeconds = r3
                return r2
            L19:
                java.lang.String r4 = "maxAge < 0: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r3)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder maxStale(int r3, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r2 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                if (r3 < 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L19
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = r2.clampToInt(r3)
                r2.maxStaleSeconds = r3
                return r2
            L19:
                java.lang.String r4 = "maxStale < 0: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r3)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder minFresh(int r3, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r2 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                if (r3 < 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L19
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = r2.clampToInt(r3)
                r2.minFreshSeconds = r3
                return r2
            L19:
                java.lang.String r4 = "minFresh < 0: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r3)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder noCache() {
                r1 = this;
                r0 = 1
                r1.noCache = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder noStore() {
                r1 = this;
                r0 = 1
                r1.noStore = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder noTransform() {
                r1 = this;
                r0 = 1
                r1.noTransform = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder onlyIfCached() {
                r1 = this;
                r0 = 1
                r1.onlyIfCached = r0
                return r1
        }
    }

    /* JADX INFO: compiled from: CacheControl.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        private final int indexOfElement(java.lang.String r3, java.lang.String r4, int r5) {
                r2 = this;
                int r0 = r3.length()
            L4:
                if (r5 >= r0) goto L14
                char r1 = r3.charAt(r5)
                boolean r1 = kotlin.text.StringsKt.contains$default(r4, r1)
                if (r1 == 0) goto L11
                return r5
            L11:
                int r5 = r5 + 1
                goto L4
            L14:
                int r3 = r3.length()
                return r3
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r28) {
                r27 = this;
                r0 = r27
                r1 = r28
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                int r2 = r28.size()
                r7 = 0
                r8 = 1
                r9 = 0
                r11 = 0
                r12 = 0
                r13 = -1
                r14 = -1
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = -1
                r19 = -1
                r20 = 0
                r21 = 0
                r22 = 0
            L23:
                if (r7 >= r2) goto L175
                java.lang.String r10 = r1.name(r7)
                java.lang.String r3 = r1.value(r7)
                java.lang.String r5 = "Cache-Control"
                boolean r5 = kotlin.text.StringsKt.equals(r10, r5)
                if (r5 == 0) goto L3a
                if (r9 == 0) goto L38
                goto L42
            L38:
                r9 = r3
                goto L43
            L3a:
                java.lang.String r5 = "Pragma"
                boolean r5 = kotlin.text.StringsKt.equals(r10, r5)
                if (r5 == 0) goto L168
            L42:
                r8 = 0
            L43:
                r5 = 0
            L44:
                int r10 = r3.length()
                if (r5 >= r10) goto L168
                java.lang.String r10 = "=,;"
                int r10 = r0.indexOfElement(r3, r10, r5)
                java.lang.String r5 = r3.substring(r5, r10)
                java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r5, r6)
                java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)
                java.lang.String r5 = r5.toString()
                int r1 = r3.length()
                if (r10 == r1) goto Lc1
                char r1 = r3.charAt(r10)
                r26 = r2
                r2 = 44
                if (r1 == r2) goto Lc3
                char r1 = r3.charAt(r10)
                r2 = 59
                if (r1 != r2) goto L7f
                goto Lc3
            L7f:
                int r10 = r10 + 1
                int r1 = okhttp3.internal.Util.indexOfNonWhitespace(r3, r10)
                int r2 = r3.length()
                if (r1 >= r2) goto La6
                char r2 = r3.charAt(r1)
                r10 = 34
                if (r2 != r10) goto La6
                int r1 = r1 + 1
                r2 = 4
                int r2 = kotlin.text.StringsKt.indexOf$default(r3, r10, r1, r2)
                java.lang.String r1 = r3.substring(r1, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
                r25 = 1
                int r2 = r2 + 1
                goto Lc9
            La6:
                r25 = 1
                java.lang.String r2 = ",;"
                int r2 = r0.indexOfElement(r3, r2, r1)
                java.lang.String r1 = r3.substring(r1, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
                java.util.Objects.requireNonNull(r1, r6)
                java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
                java.lang.String r1 = r1.toString()
                goto Lc9
            Lc1:
                r26 = r2
            Lc3:
                r25 = 1
                int r10 = r10 + 1
                r2 = r10
                r1 = 0
            Lc9:
                java.lang.String r4 = "no-cache"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5)
                if (r4 == 0) goto Ld5
                r4 = -1
                r11 = 1
                goto L161
            Ld5:
                java.lang.String r4 = "no-store"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5)
                if (r4 == 0) goto Le1
                r4 = -1
                r12 = 1
                goto L161
            Le1:
                java.lang.String r4 = "max-age"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5)
                if (r4 == 0) goto Lf0
                r4 = -1
                int r13 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                goto L161
            Lf0:
                r4 = -1
                java.lang.String r6 = "s-maxage"
                boolean r6 = kotlin.text.StringsKt.equals(r6, r5)
                if (r6 == 0) goto Lfe
                int r14 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                goto L161
            Lfe:
                java.lang.String r4 = "private"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5)
                if (r4 == 0) goto L109
                r4 = -1
                r15 = 1
                goto L161
            L109:
                java.lang.String r4 = "public"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5)
                if (r4 == 0) goto L115
                r4 = -1
                r16 = 1
                goto L161
            L115:
                java.lang.String r4 = "must-revalidate"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5)
                if (r4 == 0) goto L121
                r4 = -1
                r17 = 1
                goto L161
            L121:
                java.lang.String r4 = "max-stale"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5)
                if (r4 == 0) goto L132
                r4 = 2147483647(0x7fffffff, float:NaN)
                int r18 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                r4 = -1
                goto L161
            L132:
                java.lang.String r4 = "min-fresh"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5)
                if (r4 == 0) goto L140
                r4 = -1
                int r19 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                goto L161
            L140:
                r4 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = kotlin.text.StringsKt.equals(r1, r5)
                if (r1 == 0) goto L14c
                r20 = 1
                goto L161
            L14c:
                java.lang.String r1 = "no-transform"
                boolean r1 = kotlin.text.StringsKt.equals(r1, r5)
                if (r1 == 0) goto L157
                r21 = 1
                goto L161
            L157:
                java.lang.String r1 = "immutable"
                boolean r1 = kotlin.text.StringsKt.equals(r1, r5)
                if (r1 == 0) goto L161
                r22 = 1
            L161:
                r1 = r28
                r5 = r2
                r2 = r26
                goto L44
            L168:
                r26 = r2
                r4 = -1
                r25 = 1
                int r7 = r7 + 1
                r1 = r28
                r2 = r26
                goto L23
            L175:
                if (r8 != 0) goto L17a
                r23 = 0
                goto L17c
            L17a:
                r23 = r9
            L17c:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r24 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return r1
        }
    }

    static {
            okhttp3.CacheControl$Companion r0 = new okhttp3.CacheControl$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.CacheControl.Companion = r0
            okhttp3.CacheControl$Builder r0 = new okhttp3.CacheControl$Builder
            r0.<init>()
            okhttp3.CacheControl$Builder r0 = r0.noCache()
            okhttp3.CacheControl r0 = r0.build()
            okhttp3.CacheControl.FORCE_NETWORK = r0
            okhttp3.CacheControl$Builder r0 = new okhttp3.CacheControl$Builder
            r0.<init>()
            okhttp3.CacheControl$Builder r0 = r0.onlyIfCached()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 2147483647(0x7fffffff, float:NaN)
            okhttp3.CacheControl$Builder r0 = r0.maxStale(r2, r1)
            okhttp3.CacheControl r0 = r0.build()
            okhttp3.CacheControl.FORCE_CACHE = r0
            return
    }

    private CacheControl(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13) {
            r0 = this;
            r0.<init>()
            r0.noCache = r1
            r0.noStore = r2
            r0.maxAgeSeconds = r3
            r0.sMaxAgeSeconds = r4
            r0.isPrivate = r5
            r0.isPublic = r6
            r0.mustRevalidate = r7
            r0.maxStaleSeconds = r8
            r0.minFreshSeconds = r9
            r0.onlyIfCached = r10
            r0.noTransform = r11
            r0.immutable = r12
            r0.headerValue = r13
            return
    }

    public /* synthetic */ CacheControl(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r1) {
            okhttp3.CacheControl$Companion r0 = okhttp3.CacheControl.Companion
            okhttp3.CacheControl r1 = r0.parse(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "immutable", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_immutable")
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m1891deprecated_immutable() {
            r1 = this;
            boolean r0 = r1.immutable
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_maxAgeSeconds")
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m1892deprecated_maxAgeSeconds() {
            r1 = this;
            int r0 = r1.maxAgeSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_maxStaleSeconds")
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m1893deprecated_maxStaleSeconds() {
            r1 = this;
            int r0 = r1.maxStaleSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "minFreshSeconds", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_minFreshSeconds")
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m1894deprecated_minFreshSeconds() {
            r1 = this;
            int r0 = r1.minFreshSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "mustRevalidate", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_mustRevalidate")
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m1895deprecated_mustRevalidate() {
            r1 = this;
            boolean r0 = r1.mustRevalidate
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noCache", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_noCache")
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m1896deprecated_noCache() {
            r1 = this;
            boolean r0 = r1.noCache
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noStore", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_noStore")
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m1897deprecated_noStore() {
            r1 = this;
            boolean r0 = r1.noStore
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noTransform", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_noTransform")
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m1898deprecated_noTransform() {
            r1 = this;
            boolean r0 = r1.noTransform
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "onlyIfCached", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_onlyIfCached")
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m1899deprecated_onlyIfCached() {
            r1 = this;
            boolean r0 = r1.onlyIfCached
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_sMaxAgeSeconds")
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m1900deprecated_sMaxAgeSeconds() {
            r1 = this;
            int r0 = r1.sMaxAgeSeconds
            return r0
    }

    @kotlin.jvm.JvmName(name = "immutable")
    public final boolean immutable() {
            r1 = this;
            boolean r0 = r1.immutable
            return r0
    }

    public final boolean isPrivate() {
            r1 = this;
            boolean r0 = r1.isPrivate
            return r0
    }

    public final boolean isPublic() {
            r1 = this;
            boolean r0 = r1.isPublic
            return r0
    }

    @kotlin.jvm.JvmName(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
            r1 = this;
            int r0 = r1.maxAgeSeconds
            return r0
    }

    @kotlin.jvm.JvmName(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
            r1 = this;
            int r0 = r1.maxStaleSeconds
            return r0
    }

    @kotlin.jvm.JvmName(name = "minFreshSeconds")
    public final int minFreshSeconds() {
            r1 = this;
            int r0 = r1.minFreshSeconds
            return r0
    }

    @kotlin.jvm.JvmName(name = "mustRevalidate")
    public final boolean mustRevalidate() {
            r1 = this;
            boolean r0 = r1.mustRevalidate
            return r0
    }

    @kotlin.jvm.JvmName(name = "noCache")
    public final boolean noCache() {
            r1 = this;
            boolean r0 = r1.noCache
            return r0
    }

    @kotlin.jvm.JvmName(name = "noStore")
    public final boolean noStore() {
            r1 = this;
            boolean r0 = r1.noStore
            return r0
    }

    @kotlin.jvm.JvmName(name = "noTransform")
    public final boolean noTransform() {
            r1 = this;
            boolean r0 = r1.noTransform
            return r0
    }

    @kotlin.jvm.JvmName(name = "onlyIfCached")
    public final boolean onlyIfCached() {
            r1 = this;
            boolean r0 = r1.onlyIfCached
            return r0
    }

    @kotlin.jvm.JvmName(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
            r1 = this;
            int r0 = r1.sMaxAgeSeconds
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.headerValue
            if (r0 != 0) goto Lba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r4.noCache
            if (r1 == 0) goto L12
            java.lang.String r1 = "no-cache, "
            r0.append(r1)
        L12:
            boolean r1 = r4.noStore
            if (r1 == 0) goto L1b
            java.lang.String r1 = "no-store, "
            r0.append(r1)
        L1b:
            int r1 = r4.maxAgeSeconds
            java.lang.String r2 = ", "
            r3 = -1
            if (r1 == r3) goto L2f
            java.lang.String r1 = "max-age="
            r0.append(r1)
            int r1 = r4.maxAgeSeconds
            r0.append(r1)
            r0.append(r2)
        L2f:
            int r1 = r4.sMaxAgeSeconds
            if (r1 == r3) goto L41
            java.lang.String r1 = "s-maxage="
            r0.append(r1)
            int r1 = r4.sMaxAgeSeconds
            r0.append(r1)
            r0.append(r2)
        L41:
            boolean r1 = r4.isPrivate
            if (r1 == 0) goto L4a
            java.lang.String r1 = "private, "
            r0.append(r1)
        L4a:
            boolean r1 = r4.isPublic
            if (r1 == 0) goto L53
            java.lang.String r1 = "public, "
            r0.append(r1)
        L53:
            boolean r1 = r4.mustRevalidate
            if (r1 == 0) goto L5c
            java.lang.String r1 = "must-revalidate, "
            r0.append(r1)
        L5c:
            int r1 = r4.maxStaleSeconds
            if (r1 == r3) goto L6d
            java.lang.String r1 = "max-stale="
            r0.append(r1)
            int r1 = r4.maxStaleSeconds
            r0.append(r1)
            r0.append(r2)
        L6d:
            int r1 = r4.minFreshSeconds
            if (r1 == r3) goto L7e
            java.lang.String r1 = "min-fresh="
            r0.append(r1)
            int r1 = r4.minFreshSeconds
            r0.append(r1)
            r0.append(r2)
        L7e:
            boolean r1 = r4.onlyIfCached
            if (r1 == 0) goto L87
            java.lang.String r1 = "only-if-cached, "
            r0.append(r1)
        L87:
            boolean r1 = r4.noTransform
            if (r1 == 0) goto L90
            java.lang.String r1 = "no-transform, "
            r0.append(r1)
        L90:
            boolean r1 = r4.immutable
            if (r1 == 0) goto L99
            java.lang.String r1 = "immutable, "
            r0.append(r1)
        L99:
            int r1 = r0.length()
            if (r1 != 0) goto La2
            java.lang.String r0 = ""
            return r0
        La2:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            r0.delete(r1, r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r4.headerValue = r0
        Lba:
            return r0
    }
}
