package androidx.core.os;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a=\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\b\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tH\u0007¨\u0006\n"}, d2 = {"persistableBundleOf", "Landroid/os/PersistableBundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "toPersistableBundle", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PersistableBundleKt {
    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final android.os.PersistableBundle persistableBundleOf() {
            r0 = 0
            android.os.PersistableBundle r0 = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final android.os.PersistableBundle persistableBundleOf(@org.jetbrains.annotations.NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r5) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            android.os.PersistableBundle r0 = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(r0)
            int r1 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L20
            r3 = r5[r2]
            java.lang.Object r4 = r3.component1()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.component2()
            androidx.core.os.PersistableBundleApi21ImplKt.putValue(r0, r4, r3)
            int r2 = r2 + 1
            goto Lc
        L20:
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final android.os.PersistableBundle toPersistableBundle(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.size()
            android.os.PersistableBundle r0 = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.core.os.PersistableBundleApi21ImplKt.putValue(r0, r2, r1)
            goto L15
        L2f:
            return r0
    }
}
