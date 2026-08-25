package kotlin.random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0081\b\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0007\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0007¨\u0006\n"}, d2 = {"defaultPlatformRandom", "Lkotlin/random/Random;", "doubleFromParts", "", "hi26", "", "low27", "asJavaRandom", "Ljava/util/Random;", "asKotlinRandom", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PlatformRandomKt {
    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final java.util.Random asJavaRandom(@org.jetbrains.annotations.NotNull kotlin.random.Random r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof kotlin.random.AbstractPlatformRandom
            if (r0 == 0) goto Ld
            r0 = r1
            kotlin.random.AbstractPlatformRandom r0 = (kotlin.random.AbstractPlatformRandom) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            java.util.Random r0 = r0.getImpl()
            if (r0 != 0) goto L1b
        L16:
            kotlin.random.KotlinRandom r0 = new kotlin.random.KotlinRandom
            r0.<init>(r1)
        L1b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.random.Random asKotlinRandom(@org.jetbrains.annotations.NotNull java.util.Random r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof kotlin.random.KotlinRandom
            if (r0 == 0) goto Ld
            r0 = r1
            kotlin.random.KotlinRandom r0 = (kotlin.random.KotlinRandom) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            kotlin.random.Random r0 = r0.getImpl()
            if (r0 != 0) goto L1b
        L16:
            kotlin.random.PlatformRandom r0 = new kotlin.random.PlatformRandom
            r0.<init>(r1)
        L1b:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final kotlin.random.Random defaultPlatformRandom() {
            kotlin.internal.PlatformImplementations r0 = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS
            kotlin.random.Random r0 = r0.defaultPlatformRandom()
            return r0
    }

    public static final double doubleFromParts(int r2, int r3) {
            long r0 = (long) r2
            r2 = 27
            long r0 = r0 << r2
            long r2 = (long) r3
            long r0 = r0 + r2
            double r2 = (double) r0
            r0 = 4845873199050653696(0x4340000000000000, double:9.007199254740992E15)
            double r2 = r2 / r0
            return r2
    }
}
