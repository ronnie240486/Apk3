package kotlin.random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \t2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/random/PlatformRandom;", "Lkotlin/random/AbstractPlatformRandom;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "impl", "Ljava/util/Random;", "(Ljava/util/Random;)V", "getImpl", "()Ljava/util/Random;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class PlatformRandom extends kotlin.random.AbstractPlatformRandom implements java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.random.PlatformRandom.Companion Companion = null;

    @java.lang.Deprecated
    private static final long serialVersionUID = 0;

    @org.jetbrains.annotations.NotNull
    private final java.util.Random impl;

    /* JADX INFO: compiled from: PlatformRandom.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/random/PlatformRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.random.PlatformRandom$Companion r0 = new kotlin.random.PlatformRandom$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.random.PlatformRandom.Companion = r0
            return
    }

    public PlatformRandom(@org.jetbrains.annotations.NotNull java.util.Random r2) {
            r1 = this;
            java.lang.String r0 = "impl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.impl = r2
            return
    }

    @Override // kotlin.random.AbstractPlatformRandom
    @org.jetbrains.annotations.NotNull
    public java.util.Random getImpl() {
            r1 = this;
            java.util.Random r0 = r1.impl
            return r0
    }
}
