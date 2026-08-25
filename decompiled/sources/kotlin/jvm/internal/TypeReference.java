package kotlin.jvm.internal;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.4")
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\bH\u0002J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\f\u0010\"\u001a\u00020\u001e*\u00020\u0006H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "platformTypeUpperBound", "flags", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "getFlags$kotlin_stdlib$annotations", "()V", "getFlags$kotlin_stdlib", "()I", "()Z", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "convertPrimitiveToWrapper", "equals", "other", "", "hashCode", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TypeReference implements kotlin.reflect.KType {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.internal.TypeReference.Companion Companion = null;
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.KTypeProjection> arguments;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.KClassifier classifier;
    private final int flags;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.KType platformTypeUpperBound;

    /* JADX INFO: compiled from: TypeReference.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "()V", "IS_MARKED_NULLABLE", "", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlin.jvm.internal.TypeReference.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    static {
            kotlin.jvm.internal.TypeReference$Companion r0 = new kotlin.jvm.internal.TypeReference$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.internal.TypeReference.Companion = r0
            return
    }

    @kotlin.SinceKotlin(version = "1.6")
    public TypeReference(@org.jetbrains.annotations.NotNull kotlin.reflect.KClassifier r2, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.KTypeProjection> r3, @org.jetbrains.annotations.Nullable kotlin.reflect.KType r4, int r5) {
            r1 = this;
            java.lang.String r0 = "classifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.classifier = r2
            r1.arguments = r3
            r1.platformTypeUpperBound = r4
            r1.flags = r5
            return
    }

    public TypeReference(@org.jetbrains.annotations.NotNull kotlin.reflect.KClassifier r2, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.KTypeProjection> r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "classifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public static final /* synthetic */ java.lang.String access$asString(kotlin.jvm.internal.TypeReference r0, kotlin.reflect.KTypeProjection r1) {
            java.lang.String r0 = r0.asString(r1)
            return r0
    }

    private final java.lang.String asString(kotlin.reflect.KTypeProjection r4) {
            r3 = this;
            kotlin.reflect.KVariance r0 = r4.getVariance()
            if (r0 != 0) goto L9
            java.lang.String r4 = "*"
            return r4
        L9:
            kotlin.reflect.KType r0 = r4.getType()
            boolean r1 = r0 instanceof kotlin.jvm.internal.TypeReference
            if (r1 == 0) goto L14
            kotlin.jvm.internal.TypeReference r0 = (kotlin.jvm.internal.TypeReference) r0
            goto L15
        L14:
            r0 = 0
        L15:
            r1 = 1
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.asString(r1)
            if (r0 != 0) goto L26
        L1e:
            kotlin.reflect.KType r0 = r4.getType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L26:
            kotlin.reflect.KVariance r4 = r4.getVariance()
            int[] r2 = kotlin.jvm.internal.TypeReference.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r2[r4]
            if (r4 == r1) goto L4d
            r1 = 2
            if (r4 == r1) goto L47
            r1 = 3
            if (r4 != r1) goto L41
            java.lang.String r4 = "out "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0)
            goto L4d
        L41:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L47:
            java.lang.String r4 = "in "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0)
        L4d:
            return r0
    }

    private final java.lang.String asString(boolean r9) {
            r8 = this;
            kotlin.reflect.KClassifier r0 = r8.getClassifier()
            boolean r1 = r0 instanceof kotlin.reflect.KClass
            r2 = 0
            if (r1 == 0) goto Lc
            kotlin.reflect.KClass r0 = (kotlin.reflect.KClass) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L13
            java.lang.Class r2 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r0)
        L13:
            if (r2 != 0) goto L1e
            kotlin.reflect.KClassifier r9 = r8.getClassifier()
            java.lang.String r9 = r9.toString()
            goto L52
        L1e:
            int r0 = r8.flags
            r0 = r0 & 4
            if (r0 == 0) goto L27
            java.lang.String r9 = "kotlin.Nothing"
            goto L52
        L27:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L32
            java.lang.String r9 = r8.getArrayClassName(r2)
            goto L52
        L32:
            if (r9 == 0) goto L4e
            boolean r9 = r2.isPrimitive()
            if (r9 == 0) goto L4e
            kotlin.reflect.KClassifier r9 = r8.getClassifier()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.reflect.KClass<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9, r0)
            kotlin.reflect.KClass r9 = (kotlin.reflect.KClass) r9
            java.lang.Class r9 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r9)
            java.lang.String r9 = r9.getName()
            goto L52
        L4e:
            java.lang.String r9 = r2.getName()
        L52:
            java.util.List r0 = r8.getArguments()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = ""
            if (r0 == 0) goto L60
            r0 = r1
            goto L75
        L60:
            java.util.List r2 = r8.getArguments()
            kotlin.jvm.internal.TypeReference$asString$args$1 r6 = new kotlin.jvm.internal.TypeReference$asString$args$1
            r6.<init>(r8)
            r7 = 24
            java.lang.String r3 = ", "
            java.lang.String r4 = "<"
            java.lang.String r5 = ">"
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r2, r3, r4, r5, r6, r7)
        L75:
            boolean r2 = r8.isMarkedNullable()
            if (r2 == 0) goto L7d
            java.lang.String r1 = "?"
        L7d:
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r0, r1)
            kotlin.reflect.KType r0 = r8.platformTypeUpperBound
            boolean r1 = r0 instanceof kotlin.jvm.internal.TypeReference
            if (r1 == 0) goto Ldc
            kotlin.jvm.internal.TypeReference r0 = (kotlin.jvm.internal.TypeReference) r0
            r1 = 1
            java.lang.String r0 = r0.asString(r1)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r1 == 0) goto L95
            goto Ldc
        L95:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r2 = 63
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 == 0) goto Lbe
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r9 = 33
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            goto Ldc
        Lbe:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 40
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = ".."
            r1.append(r9)
            r1.append(r0)
            r9 = 41
            r1.append(r9)
            java.lang.String r9 = r1.toString()
        Ldc:
            return r9
    }

    private final java.lang.String getArrayClassName(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<boolean[]> r0 = boolean[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "kotlin.BooleanArray"
            goto L5a
        Lb:
            java.lang.Class<char[]> r0 = char[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L16
            java.lang.String r2 = "kotlin.CharArray"
            goto L5a
        L16:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L21
            java.lang.String r2 = "kotlin.ByteArray"
            goto L5a
        L21:
            java.lang.Class<short[]> r0 = short[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L2c
            java.lang.String r2 = "kotlin.ShortArray"
            goto L5a
        L2c:
            java.lang.Class<int[]> r0 = int[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L37
            java.lang.String r2 = "kotlin.IntArray"
            goto L5a
        L37:
            java.lang.Class<float[]> r0 = float[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L42
            java.lang.String r2 = "kotlin.FloatArray"
            goto L5a
        L42:
            java.lang.Class<long[]> r0 = long[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L4d
            java.lang.String r2 = "kotlin.LongArray"
            goto L5a
        L4d:
            java.lang.Class<double[]> r0 = double[].class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 == 0) goto L58
            java.lang.String r2 = "kotlin.DoubleArray"
            goto L5a
        L58:
            java.lang.String r2 = "kotlin.Array"
        L5a:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.jvm.internal.TypeReference
            if (r0 == 0) goto L34
            kotlin.reflect.KClassifier r0 = r2.getClassifier()
            kotlin.jvm.internal.TypeReference r3 = (kotlin.jvm.internal.TypeReference) r3
            kotlin.reflect.KClassifier r1 = r3.getClassifier()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L34
            java.util.List r0 = r2.getArguments()
            java.util.List r1 = r3.getArguments()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L34
            kotlin.reflect.KType r0 = r2.platformTypeUpperBound
            kotlin.reflect.KType r1 = r3.platformTypeUpperBound
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L34
            int r0 = r2.flags
            int r3 = r3.flags
            if (r0 != r3) goto L34
            r3 = 1
            goto L35
        L34:
            r3 = 0
        L35:
            return r3
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
    }

    @Override // kotlin.reflect.KType
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.KTypeProjection> getArguments() {
            r1 = this;
            java.util.List<kotlin.reflect.KTypeProjection> r0 = r1.arguments
            return r0
    }

    @Override // kotlin.reflect.KType
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.KClassifier getClassifier() {
            r1 = this;
            kotlin.reflect.KClassifier r0 = r1.classifier
            return r0
    }

    public final int getFlags$kotlin_stdlib() {
            r1 = this;
            int r0 = r1.flags
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.KType getPlatformTypeUpperBound$kotlin_stdlib() {
            r1 = this;
            kotlin.reflect.KType r0 = r1.platformTypeUpperBound
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.KClassifier r0 = r2.getClassifier()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r2.getArguments()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.flags
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
            r2 = this;
            int r0 = r2.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r1 = r3.asString(r1)
            java.lang.String r2 = " (Kotlin reflection is not available)"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
