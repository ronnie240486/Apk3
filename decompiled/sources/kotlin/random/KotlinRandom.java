package kotlin.random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "", "nextInt", "bound", "", "nextBoolean", "", "nextLong", "", "nextFloat", "", "nextDouble", "", "bytes", "", "nextBytes", "seed", "setSeed", "Lkotlin/random/Random;", "impl", "Lkotlin/random/Random;", "getImpl", "()Lkotlin/random/Random;", "seedInitialized", "Z", "<init>", "(Lkotlin/random/Random;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
final class KotlinRandom extends java.util.Random {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.random.KotlinRandom.Companion Companion = null;

    @java.lang.Deprecated
    private static final long serialVersionUID = 0;

    @org.jetbrains.annotations.NotNull
    private final kotlin.random.Random impl;
    private boolean seedInitialized;

    /* JADX INFO: compiled from: PlatformRandom.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/random/KotlinRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
            kotlin.random.KotlinRandom$Companion r0 = new kotlin.random.KotlinRandom$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.random.KotlinRandom.Companion = r0
            return
    }

    public KotlinRandom(@org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            r1 = this;
            java.lang.String r0 = "impl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.impl = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.random.Random getImpl() {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            return r0
    }

    @Override // java.util.Random
    public final int next(int r2) {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            int r2 = r0.nextBits(r2)
            return r2
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            boolean r0 = r0.nextBoolean()
            return r0
    }

    @Override // java.util.Random
    public void nextBytes(@org.jetbrains.annotations.NotNull byte[] r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.random.Random r0 = r1.impl
            r0.nextBytes(r2)
            return
    }

    @Override // java.util.Random
    public double nextDouble() {
            r2 = this;
            kotlin.random.Random r0 = r2.impl
            double r0 = r0.nextDouble()
            return r0
    }

    @Override // java.util.Random
    public float nextFloat() {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            float r0 = r0.nextFloat()
            return r0
    }

    @Override // java.util.Random
    public int nextInt() {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            int r0 = r0.nextInt()
            return r0
    }

    @Override // java.util.Random
    public int nextInt(int r2) {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            int r2 = r0.nextInt(r2)
            return r2
    }

    @Override // java.util.Random
    public long nextLong() {
            r2 = this;
            kotlin.random.Random r0 = r2.impl
            long r0 = r0.nextLong()
            return r0
    }

    @Override // java.util.Random
    public void setSeed(long r1) {
            r0 = this;
            boolean r1 = r0.seedInitialized
            if (r1 != 0) goto L8
            r1 = 1
            r0.seedInitialized = r1
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Setting seed is not supported."
            r1.<init>(r2)
            throw r1
    }
}
