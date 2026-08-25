package androidx.dynamicanimation.animation;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatPropertyCompat<T> {


    public FloatPropertyCompat(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RequiresApi(24)
    public static <T> androidx.dynamicanimation.animation.FloatPropertyCompat<T> createFloatPropertyCompat(android.util.FloatProperty<T> r2) {
            androidx.dynamicanimation.animation.FloatPropertyCompat$1 r0 = new androidx.dynamicanimation.animation.FloatPropertyCompat$1
            java.lang.String r1 = r2.getName()
            r0.<init>(r1, r2)
            return r0
    }

    public abstract float getValue(T r1);

    public abstract void setValue(T r1, float r2);
}
