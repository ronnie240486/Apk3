package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference2 extends kotlin.jvm.internal.PropertyReference implements kotlin.reflect.KProperty2 {
    public PropertyReference2() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public PropertyReference2(java.lang.Class r7, java.lang.String r8, java.lang.String r9, int r10) {
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

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.KCallable computeReflected() {
            r1 = this;
            kotlin.reflect.KProperty2 r0 = kotlin.jvm.internal.Reflection.property2(r1)
            return r0
    }

    @Override // kotlin.reflect.KProperty2
    @kotlin.SinceKotlin(version = "1.1")
    public java.lang.Object getDelegate(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            kotlin.reflect.KProperty2 r0 = (kotlin.reflect.KProperty2) r0
            java.lang.Object r2 = r0.getDelegate(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.KProperty
    public /* bridge */ /* synthetic */ kotlin.reflect.KProperty.Getter getGetter() {
            r1 = this;
            kotlin.reflect.KProperty2$Getter r0 = r1.getGetter()
            return r0
    }

    @Override // kotlin.reflect.KProperty
    public kotlin.reflect.KProperty2.Getter getGetter() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            kotlin.reflect.KProperty2 r0 = (kotlin.reflect.KProperty2) r0
            kotlin.reflect.KProperty2$Getter r0 = r0.getGetter()
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1, r2)
            return r1
    }
}
