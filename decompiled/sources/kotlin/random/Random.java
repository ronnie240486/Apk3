package kotlin.random;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class Random {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.random.Random.Default Default = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.random.Random defaultRandom = null;

    /* JADX INFO: compiled from: Random.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "writeReplace", "", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Default extends kotlin.random.Random implements java.io.Serializable {

        /* JADX INFO: compiled from: Random.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Serialized implements java.io.Serializable {

            @org.jetbrains.annotations.NotNull
            public static final kotlin.random.Random.Default.Serialized INSTANCE = null;
            private static final long serialVersionUID = 0;

            static {
                    kotlin.random.Random$Default$Serialized r0 = new kotlin.random.Random$Default$Serialized
                    r0.<init>()
                    kotlin.random.Random.Default.Serialized.INSTANCE = r0
                    return
            }

            private Serialized() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            private final java.lang.Object readResolve() {
                    r1 = this;
                    kotlin.random.Random$Default r0 = kotlin.random.Random.Default
                    return r0
            }
        }

        private Default() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Default(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final java.lang.Object writeReplace() {
                r1 = this;
                kotlin.random.Random$Default$Serialized r0 = kotlin.random.Random.Default.Serialized.INSTANCE
                return r0
        }

        @Override // kotlin.random.Random
        public int nextBits(int r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r2 = r0.nextBits(r2)
                return r2
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                boolean r0 = r0.nextBoolean()
                return r0
        }

        @Override // kotlin.random.Random
        @org.jetbrains.annotations.NotNull
        public byte[] nextBytes(int r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                byte[] r2 = r0.nextBytes(r2)
                return r2
        }

        @Override // kotlin.random.Random
        @org.jetbrains.annotations.NotNull
        public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                byte[] r2 = r0.nextBytes(r2)
                return r2
        }

        @Override // kotlin.random.Random
        @org.jetbrains.annotations.NotNull
        public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                byte[] r2 = r0.nextBytes(r2, r3, r4)
                return r2
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                double r0 = r0.nextDouble()
                return r0
        }

        @Override // kotlin.random.Random
        public double nextDouble(double r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                double r2 = r0.nextDouble(r2)
                return r2
        }

        @Override // kotlin.random.Random
        public double nextDouble(double r2, double r4) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                double r2 = r0.nextDouble(r2, r4)
                return r2
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                float r0 = r0.nextFloat()
                return r0
        }

        @Override // kotlin.random.Random
        public int nextInt() {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r0 = r0.nextInt()
                return r0
        }

        @Override // kotlin.random.Random
        public int nextInt(int r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r2 = r0.nextInt(r2)
                return r2
        }

        @Override // kotlin.random.Random
        public int nextInt(int r2, int r3) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r2 = r0.nextInt(r2, r3)
                return r2
        }

        @Override // kotlin.random.Random
        public long nextLong() {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                long r0 = r0.nextLong()
                return r0
        }

        @Override // kotlin.random.Random
        public long nextLong(long r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                long r2 = r0.nextLong(r2)
                return r2
        }

        @Override // kotlin.random.Random
        public long nextLong(long r2, long r4) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                long r2 = r0.nextLong(r2, r4)
                return r2
        }
    }

    static {
            kotlin.random.Random$Default r0 = new kotlin.random.Random$Default
            r1 = 0
            r0.<init>(r1)
            kotlin.random.Random.Default = r0
            kotlin.internal.PlatformImplementations r0 = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS
            kotlin.random.Random r0 = r0.defaultPlatformRandom()
            kotlin.random.Random.defaultRandom = r0
            return
    }

    public Random() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ kotlin.random.Random access$getDefaultRandom$cp() {
            kotlin.random.Random r0 = kotlin.random.Random.defaultRandom
            return r0
    }

    public static /* synthetic */ byte[] nextBytes$default(kotlin.random.Random r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            byte[] r0 = r0.nextBytes(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: nextBytes"
            r0.<init>(r1)
            throw r0
    }

    public abstract int nextBits(int r1);

    public boolean nextBoolean() {
            r2 = this;
            r0 = 1
            int r1 = r2.nextBits(r0)
            if (r1 == 0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public byte[] nextBytes(int r1) {
            r0 = this;
            byte[] r1 = new byte[r1]
            byte[] r1 = r0.nextBytes(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r3) {
            r2 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            r1 = 0
            byte[] r3 = r2.nextBytes(r3, r1, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
            r6 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.length
            r2 = 0
            r0.<init>(r2, r1)
            boolean r0 = r0.contains(r8)
            r1 = 1
            if (r0 == 0) goto L21
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r3 = r7.length
            r0.<init>(r2, r3)
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            java.lang.String r3 = "fromIndex ("
            if (r0 == 0) goto L90
            if (r8 > r9) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            if (r1 == 0) goto L6a
            int r0 = r9 - r8
            int r0 = r0 / 4
            r1 = 0
        L31:
            if (r1 >= r0) goto L54
            int r3 = r6.nextInt()
            byte r4 = (byte) r3
            r7[r8] = r4
            int r4 = r8 + 1
            int r5 = r3 >>> 8
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r8 + 2
            int r5 = r3 >>> 16
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r8 + 3
            int r3 = r3 >>> 24
            byte r3 = (byte) r3
            r7[r4] = r3
            int r8 = r8 + 4
            int r1 = r1 + 1
            goto L31
        L54:
            int r9 = r9 - r8
            int r0 = r9 * 8
            int r0 = r6.nextBits(r0)
        L5b:
            if (r2 >= r9) goto L69
            int r1 = r8 + r2
            int r3 = r2 * 8
            int r3 = r0 >>> r3
            byte r3 = (byte) r3
            r7[r1] = r3
            int r2 = r2 + 1
            goto L5b
        L69:
            return r7
        L6a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r8)
            java.lang.String r8 = ") must be not greater than toIndex ("
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = ")."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L90:
            java.lang.String r0 = ") or toIndex ("
            java.lang.String r1 = ") are out of range: 0.."
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r8, r0, r9, r1)
            int r7 = r7.length
            r9 = 46
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r7, r9)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    public double nextDouble() {
            r2 = this;
            r0 = 26
            int r0 = r2.nextBits(r0)
            r1 = 27
            int r1 = r2.nextBits(r1)
            double r0 = kotlin.random.PlatformRandomKt.doubleFromParts(r0, r1)
            return r0
    }

    public double nextDouble(double r3) {
            r2 = this;
            r0 = 0
            double r3 = r2.nextDouble(r0, r3)
            return r3
    }

    public double nextDouble(double r7, double r9) {
            r6 = this;
            kotlin.random.RandomKt.checkRangeBounds(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3e
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 == 0) goto L3e
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L3e
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r4 = r4 * r0
            double r7 = r7 + r4
            double r7 = r7 + r4
            goto L45
        L3e:
            double r2 = r6.nextDouble()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L45:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L4f
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L4f:
            return r7
    }

    public float nextFloat() {
            r2 = this;
            r0 = 24
            int r0 = r2.nextBits(r0)
            float r0 = (float) r0
            r1 = 1266679808(0x4b800000, float:1.6777216E7)
            float r0 = r0 / r1
            return r0
    }

    public int nextInt() {
            r1 = this;
            r0 = 32
            int r0 = r1.nextBits(r0)
            return r0
    }

    public int nextInt(int r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.nextInt(r0, r2)
            return r2
    }

    public int nextInt(int r5, int r6) {
            r4 = this;
            kotlin.random.RandomKt.checkRangeBounds(r5, r6)
            int r0 = r6 - r5
            r1 = 1
            if (r0 > 0) goto L1a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto Ld
            goto L1a
        Ld:
            int r0 = r4.nextInt()
            r2 = 0
            if (r5 > r0) goto L17
            if (r0 >= r6) goto L17
            r2 = 1
        L17:
            if (r2 == 0) goto Ld
            return r0
        L1a:
            int r6 = -r0
            r6 = r6 & r0
            if (r6 != r0) goto L27
            int r6 = kotlin.random.RandomKt.fastLog2(r0)
            int r6 = r4.nextBits(r6)
            goto L35
        L27:
            int r6 = r4.nextInt()
            int r6 = r6 >>> r1
            int r2 = r6 % r0
            int r6 = r6 - r2
            int r3 = r0 + (-1)
            int r3 = r3 + r6
            if (r3 < 0) goto L27
            r6 = r2
        L35:
            int r5 = r5 + r6
            return r5
    }

    public long nextLong() {
            r4 = this;
            int r0 = r4.nextInt()
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r2 = r4.nextInt()
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    public long nextLong(long r3) {
            r2 = this;
            r0 = 0
            long r3 = r2.nextLong(r0, r3)
            return r3
    }

    public long nextLong(long r10, long r12) {
            r9 = this;
            kotlin.random.RandomKt.checkRangeBounds(r10, r12)
            long r0 = r12 - r10
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L57
            long r12 = -r0
            long r12 = r12 & r0
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L43
            int r12 = (int) r0
            r13 = 32
            long r0 = r0 >>> r13
            int r1 = (int) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r12 == 0) goto L29
            int r12 = kotlin.random.RandomKt.fastLog2(r12)
            int r12 = r9.nextBits(r12)
        L26:
            long r12 = (long) r12
            long r12 = r12 & r2
            goto L55
        L29:
            if (r1 != r4) goto L30
            int r12 = r9.nextInt()
            goto L26
        L30:
            int r12 = kotlin.random.RandomKt.fastLog2(r1)
            int r12 = r9.nextBits(r12)
            long r0 = (long) r12
            long r12 = r0 << r13
            int r0 = r9.nextInt()
            long r0 = (long) r0
            long r0 = r0 & r2
            long r12 = r12 + r0
            goto L55
        L43:
            long r12 = r9.nextLong()
            long r12 = r12 >>> r4
            long r5 = r12 % r0
            long r12 = r12 - r5
            r7 = 1
            long r7 = r0 - r7
            long r7 = r7 + r12
            int r12 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r12 < 0) goto L43
            r12 = r5
        L55:
            long r10 = r10 + r12
            return r10
        L57:
            long r0 = r9.nextLong()
            r2 = 0
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 > 0) goto L65
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 >= 0) goto L65
            r2 = 1
        L65:
            if (r2 == 0) goto L57
            return r0
    }
}
