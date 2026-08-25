package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference0 extends kotlin.jvm.internal.PropertyReference implements kotlin.reflect.KProperty0 {
    public PropertyReference0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public PropertyReference0(java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public PropertyReference0(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.KCallable computeReflected() {
            r1 = this;
            kotlin.reflect.KProperty0 r0 = kotlin.jvm.internal.Reflection.property0(r1)
            return r0
    }

    @Override // kotlin.reflect.KProperty0
    @kotlin.SinceKotlin(version = "1.1")
    public java.lang.Object getDelegate() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            kotlin.reflect.KProperty0 r0 = (kotlin.reflect.KProperty0) r0
            java.lang.Object r0 = r0.getDelegate()
            return r0
    }

    @Override // kotlin.reflect.KProperty
    public /* bridge */ /* synthetic */ kotlin.reflect.KProperty.Getter getGetter() {
            r1 = this;
            kotlin.reflect.KProperty0$Getter r0 = r1.getGetter()
            return r0
    }

    @Override // kotlin.reflect.KProperty
    public kotlin.reflect.KProperty0.Getter getGetter() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            kotlin.reflect.KProperty0 r0 = (kotlin.reflect.KProperty0) r0
            kotlin.reflect.KProperty0$Getter r0 = r0.getGetter()
            return r0
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            return r0
    }
}
