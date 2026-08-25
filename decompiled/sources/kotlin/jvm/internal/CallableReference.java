package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CallableReference implements kotlin.reflect.KCallable, java.io.Serializable {

    @kotlin.SinceKotlin(version = "1.1")
    public static final java.lang.Object NO_RECEIVER = null;

    @kotlin.SinceKotlin(version = "1.4")
    private final boolean isTopLevel;

    @kotlin.SinceKotlin(version = "1.4")
    private final java.lang.String name;

    @kotlin.SinceKotlin(version = "1.4")
    private final java.lang.Class owner;

    @kotlin.SinceKotlin(version = "1.1")
    public final java.lang.Object receiver;
    private transient kotlin.reflect.KCallable reflected;

    @kotlin.SinceKotlin(version = "1.4")
    private final java.lang.String signature;

    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.SinceKotlin(version = "1.2")
    public static class NoReceiver implements java.io.Serializable {
        private static final kotlin.jvm.internal.CallableReference.NoReceiver INSTANCE = null;

        static {
                kotlin.jvm.internal.CallableReference$NoReceiver r0 = new kotlin.jvm.internal.CallableReference$NoReceiver
                r0.<init>()
                kotlin.jvm.internal.CallableReference.NoReceiver.INSTANCE = r0
                return
        }

        private NoReceiver() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlin.jvm.internal.CallableReference.NoReceiver access$000() {
                kotlin.jvm.internal.CallableReference$NoReceiver r0 = kotlin.jvm.internal.CallableReference.NoReceiver.INSTANCE
                return r0
        }

        private java.lang.Object readResolve() throws java.io.ObjectStreamException {
                r1 = this;
                kotlin.jvm.internal.CallableReference$NoReceiver r0 = kotlin.jvm.internal.CallableReference.NoReceiver.INSTANCE
                return r0
        }
    }

    static {
            kotlin.jvm.internal.CallableReference$NoReceiver r0 = kotlin.jvm.internal.CallableReference.NoReceiver.access$000()
            kotlin.jvm.internal.CallableReference.NO_RECEIVER = r0
            return
    }

    public CallableReference() {
            r6 = this;
            java.lang.Object r1 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public CallableReference(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.receiver = r1
            r0.owner = r2
            r0.name = r3
            r0.signature = r4
            r0.isTopLevel = r5
            return
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.Object call(java.lang.Object... r2) {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.lang.Object r2 = r0.call(r2)
            return r2
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.Object callBy(java.util.Map r2) {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.lang.Object r2 = r0.callBy(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    public kotlin.reflect.KCallable compute() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.reflected
            if (r0 != 0) goto La
            kotlin.reflect.KCallable r0 = r1.computeReflected()
            r1.reflected = r0
        La:
            return r0
    }

    public abstract kotlin.reflect.KCallable computeReflected();

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.util.List r0 = r0.getAnnotations()
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public java.lang.Object getBoundReceiver() {
            r1 = this;
            java.lang.Object r0 = r1.receiver
            return r0
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
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

    @Override // kotlin.reflect.KCallable
    public java.util.List<kotlin.reflect.KParameter> getParameters() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.util.List r0 = r0.getParameters()
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public kotlin.reflect.KCallable getReflected() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.compute()
            if (r0 == r1) goto L7
            return r0
        L7:
            kotlin.jvm.KotlinReflectionNotSupportedError r0 = new kotlin.jvm.KotlinReflectionNotSupportedError
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KCallable
    public kotlin.reflect.KType getReturnType() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            kotlin.reflect.KType r0 = r0.getReturnType()
            return r0
    }

    public java.lang.String getSignature() {
            r1 = this;
            java.lang.String r0 = r1.signature
            return r0
    }

    @Override // kotlin.reflect.KCallable
    @kotlin.SinceKotlin(version = "1.1")
    public java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            java.util.List r0 = r0.getTypeParameters()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    @kotlin.SinceKotlin(version = "1.1")
    public kotlin.reflect.KVisibility getVisibility() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            kotlin.reflect.KVisibility r0 = r0.getVisibility()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isAbstract() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            boolean r0 = r0.isAbstract()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isFinal() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            boolean r0 = r0.isFinal()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isOpen() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // kotlin.reflect.KCallable
    @kotlin.SinceKotlin(version = "1.3")
    public boolean isSuspend() {
            r1 = this;
            kotlin.reflect.KCallable r0 = r1.getReflected()
            boolean r0 = r0.isSuspend()
            return r0
    }
}
