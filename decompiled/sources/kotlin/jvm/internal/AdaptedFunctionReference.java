package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.4")
public class AdaptedFunctionReference implements kotlin.jvm.internal.FunctionBase, java.io.Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    public final java.lang.Object receiver;
    private final java.lang.String signature;

    public AdaptedFunctionReference(int r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
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

    public AdaptedFunctionReference(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.receiver = r2
            r0.owner = r3
            r0.name = r4
            r0.signature = r5
            r2 = r6 & 1
            r3 = 1
            if (r2 != r3) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            r0.isTopLevel = r2
            r0.arity = r1
            int r1 = r6 >> 1
            r0.flags = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.jvm.internal.AdaptedFunctionReference
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.jvm.internal.AdaptedFunctionReference r5 = (kotlin.jvm.internal.AdaptedFunctionReference) r5
            boolean r1 = r4.isTopLevel
            boolean r3 = r5.isTopLevel
            if (r1 != r3) goto L47
            int r1 = r4.arity
            int r3 = r5.arity
            if (r1 != r3) goto L47
            int r1 = r4.flags
            int r3 = r5.flags
            if (r1 != r3) goto L47
            java.lang.Object r1 = r4.receiver
            java.lang.Object r3 = r5.receiver
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L47
            java.lang.Class r1 = r4.owner
            java.lang.Class r3 = r5.owner
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L47
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L47
            java.lang.String r1 = r4.signature
            java.lang.String r5 = r5.signature
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L47
            goto L48
        L47:
            r0 = 0
        L48:
            return r0
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    public kotlin.reflect.KDeclarationContainer getOwner() {
            r2 = this;
            java.lang.Class r0 = r2.owner
            if (r0 != 0) goto L6
            r0 = 0
            goto L13
        L6:
            boolean r1 = r2.isTopLevel
            if (r1 == 0) goto Lf
            kotlin.reflect.KDeclarationContainer r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinPackage(r0)
            goto L13
        Lf:
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
        L13:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.receiver
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            java.lang.Class r2 = r3.owner
            if (r2 == 0) goto L15
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.name
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            java.lang.String r1 = r3.signature
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            boolean r1 = r3.isTopLevel
            if (r1 == 0) goto L2d
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L2f
        L2d:
            r1 = 1237(0x4d5, float:1.733E-42)
        L2f:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.arity
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.flags
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = kotlin.jvm.internal.Reflection.renderLambdaToString(r1)
            return r0
    }
}
