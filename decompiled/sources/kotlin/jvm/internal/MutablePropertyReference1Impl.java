package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class MutablePropertyReference1Impl extends kotlin.jvm.internal.MutablePropertyReference1 {
    @kotlin.SinceKotlin(version = "1.4")
    public MutablePropertyReference1Impl(java.lang.Class r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            java.lang.Object r1 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public MutablePropertyReference1Impl(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public MutablePropertyReference1Impl(kotlin.reflect.KDeclarationContainer r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            java.lang.Object r1 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r0 = r7
            kotlin.jvm.internal.ClassBasedDeclarationContainer r0 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r0
            java.lang.Class r2 = r0.getJClass()
            boolean r7 = r7 instanceof kotlin.reflect.KClass
            r5 = r7 ^ 1
            r0 = r6
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.reflect.KProperty1
    public java.lang.Object get(java.lang.Object r4) {
            r3 = this;
            kotlin.reflect.KProperty1$Getter r0 = r3.getGetter()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.Object r4 = r0.call(r1)
            return r4
    }

    @Override // kotlin.reflect.KMutableProperty1
    public void set(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            kotlin.reflect.KMutableProperty1$Setter r0 = r3.getSetter()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.call(r1)
            return
    }
}
