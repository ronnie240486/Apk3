package kotlin.jvm.internal;

/* JADX INFO: compiled from: TypeParameterReference.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.4")
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "container", "", "name", "", "variance", "Lkotlin/reflect/KVariance;", "isReified", "", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/KVariance;Z)V", "bounds", "", "Lkotlin/reflect/KType;", "()Z", "getName", "()Ljava/lang/String;", "upperBounds", "getUpperBounds$annotations", "()V", "getUpperBounds", "()Ljava/util/List;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", "hashCode", "", "setUpperBounds", "", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TypeParameterReference implements kotlin.reflect.KTypeParameter {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.internal.TypeParameterReference.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private volatile java.util.List<? extends kotlin.reflect.KType> bounds;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object container;
    private final boolean isReified;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.KVariance variance;

    /* JADX INFO: compiled from: TypeParameterReference.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "()V", "toString", "", "typeParameter", "Lkotlin/reflect/KTypeParameter;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: TypeParameterReference.kt */
        /* JADX INFO: loaded from: classes.dex */
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
                    kotlin.jvm.internal.TypeParameterReference.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

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

        @org.jetbrains.annotations.NotNull
        public final java.lang.String toString(@org.jetbrains.annotations.NotNull kotlin.reflect.KTypeParameter r4) {
                r3 = this;
                java.lang.String r0 = "typeParameter"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                kotlin.reflect.KVariance r1 = r4.getVariance()
                int[] r2 = kotlin.jvm.internal.TypeParameterReference.Companion.WhenMappings.$EnumSwitchMapping$0
                int r1 = r1.ordinal()
                r1 = r2[r1]
                r2 = 2
                if (r1 == r2) goto L24
                r2 = 3
                if (r1 == r2) goto L1e
                goto L29
            L1e:
                java.lang.String r1 = "out "
                r0.append(r1)
                goto L29
            L24:
                java.lang.String r1 = "in "
                r0.append(r1)
            L29:
                java.lang.String r4 = r4.getName()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
                return r4
        }
    }

    static {
            kotlin.jvm.internal.TypeParameterReference$Companion r0 = new kotlin.jvm.internal.TypeParameterReference$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.internal.TypeParameterReference.Companion = r0
            return
    }

    public TypeParameterReference(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.reflect.KVariance r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "variance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.container = r2
            r1.name = r3
            r1.variance = r4
            r1.isReified = r5
            return
    }

    public static /* synthetic */ void getUpperBounds$annotations() {
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.jvm.internal.TypeParameterReference
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.container
            kotlin.jvm.internal.TypeParameterReference r3 = (kotlin.jvm.internal.TypeParameterReference) r3
            java.lang.Object r1 = r3.container
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L20
            java.lang.String r0 = r2.getName()
            java.lang.String r3 = r3.getName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            return r3
    }

    @Override // kotlin.reflect.KTypeParameter
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // kotlin.reflect.KTypeParameter
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.KType> getUpperBounds() {
            r1 = this;
            java.util.List<? extends kotlin.reflect.KType> r0 = r1.bounds
            if (r0 != 0) goto L10
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            kotlin.reflect.KType r0 = kotlin.jvm.internal.Reflection.nullableTypeOf(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            r1.bounds = r0
        L10:
            return r0
    }

    @Override // kotlin.reflect.KTypeParameter
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.KVariance getVariance() {
            r1 = this;
            kotlin.reflect.KVariance r0 = r1.variance
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.container
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // kotlin.reflect.KTypeParameter
    public boolean isReified() {
            r1 = this;
            boolean r0 = r1.isReified
            return r0
    }

    public final void setUpperBounds(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.KType> r3) {
            r2 = this;
            java.lang.String r0 = "upperBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List<? extends kotlin.reflect.KType> r0 = r2.bounds
            if (r0 != 0) goto Ld
            r2.bounds = r3
            return
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Upper bounds of type parameter '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "' have already been initialized."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            kotlin.jvm.internal.TypeParameterReference$Companion r0 = kotlin.jvm.internal.TypeParameterReference.Companion
            java.lang.String r0 = r0.toString(r1)
            return r0
    }
}
