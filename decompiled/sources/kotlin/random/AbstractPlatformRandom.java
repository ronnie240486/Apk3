package kotlin.random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lkotlin/random/AbstractPlatformRandom;", "Lkotlin/random/Random;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "nextDouble", "", "nextFloat", "", "nextInt", "until", "nextLong", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AbstractPlatformRandom extends kotlin.random.Random {
    public AbstractPlatformRandom() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.Random getImpl();

    @Override // kotlin.random.Random
    public int nextBits(int r2) {
            r1 = this;
            java.util.Random r0 = r1.getImpl()
            int r0 = r0.nextInt()
            int r2 = kotlin.random.RandomKt.takeUpperBits(r0, r2)
            return r2
    }

    @Override // kotlin.random.Random
    public boolean nextBoolean() {
            r1 = this;
            java.util.Random r0 = r1.getImpl()
            boolean r0 = r0.nextBoolean()
            return r0
    }

    @Override // kotlin.random.Random
    @org.jetbrains.annotations.NotNull
    public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Random r0 = r1.getImpl()
            r0.nextBytes(r2)
            return r2
    }

    @Override // kotlin.random.Random
    public double nextDouble() {
            r2 = this;
            java.util.Random r0 = r2.getImpl()
            double r0 = r0.nextDouble()
            return r0
    }

    @Override // kotlin.random.Random
    public float nextFloat() {
            r1 = this;
            java.util.Random r0 = r1.getImpl()
            float r0 = r0.nextFloat()
            return r0
    }

    @Override // kotlin.random.Random
    public int nextInt() {
            r1 = this;
            java.util.Random r0 = r1.getImpl()
            int r0 = r0.nextInt()
            return r0
    }

    @Override // kotlin.random.Random
    public int nextInt(int r2) {
            r1 = this;
            java.util.Random r0 = r1.getImpl()
            int r2 = r0.nextInt(r2)
            return r2
    }

    @Override // kotlin.random.Random
    public long nextLong() {
            r2 = this;
            java.util.Random r0 = r2.getImpl()
            long r0 = r0.nextLong()
            return r0
    }
}
