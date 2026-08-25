package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/TypeImpl;", "upperBound", "Ljava/lang/reflect/Type;", "lowerBound", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "equals", "", "other", "", "getLowerBounds", "", "()[Ljava/lang/reflect/Type;", "getTypeName", "", "getUpperBounds", "hashCode", "", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.ExperimentalStdlibApi
final class WildcardTypeImpl implements java.lang.reflect.WildcardType, kotlin.reflect.TypeImpl {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.WildcardTypeImpl.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.WildcardTypeImpl STAR = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.reflect.Type lowerBound;

    @org.jetbrains.annotations.Nullable
    private final java.lang.reflect.Type upperBound;

    /* JADX INFO: compiled from: TypesJVM.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "()V", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "getSTAR", "()Lkotlin/reflect/WildcardTypeImpl;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.WildcardTypeImpl getSTAR() {
                r1 = this;
                kotlin.reflect.WildcardTypeImpl r0 = kotlin.reflect.WildcardTypeImpl.access$getSTAR$cp()
                return r0
        }
    }

    static {
            kotlin.reflect.WildcardTypeImpl$Companion r0 = new kotlin.reflect.WildcardTypeImpl$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.WildcardTypeImpl.Companion = r0
            kotlin.reflect.WildcardTypeImpl r0 = new kotlin.reflect.WildcardTypeImpl
            r0.<init>(r1, r1)
            kotlin.reflect.WildcardTypeImpl.STAR = r0
            return
    }

    public WildcardTypeImpl(@org.jetbrains.annotations.Nullable java.lang.reflect.Type r1, @org.jetbrains.annotations.Nullable java.lang.reflect.Type r2) {
            r0 = this;
            r0.<init>()
            r0.upperBound = r1
            r0.lowerBound = r2
            return
    }

    public static final /* synthetic */ kotlin.reflect.WildcardTypeImpl access$getSTAR$cp() {
            kotlin.reflect.WildcardTypeImpl r0 = kotlin.reflect.WildcardTypeImpl.STAR
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L24
            java.lang.reflect.Type[] r0 = r2.getUpperBounds()
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L24
            java.lang.reflect.Type[] r0 = r2.getLowerBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    @Override // java.lang.reflect.WildcardType
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type[] getLowerBounds() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.lowerBound
            r1 = 0
            if (r0 != 0) goto La
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            goto L10
        La:
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r2[r1] = r0
            r0 = r2
        L10:
            return r0
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @org.jetbrains.annotations.NotNull
    public java.lang.String getTypeName() {
            r2 = this;
            java.lang.reflect.Type r0 = r2.lowerBound
            if (r0 == 0) goto L18
            java.lang.String r0 = "? super "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.reflect.Type r1 = r2.lowerBound
            java.lang.String r1 = kotlin.reflect.TypesJVMKt.access$typeToString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L3a
        L18:
            java.lang.reflect.Type r0 = r2.upperBound
            if (r0 == 0) goto L38
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L38
            java.lang.String r0 = "? extends "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.reflect.Type r1 = r2.upperBound
            java.lang.String r1 = kotlin.reflect.TypesJVMKt.access$typeToString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L3a
        L38:
            java.lang.String r0 = "?"
        L3a:
            return r0
    }

    @Override // java.lang.reflect.WildcardType
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type[] getUpperBounds() {
            r3 = this;
            r0 = 1
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            java.lang.reflect.Type r1 = r3.upperBound
            if (r1 != 0) goto L9
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
        L9:
            r2 = 0
            r0[r2] = r1
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.reflect.Type[] r0 = r2.getUpperBounds()
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.reflect.Type[] r1 = r2.getLowerBounds()
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }
}
