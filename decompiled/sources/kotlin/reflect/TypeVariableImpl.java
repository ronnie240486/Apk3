package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\u0011\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\b\b\u0000\u0010\u0010*\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fH\u0016¢\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/reflect/TypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "typeParameter", "Lkotlin/reflect/KTypeParameter;", "(Lkotlin/reflect/KTypeParameter;)V", "equals", "", "other", "", "getAnnotatedBounds", "", "", "()[Ljava/lang/annotation/Annotation;", "getAnnotation", "T", "annotationClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "getAnnotations", "getBounds", "Ljava/lang/reflect/Type;", "()[Ljava/lang/reflect/Type;", "getDeclaredAnnotations", "getGenericDeclaration", "getName", "", "getTypeName", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.ExperimentalStdlibApi
final class TypeVariableImpl implements java.lang.reflect.TypeVariable<java.lang.reflect.GenericDeclaration>, kotlin.reflect.TypeImpl {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.KTypeParameter typeParameter;

    public TypeVariableImpl(@org.jetbrains.annotations.NotNull kotlin.reflect.KTypeParameter r2) {
            r1 = this;
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.typeParameter = r2
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L24
            java.lang.String r0 = r2.getName()
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.String r1 = r3.getName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L24
            java.lang.reflect.GenericDeclaration r0 = r2.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r3.getGenericDeclaration()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.annotation.Annotation[] getAnnotatedBounds() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            java.lang.annotation.Annotation[] r0 = (java.lang.annotation.Annotation[]) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final <T extends java.lang.annotation.Annotation> T getAnnotation(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "annotationClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            java.lang.annotation.Annotation[] r0 = (java.lang.annotation.Annotation[]) r0
            return r0
    }

    @Override // java.lang.reflect.TypeVariable
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type[] getBounds() {
            r4 = this;
            kotlin.reflect.KTypeParameter r0 = r4.typeParameter
            java.util.List r0 = r0.getUpperBounds()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            kotlin.reflect.KType r2 = (kotlin.reflect.KType) r2
            r3 = 1
            java.lang.reflect.Type r2 = kotlin.reflect.TypesJVMKt.access$computeJavaType(r2, r3)
            r1.add(r2)
            goto L13
        L28:
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.annotation.Annotation[] getDeclaredAnnotations() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            java.lang.annotation.Annotation[] r0 = (java.lang.annotation.Annotation[]) r0
            return r0
    }

    @Override // java.lang.reflect.TypeVariable
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.GenericDeclaration getGenericDeclaration() {
            r3 = this;
            java.lang.String r0 = "getGenericDeclaration() is not yet supported for type variables created from KType: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            kotlin.reflect.KTypeParameter r1 = r3.typeParameter
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            kotlin.NotImplementedError r1 = new kotlin.NotImplementedError
            java.lang.String r2 = "An operation is not implemented: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // java.lang.reflect.TypeVariable
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
            r1 = this;
            kotlin.reflect.KTypeParameter r0 = r1.typeParameter
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @org.jetbrains.annotations.NotNull
    public java.lang.String getTypeName() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            int r0 = r0.hashCode()
            java.lang.reflect.GenericDeclaration r1 = r2.getGenericDeclaration()
            int r1 = r1.hashCode()
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
