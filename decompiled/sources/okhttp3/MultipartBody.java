package okhttp3;

/* JADX INFO: compiled from: MultipartBody.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0003\"#$B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u0015J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0012J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b\u0018J\r\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u001aJ\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014¨\u0006%"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "boundaryByteString", "Lokio/ByteString;", "type", "Lokhttp3/MediaType;", "parts", "", "Lokhttp3/MultipartBody$Part;", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "boundary", "", "()Ljava/lang/String;", "contentLength", "", "contentType", "()Ljava/util/List;", "size", "", "()I", "()Lokhttp3/MediaType;", "-deprecated_boundary", "part", "index", "-deprecated_parts", "-deprecated_size", "-deprecated_type", "writeOrCountBytes", "sink", "Lokio/BufferedSink;", "countBytes", "", "writeTo", "", "Builder", "Companion", "Part", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class MultipartBody extends okhttp3.RequestBody {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType ALTERNATIVE = null;
    private static final byte[] COLONSPACE = null;
    private static final byte[] CRLF = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MultipartBody.Companion Companion = null;
    private static final byte[] DASHDASH = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType DIGEST = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType FORM = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType MIXED = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType PARALLEL = null;
    private final okio.ByteString boundaryByteString;
    private long contentLength;
    private final okhttp3.MediaType contentType;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.MultipartBody.Part> parts;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.MediaType type;

    /* JADX INFO: compiled from: MultipartBody.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "boundary", "", "(Ljava/lang/String;)V", "Lokio/ByteString;", "parts", "", "Lokhttp3/MultipartBody$Part;", "type", "Lokhttp3/MediaType;", "addFormDataPart", "name", "value", "filename", "body", "Lokhttp3/RequestBody;", "addPart", "headers", "Lokhttp3/Headers;", "part", "build", "Lokhttp3/MultipartBody;", "setType", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {
        private final okio.ByteString boundary;
        private final java.util.List<okhttp3.MultipartBody.Part> parts;
        private okhttp3.MediaType type;

        @kotlin.jvm.JvmOverloads
        public Builder() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Builder(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "boundary"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                okio.ByteString r2 = r0.encodeUtf8(r2)
                r1.boundary = r2
                okhttp3.MediaType r2 = okhttp3.MultipartBody.MIXED
                r1.type = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.parts = r2
                return
        }

        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            L11:
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addFormDataPart(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.createFormData(r2, r3)
                r1.addPart(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addFormDataPart(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r4) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.createFormData(r2, r3, r4)
                r1.addPart(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addPart(@org.jetbrains.annotations.Nullable okhttp3.Headers r2, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r3) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.create(r2, r3)
                r1.addPart(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addPart(@org.jetbrains.annotations.NotNull okhttp3.MultipartBody.Part r2) {
                r1 = this;
                java.lang.String r0 = "part"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
                r0.add(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addPart(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.create(r2)
                r1.addPart(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody build() {
                r4 = this;
                java.util.List<okhttp3.MultipartBody$Part> r0 = r4.parts
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                if (r0 == 0) goto L1a
                okhttp3.MultipartBody r0 = new okhttp3.MultipartBody
                okio.ByteString r1 = r4.boundary
                okhttp3.MediaType r2 = r4.type
                java.util.List<okhttp3.MultipartBody$Part> r3 = r4.parts
                java.util.List r3 = okhttp3.internal.Util.toImmutableList(r3)
                r0.<init>(r1, r2, r3)
                return r0
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Multipart body must have at least one part."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder setType(@org.jetbrains.annotations.NotNull okhttp3.MediaType r3) {
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = r3.type()
                java.lang.String r1 = "multipart"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L15
                r2.type = r3
                return r2
            L15:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "multipart != "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\r\u001a\u00020\u000e*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "()V", "ALTERNATIVE", "Lokhttp3/MediaType;", "COLONSPACE", "", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "appendQuotedString", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "key", "", "appendQuotedString$okhttp", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        public final void appendQuotedString$okhttp(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
                r5 = this;
                java.lang.String r0 = "$this$appendQuotedString"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = 34
                r6.append(r0)
                int r1 = r7.length()
                r2 = 0
            L14:
                if (r2 >= r1) goto L3c
                char r3 = r7.charAt(r2)
                r4 = 10
                if (r3 == r4) goto L34
                r4 = 13
                if (r3 == r4) goto L2e
                if (r3 == r0) goto L28
                r6.append(r3)
                goto L39
            L28:
                java.lang.String r3 = "%22"
                r6.append(r3)
                goto L39
            L2e:
                java.lang.String r3 = "%0D"
                r6.append(r3)
                goto L39
            L34:
                java.lang.String r3 = "%0A"
                r6.append(r3)
            L39:
                int r2 = r2 + 1
                goto L14
            L3c:
                r6.append(r0)
                return
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\f"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/RequestBody;", "()Lokhttp3/Headers;", "-deprecated_body", "-deprecated_headers", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Part {

        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.RequestBody body;

        @org.jetbrains.annotations.Nullable
        private final okhttp3.Headers headers;

        /* JADX INFO: compiled from: MultipartBody.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "()V", "create", "Lokhttp3/MultipartBody$Part;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "createFormData", "name", "", "value", "filename", "okhttp"}, k = 1, mv = {1, 4, 1})
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
            public final okhttp3.MultipartBody.Part create(@org.jetbrains.annotations.Nullable okhttp3.Headers r5, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r6) {
                    r4 = this;
                    java.lang.String r0 = "body"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    r0 = 0
                    if (r5 == 0) goto Lf
                    java.lang.String r1 = "Content-Type"
                    java.lang.String r1 = r5.get(r1)
                    goto L10
                Lf:
                    r1 = r0
                L10:
                    r2 = 1
                    r3 = 0
                    if (r1 != 0) goto L16
                    r1 = 1
                    goto L17
                L16:
                    r1 = 0
                L17:
                    if (r1 == 0) goto L3b
                    if (r5 == 0) goto L22
                    java.lang.String r1 = "Content-Length"
                    java.lang.String r1 = r5.get(r1)
                    goto L23
                L22:
                    r1 = r0
                L23:
                    if (r1 != 0) goto L26
                    goto L27
                L26:
                    r2 = 0
                L27:
                    if (r2 == 0) goto L2f
                    okhttp3.MultipartBody$Part r1 = new okhttp3.MultipartBody$Part
                    r1.<init>(r5, r6, r0)
                    return r1
                L2f:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r6 = "Unexpected header: Content-Length"
                    java.lang.String r6 = r6.toString()
                    r5.<init>(r6)
                    throw r5
                L3b:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r6 = "Unexpected header: Content-Type"
                    java.lang.String r6 = r6.toString()
                    r5.<init>(r6)
                    throw r5
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final okhttp3.MultipartBody.Part create(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                    r1 = this;
                    java.lang.String r0 = "body"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    r0 = 0
                    okhttp3.MultipartBody$Part r2 = r1.create(r0, r2)
                    return r2
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final okhttp3.MultipartBody.Part createFormData(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
                    r3 = this;
                    java.lang.String r0 = "name"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
                    r1 = 0
                    r2 = 1
                    okhttp3.RequestBody r5 = okhttp3.RequestBody.Companion.create$default(r0, r5, r1, r2, r1)
                    okhttp3.MultipartBody$Part r4 = r3.createFormData(r4, r1, r5)
                    return r4
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final okhttp3.MultipartBody.Part createFormData(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r5) {
                    r2 = this;
                    java.lang.String r0 = "name"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r0 = "body"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "form-data; name="
                    r0.append(r1)
                    okhttp3.MultipartBody$Companion r1 = okhttp3.MultipartBody.Companion
                    r1.appendQuotedString$okhttp(r0, r3)
                    if (r4 == 0) goto L23
                    java.lang.String r3 = "; filename="
                    r0.append(r3)
                    r1.appendQuotedString$okhttp(r0, r4)
                L23:
                    java.lang.String r3 = r0.toString()
                    java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                    okhttp3.Headers$Builder r4 = new okhttp3.Headers$Builder
                    r4.<init>()
                    java.lang.String r0 = "Content-Disposition"
                    okhttp3.Headers$Builder r3 = r4.addUnsafeNonAscii(r0, r3)
                    okhttp3.Headers r3 = r3.build()
                    okhttp3.MultipartBody$Part r3 = r2.create(r3, r5)
                    return r3
            }
        }

        static {
                okhttp3.MultipartBody$Part$Companion r0 = new okhttp3.MultipartBody$Part$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.MultipartBody.Part.Companion = r0
                return
        }

        private Part(okhttp3.Headers r1, okhttp3.RequestBody r2) {
                r0 = this;
                r0.<init>()
                r0.headers = r1
                r0.body = r2
                return
        }

        public /* synthetic */ Part(okhttp3.Headers r1, okhttp3.RequestBody r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part create(@org.jetbrains.annotations.Nullable okhttp3.Headers r1, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.create(r1, r2)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part create(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r1) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.create(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part createFormData(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.createFormData(r1, r2)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part createFormData(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r3) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.createFormData(r1, r2, r3)
                return r1
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_body")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
        public final okhttp3.RequestBody m1961deprecated_body() {
                r1 = this;
                okhttp3.RequestBody r0 = r1.body
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_headers")
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
        public final okhttp3.Headers m1962deprecated_headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }

        @kotlin.jvm.JvmName(name = "body")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody body() {
                r1 = this;
                okhttp3.RequestBody r0 = r1.body
                return r0
        }

        @kotlin.jvm.JvmName(name = "headers")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.Headers headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }
    }

    static {
            okhttp3.MultipartBody$Companion r0 = new okhttp3.MultipartBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MultipartBody.Companion = r0
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            java.lang.String r1 = "multipart/mixed"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.MIXED = r1
            java.lang.String r1 = "multipart/alternative"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.ALTERNATIVE = r1
            java.lang.String r1 = "multipart/digest"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.DIGEST = r1
            java.lang.String r1 = "multipart/parallel"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.PARALLEL = r1
            java.lang.String r1 = "multipart/form-data"
            okhttp3.MediaType r0 = r0.get(r1)
            okhttp3.MultipartBody.FORM = r0
            r0 = 2
            byte[] r1 = new byte[r0]
            r2 = 58
            byte r2 = (byte) r2
            r3 = 0
            r1[r3] = r2
            r2 = 32
            byte r2 = (byte) r2
            r4 = 1
            r1[r4] = r2
            okhttp3.MultipartBody.COLONSPACE = r1
            byte[] r1 = new byte[r0]
            r2 = 13
            byte r2 = (byte) r2
            r1[r3] = r2
            r2 = 10
            byte r2 = (byte) r2
            r1[r4] = r2
            okhttp3.MultipartBody.CRLF = r1
            byte[] r0 = new byte[r0]
            r1 = 45
            byte r1 = (byte) r1
            r0[r3] = r1
            r0[r4] = r1
            okhttp3.MultipartBody.DASHDASH = r0
            return
    }

    public MultipartBody(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.NotNull okhttp3.MediaType r3, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.MultipartBody.Part> r4) {
            r1 = this;
            java.lang.String r0 = "boundaryByteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "parts"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.boundaryByteString = r2
            r1.type = r3
            r1.parts = r4
            okhttp3.MediaType$Companion r2 = okhttp3.MediaType.Companion
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "; boundary="
            r4.append(r3)
            java.lang.String r3 = r1.boundary()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            okhttp3.MediaType r2 = r2.get(r3)
            r1.contentType = r2
            r2 = -1
            r1.contentLength = r2
            return
    }

    private final long writeOrCountBytes(okio.BufferedSink r13, boolean r14) throws java.io.IOException {
            r12 = this;
            if (r14 == 0) goto L9
            okio.Buffer r13 = new okio.Buffer
            r13.<init>()
            r0 = r13
            goto La
        L9:
            r0 = 0
        La:
            java.util.List<okhttp3.MultipartBody$Part> r1 = r12.parts
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L14:
            if (r5 >= r1) goto Lae
            java.util.List<okhttp3.MultipartBody$Part> r6 = r12.parts
            java.lang.Object r6 = r6.get(r5)
            okhttp3.MultipartBody$Part r6 = (okhttp3.MultipartBody.Part) r6
            okhttp3.Headers r7 = r6.headers()
            okhttp3.RequestBody r6 = r6.body()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            byte[] r8 = okhttp3.MultipartBody.DASHDASH
            r13.write(r8)
            okio.ByteString r8 = r12.boundaryByteString
            r13.write(r8)
            byte[] r8 = okhttp3.MultipartBody.CRLF
            r13.write(r8)
            if (r7 == 0) goto L5f
            int r8 = r7.size()
            r9 = 0
        L3f:
            if (r9 >= r8) goto L5f
            java.lang.String r10 = r7.name(r9)
            okio.BufferedSink r10 = r13.writeUtf8(r10)
            byte[] r11 = okhttp3.MultipartBody.COLONSPACE
            okio.BufferedSink r10 = r10.write(r11)
            java.lang.String r11 = r7.value(r9)
            okio.BufferedSink r10 = r10.writeUtf8(r11)
            byte[] r11 = okhttp3.MultipartBody.CRLF
            r10.write(r11)
            int r9 = r9 + 1
            goto L3f
        L5f:
            okhttp3.MediaType r7 = r6.contentType()
            if (r7 == 0) goto L78
            java.lang.String r8 = "Content-Type: "
            okio.BufferedSink r8 = r13.writeUtf8(r8)
            java.lang.String r7 = r7.toString()
            okio.BufferedSink r7 = r8.writeUtf8(r7)
            byte[] r8 = okhttp3.MultipartBody.CRLF
            r7.write(r8)
        L78:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L92
            java.lang.String r9 = "Content-Length: "
            okio.BufferedSink r9 = r13.writeUtf8(r9)
            okio.BufferedSink r9 = r9.writeDecimalLong(r7)
            byte[] r10 = okhttp3.MultipartBody.CRLF
            r9.write(r10)
            goto L9b
        L92:
            if (r14 == 0) goto L9b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.clear()
            return r9
        L9b:
            byte[] r9 = okhttp3.MultipartBody.CRLF
            r13.write(r9)
            if (r14 == 0) goto La4
            long r3 = r3 + r7
            goto La7
        La4:
            r6.writeTo(r13)
        La7:
            r13.write(r9)
            int r5 = r5 + 1
            goto L14
        Lae:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            byte[] r1 = okhttp3.MultipartBody.DASHDASH
            r13.write(r1)
            okio.ByteString r2 = r12.boundaryByteString
            r13.write(r2)
            r13.write(r1)
            byte[] r1 = okhttp3.MultipartBody.CRLF
            r13.write(r1)
            if (r14 == 0) goto Ld0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r13 = r0.size()
            long r3 = r3 + r13
            r0.clear()
        Ld0:
            return r3
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "boundary", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_boundary")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final java.lang.String m1957deprecated_boundary() {
            r1 = this;
            java.lang.String r0 = r1.boundary()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "parts", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_parts")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final java.util.List<okhttp3.MultipartBody.Part> m1958deprecated_parts() {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m1959deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "type", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_type")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final okhttp3.MediaType m1960deprecated_type() {
            r1 = this;
            okhttp3.MediaType r0 = r1.type
            return r0
    }

    @kotlin.jvm.JvmName(name = "boundary")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String boundary() {
            r1 = this;
            okio.ByteString r0 = r1.boundaryByteString
            java.lang.String r0 = r0.utf8()
            return r0
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws java.io.IOException {
            r5 = this;
            long r0 = r5.contentLength
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            r0 = 0
            r1 = 1
            long r0 = r5.writeOrCountBytes(r0, r1)
            r5.contentLength = r0
        L10:
            return r0
    }

    @Override // okhttp3.RequestBody
    @org.jetbrains.annotations.NotNull
    public okhttp3.MediaType contentType() {
            r1 = this;
            okhttp3.MediaType r0 = r1.contentType
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.MultipartBody.Part part(int r2) {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            java.lang.Object r2 = r0.get(r2)
            okhttp3.MultipartBody$Part r2 = (okhttp3.MultipartBody.Part) r2
            return r2
    }

    @kotlin.jvm.JvmName(name = "parts")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.MultipartBody.Part> parts() {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            return r0
    }

    @kotlin.jvm.JvmName(name = "size")
    public final int size() {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            int r0 = r0.size()
            return r0
    }

    @kotlin.jvm.JvmName(name = "type")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.MediaType type() {
            r1 = this;
            okhttp3.MediaType r0 = r1.type
            return r0
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@org.jetbrains.annotations.NotNull okio.BufferedSink r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.writeOrCountBytes(r2, r0)
            return
    }
}
