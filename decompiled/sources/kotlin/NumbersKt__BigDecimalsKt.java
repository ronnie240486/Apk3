package kotlin;

/* JADX INFO: compiled from: BigDecimals.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000fH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\u0001H\u0087\n¨\u0006\u0011"}, d2 = {"dec", "Ljava/math/BigDecimal;", "div", "other", "inc", "minus", "plus", "rem", "times", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "unaryMinus", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__BigDecimalsKt {
    public NumbersKt__BigDecimalsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal dec(java.math.BigDecimal r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.math.BigDecimal r0 = java.math.BigDecimal.ONE
            java.math.BigDecimal r1 = r1.subtract(r0)
            java.lang.String r0 = "this.subtract(BigDecimal.ONE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal div(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r1 = r1.divide(r2, r0)
            java.lang.String r2 = "this.divide(other, RoundingMode.HALF_EVEN)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal inc(java.math.BigDecimal r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.math.BigDecimal r0 = java.math.BigDecimal.ONE
            java.math.BigDecimal r1 = r1.add(r0)
            java.lang.String r0 = "this.add(BigDecimal.ONE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal minus(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r1 = r1.subtract(r2)
            java.lang.String r2 = "this.subtract(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal plus(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r1 = r1.add(r2)
            java.lang.String r2 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal rem(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r1 = r1.remainder(r2)
            java.lang.String r2 = "this.remainder(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal times(java.math.BigDecimal r1, java.math.BigDecimal r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r1 = r1.multiply(r2)
            java.lang.String r2 = "this.multiply(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(double r1) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(double r1, java.math.MathContext r3) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(float r1) {
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(float r1, java.math.MathContext r2) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(int r2) {
            long r0 = (long) r2
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r0 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(int r1, java.math.MathContext r2) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(long r0) {
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal toBigDecimal(long r1, java.math.MathContext r3) {
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal unaryMinus(java.math.BigDecimal r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.math.BigDecimal r1 = r1.negate()
            java.lang.String r0 = "this.negate()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }
}
