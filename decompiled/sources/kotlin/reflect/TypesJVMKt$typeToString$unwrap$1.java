package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Class<?>, java.lang.Class<?>> {
    public static final kotlin.reflect.TypesJVMKt$typeToString$unwrap$1 INSTANCE = null;

    static {
            kotlin.reflect.TypesJVMKt$typeToString$unwrap$1 r0 = new kotlin.reflect.TypesJVMKt$typeToString$unwrap$1
            r0.<init>()
            kotlin.reflect.TypesJVMKt$typeToString$unwrap$1.INSTANCE = r0
            return
    }

    public TypesJVMKt$typeToString$unwrap$1() {
            r6 = this;
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r1 = 1
            java.lang.String r3 = "getComponentType"
            java.lang.String r4 = "getComponentType()Ljava/lang/Class;"
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Class<?> invoke2(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class r2 = r2.getComponentType()
            return r2
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Class<?> invoke(java.lang.Class<?> r1) {
            r0 = this;
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r1 = r0.invoke2(r1)
            return r1
    }
}
