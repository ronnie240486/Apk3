package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "rawType", "Ljava/lang/Class;", "ownerType", "Ljava/lang/reflect/Type;", "typeArguments", "", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "", "[Ljava/lang/reflect/Type;", "equals", "", "other", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getOwnerType", "getRawType", "getTypeName", "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.ExperimentalStdlibApi
final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, kotlin.reflect.TypeImpl {

    @org.jetbrains.annotations.Nullable
    private final java.lang.reflect.Type ownerType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<?> rawType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Type[] typeArguments;

    public ParameterizedTypeImpl(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2, @org.jetbrains.annotations.Nullable java.lang.reflect.Type r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.reflect.Type> r4) {
            r1 = this;
            java.lang.String r0 = "rawType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "typeArguments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.rawType = r2
            r1.ownerType = r3
            r2 = 0
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r2 = r4.toArray(r2)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            java.lang.reflect.Type[] r2 = (java.lang.reflect.Type[]) r2
            r1.typeArguments = r2
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L2e
            java.lang.Class<?> r0 = r2.rawType
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r1 = r3.getRawType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L2e
            java.lang.reflect.Type r0 = r2.ownerType
            java.lang.reflect.Type r1 = r3.getOwnerType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L2e
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L2e
            r3 = 1
            goto L2f
        L2e:
            r3 = 0
        L2f:
            return r3
    }

    @Override // java.lang.reflect.ParameterizedType
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type[] getActualTypeArguments() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.typeArguments
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    @org.jetbrains.annotations.Nullable
    public java.lang.reflect.Type getOwnerType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.ownerType
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.rawType
            return r0
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @org.jetbrains.annotations.NotNull
    public java.lang.String getTypeName() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.reflect.Type r1 = r4.ownerType
            if (r1 == 0) goto L1f
            java.lang.String r1 = kotlin.reflect.TypesJVMKt.access$typeToString(r1)
            r0.append(r1)
            java.lang.String r1 = "$"
            r0.append(r1)
            java.lang.Class<?> r1 = r4.rawType
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L28
        L1f:
            java.lang.Class<?> r1 = r4.rawType
            java.lang.String r1 = kotlin.reflect.TypesJVMKt.access$typeToString(r1)
            r0.append(r1)
        L28:
            java.lang.reflect.Type[] r1 = r4.typeArguments
            int r2 = r1.length
            r3 = 1
            if (r2 != 0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            r2 = r2 ^ r3
            if (r2 == 0) goto L39
            kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1 r2 = kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1.INSTANCE
            kotlin.collections.ArraysKt.joinTo$default(r1, r0, r2)
        L39:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<?> r0 = r2.rawType
            int r0 = r0.hashCode()
            java.lang.reflect.Type r1 = r2.ownerType
            if (r1 == 0) goto Lf
            int r1 = r1.hashCode()
            goto L10
        Lf:
            r1 = 0
        L10:
            r0 = r0 ^ r1
            java.lang.reflect.Type[] r1 = r2.getActualTypeArguments()
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
