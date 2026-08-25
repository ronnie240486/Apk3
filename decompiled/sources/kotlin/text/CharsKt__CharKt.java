package kotlin.text;

/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0001\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000eH\u0087\n\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0001H\u0007¨\u0006\u0010"}, d2 = {"digitToChar", "", "", "radix", "digitToInt", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "equals", "", "other", "ignoreCase", "isSurrogate", "plus", "", "titlecase", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/CharsKt")
class CharsKt__CharKt extends kotlin.text.CharsKt__CharJVMKt {
    public CharsKt__CharKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final char digitToChar(int r3) {
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r1 = 0
            r2 = 9
            r0.<init>(r1, r2)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L12
            int r3 = r3 + 48
            char r3 = (char) r3
            return r3
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Int "
            java.lang.String r2 = " is not a decimal digit"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final char digitToChar(int r3, int r4) {
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r1 = 2
            r2 = 36
            r0.<init>(r1, r2)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L2d
            if (r3 < 0) goto L1f
            if (r3 >= r4) goto L1f
            r4 = 10
            if (r3 >= r4) goto L19
            int r3 = r3 + 48
            goto L1d
        L19:
            int r3 = r3 + 65
            char r3 = (char) r3
            int r3 = r3 - r4
        L1d:
            char r3 = (char) r3
            return r3
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Digit "
            java.lang.String r2 = " does not represent a valid digit in radix "
            java.lang.String r3 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r1, r3, r2, r4)
            r0.<init>(r3)
            throw r0
        L2d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid radix: "
            java.lang.String r1 = ". Valid radix values are in range 2..36"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1)
            r3.<init>(r4)
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final int digitToInt(char r3) {
            r0 = 10
            int r0 = kotlin.text.CharsKt__CharJVMKt.digitOf(r3, r0)
            if (r0 < 0) goto L9
            return r0
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Char "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not a decimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final int digitToInt(char r3, int r4) {
            java.lang.Integer r0 = digitToIntOrNull(r3, r4)
            if (r0 == 0) goto Lb
            int r3 = r0.intValue()
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Char "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not a digit in the given radix="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer digitToIntOrNull(char r1) {
            r0 = 10
            int r1 = kotlin.text.CharsKt__CharJVMKt.digitOf(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r1.intValue()
            if (r0 < 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer digitToIntOrNull(char r0, int r1) {
            kotlin.text.CharsKt__CharJVMKt.checkRadix(r1)
            int r0 = kotlin.text.CharsKt__CharJVMKt.digitOf(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            if (r1 < 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public static final boolean equals(char r2, char r3, boolean r4) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            char r2 = java.lang.Character.toUpperCase(r2)
            char r3 = java.lang.Character.toUpperCase(r3)
            if (r2 == r3) goto L1e
            char r2 = java.lang.Character.toLowerCase(r2)
            char r3 = java.lang.Character.toLowerCase(r3)
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public static /* synthetic */ boolean equals$default(char r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = equals(r0, r1, r2)
            return r0
    }

    public static final boolean isSurrogate(char r3) {
            kotlin.ranges.CharRange r0 = new kotlin.ranges.CharRange
            r1 = 55296(0xd800, float:7.7486E-41)
            r2 = 57343(0xdfff, float:8.0355E-41)
            r0.<init>(r1, r2)
            boolean r3 = r0.contains(r3)
            return r3
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String plus(char r1, java.lang.String r2) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String titlecase(char r0) {
            java.lang.String r0 = kotlin.text._OneToManyTitlecaseMappingsKt.titlecaseImpl(r0)
            return r0
    }
}
