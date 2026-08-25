package kotlin.jvm.internal;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"iterator", "", "T", "array", "", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ArrayIteratorKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Iterator<T> iterator(@org.jetbrains.annotations.NotNull T[] r1) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.jvm.internal.ArrayIterator r0 = new kotlin.jvm.internal.ArrayIterator
            r0.<init>(r1)
            return r0
    }
}
