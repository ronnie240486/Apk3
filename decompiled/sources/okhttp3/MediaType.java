package okhttp3;

/* JADX INFO: compiled from: MediaType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0019"}, d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "parameterNamesAndValues", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "[Ljava/lang/String;", "()Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "equals", "", "other", "hashCode", "", "parameter", "name", "-deprecated_subtype", "toString", "-deprecated_type", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class MediaType {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType.Companion Companion = null;
    private static final java.util.regex.Pattern PARAMETER = null;
    private static final java.lang.String QUOTED = "\"([^\"]*)\"";
    private static final java.lang.String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final java.util.regex.Pattern TYPE_SUBTYPE = null;
    private final java.lang.String mediaType;
    private final java.lang.String[] parameterNamesAndValues;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String subtype;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String type;

    /* JADX INFO: compiled from: MediaType.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\nJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "()V", "PARAMETER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUOTED", "", "TOKEN", "TYPE_SUBTYPE", "get", "Lokhttp3/MediaType;", "mediaType", "-deprecated_get", "parse", "-deprecated_parse", "toMediaType", "toMediaTypeOrNull", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.MediaType m1955deprecated_get(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.MediaType r2 = r1.get(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @kotlin.jvm.JvmName(name = "-deprecated_parse")
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.MediaType m1956deprecated_parse(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.MediaType r2 = r1.parse(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.MediaType get(@org.jetbrains.annotations.NotNull java.lang.String r14) {
                r13 = this;
                java.lang.String r0 = "$this$toMediaType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.util.regex.Pattern r0 = okhttp3.MediaType.access$getTYPE_SUBTYPE$cp()
                java.util.regex.Matcher r0 = r0.matcher(r14)
                boolean r1 = r0.lookingAt()
                r2 = 34
                if (r1 == 0) goto Lf6
                r1 = 1
                java.lang.String r3 = r0.group(r1)
                java.lang.String r4 = "typeSubtype.group(1)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r5 = "Locale.US"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r3, r6)
                java.lang.String r9 = r3.toLowerCase(r4)
                java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)
                r7 = 2
                java.lang.String r8 = r0.group(r7)
                java.lang.String r10 = "typeSubtype.group(2)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                java.util.Objects.requireNonNull(r8, r6)
                java.lang.String r10 = r8.toLowerCase(r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.regex.Pattern r4 = okhttp3.MediaType.access$getPARAMETER$cp()
                java.util.regex.Matcher r4 = r4.matcher(r14)
                int r0 = r0.end()
            L5c:
                int r5 = r14.length()
                r6 = 0
                if (r0 >= r5) goto Ldf
                int r5 = r14.length()
                r4.region(r0, r5)
                boolean r5 = r4.lookingAt()
                if (r5 == 0) goto Lb4
                java.lang.String r0 = r4.group(r1)
                if (r0 != 0) goto L7b
                int r0 = r4.end()
                goto L5c
            L7b:
                java.lang.String r5 = r4.group(r7)
                if (r5 != 0) goto L87
                r5 = 3
                java.lang.String r5 = r4.group(r5)
                goto La9
            L87:
                java.lang.String r6 = "'"
                boolean r8 = kotlin.text.StringsKt.startsWith$default(r5, r6)
                if (r8 == 0) goto La9
                boolean r6 = kotlin.text.StringsKt.endsWith$default(r5, r6)
                if (r6 == 0) goto La9
                int r6 = r5.length()
                if (r6 <= r7) goto La9
                int r6 = r5.length()
                int r6 = r6 - r1
                java.lang.String r5 = r5.substring(r1, r6)
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            La9:
                r3.add(r0)
                r3.add(r5)
                int r0 = r4.end()
                goto L5c
            Lb4:
                java.lang.String r1 = "Parameter is not formatted correctly: \""
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r0 = r14.substring(r0)
                java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                r1.append(r0)
                java.lang.String r0 = "\" for: \""
                r1.append(r0)
                r1.append(r14)
                r1.append(r2)
                java.lang.String r14 = r1.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
            Ldf:
                okhttp3.MediaType r0 = new okhttp3.MediaType
                java.lang.String[] r1 = new java.lang.String[r6]
                java.lang.Object[] r1 = r3.toArray(r1)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r1, r2)
                r11 = r1
                java.lang.String[] r11 = (java.lang.String[]) r11
                r12 = 0
                r7 = r0
                r8 = r14
                r7.<init>(r8, r9, r10, r11, r12)
                return r0
            Lf6:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "No subtype found for: \""
                r0.append(r1)
                r0.append(r14)
                r0.append(r2)
                java.lang.String r14 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "parse")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.MediaType parse(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "$this$toMediaTypeOrNull"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.MediaType r2 = r1.get(r2)     // Catch: java.lang.IllegalArgumentException -> La
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }
    }

    static {
            okhttp3.MediaType$Companion r0 = new okhttp3.MediaType$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MediaType.Companion = r0
            java.lang.String r0 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.MediaType.TYPE_SUBTYPE = r0
            java.lang.String r0 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.MediaType.PARAMETER = r0
            return
    }

    private MediaType(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.mediaType = r1
            r0.type = r2
            r0.subtype = r3
            r0.parameterNamesAndValues = r4
            return
    }

    public /* synthetic */ MediaType(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getPARAMETER$cp() {
            java.util.regex.Pattern r0 = okhttp3.MediaType.PARAMETER
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getTYPE_SUBTYPE$cp() {
            java.util.regex.Pattern r0 = okhttp3.MediaType.TYPE_SUBTYPE
            return r0
    }

    public static /* synthetic */ java.nio.charset.Charset charset$default(okhttp3.MediaType r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.nio.charset.Charset r0 = r0.charset(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType get(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            okhttp3.MediaType r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "parse")
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.MediaType parse(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            okhttp3.MediaType r1 = r0.parse(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "subtype", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_subtype")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name */
    public final java.lang.String m1953deprecated_subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "type", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_type")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final java.lang.String m1954deprecated_type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final java.nio.charset.Charset charset() {
            r2 = this;
            r0 = 0
            r1 = 1
            java.nio.charset.Charset r0 = charset$default(r2, r0, r1, r0)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final java.nio.charset.Charset charset(@org.jetbrains.annotations.Nullable java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            java.lang.String r0 = r1.parameter(r0)
            if (r0 == 0) goto Lc
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> Lc
        Lc:
            return r2
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.MediaType
            if (r0 == 0) goto L12
            okhttp3.MediaType r2 = (okhttp3.MediaType) r2
            java.lang.String r2 = r2.mediaType
            java.lang.String r0 = r1.mediaType
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String parameter(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String[] r0 = r4.parameterNamesAndValues
            kotlin.ranges.IntRange r0 = kotlin.collections.ArraysKt.getIndices(r0)
            r1 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            int r1 = r0.getFirst()
            int r2 = r0.getLast()
            int r0 = r0.getStep()
            if (r0 < 0) goto L21
            if (r1 > r2) goto L38
            goto L23
        L21:
            if (r1 < r2) goto L38
        L23:
            java.lang.String[] r3 = r4.parameterNamesAndValues
            r3 = r3[r1]
            boolean r3 = kotlin.text.StringsKt.equals(r3, r5)
            if (r3 == 0) goto L34
            java.lang.String[] r5 = r4.parameterNamesAndValues
            int r1 = r1 + 1
            r5 = r5[r1]
            return r5
        L34:
            if (r1 == r2) goto L38
            int r1 = r1 + r0
            goto L23
        L38:
            r5 = 0
            return r5
    }

    @kotlin.jvm.JvmName(name = "subtype")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            return r0
    }

    @kotlin.jvm.JvmName(name = "type")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }
}
