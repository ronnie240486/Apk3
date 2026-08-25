package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyReference extends kotlin.jvm.internal.CallableReference implements kotlin.reflect.KProperty {
    public PropertyReference() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public PropertyReference(java.lang.Object r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public PropertyReference(java.lang.Object r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
            r7 = this;
            r0 = 1
            r12 = r12 & r0
            if (r12 != r0) goto L6
            r6 = 1
            goto L8
        L6:
            r0 = 0
            r6 = 0
        L8:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.jvm.internal.PropertyReference
            r2 = 0
            if (r1 == 0) goto L46
            kotlin.jvm.internal.PropertyReference r5 = (kotlin.jvm.internal.PropertyReference) r5
            kotlin.reflect.KDeclarationContainer r1 = r4.getOwner()
            kotlin.reflect.KDeclarationContainer r3 = r5.getOwner()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.getSignature()
            java.lang.String r3 = r5.getSignature()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.Object r1 = r4.getBoundReceiver()
            java.lang.Object r5 = r5.getBoundReceiver()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 == 0) goto L44
            goto L45
        L44:
            r0 = 0
        L45:
            return r0
        L46:
            boolean r0 = r5 instanceof kotlin.reflect.KProperty
            if (r0 == 0) goto L53
            kotlin.reflect.KCallable r0 = r4.compute()
            boolean r5 = r5.equals(r0)
            return r5
        L53:
            return r2
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final /* bridge */ /* synthetic */ kotlin.reflect.KCallable getReflected() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.SinceKotlin(version = "1.1")
    public final kotlin.reflect.KProperty getReflected() {
            r1 = this;
            kotlin.reflect.KCallable r0 = super.getReflected()
            kotlin.reflect.KProperty r0 = (kotlin.reflect.KProperty) r0
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.KDeclarationContainer r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.getSignature()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.KProperty
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isConst() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            boolean r0 = r0.isConst()
            return r0
    }

    @Override // kotlin.reflect.KProperty
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isLateinit() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            boolean r0 = r0.isLateinit()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.KCallable r0 = r2.compute()
            if (r0 == r2) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.String r0 = "property "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
