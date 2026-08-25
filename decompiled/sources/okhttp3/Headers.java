package okhttp3;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 '2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002&'B\u0015\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\b\u0010\u0017\u001a\u00020\tH\u0016J\u001b\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0019H\u0096\u0002J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u001fJ\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"0!J\b\u0010#\u001a\u00020\u0003H\u0016J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010\u0012\u001a\u00020\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006("}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "namesAndValues", "", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "size", "", "()I", "byteCount", "", "equals", "", "other", "", "get", "name", "getDate", "Ljava/util/Date;", "getInstant", "Ljava/time/Instant;", "hashCode", "iterator", "", "index", "names", "", "newBuilder", "Lokhttp3/Headers$Builder;", "-deprecated_size", "toMultimap", "", "", "toString", "value", "values", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Headers implements java.lang.Iterable<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>>, kotlin.jvm.internal.markers.KMappedMarker {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Companion Companion = null;
    private final java.lang.String[] namesAndValues;

    /* JADX INFO: compiled from: Headers.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokhttp3/Headers$Builder;", "", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", "value", "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", "headers", "Lokhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", "build", "get", "removeAll", "set", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> namesAndValues;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 20
                r0.<init>(r1)
                r2.namesAndValues = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "line"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 58
                r1 = 0
                r2 = 6
                int r0 = kotlin.text.StringsKt.indexOf$default(r4, r0, r1, r2)
                r2 = -1
                if (r0 == r2) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                if (r2 == 0) goto L3a
                java.lang.String r1 = r4.substring(r1, r0)
                java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r1, r2)
                java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
                java.lang.String r1 = r1.toString()
                int r0 = r0 + 1
                java.lang.String r4 = r4.substring(r0)
                java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
                r3.add(r1, r4)
                return r3
            L3a:
                java.lang.String r0 = "Unexpected header: "
                java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkName(r0, r2)
                okhttp3.Headers.Companion.access$checkValue(r0, r3, r2)
                r1.addLenient$okhttp(r2, r3)
                return r1
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.time.Instant r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.util.Date r0 = new java.util.Date
                long r1 = r5.toEpochMilli()
                r0.<init>(r1)
                r3.add(r4, r0)
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Date r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r3 = okhttp3.internal.http.DatesKt.toHttpDateString(r3)
                r1.add(r2, r3)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder addAll(@org.jetbrains.annotations.NotNull okhttp3.Headers r5) {
                r4 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                int r0 = r5.size()
                r1 = 0
            La:
                if (r1 >= r0) goto L1a
                java.lang.String r2 = r5.name(r1)
                java.lang.String r3 = r5.value(r1)
                r4.addLenient$okhttp(r2, r3)
                int r1 = r1 + 1
                goto La
            L1a:
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder addLenient$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r7) {
                r6 = this;
                java.lang.String r0 = "line"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = 58
                r1 = 1
                r2 = 4
                int r2 = kotlin.text.StringsKt.indexOf$default(r7, r0, r1, r2)
                java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
                r4 = 0
                r5 = -1
                if (r2 == r5) goto L28
                java.lang.String r0 = r7.substring(r4, r2)
                java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
                int r2 = r2 + r1
                java.lang.String r7 = r7.substring(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
                r6.addLenient$okhttp(r0, r7)
                goto L3e
            L28:
                char r2 = r7.charAt(r4)
                java.lang.String r4 = ""
                if (r2 != r0) goto L3b
                java.lang.String r7 = r7.substring(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
                r6.addLenient$okhttp(r4, r7)
                goto L3e
            L3b:
                r6.addLenient$okhttp(r4, r7)
            L3e:
                return r6
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder addLenient$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.util.List<java.lang.String> r0 = r1.namesAndValues
                r0.add(r2)
                java.util.List<java.lang.String> r2 = r1.namesAndValues
                java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
                java.lang.String r3 = r3.toString()
                r2.add(r3)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder addUnsafeNonAscii(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkName(r0, r2)
                r1.addLenient$okhttp(r2, r3)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers build() {
                r3 = this;
                okhttp3.Headers r0 = new okhttp3.Headers
                java.util.List<java.lang.String> r1 = r3.namesAndValues
                r2 = 0
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r1, r2)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String get(@org.jetbrains.annotations.NotNull java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.util.List<java.lang.String> r0 = r4.namesAndValues
                int r0 = r0.size()
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.downTo(r0, r2)
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
                int r1 = r0.getFirst()
                int r2 = r0.getLast()
                int r0 = r0.getStep()
                if (r0 < 0) goto L27
                if (r1 > r2) goto L46
                goto L29
            L27:
                if (r1 < r2) goto L46
            L29:
                java.util.List<java.lang.String> r3 = r4.namesAndValues
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                boolean r3 = kotlin.text.StringsKt.equals(r5, r3)
                if (r3 == 0) goto L42
                java.util.List<java.lang.String> r5 = r4.namesAndValues
                int r1 = r1 + 1
                java.lang.Object r5 = r5.get(r1)
                java.lang.String r5 = (java.lang.String) r5
                return r5
            L42:
                if (r1 == r2) goto L46
                int r1 = r1 + r0
                goto L29
            L46:
                r5 = 0
                return r5
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getNamesAndValues$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.namesAndValues
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder removeAll(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
            L6:
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                int r1 = r1.size()
                if (r0 >= r1) goto L2b
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                java.lang.Object r1 = r1.get(r0)
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = kotlin.text.StringsKt.equals(r3, r1)
                if (r1 == 0) goto L28
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                r1.remove(r0)
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                r1.remove(r0)
                int r0 = r0 + (-2)
            L28:
                int r0 = r0 + 2
                goto L6
            L2b:
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder set(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkName(r0, r2)
                okhttp3.Headers.Companion.access$checkValue(r0, r3, r2)
                r1.removeAll(r2)
                r1.addLenient$okhttp(r2, r3)
                return r1
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder set(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.time.Instant r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.util.Date r0 = new java.util.Date
                long r1 = r5.toEpochMilli()
                r0.<init>(r1)
                okhttp3.Headers$Builder r4 = r3.set(r4, r0)
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder set(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Date r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r3 = okhttp3.internal.http.DatesKt.toHttpDateString(r3)
                r1.set(r2, r3)
                return r1
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J%\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u0011J\u001d\u0010\u0014\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u000f¨\u0006\u0015"}, d2 = {"Lokhttp3/Headers$Companion;", "", "()V", "checkName", "", "name", "", "checkValue", "value", "get", "namesAndValues", "", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "headersOf", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "headers", "", "toHeaders", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        public static final /* synthetic */ void access$checkName(okhttp3.Headers.Companion r0, java.lang.String r1) {
                r0.checkName(r1)
                return
        }

        public static final /* synthetic */ void access$checkValue(okhttp3.Headers.Companion r0, java.lang.String r1, java.lang.String r2) {
                r0.checkValue(r1, r2)
                return
        }

        public static final /* synthetic */ java.lang.String access$get(okhttp3.Headers.Companion r0, java.lang.String[] r1, java.lang.String r2) {
                java.lang.String r0 = r0.get(r1, r2)
                return r0
        }

        private final void checkName(java.lang.String r8) {
                r7 = this;
                int r0 = r8.length()
                r1 = 1
                r2 = 0
                if (r0 <= 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L4c
                int r0 = r8.length()
                r3 = 0
            L12:
                if (r3 >= r0) goto L4b
                char r4 = r8.charAt(r3)
                r5 = 126(0x7e, float:1.77E-43)
                r6 = 33
                if (r6 <= r4) goto L1f
                goto L23
            L1f:
                if (r5 < r4) goto L23
                r5 = 1
                goto L24
            L23:
                r5 = 0
            L24:
                if (r5 == 0) goto L29
                int r3 = r3 + 1
                goto L12
            L29:
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0[r2] = r4
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r0[r1] = r2
                r1 = 2
                r0[r1] = r8
                java.lang.String r8 = "Unexpected char %#04x at %d in header name: %s"
                java.lang.String r8 = okhttp3.internal.Util.format(r8, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
            L4b:
                return
            L4c:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "name is empty"
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
        }

        private final void checkValue(java.lang.String r8, java.lang.String r9) {
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L48
                char r3 = r8.charAt(r2)
                r4 = 9
                r5 = 1
                if (r3 == r4) goto L1d
                r4 = 126(0x7e, float:1.77E-43)
                r6 = 32
                if (r6 <= r3) goto L18
                goto L1b
            L18:
                if (r4 < r3) goto L1b
                goto L1d
            L1b:
                r4 = 0
                goto L1e
            L1d:
                r4 = 1
            L1e:
                if (r4 == 0) goto L23
                int r2 = r2 + 1
                goto L6
            L23:
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r5] = r1
                r1 = 2
                r0[r1] = r9
                r9 = 3
                r0[r9] = r8
                java.lang.String r8 = "Unexpected char %#04x at %d in %s value: %s"
                java.lang.String r8 = okhttp3.internal.Util.format(r8, r0)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L48:
                return
        }

        private final java.lang.String get(java.lang.String[] r5, java.lang.String r6) {
                r4 = this;
                int r0 = r5.length
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.downTo(r0, r2)
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
                int r1 = r0.getFirst()
                int r2 = r0.getLast()
                int r0 = r0.getStep()
                if (r0 < 0) goto L1d
                if (r1 > r2) goto L30
                goto L1f
            L1d:
                if (r1 < r2) goto L30
            L1f:
                r3 = r5[r1]
                boolean r3 = kotlin.text.StringsKt.equals(r6, r3)
                if (r3 == 0) goto L2c
                int r1 = r1 + 1
                r5 = r5[r1]
                return r5
            L2c:
                if (r1 == r2) goto L30
                int r1 = r1 + r0
                goto L1f
            L30:
                r5 = 0
                return r5
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @kotlin.ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_of")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m1928deprecated_of(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.Headers r2 = r1.of(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "function name changed", replaceWith = @kotlin.ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_of")
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m1929deprecated_of(@org.jetbrains.annotations.NotNull java.lang.String... r2) {
                r1 = this;
                java.lang.String r0 = "namesAndValues"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                okhttp3.Headers r2 = r1.of(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "of")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers of(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r6) {
                r5 = this;
                java.lang.String r0 = "$this$toHeaders"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r6.size()
                int r0 = r0 * 2
                java.lang.String[] r0 = new java.lang.String[r0]
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
                r1 = 0
            L16:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L55
                java.lang.Object r2 = r6.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r2.getValue()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r3, r4)
                java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
                java.lang.String r3 = r3.toString()
                java.util.Objects.requireNonNull(r2, r4)
                java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
                java.lang.String r2 = r2.toString()
                r5.checkName(r3)
                r5.checkValue(r2, r3)
                r0[r1] = r3
                int r3 = r1 + 1
                r0[r3] = r2
                int r1 = r1 + 2
                goto L16
            L55:
                okhttp3.Headers r6 = new okhttp3.Headers
                r1 = 0
                r6.<init>(r0, r1)
                return r6
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "of")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers of(@org.jetbrains.annotations.NotNull java.lang.String... r8) {
                r7 = this;
                java.lang.String r0 = "namesAndValues"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r0 = r8.length
                r1 = 2
                int r0 = r0 % r1
                r2 = 1
                r3 = 0
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L7c
                java.lang.Object r8 = r8.clone()
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
                java.util.Objects.requireNonNull(r8, r0)
                java.lang.String[] r8 = (java.lang.String[]) r8
                int r0 = r8.length
                r4 = 0
            L1e:
                if (r4 >= r0) goto L49
                r5 = r8[r4]
                if (r5 == 0) goto L26
                r5 = 1
                goto L27
            L26:
                r5 = 0
            L27:
                if (r5 == 0) goto L3d
                r5 = r8[r4]
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r5, r6)
                java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)
                java.lang.String r5 = r5.toString()
                r8[r4] = r5
                int r4 = r4 + 1
                goto L1e
            L3d:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Headers cannot be null"
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L49:
                int r0 = r8.length
                kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r3, r0)
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
                int r1 = r0.getFirst()
                int r2 = r0.getLast()
                int r0 = r0.getStep()
                if (r0 < 0) goto L63
                if (r1 > r2) goto L75
                goto L65
            L63:
                if (r1 < r2) goto L75
            L65:
                r3 = r8[r1]
                int r4 = r1 + 1
                r4 = r8[r4]
                r7.checkName(r3)
                r7.checkValue(r4, r3)
                if (r1 == r2) goto L75
                int r1 = r1 + r0
                goto L65
            L75:
                okhttp3.Headers r0 = new okhttp3.Headers
                r1 = 0
                r0.<init>(r8, r1)
                return r0
            L7c:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Expected alternating header names and values"
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
        }
    }

    static {
            okhttp3.Headers$Companion r0 = new okhttp3.Headers$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Headers.Companion = r0
            return
    }

    private Headers(java.lang.String[] r1) {
            r0 = this;
            r0.<init>()
            r0.namesAndValues = r1
            return
    }

    public /* synthetic */ Headers(java.lang.String[] r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "of")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers of(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r1) {
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            okhttp3.Headers r1 = r0.of(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "of")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers of(@org.jetbrains.annotations.NotNull java.lang.String... r1) {
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            okhttp3.Headers r1 = r0.of(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m1927deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    public final long byteCount() {
            r6 = this;
            java.lang.String[] r0 = r6.namesAndValues
            int r1 = r0.length
            int r1 = r1 * 2
            long r1 = (long) r1
            int r0 = r0.length
            r3 = 0
        L8:
            if (r3 >= r0) goto L17
            java.lang.String[] r4 = r6.namesAndValues
            r4 = r4[r3]
            int r4 = r4.length()
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L8
        L17:
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.Headers
            if (r0 == 0) goto L12
            java.lang.String[] r0 = r1.namesAndValues
            okhttp3.Headers r2 = (okhttp3.Headers) r2
            java.lang.String[] r2 = r2.namesAndValues
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String get(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            java.lang.String[] r1 = r2.namesAndValues
            java.lang.String r3 = okhttp3.Headers.Companion.access$get(r0, r1, r3)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.Date getDate(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = r1.get(r2)
            if (r2 == 0) goto L10
            java.util.Date r2 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r2)
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    @org.jetbrains.annotations.Nullable
    public final java.time.Instant getInstant(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Date r2 = r1.getDate(r2)
            if (r2 == 0) goto L10
            java.time.Instant r2 = r2.toInstant()
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> iterator() {
            r5 = this;
            int r0 = r5.size()
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L1a
            java.lang.String r3 = r5.name(r2)
            java.lang.String r4 = r5.value(r2)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L1a:
            java.util.Iterator r0 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String name(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r2 = r2 * 2
            r2 = r0[r2]
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> names() {
            r4 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Comparator r1 = kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(r1)
            r0.<init>(r1)
            int r1 = r4.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L1c
            java.lang.String r3 = r4.name(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L1c:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r1 = "Collections.unmodifiableSet(result)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Headers.Builder newBuilder() {
            r3 = this;
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.List r1 = r0.getNamesAndValues$okhttp()
            java.lang.String[] r2 = r3.namesAndValues
            kotlin.collections.CollectionsKt.addAll(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmName(name = "size")
    public final int size() {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> toMultimap() {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Comparator r1 = kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(r1)
            r0.<init>(r1)
            int r1 = r6.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L46
            java.lang.String r3 = r6.name(r2)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "Locale.US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r3, r5)
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L3c
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 2
            r4.<init>(r5)
            r0.put(r3, r4)
        L3c:
            java.lang.String r3 = r6.value(r2)
            r4.add(r3)
            int r2 = r2 + 1
            goto L10
        L46:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L27
            java.lang.String r3 = r4.name(r2)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.lang.String r3 = r4.value(r2)
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L27:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String value(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r2 = r2 * 2
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> values(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L29
            java.lang.String r3 = r4.name(r2)
            boolean r3 = kotlin.text.StringsKt.equals(r5, r3)
            if (r3 == 0) goto L26
            if (r1 != 0) goto L1f
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 2
            r1.<init>(r3)
        L1f:
            java.lang.String r3 = r4.value(r2)
            r1.add(r3)
        L26:
            int r2 = r2 + 1
            goto Lb
        L29:
            if (r1 == 0) goto L35
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r0 = "Collections.unmodifiableList(result)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            goto L39
        L35:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L39:
            return r5
    }
}
