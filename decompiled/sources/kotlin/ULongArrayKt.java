package kotlin;

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u00012\n\u0010\t\u001a\u00020\u0001\"\u00020\u0006H\u0087\bø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"ULongArray", "Lkotlin/ULongArray;", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/ULong;", "(ILkotlin/jvm/functions/Function1;)[J", "ulongArrayOf", "elements", "ulongArrayOf-QwZRm1k", "([J)[J", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ULongArrayKt {
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    private static final long[] ULongArray(int r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.ULong> r5) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long[] r0 = new long[r4]
            r1 = 0
        L8:
            if (r1 >= r4) goto L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r5.invoke(r2)
            kotlin.ULong r2 = (kotlin.ULong) r2
            long r2 = r2.m556unboximpl()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L1d:
            long[] r4 = kotlin.ULongArray.m559constructorimpl(r0)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: ulongArrayOf-QwZRm1k, reason: not valid java name */
    private static final long[] m575ulongArrayOfQwZRm1k(long... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            return r1
    }
}
