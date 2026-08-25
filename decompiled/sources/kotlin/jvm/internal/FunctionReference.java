package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class FunctionReference extends kotlin.jvm.internal.CallableReference implements kotlin.jvm.internal.FunctionBase, kotlin.reflect.KFunction {
    private final int arity;

    @kotlin.SinceKotlin(version = "1.4")
    private final int flags;

    public FunctionReference(int r8) {
            r7 = this;
            java.lang.Object r2 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public FunctionReference(int r8, java.lang.Object r9) {
            r7 = this;
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public FunctionReference(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L7
            r7 = 1
            goto L9
        L7:
            r0 = 0
            r7 = 0
        L9:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.arity = r9
            int r9 = r14 >> 1
            r8.flags = r9
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.SinceKotlin(version = "1.1")
    public final kotlin.reflect.KCallable computeReflected() {
            r1 = this;
            kotlin.reflect.KFunction r0 = kotlin.jvm.internal.Reflection.function(r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionReference
            r2 = 0
            if (r1 == 0) goto L52
            kotlin.jvm.internal.FunctionReference r5 = (kotlin.jvm.internal.FunctionReference) r5
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            java.lang.String r1 = r4.getSignature()
            java.lang.String r3 = r5.getSignature()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            int r1 = r4.flags
            int r3 = r5.flags
            if (r1 != r3) goto L50
            int r1 = r4.arity
            int r3 = r5.arity
            if (r1 != r3) goto L50
            java.lang.Object r1 = r4.getBoundReceiver()
            java.lang.Object r3 = r5.getBoundReceiver()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L50
            kotlin.reflect.KDeclarationContainer r1 = r4.getOwner()
            kotlin.reflect.KDeclarationContainer r5 = r5.getOwner()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 == 0) goto L50
            goto L51
        L50:
            r0 = 0
        L51:
            return r0
        L52:
            boolean r0 = r5 instanceof kotlin.reflect.KFunction
            if (r0 == 0) goto L5f
            kotlin.reflect.KCallable r0 = r4.compute()
            boolean r5 = r5.equals(r0)
            return r5
        L5f:
            return r2
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    public /* bridge */ /* synthetic */ kotlin.reflect.KCallable getReflected() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.SinceKotlin(version = "1.1")
    public kotlin.reflect.KFunction getReflected() {
            r1 = this;
            kotlin.reflect.KCallable r0 = super.getReflected()
            kotlin.reflect.KFunction r0 = (kotlin.reflect.KFunction) r0
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.KDeclarationContainer r0 = r2.getOwner()
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            kotlin.reflect.KDeclarationContainer r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
        L12:
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.getSignature()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.KFunction
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isExternal() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isExternal()
            return r0
    }

    @Override // kotlin.reflect.KFunction
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isInfix() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isInfix()
            return r0
    }

    @Override // kotlin.reflect.KFunction
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isInline() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // kotlin.reflect.KFunction
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isOperator() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isOperator()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isSuspend() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isSuspend()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.KCallable r0 = r2.compute()
            if (r0 == r2) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "<init>"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "constructor (Kotlin reflection is not available)"
            goto L30
        L1a:
            java.lang.String r0 = "function "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L30:
            return r0
    }
}
