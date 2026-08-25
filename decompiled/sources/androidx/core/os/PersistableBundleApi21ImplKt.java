package androidx.core.os;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(21)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\r"}, d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "()V", "createPersistableBundle", "Landroid/os/PersistableBundle;", "capacity", "", "putValue", "", "persistableBundle", "key", "", "value", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class PersistableBundleApi21ImplKt {

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.os.PersistableBundleApi21ImplKt INSTANCE = null;

    static {
            androidx.core.os.PersistableBundleApi21ImplKt r0 = new androidx.core.os.PersistableBundleApi21ImplKt
            r0.<init>()
            androidx.core.os.PersistableBundleApi21ImplKt.INSTANCE = r0
            return
    }

    private PersistableBundleApi21ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    @org.jetbrains.annotations.NotNull
    public static final android.os.PersistableBundle createPersistableBundle(int r1) {
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    public static final void putValue(@org.jetbrains.annotations.NotNull android.os.PersistableBundle r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.Object r6) {
            java.lang.String r0 = "persistableBundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r6 != 0) goto Ld
            r6 = 0
            r4.putString(r5, r6)
            goto Lde
        Ld:
            boolean r0 = r6 instanceof java.lang.Boolean
            r1 = 22
            r2 = 34
            if (r0 == 0) goto L3e
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L24
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            androidx.core.os.PersistableBundleApi22ImplKt.putBoolean(r4, r5, r6)
            goto Lde
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Illegal value type boolean for key \""
            r6.append(r0)
            r6.append(r5)
            r6.append(r2)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L3e:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L4d
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            r4.putDouble(r5, r0)
            goto Lde
        L4d:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L5c
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4.putInt(r5, r6)
            goto Lde
        L5c:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L6b
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            r4.putLong(r5, r0)
            goto Lde
        L6b:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L75
            java.lang.String r6 = (java.lang.String) r6
            r4.putString(r5, r6)
            goto Lde
        L75:
            boolean r0 = r6 instanceof boolean[]
            if (r0 == 0) goto L9d
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L83
            boolean[] r6 = (boolean[]) r6
            androidx.core.os.PersistableBundleApi22ImplKt.putBooleanArray(r4, r5, r6)
            goto Lde
        L83:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Illegal value type boolean[] for key \""
            r6.append(r0)
            r6.append(r5)
            r6.append(r2)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L9d:
            boolean r0 = r6 instanceof double[]
            if (r0 == 0) goto La7
            double[] r6 = (double[]) r6
            r4.putDoubleArray(r5, r6)
            goto Lde
        La7:
            boolean r0 = r6 instanceof int[]
            if (r0 == 0) goto Lb1
            int[] r6 = (int[]) r6
            r4.putIntArray(r5, r6)
            goto Lde
        Lb1:
            boolean r0 = r6 instanceof long[]
            if (r0 == 0) goto Lbb
            long[] r6 = (long[]) r6
            r4.putLongArray(r5, r6)
            goto Lde
        Lbb:
            boolean r0 = r6 instanceof java.lang.Object[]
            java.lang.String r1 = " for key \""
            if (r0 == 0) goto L103
            java.lang.Class r0 = r6.getClass()
            java.lang.Class r0 = r0.getComponentType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto Ldf
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r4.putStringArray(r5, r6)
        Lde:
            return
        Ldf:
            java.lang.String r4 = r0.getCanonicalName()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Illegal value array type "
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
        L103:
            java.lang.Class r4 = r6.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Illegal value type "
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
    }
}
