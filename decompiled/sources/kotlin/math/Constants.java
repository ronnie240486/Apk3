package kotlin.math;

/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/math/Constants;", "", "()V", "LN2", "", "epsilon", "taylor_2_bound", "taylor_n_bound", "upper_taylor_2_bound", "upper_taylor_n_bound", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class Constants {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.math.Constants INSTANCE = null;

    @kotlin.jvm.JvmField
    public static final double LN2 = 0.0d;

    @kotlin.jvm.JvmField
    public static final double epsilon = 0.0d;

    @kotlin.jvm.JvmField
    public static final double taylor_2_bound = 0.0d;

    @kotlin.jvm.JvmField
    public static final double taylor_n_bound = 0.0d;

    @kotlin.jvm.JvmField
    public static final double upper_taylor_2_bound = 0.0d;

    @kotlin.jvm.JvmField
    public static final double upper_taylor_n_bound = 0.0d;

    static {
            kotlin.math.Constants r0 = new kotlin.math.Constants
            r0.<init>()
            kotlin.math.Constants.INSTANCE = r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.log(r0)
            kotlin.math.Constants.LN2 = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = java.lang.Math.ulp(r0)
            kotlin.math.Constants.epsilon = r0
            double r0 = java.lang.Math.sqrt(r0)
            kotlin.math.Constants.taylor_2_bound = r0
            double r2 = java.lang.Math.sqrt(r0)
            kotlin.math.Constants.taylor_n_bound = r2
            r4 = 1
            double r4 = (double) r4
            double r0 = r4 / r0
            kotlin.math.Constants.upper_taylor_2_bound = r0
            double r4 = r4 / r2
            kotlin.math.Constants.upper_taylor_n_bound = r4
            return
    }

    private Constants() {
            r0 = this;
            r0.<init>()
            return
    }
}
