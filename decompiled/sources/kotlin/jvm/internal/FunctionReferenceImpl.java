package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class FunctionReferenceImpl extends kotlin.jvm.internal.FunctionReference {
    @kotlin.SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
            r7 = this;
            java.lang.Object r2 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public FunctionReferenceImpl(int r8, kotlin.reflect.KDeclarationContainer r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            java.lang.Object r2 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r0 = r9
            kotlin.jvm.internal.ClassBasedDeclarationContainer r0 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r0
            java.lang.Class r3 = r0.getJClass()
            boolean r9 = r9 instanceof kotlin.reflect.KClass
            r6 = r9 ^ 1
            r0 = r7
            r1 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }
}
